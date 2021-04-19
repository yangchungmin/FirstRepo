package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {
public static void main(String[] args) {
	/*
	 사용자가 입력한 문자열에 알파벳이 포함되어있으면 true를 출력,없으면 
	 false를 출력
	 
	 i=iterable
	 
	 
	 
	 */
	boolean contain_alphabet =true;
	char ch;
	System.out.print("판별한 문자열을 입력하세요: ");
	String word =new Scanner(System.in).nextLine();
	
	for(int i =0;i<word.length();i++) {
		ch = word.charAt(i);
		
		if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122))) {
			contain_alphabet=false;
			
		}
	}
	System.out.println("입력한 문자열에대한 알파벳여부 : "+contain_alphabet);



	


	}
}
