package quiz;

import java.util.Scanner;

public class B11_Palindrome {
public static void main(String[] args) {
	/*
	 ����ڷκ��� �ܾ �ϳ� �Է¹ް� �ش�ܾ ȸ���̶�� "PALINDROME"�� ���
	 ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
	 */
	
	System.out.print("�Ǻ��� ���ڿ��� �Է��ϼ���: ");
	String word =new Scanner(System.in).nextLine();
	boolean check=true;
	for(int i =0;i<word.length()/2;i++) {
	
	char ch = word.charAt(i);
	char sh = word.charAt(word.length()-i-1);
	
		if(ch == sh) {
			check =true;
		}else {
			check=false;
			break;
		}
	
	}
	 
	if(check==true) {
		System.out.println("PALINDROME");
		}else {
		System.out.println("NOT PALINDROME");
		}
	
	

	}
}