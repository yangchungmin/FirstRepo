package study;

public class B11_For {
	public static void main(String[] args) {
		/*
		 �ݺ��� (Loop)
		 -for,while,do-while(x)
		 
	
		 for (�ʱ�ȭ; ����; ������){
		 	��� �ִ� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
		 }
		 
		 1.���� �⺻���� ������ for��
		 -���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���������� for��\
		 -�ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ������ȴ�
		 -������ 1���Ѵ�
		 2.�ʱⰪ, ������, ������ ������� �����Ҽ��ִ�.
		 3.�ʱⰪ�� �������� ��ġ�� ������� �����Ҽ� �ִ�.
		 */
	//1.
	for(int i =0; i<10000000;++i) {
		System.out.println("hello world!"+i);
	}
	
	//2.
	//3.������ �߰�ȣ�� ����� �״´� = ��������
	int x= 0;
	for(;x<10;) {
		System.out.println("3��° �ݺ���"+x++);
	}
	//4.�ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����Ҽ� �ִ�.
	for (int month=1;month<=12;++month) {
		String season;
		switch (month) {
		case 3: case 4: case 5:
			season="���Դϴ�";
		    break;
		case 6: case 7: case 8:
			season="�����Դϴ�";
			break;
		case 9: case 10: case 11:
			season="�����Դϴ�";
			break;
		case 12: case 1: case 2:
			season="�ܿ��Դϴ�";
			break;
		default :
			season="�߸��� �Է��Դϴ�";
			break;
		}
		System.out.printf("%2d���� [%s]�Դϴ�.\n",month,season);
	}
	
	//5.for���� ������ ��������� ���ѹݺ��Ѵ�.
	// -�ݺ����� ���ϴ� Ÿ�ֿ̹� break���� ���� Ż���Ҽ��ִ�
	int count =0;
	for(;;) {
		System.out.println("hello!"+count++);
		if(count ==7) {
			break;
		}
	}
	
	
	 /*�ݺ������� ���ձ��ϱ�
	 1.������ ������ ������ �ϳ� �����ϰ� 0���� �ʱ�ȭ �صд�
	 2.�ݺ����� �����ϸ鼭 �ش纯���� ���� ������Ų��
	 */
	int sum =0;
	for(int i1 =80; i1<=333;++i1) {
		if (i1%3==0) {
			sum += i1;
		}
	}
	System.out.println("80���� 333������ 3�� ������� : "+sum);
	
	}

}
