package quiz;

import java.util.Scanner;

public class B11_ForBasicQuiz {
public static void main(String[] args) {
	
	
	/*
	 ����ڰ� ���ڸ� �Է����� ��
	 1.10���� �Է��� ���ڱ����� ������ ���غ�����
	 2.1���� �Է��� ���ڻ����� 5�ǹ���� ��� ����غ�����
	 */
	//1.
	System.out.print("���ڸ� �Է��غ�����:");
	int num =new Scanner(System.in).nextInt();
	int sum =0;
	for(int i =10; i<=num;++i) {
			sum += i;
		}
	
	System.out.println("10���� �Է��Ѽ��ڻ����� ���� : "+sum);
	
	

	for (int i=1;i<=num;++i) {
		if (i % 5 !=0) { 
			continue;
	}
	System.out.println(i);
	}
}
}