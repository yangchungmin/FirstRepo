package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class D07_checkValidPhoneNumber {
/*
 사용자로부터 핸드폰번호를 입력받으면
 올바른 전화번호인지 구분하는 프로그램을 만들어보세요
 
 앞의 3자리가 숫자,
 두번쨰 숫자는 3자리 혹은 4자리
 세번쨰 숫자는 4자리
 4번쨰 ,9번쨰 문자는 '-'
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰번호를 입력해주세요 : ");
		String num =sc.nextLine();
		
		phoneNumber(num);
		
	}
	public static boolean phoneNumber(String num) {
		
		Pattern phone = Pattern.compile(("(\\d{3})-(\\d{3,4})-(\\d{4})"));
		Matcher p = phone.matcher(num);
		if(p.matches()) {
			System.out.println("올바른 핸드폰번호입니다");
			return true;
		}else {
			System.out.println("올바른 핸드폰 번호가 아닙니다");
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
                   System.out.println("[invalid] 길이가 올바르지 않음");
                   return false;
           }
           
           for (int i = 0; i < len; ++i) {
                   
                   char ch = phoneNumber.charAt(i);
                   
                   if (i < 3 && !checkNumeric(ch)) {
                           System.out.println("[invalid] 맨앞 3자리에 숫자 아닌것이 있음");
                           return false;
                   } else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
                           System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
                           return false;
                   } else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
                           System.out.println("[invalid] 가운데 자리에 숫자 아닌것이 있음");
                           return false;
                   } else if (((i > 7 && len == 12 ) || (len == 13 && i > 8)) && !checkNumeric(ch)) {
                       System.out.println("[invalid] 마지막 자리에 숫자 아닌것이 있음");
                       return false;
                       }         
           }
           
           return true;
   }
   
   public static void main(String[] args) {
           
           if (checkValidPhoneNumber("123-1211-a111")) {                        
                   System.out.println("올바른 핸드폰 번호 입니다!");
           }
   }
}





