package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {
	

	public static void main(String[] args) {
		/*
		 ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
		 1.�÷��̾�� 8���� �õ��� �Ҽ��ִ�
		 2.�� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
		 
		 	���ڿ� ��ġ�� �� �������- Strike
		 	���ڸ� ������� -Ball
		 	
		 	ex: ������ 3456�϶�
		 		- 5634 4Ball
		 		- 3789 1Strike
		 		- 3654 1Strike 3ball
		 		
		 	���߰� ���� ������� ������� �˷��ֱ�
		 */
Random rc =new Random();
Scanner input_scanner = new Scanner(System.in);
int Strike=0;
int Ball=0;
int count=0;
final boolean DEBUGMODE =true;
StringBuilder answer_builer = new StringBuilder();

for(int i=0;i<4;i++) {

	answer_builer.append((int)(Math.random()*10));
	
}
String answer=answer_builer.toString();

if(DEBUGMODE) {
	System.out.printf("�̹� ���� [%s]\n",answer);
}
//�⺻Ÿ�� ������ 0���� �ʱ�ȭ
int ball=0;
int strike=0;
int tryCount =0;
//������ ������ null�� �ʱ�ȭ�Ҽ��ִ�
String input = null;

while(strike !=4 && tryCount !=8) {
	strike =0;
	ball=0;
	while(true) {
		System.out.printf("�õ�Ƚ��%d �Է����ּ���: ",tryCount);
		input = input_scanner.nextLine();
		
		if(input.length()!=4) {
			continue;
	}
		boolean valid = true;
		
		for(int i=0;valid&&i<4;i++) {
			if(input.charAt(i)<'0'|| input.charAt(i)>'9') {
				valid =false;
				
				
			}
		
		  }
			if(valid) {
				break;
			}else {
			System.out.println("4�ڸ� ���ڸ� �Է����ּ���"); 
		}
			
	}	
	
		//��Ʈ����ũ �� üũ
		if(answer.equals(input)) {
			strike=4;
		}else {
			for(int i=0;i<4;i++) {
			
				if(answer.charAt(i)==input.charAt(i)) {
					strike++;
				}else  {
					for(int j=0;j<4;j++) {
						if(answer.charAt(i)==input.charAt(j)) { 
							ball++;
							break;
						}
				 }
			}
					
	   }
	}
			
	System.out.printf("%d strike,%d ball\n",strike,ball);
	tryCount++;
	
   }
	
	
	System.out.println("��������!");
	
	}
  }
