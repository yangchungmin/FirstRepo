package quiz;

import java.util.Scanner;

public class B15_Count369_2 {
public static void main(String[] args) {
	
	System.out.print("���ڸ� �Է��ϼ���: ");
	
	int num  =new Scanner(System.in).nextInt();
	int cnt=0;
	for(int i=1;i<=num;i++) {
		String num_str=""+i;
		
		for(int j=0; j <num_str.length();++j) {
			char num_ch=num_str.charAt(j);
		
			if (num_ch =='3'||num_ch =='6'||num_ch =='9') {
				cnt++;
				System.out.println("¦");
			}
		}
		System.out.println();	
		
	}
	System.out.println("�� �ڼ�Ƚ�� : "+ cnt +"ȸ");
}
}
