package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {
public static void main(String[] args) {
	/*
	 ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ������� true�� ���,������ 
	 false�� ���
	 
	 i=iterable
	 
	 
	 
	 */
	boolean contain_alphabet =true;
	char ch;
	System.out.print("�Ǻ��� ���ڿ��� �Է��ϼ���: ");
	String word =new Scanner(System.in).nextLine();
	
	for(int i =0;i<word.length();i++) {
		ch = word.charAt(i);
		
		if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122))) {
			contain_alphabet=false;
			
		}
	}
	System.out.println("�Է��� ���ڿ������� ���ĺ����� : "+contain_alphabet);



	


	}
}
