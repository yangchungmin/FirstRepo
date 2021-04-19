package quiz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

/*
 *사용자로부터 숫자를 제대로 입력받을떄까지 계속 입력받는 프로그램을 만들어보세요
 *(잘못된 값이 입력되어도 강제종료 되지않고 올바른 값이입력되면 출력후 프로그램종료
 
public class C13_InputRightThing {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int a ;
	
	System.out.print("반드시 숫자만 입력해주세요");
	a = sc.nextInt();
	
	try {
		 a = sc.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("다시 입력해주세요");
		
	}
	
	
	while(!sc.hasNextInt()) {
			System.out.println("숫자만 입력해주세요");
		
	}
	System.out.println("입력하신 숫자:"+a);
	System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
	public static void retry() {
		
	}
	*/
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	int a = inputInt("숫자 :");
	int b = inputInt("두번째 숫자:");
	System.out.println("입력하신 숫자:"+a);
	System.out.println("프로그램이 정상적으로 종료되었습니다");
}
public static int inputInt(String message) {

	int num;
	
	while(true) {
		try {
			System.out.println(message);
			num= sc.nextInt();
			break;
	  }catch(InputMismatchException e) {
		  	sc.nextLine();
	  }
	
	}
	//sc.close(); 더이상 쓰지않을 스캐너를 삭제(System.in은 함부로 close안해야됨)
	return num;
}
}