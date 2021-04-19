package study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C15_Throw {
/*
1.throw
-원하는 예외를 발생시킨다

2.throws
-해당 메서드에서 이러한 예외들을 발생시키다는것을 알린다
-해당 메서드를 호출하는곳에서 경고를 해줄수있다

3.Exception클래스를 상속받은 예외는 반드시 처리해야하는 예외가 된다
-Exception은 예외처리를 하지않으면 컴파일 에러를 발생시킨다
-예외철가 된경우에만 컴파일을 허용해준다
4.RuntimeException 클래스를 상속받은 예외는 꼭 처리하지 않아도 되는 예외가 된다
-InputMismatchException ,ArrayIndexOutOfBoundsException..등등
-예외처리를 하지 않아도 컴파일 에러는 발생하지않는 예외들
 
	public static void main(String[] args) {
		C15_Throw instance = new C15_Throw();
		instance.dangerous_method();
		try {
			instance.dangerous_method();
		}
		catch() {
			
		}
		
		
	}	
	public void dangerous_method()throws ArrayIndexOutOfBoundsException {
		int[] arr =new int[5];
		arr[5] = 10;
	
		
	}
}
*/
public static void main(String[] args) {
	
	C15_Throw instance = new C15_Throw();	
	try {
		instance.dangerous_method();
		instance.dangerous_method2();
	} catch (FileNotFoundException e) {
		System.out.println("파일못찾음");
	}catch(ArrayIndexOutOfBoundsException e) {

	System.out.println("배열터짐"+e.getMessage());
	}
	
	try {
		instance.checkEven(20);
		instance.checkOdd(14);
	}catch(NotEvenException e) {
		System.out.println("짝수아님 익셉션 발생");
	}catch(NotOddException e) {
		System.out.println("홀수 아님 익셉션 발생");
	}
	
	System.out.println("프로그램 정상종료");
}	
public void dangerous_method() throws FileNotFoundException{
	File f = new File("F:\\nameless.txt");
	}


public void dangerous_method2() {
	throw new ArrayIndexOutOfBoundsException("그냥만들엇씀");
	
	}

public void checkEven (int num) throws NotEvenException {
	if (num %2 ==0) {
		System.out.println("짝수입니다");
	}else {
		throw new NotEvenException();
	}
	System.out.println("checkEven 메서드가 정상 종료 되었습니다");
}
public void checkOdd (int num)  {
	if (num %2 ==1) {
		System.out.println("홀수입니다");
	}else {
		throw new NotOddException();
	}
	System.out.println("checkOdd 메서드가 정상 종료 되었습니다");
}
}
//짝수가 아닐떄 발생시킬 예외(예외처리하지않으면 컴파일 불가)
class NotEvenException extends Exception{
	public NotEvenException() {
	
	super("짝수가 아니어서 발생하는 예외");
	}
}
//홀수가 아닐때 발생시킬 예외 (예외처리하지않아도 빨간줄이 뜨지않는 예외)
class NotOddException extends RuntimeException{
	public NotOddException() {
	super("홀수가 아니어서 발생하는 예외");
	}
}