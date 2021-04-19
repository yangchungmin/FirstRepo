package study;

public class B05_TypeCasting {
	public static void main(String[] args) {
		/*
		 타입 캐스팅
		 -타입이 자연스럽게 변하는 경우(타입이 변하더라도 문제가없을때)
		 -타입을 강제로 변환시켜야하는 경우(타입이 변하면 문제가 생길때)
		 
		# 타입의 크기
		 정수타입
		 -byte(1)<char(1), short(2)<int(4)<long(8)
		 실수타입
		 -float(4)<double(8)
		
		정수타입은 무조건 실수타입보다 작다
		 */
		
		//1.자연스러운 타입캐스팅
		byte _byte =127;
		int _int ;
		long _long;
		float _float;
		short _short;
		
		_int = _byte;
		_int=21000000;
		_long =_int;
		_float =_long;
		
		System.out.println(_float);
		
		//2.값이 손상될 위험이 있는 타입 캐스팅(강제 타입캐스팅)
		
		_int = 50000;
		_short=(short)_int; //값이 손상될수도 있으므로 컴파일러가 경고를해줌.
		
		System.out.println(_short);
		//ex)
		int a =(int)Math.round(10.3);
		
		//3.같은 값이더라도 다르게 해석될수있는 타입의 경우 타입 캐스팅이 필요하다
		int b =80;
		char ch = 'z';
		
		System.out.println((char)b);
		System.out.println(b);
		
		System.out.println((int)ch);
		System.out.println(ch);
		
		//코드표를 외울 필요가없다(char 타입에 숫자를 사용할 이유가없다)
		ch ='M';
		System.out.println(ch > 'A');
		
		ch ='감';
		System.out.println(ch > '가');
		System.out.println(ch < '나');
		System.out.println((int)'가');
		
		
		
		
		
		
		
		
		
	}
}
