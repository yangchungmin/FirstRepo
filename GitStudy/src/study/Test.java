package study;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("������ �Է� : ");
	String var =sc.nextLine();
	
	variable(var);
		
}
public static boolean variable(String var) {

Pattern pattern = Pattern.compile(("([a-z]*[A-Z]*[0-9]*[_,$]*)"));
Matcher p = pattern.matcher(var);
if(p.matches()) {
	System.out.println("�ùٸ� �������Դϴ�");
	return true;
}else {
	System.out.println("�ùٸ� �������� �ƴմϴ�");
	return false;
}


}
}

