package study;

public class B05_TypeCasting {
	public static void main(String[] args) {
		/*
		 Ÿ�� ĳ����
		 -Ÿ���� �ڿ������� ���ϴ� ���(Ÿ���� ���ϴ��� ������������)
		 -Ÿ���� ������ ��ȯ���Ѿ��ϴ� ���(Ÿ���� ���ϸ� ������ ���涧)
		 
		# Ÿ���� ũ��
		 ����Ÿ��
		 -byte(1)<char(1), short(2)<int(4)<long(8)
		 �Ǽ�Ÿ��
		 -float(4)<double(8)
		
		����Ÿ���� ������ �Ǽ�Ÿ�Ժ��� �۴�
		 */
		
		//1.�ڿ������� Ÿ��ĳ����
		byte _byte =127;
		int _int ;
		long _long;
		float _float;
		short _short;
		
		_int = _byte;
		_int=21000000;
		_long =_int;
		_float =_long;
		
		System.out.println(_float);
		
		//2.���� �ջ�� ������ �ִ� Ÿ�� ĳ����(���� Ÿ��ĳ����)
		
		_int = 50000;
		_short=(short)_int; //���� �ջ�ɼ��� �����Ƿ� �����Ϸ��� �������.
		
		System.out.println(_short);
		//ex)
		int a =(int)Math.round(10.3);
		
		//3.���� ���̴��� �ٸ��� �ؼ��ɼ��ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�
		int b =80;
		char ch = 'z';
		
		System.out.println((char)b);
		System.out.println(b);
		
		System.out.println((int)ch);
		System.out.println(ch);
		
		//�ڵ�ǥ�� �ܿ� �ʿ䰡����(char Ÿ�Կ� ���ڸ� ����� ����������)
		ch ='M';
		System.out.println(ch > 'A');
		
		ch ='��';
		System.out.println(ch > '��');
		System.out.println(ch < '��');
		System.out.println((int)'��');
		
		
		
		
		
		
		
		
		
	}
}
