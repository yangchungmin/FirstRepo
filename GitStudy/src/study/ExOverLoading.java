package study;
/*
 * �޼ҵ� �����ε�( method overloading )
 * - class �ȿ� ���� �̸��� �޼ҵ带 ������ �����ϴ� ���� ���մϴ�
 *   > �Ű����� type, ������ �ٸ��� �ϳ��� �̸����� �������� �޼ҵ带 ���� �� �� �ֽ��ϴ�
 * - return Ÿ���� �����ε� ���ǿ� �ش����� �ʽ��ϴ�
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

