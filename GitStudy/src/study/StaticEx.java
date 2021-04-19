package study;

/*
 * static
 * - class 멤버로서 객체를 생성하지 않아도 사용 할 수 있는 필드와 메소드입니다
 * - static 키워드를 붙여서 선언합니다
 * 
 * static 멤버필드
 * - 선언 : static 자료형 변수명
 * - 같은 class 에서 공통으로 사용하는 멤버필드(변수) 입니다
 * 
 */

public class StaticEx {
	
	private int priValue;
	static int staValue;
	
	static {
		System.out.println("- static area -");
		staValue = 10;
		// priValue = 10; Error
	}
	
	StaticEx(){
		++priValue;
		++staValue;
		System.out.println("priValue :" + priValue + " - staValue : " + staValue);
	}
	
	static void staticMethod() {
		System.out.println("- staticMethod() -");
		System.out.println("staValue : " + staValue);
		//System.out.println("priValue : " + priValue); Error
		int a = 0;
	}
	
	void info() {
		System.out.println("staValue : " + staValue);
		System.out.println("priValue : " + priValue);
	}

}




