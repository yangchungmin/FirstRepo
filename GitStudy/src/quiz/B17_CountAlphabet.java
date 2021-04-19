package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	public static void main(String[] args) {
	/*
	 사용자로부터 문자을 하나 입력받고
	 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 모두 출력해보세요
	 (대소문자 구분없이 카운트)
	 */
	
	Scanner sc =new Scanner(System.in);
	System.out.print("영어단어를 입력하세요 : ");
	String eng=sc.nextLine();
	
	eng =eng.toUpperCase();
	
	int[] count =new int[26];
	
	for(int i=0;i<eng.length();i++) {
		char ch = eng.charAt(i);
		//System.out.println(ch);
		if(ch>='A'&& ch<='Z' ) {
			count[ch -'A']++;
			
		}
	
		
		}
		
	for(int i=0;i<26;i++) {
		if(count[i]!=0) {
			System.out.println((char)(i+'A')+":"+count[i]+"번");
		}
	}
}
}