package quiz;

import java.util.Random;

public class B16_TempPassword {
	public static void main(String[] args) {
	/*
	StringBuilder tempPassword = new StringBuilder();
	int size =4;
	for (int i =0; i<size; i++) {
		
		switch((int)Math.random()*2) {
		case 0:
			tempPassword.append((char)(Math.random()*26+'A'));
			break;
			
		case 1:
			tempPassword.append((char)(Math.random()*10+'0'));
			break;
			
		
		}
	}
	System.out.println("�ӽú�й�ȣ :"+tempPassword.toString());

	*/
	
	//���ڼ��� �����ΰ� �ε����� �������� �����ϴ� ���
	String charset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	int password_size =4;
	
	for(int i=0; i<password_size;i++) {
		int random_index = (int)(Math.random()*charset.length());
		System.out.print(charset.charAt(random_index));
	
	}
	System.out.println();
	
	}
}