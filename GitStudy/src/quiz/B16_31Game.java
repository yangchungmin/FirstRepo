package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {
public static void main(String[] args) {
	/*
	 31 게임을 만들어보세요
	 
	 1.컴퓨터와 사람이 번갈아가면서 숫자를 선택해야한다.
	 (1,2,3 밖에 선택할수 없음)
	 2.컴퓨터는 랜덤으로 숫자를 선택한다
	 3.선공은 랜덤으로 결정한다
	 4.마지막에 31이상의 숫자를 만들 플레이어가 패배한다
	 */
	final int PLAYER=0,COMPUTER=1;
	int num =0;
	int turn =0;
	Random ran = new Random();
	Scanner sc =new Scanner(System.in);
	
	
	while(true) {
		
		
		if(turn==PLAYER) {
			int user =-1;
			while(true){
				System.out.print("유저 턴(3까지입력):");
				user =sc.nextInt() ;
				
				if(user>0 && user<=3) {
					break;
				}else {
					System.out.print("잘못된입력입니다");
				}
			
			}
			num += user;
			
			System.out.printf("당신은 %d을 선택 / 총합계:%d\n",user,num);
			turn =COMPUTER;
		}else if (turn==COMPUTER) {
			int com =(int)(Math.random()*3+1) ;
			num += com;
			System.out.println("컴퓨터의 턴 : "+com);
			
			System.out.printf("컴퓨터가 %d을 선택 / 총합계: %d\n",com,num);
			turn=PLAYER;
			
		}
		
		if(num>=31) {
			String winner = turn ==PLAYER? "플레이어":"컴퓨터";
			System.out.printf("<<<'%s'의 승리>>>\n",winner);
			break;
			
			
		}
		
	}
	System.out.println("게임이 끝났습니다.");
		
		
		
		
		
	
	
	
	
	

}

}
