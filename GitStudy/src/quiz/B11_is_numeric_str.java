package quiz;

import java.util.Scanner;
import java.util.stream.IntStream;

public class B11_is_numeric_str {
	public static void main(String[] args) {
		/*
		 �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ��ִٸ� result�� 1
		 �ٸ����ڰ� ���ԵǾ��ִٸ� result�� 0
		 
		int result = 0;
		char check;
		System.out.print("�Ǻ��� ���ڿ��� �Է��ϼ���: ");
		String word =new Scanner(System.in).nextLine();
		
		for(int i =0;i<word.length();i++) {
			 check = word.charAt(i);
			
		
			if(check >= 48 || check <= 57){
				result = 1;
				
			}else {
				result = 0;
				
			}
			
			
		}
		System.out.println(result);
	
	*/
		System.out.print("�Ǻ��� ���ڿ��� �Է��ϼ���: ");
		String word =new Scanner(System.in).nextLine();
		
		int numeric_str = 1;
		
		
		for(int i =0;i<word.length();++i) {
			char ch = word.charAt(i);
		
		if(ch <'0' || ch > '9') {
			numeric_str= 0;
			break;//�ٸ����ڸ� �ϳ��� ã���� �׸�ã��
		}
		
		
		
		}
		
		System.out.println("numeric_str : "+(numeric_str > 0 ?"true":"false"));
		
		
		
		
		
		
	}
}
	
