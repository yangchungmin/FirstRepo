package study;

import java.util.Random;

public class B16_RandomClass {
	public static void main(String[] args) {
		/*
		 2.Random Ŭ����
		 
		 -�� �� ���ϰ� ���� ���� �����Ҽ��ִ� ��ɵ��� ���ִ� Ŭ����
		 -�����Ҷ� ������ �����õ尡 ���õȴ�
		 -���ϴ� �����õ带 �����Ҽ����ִ�
		 */
		System.out.println("------------------");
		
		//���ο� �����õ� ����
		Random ran = new Random();
		
		//Random.nextInt(bound)
		//0~bound�̸��� ����
		System.out.println(ran.nextInt(45)+1); //1~45�� ��������
		System.out.println(ran.nextInt(41)+30); //30~70�� ��������
		
		
		//Random.nextBoolean()
		//-RandomŬ������ ���ϴ� Ÿ���� �������� ���� ������ �ִ�
		//�� �� ����������
		System.out.println(ran.nextBoolean() ? "��":"��");
		
	}
}
