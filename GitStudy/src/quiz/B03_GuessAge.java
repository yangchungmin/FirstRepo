package quiz;
import java.util.Scanner;
public class B03_GuessAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("�¾�ظ� �Է����ּ��� >");
		int bornyear = sc.nextInt();
		System.out.print("���س⵵�� �Է����ּ��� >");
		int  thisyear= sc.nextInt();
		System.out.print("����  �ѱ����̴� "+((thisyear-bornyear)+1)+"�Դϴ�");
	
	
	}
}
