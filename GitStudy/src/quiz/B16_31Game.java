package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {
public static void main(String[] args) {
	/*
	 31 ������ ��������
	 
	 1.��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ��Ѵ�.
	 (1,2,3 �ۿ� �����Ҽ� ����)
	 2.��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	 3.������ �������� �����Ѵ�
	 4.�������� 31�̻��� ���ڸ� ���� �÷��̾ �й��Ѵ�
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
				System.out.print("���� ��(3�����Է�):");
				user =sc.nextInt() ;
				
				if(user>0 && user<=3) {
					break;
				}else {
					System.out.print("�߸����Է��Դϴ�");
				}
			
			}
			num += user;
			
			System.out.printf("����� %d�� ���� / ���հ�:%d\n",user,num);
			turn =COMPUTER;
		}else if (turn==COMPUTER) {
			int com =(int)(Math.random()*3+1) ;
			num += com;
			System.out.println("��ǻ���� �� : "+com);
			
			System.out.printf("��ǻ�Ͱ� %d�� ���� / ���հ�: %d\n",com,num);
			turn=PLAYER;
			
		}
		
		if(num>=31) {
			String winner = turn ==PLAYER? "�÷��̾�":"��ǻ��";
			System.out.printf("<<<'%s'�� �¸�>>>\n",winner);
			break;
			
			
		}
		
	}
	System.out.println("������ �������ϴ�.");
		
		
		
		
		
	
	
	
	
	

}

}
