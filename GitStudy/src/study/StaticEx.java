package study;

/*
 * static
 * - class ����μ� ��ü�� �������� �ʾƵ� ��� �� �� �ִ� �ʵ�� �޼ҵ��Դϴ�
 * - static Ű���带 �ٿ��� �����մϴ�
 * 
 * static ����ʵ�
 * - ���� : static �ڷ��� ������
 * - ���� class ���� �������� ����ϴ� ����ʵ�(����) �Դϴ�
 * 
 */

public class StaticEx {
	
	private int priValue;
	static int staValue;
	
	static {
		System.out.println("- static area -");
		staValue = 10;
		// priValue = 10; Error
	}
	
	StaticEx(){
		++priValue;
		++staValue;
		System.out.println("priValue :" + priValue + " - staValue : " + staValue);
	}
	
	static void staticMethod() {
		System.out.println("- staticMethod() -");
		System.out.println("staValue : " + staValue);
		//System.out.println("priValue : " + priValue); Error
		int a = 0;
	}
	
	void info() {
		System.out.println("staValue : " + staValue);
		System.out.println("priValue : " + priValue);
	}

}




