package quiz;

import java.util.Scanner;

public class B07_CheckWord {
public static void main(String[] args) {
	/*
	 ����ڷ� ���� �ܾ �ϳ� �Է¹ް� ù���� ���ڿ� ��������° ���ڰ� ��ġ�ϸ� "ok"�� ���
	 �ƴ϶�� "not ok"�� ����ϼ���
	 */
Scanner sc = new Scanner(System.in); 
System.out.print("�ܾ �Է����ּ���:");
String word = sc.nextLine();

if(word.charAt(0) == word.charAt(word.length()-1)) {
	System.out.println("OK");
}else {
	System.out.println("NOT OK");
}
//next() :���� �ܾ StringŸ������ �޾ƿ���(����,\t ����)

//ex) banana orange apple

//nextLine() :���� ���ڿ��� StringŸ������ �޾ƿ���(\n ����)





}
}
