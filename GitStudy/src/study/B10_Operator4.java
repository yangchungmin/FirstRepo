package study;

public class B10_Operator4 {
public static void main(String[] args) {
	/*
	 #대입 연산
	 = : 왼쪽의 변수에 오른쪽의 값을 대입한다
	 */

	int num =10;
	num = num + 20;
	System.out.println(num);

	/*
	 복합 대입 연산자
	 변수에 결과를 누적시키는 연산자
	 */
	
	num =10;
	System.out.println(num += 15);//num = num+5
	System.out.println(num -= 3);//22
	System.out.println(num *= 2);//44
	System.out.println(num /= 4);//11
	System.out.println(num %= 3);//2
	
	/*
	 단항 연산자
	 -변수에 결과를 1씩 누적시키는 연산자
	 ++ 과  -- 의 위치에따라 결과가 달라진다
	 */
	num = 10;
	num++; // num+1
	num--; // num-1
	System.out.println(num);
	
	//++ , --를 뒤에붙히면 해당 줄의 모든명령을 실행한뒤에 값이변한다
	//++ , --를 앞에붙히면 해당 줄의 명령을 실행하기전에 값이변한다
	num =3;
	System.out.println(++num);
	
	
	
	



}
}
