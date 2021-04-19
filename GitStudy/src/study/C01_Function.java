package study;

public class C01_Function {
	public static void main(String[] args) {
		
		/*
		 함수 (Function)
		 -기능을 미리 정의 해두고 나중에 가져다 쓰는것
		 -정의해둔 함수이름 뒤에 ()를 붙혀서 함수를 호출하면 
		 호출한자리에 함수의 실행결과가반환된다.
		 -함수를 정의할때 해당 함수가 반환할 값의 타입을 앞에 적어둔다
		 -자바에서 함수(메서드)는 클래스 내부에 선언해야된다
		 -나중에 재사용할 가능성이 있는 기능들을 미리 만들어둠 으로써 작업의 반복을 줄일수있다
		 
		for(int i=0;i<10;i++) {
		print_rabbit();
		
		print_rabbit();
		print_rabbit();
		
		}
		*/
		
		System.out.println(apple_basket(155,10));
	
	}
	
	
	//ex:사과의 개수와 바구니의 크기를 전달하면 필요한바구니의 개수를 알려주는 함수
	//public static : 나중에 생각할것
	//int : 이 함수의 실행결과의 타입(리턴타입(return type))
	//apple_basket : 타입뒤에 함수명을 정의할수있다
	//apple_basket(int apple,int size) : 이 함수를 실행할때 int타입 값을 두개 전달 받아야한다(매개변수(arguments=args))
	//리턴타입 void는 해당함수가 반환하는 값이 없다는 것을 나타낸다
	public static String apple_basket(int apple,int size) {
		
		int result;
		if(apple%size==0) {
			result =apple/size;
		}else {
			result =apple/size+1;
			
		}
		return "필요한 바구니의 개수는"+result+"개 입니다.";
	}
	
	
	
	
	
	
	
	
	public static void print_rabbit() {
		System.out.println("====================");
		System.out.println("        /)/)");
		System.out.println("       (  ..)");
		System.out.println("       (  >$)");
		System.out.println(" Have a Good Time.");
		System.out.println("====================\n");
	}

}



