package study;

public class A00_Hello {
	public static void main(String[] args) {
		//class ������ bin ������ �����
		System.out.println("Hello, World 1");
		/*
		  �ڹ��� �����͵� (���ͷ�)
		 
		 1. "" : ���ڿ�(String) ���ڸ� ������ �����ִ� ������ Ÿ��
		 2. '' : ����(Character) ���ϳ��� �����ִ� ������ Ÿ��
		 3. ����(Integer) : ���ڸ� ���°�
		 4. �Ǽ�(Float,Double) : �Ҽ��� ���°�
		 
		 ���ڵ��� ������ ���ڰ��� ���ϰ��ִ�
 		
 		(int)�� ��Ȱ - ���ڸ� ���ڷ� ���̰���
 			((int)'��')
 		(char)�� ��Ȱ - ���ڸ� ���ڷ� ���̰���
		 	((char)54621)
		 
		 */	
	System.out.println((char)('A'+0));
	System.out.println((char)('A'+1));
	System.out.println((char)('A'+2));
	System.out.println((char)('A'+3));
	
	System.out.println("'A'�� �������� ��� :"+'A');
	System.out.println("'A'�� �ڵ尪 :"+(int)'A');
	System.out.println("'1'�� �ڵ尪 :"+(int)'1');
	System.out.println("1"+5);
	System.out.println('1'+5);
	System.out.println(1+5);
	
	//���� + �Ǽ��� �Ǽ��� �ȴ�
	System.out.println(10+10.123);
	
	//���� + ���ڴ� �������ȴ�
	System.out.println('a'+10);
	System.out.println((char)('a'+10));
	
	
	
	
		
	
	
	
	
	
	
	}

}
