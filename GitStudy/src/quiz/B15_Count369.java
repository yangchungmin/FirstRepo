package quiz;

import java.util.Scanner;

public class B15_Count369 {


public static void main(String[] args) {
	/*
	 ����ڷκ��� ������ �ϳ� �Է¹ް�
	 �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
	 */
	System.out.print("���ڸ� �Է��ϼ���: ");
	int num  =new Scanner(System.in).nextInt();
	int a,b,i,count = 0;
	for(i=1;i<=num;i++) {
		a=i/10;
		b=i%10;
		if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
			count += 2;
			
		}else if((a==3 || a==6 || a==9) && (b!=3 || b!=6 || b!=9)) {
			count += 1;
			
		}else if((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
			count += 1;
			
		}
		
		
	}	
	
	System.out.println("�ڼ�Ƚ��: "+count+"��");

	}
}
