package quiz;
import java.util.Scanner;
public class B05_ConditionQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
      	
      	 �����ڵ�Ȱ��
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true        
        7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
*/        
		char a = 'q';
		char b = ' ';
		char c = '0';
		char d = 'b';
		char e = '��';
	    char f = '��';
		String ch ="exit";
		
		//1.
		System.out.println(a == 'q' || a == 'Q');
		//2.
		System.out.println(b != ' ' || b != '\t');
		//3.
		System.out.println(c <= '9' && c >= '0');
		//4.
		System.out.println((d >= 'a'  && d <= 'z') || (d >= 'A'  && d <= 'Z'));
		//5.
		System.out.println(e >= 0xAC00 && e <= 0xD7A3);
		//6.
		System.out.println((f >= 0x3040 && f <=0x309F) || (f >= 0x30A0 && f <=0x30FF ));
		//7.
		System.out.print("���ڿ��� �Է��ϼ��� :");
		String in = sc.nextLine();
		System.out.println(ch.equals(in));
		
		
		
		
		
		
		
		
		
	}
}
