package quiz;
import java.util.Scanner;
public class B05_ConditionQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
      	
      	 유니코드활용
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true        
        7. 사용자가 입력한 문자열이 exit일 때 true
*/        
		char a = 'q';
		char b = ' ';
		char c = '0';
		char d = 'b';
		char e = '가';
	    char f = 'は';
		String ch ="exit";
		
		//1.
		System.out.println(a == 'q' || a == 'Q');
		//2.
		System.out.println(b != ' ' || b != '\t');
		//3.
		System.out.println(c <= '9' && c >= '0');
		//4.
		System.out.println((d >= 'a'  && d <= 'z') || (d >= 'A'  && d <= 'Z'));
		//5.
		System.out.println(e >= 0xAC00 && e <= 0xD7A3);
		//6.
		System.out.println((f >= 0x3040 && f <=0x309F) || (f >= 0x30A0 && f <=0x30FF ));
		//7.
		System.out.print("문자열을 입력하세요 :");
		String in = sc.nextLine();
		System.out.println(ch.equals(in));
		
		
		
		
		
		
		
		
		
	}
}
