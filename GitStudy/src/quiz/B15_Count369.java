package quiz;

import java.util.Scanner;

public class B15_Count369 {


public static void main(String[] args) {
	/*
	 사용자로부터 정수를 하나 입력받고
	 해당 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
	 */
	System.out.print("숫자를 입력하세요: ");
	int num  =new Scanner(System.in).nextInt();
	int a,b,i,count = 0;
	for(i=1;i<=num;i++) {
		a=i/10;
		b=i%10;
		if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
			count += 2;
			
		}else if((a==3 || a==6 || a==9) && (b!=3 || b!=6 || b!=9)) {
			count += 1;
			
		}else if((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
			count += 1;
			
		}
		
		
	}	
	
	System.out.println("박수횟수: "+count+"번");

	}
}
