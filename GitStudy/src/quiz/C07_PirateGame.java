package quiz;

import java.util.Random;
import java.util.Scanner;

import myobj.Barrel;

public class C07_PirateGame {
	/*
	 1.플레이어가 돌아가면서 원하는곳에 칼을 찌른다
	 2.잘못된 곳에 칼을 넣으면 해적 아저씨가 날아가며 게임에 패배
	 */
	Scanner sc;
	Barrel barrel;
	int mode;
	int turn;
	int numOfPlayer;




	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfPlayer =2;
		this.sc = new Scanner(System.in);
		
	}
	public C07_PirateGame(int mode,int numOfPlayer) {
		
		this(mode);
		this.numOfPlayer =numOfPlayer;
		
		
	}
	
	public void start() {
		switch (this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default:
			System.out.println("아직 구현되지않은 모드");
			break;
			
		}
		
	}
	
	public void config(int mode) {
		this.mode = mode;
		
	}
	
	void pvp() {
		while(true) {
			System.out.println((turn+1)+"턴");
			System.out.println("'Player"+(turn % numOfPlayer +1)+"'의 차례 :");
			int slot = sc.nextInt();
			
			boolean fork_result = barrel.fork(slot);
			if(fork_result) {
				
				if(barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다");
					System.out.println("'Player"+(turn % numOfPlayer +1)+"'의 패배!");
					break;
				}
				turn++;
				
			}
		
		}
	}
	
	void pvc() {
		
	}
	
	public static void main(String[] args) {
		C07_PirateGame testGame = new C07_PirateGame(99,3);
	
	
		testGame.start();
		testGame.config(0);
		testGame.start();
		
		System.out.println("테스트 게임 끝!");
	
	}
	
	
	
}
