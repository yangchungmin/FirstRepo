package study;

public class B06_If {
	public static void main(String[] args) {
		/*
		 if문
		 -()안의 값이 true일때 {}안의 내용을 실행한다
		 -()안의 값이 false일때는 {}안의 내용을 무시한다
		 -{}안에 들어갈 내용이 한줄이면 {}를 생략할수있다
		
		 else if문
		 -위에 있는 if문이 실행되지 않았다면 if문처럼 동작한다
		 -else if는 단독으로 사용할수 없다
		 -else if는 여러번 사용할수 있다
		
		else문
		-위에 있는 if,else if가 모두 실행되지않는다면 {}안의 내용을 무조건 실행한다
		-if바로 다음에 사용할수도 있다
		 *else가 붙어있는 조건문은 무조건 한번은 실행된다
*/
		
		int a = -8;
		if (a==5) { 
			System.out.println("Hello");
		}else if(a>0) {
		System.out.println("niec to meet you.");
		}else if(a>-10) {
			System.out.println("Greeting");
		}else if(a>-20) {
			System.out.println("Good to see you");
		}
		
		
		
		
		char ch ='가';
		if (ch >= '가' && ch <='힣') {
			System.out.println("ch안의값은 한글입니다");
		}else if((ch >= 0x3040 && ch <=0x309F) || (ch >= 0x30A0 && ch <=0x30FF )) {
			System.out.println("ch안의 값은 일본어 입니다");
		}
		else {
			System.out.println("ch안의값은 일본어도 한글도 아닙니다");
		}
		System.out.println("프로그램이 끝났습니다");
	}

}
