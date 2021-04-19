package quiz;
import java.util.Scanner;
public class B03_wonToDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("원화를 입력해주세요 >");
		final double WON_TO_DOLLAR = 0.00089;
		int won = sc.nextInt();
		double usd = (won*WON_TO_DOLLAR);
		//환전 수수료 1.75%
		double commission = usd*0.0175;
		System.out.printf("%d원은 %.2fUSD입니다.\n",won,usd-commission);
		
		
		
	}
}
