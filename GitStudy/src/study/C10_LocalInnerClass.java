package study;

public class C10_LocalInnerClass {
/*
 ���� ���� Ŭ����
 -�޼��� ���ο��� �����Ͽ� ����ϴ� Ŭ����
 -�޼��尡 ������ �ش�Ŭ������ ������ ���Ѵ�
 */
	public static void main(String[] args) {
		
		//���� ����Ŭ����(�޼��尡 ������ �� Ŭ������ ������Եȴ�)
		class Apple{
			String size;
			String color;
			String insert;
		}
	
	Apple a =new Apple();
	AppleBox.Apple a2 = new AppleBox("���� �ڽ�").new Apple();
	
	//���� ���� Ŭ������ ��ĳ���� �Ǿ��ִ»���
	Fruiti banana = getBanana();
	
	banana.eat();
	}
	public static Fruiti getBanana() {
		class Banana extends Fruiti{
			int fruit;
			int[] color;
			
			public Banana(int fruit) {
				this.fruit = fruit;
			}
			
			void eat() {
				System.out.println("���Ű�"+fruit+"�� ���� �ٳ����� ���ֽ��ϴ�");

			}
			void banana���������ִ°����Ǳ��() {
				System.out.println("��û�� ���");
			}
		}
		return new Banana(20);
	}

}
abstract class Fruiti {
	abstract void eat();
}