package quiz;

import java.util.Scanner;

public class B14_GCD {
	public static void main(String[] args) {
	
		/*
		 �� ���ڸ� �Է¹ް� �μ����� �ִ������� ���غ�����
		 �ִ�����:�μ����� ������� ���� ū �����
		 */
		int min=0,i=2;
		System.out.print("ù��°���ڸ� �Է��ϼ���: ");
		int num1  =new Scanner(System.in).nextInt();
		System.out.print("�ι�°���ڸ� �Է��ϼ���: ");
		int num2  =new Scanner(System.in).nextInt();
		
		for(;i<=num1 && i<=num2;) {
			if(num1%i==0 && num2%i==0) 
				min=i;
				i++;
			
		}
		
		System.out.println("�ִ� ����� : "+min);
	
		}
		
	
	}

