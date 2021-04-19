package study;

public class B11_For {
	public static void main(String[] args) {
		/*
		 반복문 (Loop)
		 -for,while,do-while(x)
		 
	
		 for (초기화; 조건; 증가값){
		 	가운데 있는 조건이 true인 동안 반복될 명령어들을 적는 곳
		 }
		 
		 1.가장 기본적인 형태의 for문
		 -원하는 횟수만큼 반복하기 가장 좋은형태의 for문\
		 -초기값에는 0을 주고, 조건에는 반복하고 싶은 횟수를 적으면된다
		 -증가는 1씩한다
		 2.초기값, 증가값, 조건은 마음대로 변경할수있다.
		 3.초기값과 증가값의 위치는 마음대로 변경할수 있다.
		 */
	//1.
	for(int i =0; i<10000000;++i) {
		System.out.println("hello world!"+i);
	}
	
	//2.
	//3.변수는 중괄호를 벗어나면 죽는다 = 지역변수
	int x= 0;
	for(;x<10;) {
		System.out.println("3번째 반복문"+x++);
	}
	//4.반복문 내부에 다른 문법들도 자유롭게 사용할수 있다.
	for (int month=1;month<=12;++month) {
		String season;
		switch (month) {
		case 3: case 4: case 5:
			season="봄입니다";
		    break;
		case 6: case 7: case 8:
			season="여름입니다";
			break;
		case 9: case 10: case 11:
			season="가을입니다";
			break;
		case 12: case 1: case 2:
			season="겨울입니다";
			break;
		default :
			season="잘못된 입력입니다";
			break;
		}
		System.out.printf("%2d월은 [%s]입니다.\n",month,season);
	}
	
	//5.for문은 조건을 비워놓으면 무한반복한다.
	// -반복문은 원하는 타이밍에 break문을 통해 탈출할수있다
	int count =0;
	for(;;) {
		System.out.println("hello!"+count++);
		if(count ==7) {
			break;
		}
	}
	
	
	 /*반복문으로 총합구하기
	 1.총합을 저장할 변수를 하나 선언하고 0으로 초기화 해둔다
	 2.반복문을 진행하면서 해당변수에 값을 누적시킨다
	 */
	int sum =0;
	for(int i1 =80; i1<=333;++i1) {
		if (i1%3==0) {
			sum += i1;
		}
	}
	System.out.println("80부터 333사이의 3의 배수총합 : "+sum);
	
	}

}
