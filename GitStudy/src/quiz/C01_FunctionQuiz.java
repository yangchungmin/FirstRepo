package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 
	 1. 전달한 문자가 알파벳이면 true를 반환,아니면 false를 반환하는 함수
	 2. 전달한 숫자가 3의 배수이면 true를 반환 아니면 false를 반환하는 함수
	 3. 숫자를 하나 전달하면 문자열 "짝수입입니다" 또는 "홀수입니다"를 반환하는 함수
	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	factorial : (n)*(n-1)*(n-2).....3*2*1
	 */
	
	//1.
	public static boolean alphabet(char alpha) {
		
		return (alpha >='A'&& alpha <='Z' ||alpha >='a'&& alpha <='z' );
	}
			
	
	//2.
	public static boolean num (int number) {
		
		return number % 3 ==0;
	}
	
	
	
	//3.	
	public static String num1(int num) {
			return num%2==0? "짝수입니다":"홀수입니다";
			
		}
		
	//4.	
	public static int[] FindDivide(int num) {
		
		
		
		boolean[] divide = new boolean[num];
		int count =0;
		for(int i =1;i<=num;++i){
			if(num%i==0) {
				divide[i-1]=true;
				count++;
			}	
			
		}
		int[] result = new int[count];
		int index =0;
		
		for(int i =0;i<divide.length;++i) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
	
		return result;
		
		
	}
	
	//5.
	public static boolean num2(int num) {
		
			
		double sqrt =Math.sqrt(num);
		
		for(int i=2;i<=sqrt;i++) {
			if(num%i==0) {
				return  false;
				
			}
		}
		return true;
	}
		
	//6.	
	
	public static int factorial(int n) {
	
		if (n==2) {
			return 2;
		}
	
		return n * factorial(n-1);
	}
	
	
	
	
	public static void main(String[] args) {
		
			
	
		System.out.println(Arrays.toString(FindDivide(120)));
		
		for(int i=1;i<10;i++) {
			System.out.println(factorial(11));
		}
	
	}
}
