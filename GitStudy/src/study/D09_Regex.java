package study;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
/*
 #���� ǥ����
 -���ڿ��� ������ ǥ���ϴ� ǥ����
 -Ư�� ���α׷��� �� ���ӵ����ʴ´�
 -���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��Ҷ� ����Ѵ� 
 
 #Pattern Ŭ����
 -����ǥ������ �ٷ�� Ŭ����
 #Matcher Ŭ���� 
 -���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��Ҷ� ����ϴ� Ŭ����
 */
public static void main(String[] args) {
	
	//Paatern.matches(regex , input) : input�� regex�� ��ġ�Ǵ� ���ڿ����� �˻�
	System.out.println(Pattern.matches("sleep","sleep"));
	
	//[] : �ش� ��ġ�� �ѱ��ڿ� � ���ڵ��� �ü��ִ��� �����ϴ� ǥ����
	System.out.println(Pattern.matches("s[lh@]eep","sleep"));
	System.out.println(Pattern.matches("s[lh@]eep","sheep"));
	System.out.println(Pattern.matches("s[lh@]eep","s@eep"));
	/*
	[] ���ο� �����Ҽ� �ִ°͵�
	1. abc : �ش��ڸ��� a �Ǵ� b �Ǵ� c�� ���
	2. ^abc : �ش��ڸ��� abc�� ������ ������ ���
	3. a-z : a����z���� ��� ���
	4. && : ������
	*/
	System.out.println(Pattern.matches("s[^lh@]eep","s\\eep"));
	System.out.println(Pattern.matches("s[0-9]eep","s0eep"));
	System.out.println(Pattern.matches("s[0-9a-z]eep","sheep"));
	System.out.println(Pattern.matches("s[a-d&&c-f]eep","sfeep"));
	
	/*
	  ���� ���ڸ� ��Ÿ���� �͵�
	 1. . : ��繮��   
	 	-[]�ۿ� ��� ��繮��
	 2. \d : ������
	 3. \D : ���ڸ� ������ ����
	 4. \s :��� ���� (\t\n\r.. ���� ��� �����)
	 5. \S : ������ ������ ����
	 6. \w :�Ϲ����� ���ڵ��� ���[a-zA-Z0-9]
	 7. \W :�Ϲ�����  ���ڵ��� ������ ���� ���
	 */ 
	System.out.println(Pattern.matches("s.eep","sleep")); //��� �������
	System.out.println(Pattern.matches("s[.]eep","sleep"));//.�� ���
	System.out.println(Pattern.matches("s\\.eep","sleep"));//.�����
	
	System.out.println(Pattern.matches("s\\deep","s9eep"));
	System.out.println(Pattern.matches("\\D\\D\\D","cat"));
	
	
	System.out.println(Pattern.matches("s\\seep","s eep"));
	System.out.println(Pattern.matches("s\\seep","saeep"));
	System.out.println(Pattern.matches("s\\seep","s\teep"));
	System.out.println(Pattern.matches("s\\seep","s\neep"));
	
	
	System.out.println(Pattern.matches("s\\Seep","s eep"));
	/*
	 �ش� ������ ����� ������ ������ �����ϴ� ���
	 1.[ex]{n} : {}���� ������ n�� ��ġ�ؾ��Ѵ�
	 2.[ex]{n,m} : {}���� ������ �ּ� n���̻� ,�ִ� m��(����) ��ġ�ؾ��Ѵ�
	  - *����ǥ���Ŀ� {n,m}ó�� ������ ������ �ȵȴ�
	 3.[ex]? : 0���Ǵ� �ѹ�
	 4.[ex]+ : �ּ� �ѹ��̻�
	 5.[ex]* : 0���Ǵ� ������
	 */
	System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt","345!!.txt"));
	System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt","3!.txt"));
	System.out.println(Pattern.matches("[��-�R]{2,}\\.txt","�ȳ�.txt"));
	System.out.println(Pattern.matches("[��-�R]{2,}\\.txt","�ȳ��ϼ���.txt"));
	System.out.println(Pattern.matches("[��-�R]{2,}\\.txt","hi.txt"));
	
	System.out.println(Pattern.matches("[��-�R]?\\.txt",".txt"));
	System.out.println(Pattern.matches("[��-�R]?\\.txt","��.txt"));
	System.out.println(Pattern.matches("[��-�R]?\\.txt","�ѱ�.txt"));
	
	//��ȭ ��ȣ ����ǥ����
	System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}","01012341234"));
	System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}","0101234123"));
	System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}","010-1234-1234"));
	System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}","010-123-1234"));
	
	//��������:�ڹٿ��� ����ϴ� �������� �˻��Ҽ��ִ� ����ǥ������ ��������
	System.out.println(Pattern.matches("^[a-zA-Z_$][\\w$]*$","abc"));
	System.out.println(Pattern.matches("^[\\D&&\\S&&\\w$��-�R][\\w$��-�R]*$","_����"));

	
	/*
	 #Pattern.compile(regex)
	 -������ ����ǥ������ �ؼ��Ͽ� ���� �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ�
	 # split() : �����ϵ� ���� �ν��Ͻ��� ���ڿ� split()�� �����Ѵ�
	 # matcher() : Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
	 */
	String fruits_text="apple/banana/orange/grape/pineapple/peach/mango/redapple";
	
	Pattern regex = Pattern.compile("/");
	String[] fruits = regex.split(fruits_text);
	
	System.out.println(Arrays.toString(fruits));
	
	
	Pattern regex2 = Pattern.compile("apple");
	Matcher matcher =regex2.matcher(fruits_text);
	
	while(matcher.find()) {
		System.out.println("ã�� �� :"+matcher.group());
		System.out.println("��ġ :"+ matcher.start()+"����"+matcher.end()+"����");
	}
	
	
	
	}
}
