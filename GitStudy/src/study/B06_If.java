package study;

public class B06_If {
	public static void main(String[] args) {
		/*
		 if��
		 -()���� ���� true�϶� {}���� ������ �����Ѵ�
		 -()���� ���� false�϶��� {}���� ������ �����Ѵ�
		 -{}�ȿ� �� ������ �����̸� {}�� �����Ҽ��ִ�
		
		 else if��
		 -���� �ִ� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
		 -else if�� �ܵ����� ����Ҽ� ����
		 -else if�� ������ ����Ҽ� �ִ�
		
		else��
		-���� �ִ� if,else if�� ��� ��������ʴ´ٸ� {}���� ������ ������ �����Ѵ�
		-if�ٷ� ������ ����Ҽ��� �ִ�
		 *else�� �پ��ִ� ���ǹ��� ������ �ѹ��� ����ȴ�
*/
		
		int a = -8;
		if (a==5) { 
			System.out.println("Hello");
		}else if(a>0) {
		System.out.println("niec to meet you.");
		}else if(a>-10) {
			System.out.println("Greeting");
		}else if(a>-20) {
			System.out.println("Good to see you");
		}
		
		
		
		
		char ch ='��';
		if (ch >= '��' && ch <='�R') {
			System.out.println("ch���ǰ��� �ѱ��Դϴ�");
		}else if((ch >= 0x3040 && ch <=0x309F) || (ch >= 0x30A0 && ch <=0x30FF )) {
			System.out.println("ch���� ���� �Ϻ��� �Դϴ�");
		}
		else {
			System.out.println("ch���ǰ��� �Ϻ�� �ѱ۵� �ƴմϴ�");
		}
		System.out.println("���α׷��� �������ϴ�");
	}

}
