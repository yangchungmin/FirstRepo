package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {



public static void main(String[] args) {
	/*
	 1.����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
	 2.�ش� ũ�⸸ŭ�� �迭�� �������� ���ڿ��� �����Ѵ�
	 (�������� �����ϴ°��� : apple,banana,kiwi,orange,peach,strawberry,pineapple)
	 3.�� ������ ��� �����ߴ��� ��� ����ϰ� ����غ���
	 
*/
	
	
	Scanner sc =new Scanner(System.in);
	System.out.print("ũ�� �Է� : ");
	int input=sc.nextInt();
	Random ran = new Random();
	
	String[]  fruit = new String[]{"apple","banana","kiwi","orange","peach",
									"strawberry","pineapple"};
	//String[] fruitrandom =new String[input];
	
	for(int i=0;i<input;i++) {
		int random =(int)(Math.random()*7);
		System.out.println(fruit[random]);
	
	
	
	
		}
 	}
}

