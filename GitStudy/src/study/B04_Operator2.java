package study;
import java.util.Scanner;
public class B04_Operator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		/*
		 비교연산자
		 -비교연산의 결과는 참 또는 거짓이다 (boolean 타입이다)
		 -산술 연산과 비교연산이 함께 있으면 산술 연산을 먼저 계산한다 
		 */
		System.out.print("a를 입력해주세요>");
		int a =sc.nextInt();
		System.out.print("b를 입력해주세요>");
		int b =sc.nextInt();
		System.out.println("a > b :"+(a>b));
		
		System.out.println("a == b :" +(a == b));
		System.out.println("a != b :" +(a != b));
		
		/*
		 논리 연산자
		 -boolean 타입값으로 하는연산
		 -&& : 양 옆의 값이 모두 true 일때만 true (AND)
		 -|| : 양 옆의 값 중 하나만 true여도 true (OR)
		 -! : true면 false , false면 true (NOT)
		 
		 */
		System.out.println("\n -- AND --");
		System.out.println(true && true ); 
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\n -- or -- ");
		System.out.println(true || true );//T
		System.out.println(true || false);//T
		System.out.println(false || true);//T
		System.out.println(false || false);//F
		
		System.out.println("\n -- not -- ");
		System.out.println(!true);//F
		System.out.println(!false);//T
		
		
		int x = 3 , y = 6 ,z = 9;
		
		System.out.println("x가 10보다 작고 3의 배수면 통과"+(x>10 && x % 3 == 0) );
		
		
		System.out.println(x % 3 != 0 && y % 3 != 0 && 
				z % 3 != 0 );
		
		
	}
}
