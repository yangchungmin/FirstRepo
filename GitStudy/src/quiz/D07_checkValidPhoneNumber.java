package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class D07_checkValidPhoneNumber {
/*
 ����ڷκ��� �ڵ�����ȣ�� �Է¹�����
 �ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������
 
 ���� 3�ڸ��� ����,
 �ι��� ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
 ������ ���ڴ� 4�ڸ�
 4���� ,9���� ���ڴ� '-'
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڵ�����ȣ�� �Է����ּ��� : ");
		String num =sc.nextLine();
		
		phoneNumber(num);
		
	}
	public static boolean phoneNumber(String num) {
		
		Pattern phone = Pattern.compile(("(\\d{3})-(\\d{3,4})-(\\d{4})"));
		Matcher p = phone.matcher(num);
		if(p.matches()) {
			System.out.println("�ùٸ� �ڵ�����ȣ�Դϴ�");
			return true;
		}else {
			System.out.println("�ùٸ� �ڵ��� ��ȣ�� �ƴմϴ�");
			return false;
		}
	}
	*/
	
	   private static boolean checkNumeric(char ch) {
           return ch >= '0' && ch <= '9';
   }
   
   public static boolean checkValidPhoneNumber(String phoneNumber) {
           int len = phoneNumber.length();
           
           if (len != 12 && len != 13) {
                   System.out.println("[invalid] ���̰� �ùٸ��� ����");
                   return false;
           }
           
           for (int i = 0; i < len; ++i) {
                   
                   char ch = phoneNumber.charAt(i);
                   
                   if (i < 3 && !checkNumeric(ch)) {
                           System.out.println("[invalid] �Ǿ� 3�ڸ��� ���� �ƴѰ��� ����");
                           return false;
                   } else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
                           System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
                           return false;
                   } else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
                           System.out.println("[invalid] ��� �ڸ��� ���� �ƴѰ��� ����");
                           return false;
                   } else if (((i > 7 && len == 12 ) || (len == 13 && i > 8)) && !checkNumeric(ch)) {
                       System.out.println("[invalid] ������ �ڸ��� ���� �ƴѰ��� ����");
                       return false;
                       }         
           }
           
           return true;
   }
   
   public static void main(String[] args) {
           
           if (checkValidPhoneNumber("123-1211-a111")) {                        
                   System.out.println("�ùٸ� �ڵ��� ��ȣ �Դϴ�!");
           }
   }
}





