package study;

public class A01_Escape {
	public static void main(String[] args) {
		
		/*
		 Escape ����
		 -Ư���� ����� �������ڵ�
		 -�׳� ����Ϸ��� �ϸ� ������ �߻��ϴ� Ư���� ���ڵ�
		 -�տ� \ �� ���� ���ڴ�  Escape ���ڷ� �����Ѵ�
		 -�տ� ���� \�� ���� ���ڰ� �������� �ϳ��� ���ڷ� �νĵȴ�
		 */
		
		System.out.println("�ȳ��ϼ���, �ݰ����ϴ�");
		
		// \n :�ٹٲ� ��� (linefeed,breakline,newline...)
		System.out.println("�ȳ��ϼ���, ��\n��\n���ϴ�");
		
		// \t :TabŰ�� ����� ���� Ư������
		System.out.println("�ȳ��ϼ���, ��\t��\t���ϴ�");
		
		// \\ : Escape������ ����� �̿����� �ʰ� �׳� ����ϰ������
		System.out.println("�ȳ��ϼ���, ��\\t��\\t���ϴ�");
		
		// ex) jdk�� ��θ� ����ϰ������
		System.out.println("C:\\Program Files\\JAVA\\JDK");
		
		// \" : �׳� ū ����ǥ�� ����ϰ� ������
		System.out.println("������ �������� \"�Ŷ��\"�� �Ծ�߰ڴ�.");
		
		// \' : �׳� ���� ����ǥ�� ����ϰ� ������ (ū ����ǥ���� ���� ����ǥ�� ��������������) 
		System.out.println('\'');
		
	
	
	}
}
