package study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C15_Throw {
/*
1.throw
-���ϴ� ���ܸ� �߻���Ų��

2.throws
-�ش� �޼��忡�� �̷��� ���ܵ��� �߻���Ű�ٴ°��� �˸���
-�ش� �޼��带 ȣ���ϴ°����� ��� ���ټ��ִ�

3.ExceptionŬ������ ��ӹ��� ���ܴ� �ݵ�� ó���ؾ��ϴ� ���ܰ� �ȴ�
-Exception�� ����ó���� ���������� ������ ������ �߻���Ų��
-����ö�� �Ȱ�쿡�� �������� ������ش�
4.RuntimeException Ŭ������ ��ӹ��� ���ܴ� �� ó������ �ʾƵ� �Ǵ� ���ܰ� �ȴ�
-InputMismatchException ,ArrayIndexOutOfBoundsException..���
-����ó���� ���� �ʾƵ� ������ ������ �߻������ʴ� ���ܵ�
 
	public static void main(String[] args) {
		C15_Throw instance = new C15_Throw();
		instance.dangerous_method();
		try {
			instance.dangerous_method();
		}
		catch() {
			
		}
		
		
	}	
	public void dangerous_method()throws ArrayIndexOutOfBoundsException {
		int[] arr =new int[5];
		arr[5] = 10;
	
		
	}
}
*/
public static void main(String[] args) {
	
	C15_Throw instance = new C15_Throw();	
	try {
		instance.dangerous_method();
		instance.dangerous_method2();
	} catch (FileNotFoundException e) {
		System.out.println("���ϸ�ã��");
	}catch(ArrayIndexOutOfBoundsException e) {

	System.out.println("�迭����"+e.getMessage());
	}
	
	try {
		instance.checkEven(20);
		instance.checkOdd(14);
	}catch(NotEvenException e) {
		System.out.println("¦���ƴ� �ͼ��� �߻�");
	}catch(NotOddException e) {
		System.out.println("Ȧ�� �ƴ� �ͼ��� �߻�");
	}
	
	System.out.println("���α׷� ��������");
}	
public void dangerous_method() throws FileNotFoundException{
	File f = new File("F:\\nameless.txt");
	}


public void dangerous_method2() {
	throw new ArrayIndexOutOfBoundsException("�׳ɸ������");
	
	}

public void checkEven (int num) throws NotEvenException {
	if (num %2 ==0) {
		System.out.println("¦���Դϴ�");
	}else {
		throw new NotEvenException();
	}
	System.out.println("checkEven �޼��尡 ���� ���� �Ǿ����ϴ�");
}
public void checkOdd (int num)  {
	if (num %2 ==1) {
		System.out.println("Ȧ���Դϴ�");
	}else {
		throw new NotOddException();
	}
	System.out.println("checkOdd �޼��尡 ���� ���� �Ǿ����ϴ�");
}
}
//¦���� �ƴҋ� �߻���ų ����(����ó������������ ������ �Ұ�)
class NotEvenException extends Exception{
	public NotEvenException() {
	
	super("¦���� �ƴϾ �߻��ϴ� ����");
	}
}
//Ȧ���� �ƴҶ� �߻���ų ���� (����ó�������ʾƵ� �������� �����ʴ� ����)
class NotOddException extends RuntimeException{
	public NotOddException() {
	super("Ȧ���� �ƴϾ �߻��ϴ� ����");
	}
}