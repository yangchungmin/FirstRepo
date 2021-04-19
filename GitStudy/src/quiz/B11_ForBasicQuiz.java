package quiz;

import java.util.Scanner;

public class B11_ForBasicQuiz {
public static void main(String[] args) {
	
	
	/*
	 사용자가 숫자를 입력했을 때
	 1.10부터 입력한 숫자까지의 총합을 구해보세요
	 2.1부터 입력한 숫자사이의 5의배수만 모두 출력해보세요
	 */
	//1.
	System.out.print("숫자를 입력해보세요:");
	int num =new Scanner(System.in).nextInt();
	int sum =0;
	for(int i =10; i<=num;++i) {
			sum += i;
		}
	
	System.out.println("10부터 입력한숫자사이의 총합 : "+sum);
	
	

	for (int i=1;i<=num;++i) {
		if (i % 5 !=0) { 
			continue;
	}
	System.out.println(i);
	}
}
}