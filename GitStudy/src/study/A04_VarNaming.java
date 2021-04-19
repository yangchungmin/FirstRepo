package study;

public class A04_VarNaming {
	public static void main(String[] args) {
		
		/*
		 변수를 사용해야 하는 이유
			1.값을 한번에 도출해내기 위해서
			2.값의 의미를 부여할수있다
			-값의 용도를 빠르게 파악할수있다
			3.
		 *
		 *
		 */
		
		int apple_count =15;
		int apple_price =493;
		int apple_calorie =110;
		int apple_gram =50;
		
		System.out.println("사과의 개수:"+apple_count);
		System.out.println("사과의 총가격:"+apple_count*apple_price+"원");
		System.out.println("사과의 개당 칼로리:"+apple_calorie+"kcal");
		System.out.println("사과의 총칼로리:"+apple_count*apple_calorie+"kcal");
		System.out.println("사과의 개당 무게:"+apple_gram+"g");
		System.out.println("사과의 총무게:"+apple_count*apple_gram+"g");
		
		/*
		 #변수 작명 규칙(권장사항)
		 1.두 단어 이상을 이어붙혀서 사용할때 _를 사용한다(snake_case)
		 	ex)apple_count
		 2.두 단어 이상을 이어붙혀서 사용할떄 대문자를 사용한다(camelCase)
		 	ex)appleCount
		 3.변수명 첫글자는 소문자를 사용한다
		 4.클래스명 첫글자는 대문자를 사용한다
		 5.프로그램내에서 값이 변하지 않을 변수(상수)는 모두 대문자를 사용한다
		 	ex)APPLE_PRICE
		 6.변수에 들어있는 값을 추측할수있는 적절한 단어를 사용한다
		 
		 #변수 작명 규칙(필수사항)
		 1.변수의 첫번째 글자는 숫자가 될수없다
		 	ex)1st,4pple
		 2.변수명 사이에는 공백을 사용할수없다
		 3.특수문자는 _와 $ 만 사용할수있다
		 4.이미 자바에서 사용하고있는 키워드는  변수명으로 사용할수 없다.
		 (보라색으로 표기되어있는것들)
		 	ex)bite,int,float,double,public,static
	
		  */
		
		
		
	
	
	
	
	
	
	
	
	
	
	}
}

