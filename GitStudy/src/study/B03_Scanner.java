package study;
import java.util.Scanner;
public class B03_Scanner {
	
	/*
	 * Math Ŭ����
	 * -���а� ���õ� ��ɵ��� ���ִ�  Ŭ����
	 * ex)abs(),round(),ceil()...
	 * java.util.ScannerŬ����
	 -���α׷��� �ܺηκ��� �Է��� ������ �ִ� ��ɵ��� ���ִ� Ŭ����
	 -��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹������ִ�
	 -�ַܼκ��� �Է¹ް� ���������� System.in�� ����Ѵ�
	 */
	public static void main(String[] args) {
		//new Scanner(System.in);
		//-System.in���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� ����
		
		//ScannerŸ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
		Scanner sc = new Scanner(System.in); 
		
		//Scanner�� nextInt() : �������� ������ ������ �ϳ� ������. �������� �������� �������� �Է��� ��ӱ�ٸ���.
		System.out.print("������ �Է����ּ���(21������) >");
		int a = sc.nextInt();
		System.out.println("�Է��Ͻ� ����"+a+"�Դϴ�.");
		System.out.println("�Է��Ͻ� ���� 3�� ���ϸ�"+a*3+"�Դϴ�.");
		System.out.println("1000�� �Է��Ͻ� ���� ���̴�"+(1000-a)+"�Դϴ�.");
		
		//Scanner�� nextDouble() :�������� ������ �Ǽ��� �ϳ� ������. �������� �������� �������� �Է��� ��ӱ�ٸ���.
		System.out.print("�̹����� �Ǽ��� �Է����ּ��� >");
		double b = sc.nextDouble();
		
		System.out.print("�ι�°�� �Է��Ͻ� ���� "+b+"�Դϴ�");
		System.out.print("ù��° ���� �ι�° ���� ���ϸ� "+a*b+"�Դϴ�");
		
		
	
	}
}
