package study;

public class B16_Random {
public static void main(String[] args) {
	/*
	1. Math.random()
	 -double 타입의 랜덤 소수를 생성한다(0 <= x < 1)
	 -이 랜덤 소수를 이용하여 원하는 범위의 숫자를 만들수있다
	 #원하는 범위의 숫자를 만드는 순서(ex: 30~60)
	 (1) 생성된 랜덤 소수에 원하는 숫자의 개수를 곱한다(31개)
	 	(0*31<= x <1*31)
	 (2) 원하는 숫자중 가장 작은숫자를 더한다
	 	(0 * 31 + 30 <= x < 1* 31 +30)
	 (3)
	 	소수점 아래를 삭제한다
	 	-Math.floor() 또는 int로 타입캐스팅
	 */
	
	
	
	
	
	
	for(int i=0;i<10;++i) {
		System.out.print((int)(Math.random()*31+30));
	}

//	1~45의 랜덤숫자를 7개출력해보세요

	for(int i=1;i<=7;++i) {
		System.out.println((int)(Math.random()*45)+1);
	}

	}
}

