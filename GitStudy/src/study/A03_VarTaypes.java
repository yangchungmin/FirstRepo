package study;

public class A03_VarTaypes {
	public static void main(String[] args) {
		
		/*
		 ����Ÿ��
		 
		 -byte  (1byte)
		 	1byte = 8bit
		 	0000 0000 (0) ~ 1111 1111 (255)
		 	
		 	*ù��°  bit�� ��ȣ ��Ʈ�� ���ȴ�
		 	
		 	byteŸ���� ��� ���� 0000 0000 (0) ~ 0111 1111(127)
		 	
		 	byteŸ���� ���� ���� 1000 0000 (-128) ~ 1111 1111(-1)
		 	
		 	2 ^ 1 = 2����
		 	2 ^ 2 = 4����
		 	2 ^ 3 = 8����
		 	2 ^ 4 = 16����
		 	2 ^ 5 = 32����
		 	2 ^ 6 = 64����
		 	2 ^ 7 = 128����
		 	2 ^ 8 = 256����
		 	
		 -short (2byte)
		  
		  2byte = 16bit
		  	
		  2 ^ 16 = 65536����
		  	 
		  short�� ������� 0 ~ 32767
		  short�� �������� -32768 ~ -1
		 	
		 -char  (2byte,unsigned)
		 
		  2 ^ 16 = 65536����
		  
		  ��ȣ�� ���� ������ 0 ~ 65535�� ����� �����Ҽ��ִ� Ÿ��
		  �ַ� �����ڵ带 �����ϴµ��� ����Ѵ�(����Ÿ��)
		 
		 -int   (4byte)
		 
		  4byte = 32bit
		  
		  2 ^ 32 = 4,294,967,296����
		 
		  int�� ������� 0 ~ 2,147,483,647
		  int�� �������� -2,147,483,648 ~ -1
		 
		 -long  (8byte)
		 	
		 	8byte = 64bit
		 	
		 	2 ^ 64 = ����
		*/
		byte min_Byte =-128;
		byte max_Byte =127;
		System.out.println("byte Ÿ�Կ� �����Ҽ� �ִ� ���� ū ����"+max_Byte+"�̰�,"
				+"���� ���� ����"+min_Byte+"�Դϴ�.");
		
		short min_Short =-32768;
		short max_Short = 32767;
		System.out.println("short Ÿ�Կ� �����Ҽ� �ִ� ���� ū ����"+max_Short+"�̰�,"
				+"���� ���� ����"+min_Short+"�Դϴ�.");
		
		char min_Char =0;
		char max_Char =65535;
		System.out.println("char Ÿ�Կ� �����Ҽ� �ִ� ���� ū ����"+(int)max_Char+"�̰�,"
				+"���� ���� ����"+(int)min_Char+"�Դϴ�.");
		
		char ch =65;
		System.out.println("charŸ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�"+ch);
		System.out.println("charŸ�Կ� ����� �ڵ尪�� Ȯ���ϰ������ (int)�� ���δ�"
		+(int)ch);
		
		
		int min_Int =-2_147_483_648;
		int max_Int =2_147_483_647;
		
		System.out.println("int Ÿ�Կ� �����Ҽ� �ִ� ���� ū ����"+max_Int+"�̰�,"
				+"���� ���� ����"+min_Int+"�Դϴ�.");
		
		//int�� ������ �Ѿ�� ���ڸ� ����Ҷ����� L�� ������ �Ѵ�
		long _Long =2_147_483_648L;
		
		/*
		 �Ǽ�Ÿ��
		 -float (4byte)
		 -double (8byte)
		 
		 �Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
		 �ε��Ҽ��� ����� ����Ѵ�
		 */
		//�׳� �Ҽ��� ���°��� �⺻������ double Ÿ���̴�
		//floatŸ���� �Ҽ��� �ڿ� F�� �������Ѵ�.
		
		float weight = 65.66F;
		double height =177.77;
		
		/*
		 ��/���� Ÿ��
		 
		 ���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
		 ���� true false�ۿ� ����
		*/
		
		boolean hasFood = true;
		boolean over130cm = false;
		
		
		 /*
		 ������ Ÿ�� (Ŭ���� Ÿ��)
		 	������Ÿ���� �⺻�� Ÿ�԰��� �ٸ��� �빮�ڷ� �����Ѵ�
		 	-String : ���ڿ�
		 	-�׿� ��� Ŭ������..
		 
		 */
		
		String helloMessage = "Hello, My name is John Doe";
		String byeMessage = "Good bye ";
		
		System.out.println(helloMessage);
		System.out.println("helloMessage");
		
		System.out.println(byeMessage + byeMessage + byeMessage);
		
		
		
		
		
		
		
	}
}
