package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
public static void main(String[] args) {
	Scanner apple =new Scanner(System.in);
	/*
	 ����� 10���� ���� ���ִ� �ٱ��ϰ� �ִ�
	 ����� �����ϰ���� ����� ������ �Է��ϸ� 
	 ����� ��δ�� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������
	 
	 */
	
  
  

  System.out.print("���ϴ� ����ǰ����� �Է����ּ��� :");
  int want= apple.nextInt();
  int basket;
  basket =want/10;
 
  if(want%10 ==0) {
	  System.out.println("�ٱ��ϰ�"+basket+"�� �ʿ��մϴ�");
	 }else{
	  System.out.println("�ٱ��ϰ�"+(basket+1)+"�� �ʿ��մϴ�");
	 }
  
		
  
}
}
