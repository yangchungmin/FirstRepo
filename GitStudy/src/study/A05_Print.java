package study;

public class A05_Print {
	public static void main(String[] args) {
		
		/*
		 #�ֿܼ� ����ϱ� ���� �������� �Լ��� 
		 1.print()
		 -���� �ڵ����� �ٲ��� �ʴ� ���� �⺻���� ���
		 2.println()
		 -���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		 -()�� ������ ������ �ǵڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		 -()�� �ƹ��͵� �������������� '\n'�� ����Ѵ�
		 3.printf()
		 -���� ���ڸ� �̿��Ҽ��ִ� ��� �Լ�
		 -���ڿ� +�� �̾������ �ͺ��� ������ ����ϴ� ��찡 ���Ҷ��� �ִ�
		 -���� �ڵ����� �ٲ����� �ʴ´�
		 */
		int year=2021,month=3,day=17,hour=11,minute=9,second=38,millisec=1234;
		
		System.out.println(year+"��"+month+"��"+day+"��"
				+hour+":"+minute+":"+second+"."+millisec);
		//%d �ڸ��� ���ڸ� �ϳ��� ä���� ����Ѵ�
		System.out.printf("%d��%d��%d�� / %d:%d:%d.%d\n",
				year,month,day,hour,minute,second,millisec);
		
		/*
		 ���Ĺ����� ���� 
		 	%d    : �ش� �ڸ��� ������ ������ 10������ ������ش� (demical)
		 	%x,%X : �ش� �ڸ��� ������ ������ 16������ ������ش� (%X�� �빮��,hexa demical)
		 	%o 	  : �ش� �ڸ��� ������ ������ 8������ ������ش�   (octal)
		 	%s    :	���ڿ� (String)
		 	%c    :	����	(Char)
		 	%f    :	�Ǽ�   (Float)
		 10������ ���ڵ�
		 0 1 2 3 4 5 6 7 8 9 
		 
		 8������ ���ڵ�
		 0 1 2 3 4 5 6 7
		 
		 16������ ���ڵ�
		 0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 ...19 1A 1B 1C 1D 1E 1F 20
		 */
		
		int testnum = 25;
		System.out.printf("8������ %d�� %o�Դϴ�.\n",testnum,testnum);
		System.out.printf("10������ %d�� %d�Դϴ�.\n",testnum,testnum);
		System.out.printf("16������ %d�� %x�Դϴ�.\n",testnum,testnum);
		System.out.printf("16������ %d�� %X�Դϴ�.\n",testnum,testnum);
		System.out.printf("8������ 15��%o�Դϴ�.\n",15);
		/*
		 ���Ĺ��� �ɼǵ�
		 %����d : ���ڸ�ŭ ĭ�� Ȯ���ѵ� ������ �����Ͽ� ����Ѵ�
		 */
		System.out.printf("��� : %d\n",10);
		System.out.printf("��� : %10d\n",10);
		
		System.out.printf("[[ %s ]]\n","Hello World");
		System.out.printf("[[ %25s ]]\n","Hello World");
		System.out.printf("[[ %50s ]]\n","Hello World");
	  
		/*
		 ���Ĺ��� �ɼǵ�
		 %-����d : ���ڸ�ŭ ĭ�� Ȯ���ѵ� ���� �����Ͽ� ����Ѵ�
		 */
		System.out.printf("��� : %d\n",10);
		System.out.printf("��� : %-10d\n",10);
		
		
		System.out.printf(" %s :10��\n","���");
		System.out.printf(" %-7s :10��\n","��");
		System.out.printf(" %-10s :10�� \n","�ٳ���");
	  
	    //%0����d: ���ڸ�ŭ ĭ�� Ȯ���ѵ� ��ĭ�� 0�� ä���� ����Ѵ�
		System.out.printf(" %d��\n",5);
		System.out.printf(" %02d��\n",5);
		System.out.printf(" %03d��\n",5);
		System.out.printf(" %020f",3.1411234);
	
	    //%+d : ��� �տ��� ��ȣ�� �����ش�
		System.out.printf("��� :%d,����:%d\n",5,-5);
		System.out.printf("��� :%+d,����:%+d\n",5,-5);
		
		//%����f :�Ҽ� �ڸ����� �����Ѵ�
		
		double avg =123.1255555;
		
		System.out.printf("�������: %2f\n",avg);
	
	
	
	
	}
	
	
	
}
