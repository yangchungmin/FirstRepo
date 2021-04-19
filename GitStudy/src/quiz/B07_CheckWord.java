package quiz;

import java.util.Scanner;

public class B07_CheckWord {
public static void main(String[] args) {
	/*
	 사용자로 부터 단어를 하나 입력받고 첫번쨰 글자와 마지막번째 글자가 일치하면 "ok"를 출력
	 아니라면 "not ok"를 출력하세요
	 */
Scanner sc = new Scanner(System.in); 
System.out.print("단어를 입력해주세요:");
String word = sc.nextLine();

if(word.charAt(0) == word.charAt(word.length()-1)) {
	System.out.println("OK");
}else {
	System.out.println("NOT OK");
}
//next() :다음 단어를 String타입으로 받아오기(공백,\t 기준)

//ex) banana orange apple

//nextLine() :다음 문자열을 String타입으로 받아오기(\n 기준)





}
}
