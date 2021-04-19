package quiz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

/*
 *����ڷκ��� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ��������
 *(�߸��� ���� �ԷµǾ �������� �����ʰ� �ùٸ� �����ԷµǸ� ����� ���α׷�����
 
public class C13_InputRightThing {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int a ;
	
	System.out.print("�ݵ�� ���ڸ� �Է����ּ���");
	a = sc.nextInt();
	
	try {
		 a = sc.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("�ٽ� �Է����ּ���");
		
	}
	
	
	while(!sc.hasNextInt()) {
			System.out.println("���ڸ� �Է����ּ���");
		
	}
	System.out.println("�Է��Ͻ� ����:"+a);
	System.out.println("���α׷��� ���������� ����Ǿ����ϴ�");
	}
	public static void retry() {
		
	}
	*/
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	int a = inputInt("���� :");
	int b = inputInt("�ι�° ����:");
	System.out.println("�Է��Ͻ� ����:"+a);
	System.out.println("���α׷��� ���������� ����Ǿ����ϴ�");
}
public static int inputInt(String message) {

	int num;
	
	while(true) {
		try {
			System.out.println(message);
			num= sc.nextInt();
			break;
	  }catch(InputMismatchException e) {
		  	sc.nextLine();
	  }
	
	}
	//sc.close(); ���̻� �������� ��ĳ�ʸ� ����(System.in�� �Ժη� close���ؾߵ�)
	return num;
}
}