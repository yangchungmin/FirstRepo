package study;

public class C09_InnerClass {
/*
 Ŭ���� ���ο� Ŭ���� ����ϱ�
 -Ŭ���� ���ο��� Ŭ������ �����ϰ� ����Ҽ��ִ�
 -Ŭ���� ���ο� �����ϴ� Ŭ������ �ν��Ͻ��� �����Ǿ�� ����Ҽ��ִ� ���赵�̴�
 */

public static void main(String[] args) {
	AppleBox box =new AppleBox("���ֹڽ�");
	
	//�̳�Ŭ���� �ν��Ͻ� �����ϱ�
	AppleBox.Apple apple = new AppleBox("����ڽ�").new Apple();
	AppleBox.Apple apple2 = box.new Apple();
	
	apple.whereAmI();
	apple2.whereAmI();
	}

}
class AppleBox {
	
	Apple[] box;
	String boxName;
	
	public AppleBox(String name) {
		box = new Apple[10];
		for(int i=0;i<10;i++) {
			box[i] = new Apple();
			
		}
		
		boxName = name;
	}
	class Apple{
		String color;
		int size;
		boolean insect;
		
		void whereAmI() {
			System.out.println(boxName);
		}
	}
	
	
}