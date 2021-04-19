package study;

public class D10_args {
	/*
	 main 메서드 첫번쨰 매개변수(args)의 역활
	 -프로그램실행시 사용자가 지정한 옵션을 main의 첫번째 매개변수에 받는다
	 -사용자가 지정한 옵션에따라 다르게 동작하는 프로그램을 만들수있다
	 */
	
	
	public static void main(String[] args) {
		System.out.println(args);
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
