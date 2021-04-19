package study;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {
	public static void main(String[] args) {
		/*
		 SimpleDateFormat Ŭ����
		 -�����ϰ� ��¥ �ν��Ͻ��� ���ڷ� ��ȯ�Ҽ��ִ� Ŭ����
		 
		 ��¥����
		 y :��
		 M :��
		 d :��
		 D :�� ���о��� �� (1~365)
		 H :24��
		 h :12��
		 m: ��
		 s: ��
		 
		 E :����
		 a:����/����
		 
		 w: day of week in year
		 W: day of week in month
		 */
		SimpleDateFormat f1 = new SimpleDateFormat("y/MM/dd(DDD) a HH:mm:ss.SSS EEEE w W");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
				
	}
}
