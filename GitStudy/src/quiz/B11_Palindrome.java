package quiz;

import java.util.Scanner;

public class B11_Palindrome {
public static void main(String[] args) {
	/*
	 사용자로부터 단어를 하나 입력받고 해당단어가 회문이라면 "PALINDROME"을 출력
	 회문이 아니라면 "NOT PALINDROME"을 출력
	 */
	
	System.out.print("판별한 문자열을 입력하세요: ");
	String word =new Scanner(System.in).nextLine();
	boolean check=true;
	for(int i =0;i<word.length()/2;i++) {
	
	char ch = word.charAt(i);
	char sh = word.charAt(word.length()-i-1);
	
		if(ch == sh) {
			check =true;
		}else {
			check=false;
			break;
		}
	
	}
	 
	if(check==true) {
		System.out.println("PALINDROME");
		}else {
		System.out.println("NOT PALINDROME");
		}
	
	

	}
}