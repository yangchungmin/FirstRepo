package quiz;
import java.util.Scanner;
public class B03_wonToDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("��ȭ�� �Է����ּ��� >");
		final double WON_TO_DOLLAR = 0.00089;
		int won = sc.nextInt();
		double usd = (won*WON_TO_DOLLAR);
		//ȯ�� ������ 1.75%
		double commission = usd*0.0175;
		System.out.printf("%d���� %.2fUSD�Դϴ�.\n",won,usd-commission);
		
		
		
	}
}
