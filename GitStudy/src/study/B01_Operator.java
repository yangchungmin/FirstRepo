package study;

public class B01_Operator {
	public static void main(String[] args) {
		/*
		 연산자(operator)
		 -계산할떄 사용하는것
		 -+, -, *, / ....
		 */
		//산술 연산자
		int a =10,b=7;
		double c = 7.0;
		
		
		System.out.println("+ :"+(a+b));
		System.out.println("- :"+(a-b));
		System.out.println("* :"+a*b);
		System.out.println("/ :"+a/b);		
	
		//정수끼리 나누면 몫만 나온다
		System.out.println("/ :"+a/b);	
		//정수와 실수를 나누면 정확한 값을 계산한다
		System.out.println("/ :"+a/c);	
		
		System.out.println("/(double) :"+a/(double)b);	
		System.out.println("/(float) :"+a/(float)b);	
		
		//몫을 구하고난뒤에 나머지
		System.out.println("% :"+a%b);	
		//제곱
		System.out.println("제곱 :"+Math.pow(a,3));
		System.out.println("제곱 :"+(a^3));//제곱이 아니라 비트연산
		//제곱근
		System.out.println("제곱근 :"+Math.sqrt(52));
		//절대값
		System.out.println("절대값 :"+Math.abs(25));
		//반올림(소수 첫째자리에서 반올림)Math.round()는 반올림하고싶은 자리를 소수 첫째자리로 만들만큼 곱한후 
		//다시 나누는 방식을 통해 원하는 자릿수에서 반올림할수있다
		System.out.println("소수 첫째자리에서 반올림 :"+Math.round(3.335));
		System.out.println("소수 첫째자리에서 반올림 :"+Math.round(3.777));
		System.out.println("소수 셋째자리에서 반올림 :"+Math.round(3.335*100)/100.0);
		//올림
		System.out.println("올림 :"+Math.ceil(1.001));
		//내림
		System.out.println("내림 :"+Math.floor(1.999));
		//더 큰 숫자
		System.out.println("더 큰숫자 남기기 :"+Math.max(1900,1500));
		//더 작은 숫자 
		System.out.println("더 작은숫자 남기기 :"+Math.min(1900,1500));
		
		//비트연산
		//&,|,^,>>,<<
		
		//1010
		//0111
		//----- &
		//0010 -> 2
		System.out.println("a & b :"+(a & b)); //AND
		
		//1010
		//0111
		//----- |
		//1111
		System.out.println("a | b :"+(a | b)); //OR
		
		//1010
		//0111
		//----- ^
		//1101
		System.out.println(a ^ b); //XOR
		
		
		//0000001000 << 2
		//0000100000
		System.out.println(8 << 2 ); //SHIFT
		System.out.println(8 >> 2); //SHIFT
		
		
		
	
	
	
	
	}
}
