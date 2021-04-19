package study;

public class B01_Operator {
	public static void main(String[] args) {
		/*
		 ������(operator)
		 -����ҋ� ����ϴ°�
		 -+, -, *, / ....
		 */
		//��� ������
		int a =10,b=7;
		double c = 7.0;
		
		
		System.out.println("+ :"+(a+b));
		System.out.println("- :"+(a-b));
		System.out.println("* :"+a*b);
		System.out.println("/ :"+a/b);		
	
		//�������� ������ �� ���´�
		System.out.println("/ :"+a/b);	
		//������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ�
		System.out.println("/ :"+a/c);	
		
		System.out.println("/(double) :"+a/(double)b);	
		System.out.println("/(float) :"+a/(float)b);	
		
		//���� ���ϰ��ڿ� ������
		System.out.println("% :"+a%b);	
		//����
		System.out.println("���� :"+Math.pow(a,3));
		System.out.println("���� :"+(a^3));//������ �ƴ϶� ��Ʈ����
		//������
		System.out.println("������ :"+Math.sqrt(52));
		//���밪
		System.out.println("���밪 :"+Math.abs(25));
		//�ݿø�(�Ҽ� ù°�ڸ����� �ݿø�)Math.round()�� �ݿø��ϰ���� �ڸ��� �Ҽ� ù°�ڸ��� ���鸸ŭ ������ 
		//�ٽ� ������ ����� ���� ���ϴ� �ڸ������� �ݿø��Ҽ��ִ�
		System.out.println("�Ҽ� ù°�ڸ����� �ݿø� :"+Math.round(3.335));
		System.out.println("�Ҽ� ù°�ڸ����� �ݿø� :"+Math.round(3.777));
		System.out.println("�Ҽ� ��°�ڸ����� �ݿø� :"+Math.round(3.335*100)/100.0);
		//�ø�
		System.out.println("�ø� :"+Math.ceil(1.001));
		//����
		System.out.println("���� :"+Math.floor(1.999));
		//�� ū ����
		System.out.println("�� ū���� ����� :"+Math.max(1900,1500));
		//�� ���� ���� 
		System.out.println("�� �������� ����� :"+Math.min(1900,1500));
		
		//��Ʈ����
		//&,|,^,>>,<<
		
		//1010
		//0111
		//----- &
		//0010 -> 2
		System.out.println("a & b :"+(a & b)); //AND
		
		//1010
		//0111
		//----- |
		//1111
		System.out.println("a | b :"+(a | b)); //OR
		
		//1010
		//0111
		//----- ^
		//1101
		System.out.println(a ^ b); //XOR
		
		
		//0000001000 << 2
		//0000100000
		System.out.println(8 << 2 ); //SHIFT
		System.out.println(8 >> 2); //SHIFT
		
		
		
	
	
	
	
	}
}
