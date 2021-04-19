package quiz;
import java.util.Scanner;
public class B03_celtoFahr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double cel;
		double fahr;
		System.out.print("섭씨(℃)온도를 입력해주세요 >");
		cel=sc.nextDouble();
		fahr=(cel*9/5)+32;
		System.out.printf("%.1f℃은 %.1f℉입니다.\n",cel,fahr);
	}
}
