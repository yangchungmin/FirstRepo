package study;
import java.util.Scanner;
public class B04_Operator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		/*
		 �񱳿�����
		 -�񱳿����� ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
		 -��� ����� �񱳿����� �Բ� ������ ��� ������ ���� ����Ѵ� 
		 */
		System.out.print("a�� �Է����ּ���>");
		int a =sc.nextInt();
		System.out.print("b�� �Է����ּ���>");
		int b =sc.nextInt();
		System.out.println("a > b :"+(a>b));
		
		System.out.println("a == b :" +(a == b));
		System.out.println("a != b :" +(a != b));
		
		/*
		 �� ������
		 -boolean Ÿ�԰����� �ϴ¿���
		 -&& : �� ���� ���� ��� true �϶��� true (AND)
		 -|| : �� ���� �� �� �ϳ��� true���� true (OR)
		 -! : true�� false , false�� true (NOT)
		 
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
		
		System.out.println("x�� 10���� �۰� 3�� ����� ���"+(x>10 && x % 3 == 0) );
		
		
		System.out.println(x % 3 != 0 && y % 3 != 0 && 
				z % 3 != 0 );
		
		
	}
}
