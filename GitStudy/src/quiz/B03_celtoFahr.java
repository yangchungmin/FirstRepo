package quiz;
import java.util.Scanner;
public class B03_celtoFahr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double cel;
		double fahr;
		System.out.print("����(��)�µ��� �Է����ּ��� >");
		cel=sc.nextDouble();
		fahr=(cel*9/5)+32;
		System.out.printf("%.1f���� %.1f���Դϴ�.\n",cel,fahr);
	}
}
