package study;

public class B16_Random {
public static void main(String[] args) {
	/*
	1. Math.random()
	 -double Ÿ���� ���� �Ҽ��� �����Ѵ�(0 <= x < 1)
	 -�� ���� �Ҽ��� �̿��Ͽ� ���ϴ� ������ ���ڸ� ������ִ�
	 #���ϴ� ������ ���ڸ� ����� ����(ex: 30~60)
	 (1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ�(31��)
	 	(0*31<= x <1*31)
	 (2) ���ϴ� ������ ���� �������ڸ� ���Ѵ�
	 	(0 * 31 + 30 <= x < 1* 31 +30)
	 (3)
	 	�Ҽ��� �Ʒ��� �����Ѵ�
	 	-Math.floor() �Ǵ� int�� Ÿ��ĳ����
	 */
	
	
	
	
	
	
	for(int i=0;i<10;++i) {
		System.out.print((int)(Math.random()*31+30));
	}

//	1~45�� �������ڸ� 7������غ�����

	for(int i=1;i<=7;++i) {
		System.out.println((int)(Math.random()*45)+1);
	}

	}
}

