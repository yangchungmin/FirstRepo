package study;

import java.util.Random;

public class B16_RandomClass {
	public static void main(String[] args) {
		/*
		 2.Random 클래스
		 
		 -좀 더 편리하게 랜덤 값을 선택할수있는 기능들이 모여있는 클래스
		 -생성할때 무작위 랜덤시드가 선택된다
		 -원하는 랜덤시드를 선택할수도있다
		 */
		System.out.println("------------------");
		
		//새로운 랜덤시드 생성
		Random ran = new Random();
		
		//Random.nextInt(bound)
		//0~bound미만의 정수
		System.out.println(ran.nextInt(45)+1); //1~45의 랜덤정수
		System.out.println(ran.nextInt(41)+30); //30~70의 랜덤정수
		
		
		//Random.nextBoolean()
		//-Random클래스는 원하는 타입의 랜덤값을 쉽게 얻을수 있다
		//앞 뒤 동전던지기
		System.out.println(ran.nextBoolean() ? "앞":"뒤");
		
	}
}
