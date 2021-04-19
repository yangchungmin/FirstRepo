package quiz;
import java.util.Scanner;
public class B03_GuessAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("태어난해를 입력해주세요 >");
		int bornyear = sc.nextInt();
		System.out.print("올해년도를 입력해주세요 >");
		int  thisyear= sc.nextInt();
		System.out.print("올해  한국나이는 "+((thisyear-bornyear)+1)+"입니다");
	
	
	}
}
