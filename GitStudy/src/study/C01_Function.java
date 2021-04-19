package study;

public class C01_Function {
	public static void main(String[] args) {
		
		/*
		 �Լ� (Function)
		 -����� �̸� ���� �صΰ� ���߿� ������ ���°�
		 -�����ص� �Լ��̸� �ڿ� ()�� ������ �Լ��� ȣ���ϸ� 
		 ȣ�����ڸ��� �Լ��� ����������ȯ�ȴ�.
		 -�Լ��� �����Ҷ� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
		 -�ڹٿ��� �Լ�(�޼���)�� Ŭ���� ���ο� �����ؾߵȴ�
		 -���߿� ������ ���ɼ��� �ִ� ��ɵ��� �̸� ������ ���ν� �۾��� �ݺ��� ���ϼ��ִ�
		 
		for(int i=0;i<10;i++) {
		print_rabbit();
		
		print_rabbit();
		print_rabbit();
		
		}
		*/
		
		System.out.println(apple_basket(155,10));
	
	}
	
	
	//ex:����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��ѹٱ����� ������ �˷��ִ� �Լ�
	//public static : ���߿� �����Ұ�
	//int : �� �Լ��� �������� Ÿ��(����Ÿ��(return type))
	//apple_basket : Ÿ�Եڿ� �Լ����� �����Ҽ��ִ�
	//apple_basket(int apple,int size) : �� �Լ��� �����Ҷ� intŸ�� ���� �ΰ� ���� �޾ƾ��Ѵ�(�Ű�����(arguments=args))
	//����Ÿ�� void�� �ش��Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� ��Ÿ����
	public static String apple_basket(int apple,int size) {
		
		int result;
		if(apple%size==0) {
			result =apple/size;
		}else {
			result =apple/size+1;
			
		}
		return "�ʿ��� �ٱ����� ������"+result+"�� �Դϴ�.";
	}
	
	
	
	
	
	
	
	
	public static void print_rabbit() {
		System.out.println("====================");
		System.out.println("        /)/)");
		System.out.println("       (  ..)");
		System.out.println("       (  >$)");
		System.out.println(" Have a Good Time.");
		System.out.println("====================\n");
	}

}



