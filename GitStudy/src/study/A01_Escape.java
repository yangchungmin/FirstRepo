package study;

public class A01_Escape {
	public static void main(String[] args) {
		
		/*
		 Escape 문자
		 -특수한 기능을 가진문자들
		 -그냥 출력하려고 하면 문제가 발생하는 특수한 문자들
		 -앞에 \ 가 붙은 문자는  Escape 문자로 간주한다
		 -앞에 붙은 \와 뒤의 문자가 합쳐져서 하나의 문자로 인식된다
		 */
		
		System.out.println("안녕하세요, 반갑습니다");
		
		// \n :줄바꿈 기능 (linefeed,breakline,newline...)
		System.out.println("안녕하세요, 반\n갑\n습니다");
		
		// \t :Tab키의 기능을 가진 특수문자
		System.out.println("안녕하세요, 반\t갑\t습니다");
		
		// \\ : Escape문자의 기능을 이용하지 않고 그냥 출력하고싶을때
		System.out.println("안녕하세요, 반\\t갑\\t습니다");
		
		// ex) jdk의 경로를 출력하고싶을때
		System.out.println("C:\\Program Files\\JAVA\\JDK");
		
		// \" : 그냥 큰 따옴표를 출력하고 싶을떄
		System.out.println("오늘은 점심으로 \"컵라면\"을 먹어야겠다.");
		
		// \' : 그냥 작은 따옴표를 출력하고 싶을때 (큰 따옴표안의 작은 따옴표는 문제가되지않음) 
		System.out.println('\'');
		
	
	
	}
}
