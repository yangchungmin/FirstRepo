package quiz;

import java.util.Scanner;
import java.util.stream.IntStream;

public class B11_is_numeric_str {
	public static void main(String[] args) {
		/*
		 입력받은 문자열에 숫자만 포함되어있다면 result가 1
		 다른문자가 포함되어있다면 result가 0
		 
		int result = 0;
		char check;
		System.out.print("판별할 문자열을 입력하세요: ");
		String word =new Scanner(System.in).nextLine();
		
		for(int i =0;i<word.length();i++) {
			 check = word.charAt(i);
			
		
			if(check >= 48 || check <= 57){
				result = 1;
				
			}else {
				result = 0;
				
			}
			
			
		}
		System.out.println(result);
	
	*/
		System.out.print("판별할 문자열을 입력하세요: ");
		String word =new Scanner(System.in).nextLine();
		
		int numeric_str = 1;
		
		
		for(int i =0;i<word.length();++i) {
			char ch = word.charAt(i);
		
		if(ch <'0' || ch > '9') {
			numeric_str= 0;
			break;//다른문자를 하나라도 찾으면 그만찾기
		}
		
		
		
		}
		
		System.out.println("numeric_str : "+(numeric_str > 0 ?"true":"false"));
		
		
		
		
		
		
	}
}
	
