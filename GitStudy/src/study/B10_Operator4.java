package study;

public class B10_Operator4 {
public static void main(String[] args) {
	/*
	 #���� ����
	 = : ������ ������ �������� ���� �����Ѵ�
	 */

	int num =10;
	num = num + 20;
	System.out.println(num);

	/*
	 ���� ���� ������
	 ������ ����� ������Ű�� ������
	 */
	
	num =10;
	System.out.println(num += 15);//num = num+5
	System.out.println(num -= 3);//22
	System.out.println(num *= 2);//44
	System.out.println(num /= 4);//11
	System.out.println(num %= 3);//2
	
	/*
	 ���� ������
	 -������ ����� 1�� ������Ű�� ������
	 ++ ��  -- �� ��ġ������ ����� �޶�����
	 */
	num = 10;
	num++; // num+1
	num--; // num-1
	System.out.println(num);
	
	//++ , --�� �ڿ������� �ش� ���� ������� �����ѵڿ� ���̺��Ѵ�
	//++ , --�� �տ������� �ش� ���� ����� �����ϱ����� ���̺��Ѵ�
	num =3;
	System.out.println(++num);
	
	
	
	



}
}
