package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	public static void main(String[] args) {
	/*
	 ����ڷκ��� ������ �ϳ� �Է¹ް�
	 �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ��� ����غ�����
	 (��ҹ��� ���о��� ī��Ʈ)
	 */
	
	Scanner sc =new Scanner(System.in);
	System.out.print("����ܾ �Է��ϼ��� : ");
	String eng=sc.nextLine();
	
	eng =eng.toUpperCase();
	
	int[] count =new int[26];
	
	for(int i=0;i<eng.length();i++) {
		char ch = eng.charAt(i);
		//System.out.println(ch);
		if(ch>='A'&& ch<='Z' ) {
			count[ch -'A']++;
			
		}
	
		
		}
		
	for(int i=0;i<26;i++) {
		if(count[i]!=0) {
			System.out.println((char)(i+'A')+":"+count[i]+"��");
		}
	}
}
}