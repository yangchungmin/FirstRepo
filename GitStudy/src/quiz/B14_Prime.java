package quiz;

import java.util.Scanner;

public class B14_Prime {




public static void main(String[] args) {
	/*
	 사용자로부터 숫자를 입력받으면 
	 1부터 입력한 숫자사이에 존재하는 소수를 모두 출력하세요
	 
	 소수=1과 자기자신으로만 나누어지는수
	 */
	System.out.print("숫자를 입력하세요: ");
	int count =0; 
	int num  =new Scanner(System.in).nextInt();
	
	for(int i =2;i<=num;i++) {
			count=0;
		for(int j =2;j<i;j++) {
			if(i%j==0) {
				System.out.printf("검사하는숫자[%d]는[%d]로 나누어 떨어졌습니다.\n",i,j);
				System.out.println("\t소수가아닙니다.");
				count++;
				break;
			}
		}
	if(count==0) 
		
		System.out.printf("%d는 소수입니다\n",i);
			
			
		
		
		}
	System.out.println("------------------------------");
	}
}
