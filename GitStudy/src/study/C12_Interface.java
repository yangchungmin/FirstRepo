package study;

public class C12_Interface {
/*
 �������̽� 
 -abstract class�� ����� ������ ������ ���ٴ� ������ �����Ѱ�
 -�������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�
 -�������̽� ������ ������ �ڵ����� flnal static�� �ȴ�
 -�������̽� ������ �޼��带 �����ҋ� default�� ���̸� �⺻������ �����Ҽ��ִ�
 */
public static void main(String[] args) {
	new OrangeTree().click();
}




}

interface CanClick{
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻����"+"(�������̵� �ؼ� ������ּ���)");
	}
	
	
}
interface CanPunch{
	void punch();
}

class OrangeTree implements CanClick,CanPunch{
	
	@Override
	public void click() {
		
		System.out.println("������ �������� Ŭ�� ����");
	}
	@Override
	public void punch() {
		
		
	}
	
}