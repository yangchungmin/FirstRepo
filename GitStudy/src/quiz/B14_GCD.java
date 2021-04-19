package quiz;

import java.util.Scanner;

public class B14_GCD {
	public static void main(String[] args) {
	
		/*
		 두 숫자를 입력받고 두숫자의 최대공약수를 구해보세요
		 최대공약수:두숫자의 공약수중 가장 큰 공약수
		 */
		int min=0,i=2;
		System.out.print("첫번째숫자를 입력하세요: ");
		int num1  =new Scanner(System.in).nextInt();
		System.out.print("두번째숫자를 입력하세요: ");
		int num2  =new Scanner(System.in).nextInt();
		
		for(;i<=num1 && i<=num2;) {
			if(num1%i==0 && num2%i==0) 
				min=i;
				i++;
			
		}
		
		System.out.println("최대 공약수 : "+min);
	
		}
		
	
	}

