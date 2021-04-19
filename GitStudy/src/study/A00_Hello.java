package study;

public class A00_Hello {
	public static void main(String[] args) {
		//class 파일은 bin 폴더에 저장됨
		System.out.println("Hello, World 1");
		/*
		  자바의 데이터들 (리터럴)
		 
		 1. "" : 문자열(String) 문자를 여러개 쓸수있는 데이터 타입
		 2. '' : 문자(Character) 단하나만 쓸수있는 데이터 타입
		 3. 정수(Integer) : 숫자를 적는것
		 4. 실수(Float,Double) : 소수를 적는것
		 
		 문자들은 실제로 숫자값을 지니고있다
 		
 		(int)의 역활 - 문자를 숫자로 보이게함
 			((int)'한')
 		(char)의 역활 - 숫자를 문자로 보이게함
		 	((char)54621)
		 
		 */	
	System.out.println((char)('A'+0));
	System.out.println((char)('A'+1));
	System.out.println((char)('A'+2));
	System.out.println((char)('A'+3));
	
	System.out.println("'A'의 보여지는 모습 :"+'A');
	System.out.println("'A'의 코드값 :"+(int)'A');
	System.out.println("'1'의 코드값 :"+(int)'1');
	System.out.println("1"+5);
	System.out.println('1'+5);
	System.out.println(1+5);
	
	//정수 + 실수는 실수가 된다
	System.out.println(10+10.123);
	
	//정수 + 문자는 정수가된다
	System.out.println('a'+10);
	System.out.println((char)('a'+10));
	
	
	
	
		
	
	
	
	
	
	
	}

}
