package quiz;

import java.util.Scanner;

public class B14_Prime {




public static void main(String[] args) {
	/*
	 ����ڷκ��� ���ڸ� �Է¹����� 
	 1���� �Է��� ���ڻ��̿� �����ϴ� �Ҽ��� ��� ����ϼ���
	 
	 �Ҽ�=1�� �ڱ��ڽ����θ� ���������¼�
	 */
	System.out.print("���ڸ� �Է��ϼ���: ");
	int count =0; 
	int num  =new Scanner(System.in).nextInt();
	
	for(int i =2;i<=num;i++) {
			count=0;
		for(int j =2;j<i;j++) {
			if(i%j==0) {
				System.out.printf("�˻��ϴ¼���[%d]��[%d]�� ������ ���������ϴ�.\n",i,j);
				System.out.println("\t�Ҽ����ƴմϴ�.");
				count++;
				break;
			}
		}
	if(count==0) 
		
		System.out.printf("%d�� �Ҽ��Դϴ�\n",i);
			
			
		
		
		}
	System.out.println("------------------------------");
	}
}
