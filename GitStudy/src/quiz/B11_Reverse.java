package quiz;

import java.util.Scanner;

public class B11_Reverse {
public static void main(String[] args) {
	/*
	 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	 */

	System.out.print("문장을 입력하세요: ");
	String word =new Scanner(System.in).nextLine();

	for(int i =word.length();i>0;i--) {
		System.out.print(word.charAt(i-1));
	}
	
	
	









}
}
