package myinterface;

public class TestWashingMachine{
	
	public static void main(String[] args) {
		Samsung washMachine = new Samsung();
		washMachine.startButton();
		System.out.println("��Ź�Ϸ���� "+washMachine.changeMode(3)+"�� ���ҽ��ϴ�.");
	}
	
}