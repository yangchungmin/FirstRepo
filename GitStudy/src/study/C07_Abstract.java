package study;

public class C07_Abstract {	
	public static void main(String[] args) {
		
		
		/*
		 1. �߻� Ŭ����(abstract class)
		 -�ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
		 -Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstract�� ���� ǥ���ؾ��Ѵ�
		 
		 2.�߻� �޼���(abstract method)
		 -�Լ��� ����(����Ÿ��,����������,�Ű�����)�� ���س���
		    �ڼ��� ������ �ڽ� Ŭ�������� �������̵带 ���� �����ϴ� �޼���
		 -�ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
		 */
		
		
		/*�͸�Ŭ����
		Apple a = new Apple() {
			@Override
			void eat() {
				
				super.eat();
			}
		};
		*/
		Vehicle v1 = new Bus();
		
		
		//�͸�Ŭ����(Anonymous class)
		Vehicle v2 = new Vehicle() {
			@Override
			void ride() {
				
				System.out.println("�Ｎ���� ������ Ż��");
				
			}
			
		};
		
		v1.ride();
		v2.ride();
		
		
	}
}
abstract class Vehicle{
	abstract  void ride();
}


class Bus extends Vehicle{
	@Override
	void ride() {
		// TODO Auto-generated method stub
		
	}
}




 class Bike extends Vehicle{
	
	 //�������̵� ���� (���� �Լ���,���� ����Ÿ��,���� �Ű�����)
	 @Override
	void ride() {
		
		
	}
	
}



