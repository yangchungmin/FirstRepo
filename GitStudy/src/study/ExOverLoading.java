package study;
/*
 * 메소드 오버로딩( method overloading )
 * - class 안에 같은 이름의 메소드를 여러개 정의하는 것을 말합니다
 *   > 매개변수 type, 갯수가 다르면 하나의 이름으로 여러개의 메소드를 정의 할 수 있습니다
 * - return 타입은 오버로딩 조건에 해당하지 않습니다
 * 
 */

class Add{
	
	//void addData() { }
	
	// int addData(int c, int c) {	}  Error
	
	void addData(int a, int b) {
		System.out.println("- addData(int a, int b) -");
		 int sum = a + b;
		result(a, b, sum);
	}
	
	void addData(double a, double b) {
		System.out.println("- addData(double a, double b) -");
		 double sum = a + b;
		result(a, b, sum);
	}
	
	void result(int a, int b, int sum) {
		System.out.println("- result(int a, int b, int sum) -");
		System.out.println(a +" + "+ b +" = "+ sum);
	}
	
	void result(double a, double b, double sum) {
		System.out.println("- result(double a, double b, double sum) -");
		System.out.println(a +" + "+ b +" = "+ sum);
	}
	
}

public class ExOverLoading {

	public static void main(String[] args) {
		
		Add plus = new Add();
		plus.addData(12, 45);
		System.out.println();
		
		plus.addData(3.4, 2.1);
		
	}
	
}

