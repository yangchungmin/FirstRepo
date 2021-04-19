package study;

public class D03_WrapperClass {
	
	/*
	 Wrapper Class
	 -�⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� Ŭ����
	 -�� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 
	 �⺻���̸�
	 -int,short,char,byte,long,float,double,boolean
	 
	 �������̸�
	 -Byte,Short,Character,Integer,Long,Float,Double,Boolean
	 */
	
	
	
	public static void main(String[] args) {
		/*
		parse �ø���
		-���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ���
		-�� Ÿ�Կ� ����ƽ �޼���� �����Ѵ�
		-�����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵Ǵ� ��찡 ����
		-�ٽ� ����ϱ� ���ؼ��� ���� �����͸� ������ Ÿ������ �ǵ������Ѵ�
		-radix�� �����ִ� �����ε��� ������ �ǹ��Ѵ�
		*/
		try {
		int a1 =Integer.parseInt("1234ABC",16);
		System.out.println(a1);
		}catch(NumberFormatException e){
			System.out.println("int�� ��ȯ�Ҽ� ���� ���ڿ��Դϴ�");
		}
		System.out.printf("%.9f",Double.parseDouble("123.123455667"));
		
		//Integer i =new Integer(10);
		Integer i =Integer.valueOf(10);
		int a =10;
		/*
		 toString();
		 -�ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�Ҽ��ִ�
		 -toString()�� Object �޼����̱� ������ ��� Ŭ������ �����Ѵ�
		 -�ν��Ͻ��޼��� toString()�� �ش� �ν��Ͻ��� ���� ���ڿ��� ��ȯ�Ѵ�
		 -����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ�
		 	 */
		System.out.println(Integer.toString(123456,2));
		System.out.println(Integer.toString(123456,8));
		System.out.println(Integer.toString(123456));//radix default 10
		System.out.println(Integer.toString(123456,16));
		
		//int num =10;
		Integer num2 = 10;
		num2.toString();
		
		/*
		 typevalue() �ø���
		 -�ش� �ν��Ͻ� ���� ���ϴ� Ÿ���� ������ �ս��� �����ϴ� �޼���
		 -Ÿ��ĳ������ ������ ����
		 */
		Integer num = 10000003;
		
		System.out.println(num.byteValue());
		System.out.println(num.shortValue());
		System.out.println(num.longValue());
		System.out.println(num.floatValue());
		System.out.println(num.doubleValue());
		
		
	}
}
