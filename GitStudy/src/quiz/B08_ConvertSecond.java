package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	public static void main(String[] args) {
		
		
		System.out.print("���Է� :");
		int second =new Scanner(System.in).nextInt();
		//1�� : 60 * 60 * 24 * 365 ��
		//1��: 60 * 60 * 24 ��
		//1�ð� : 60*60 ��
		//1�� : 60��
		final int YEAR_FOR_SECOND = 31536000;
		final int SECOND_FOR_DAY = 86400;
		final int SECOND_FOR_HOUR = 3600;
		final int SECOND_FOR_MINUTE = 60;
		
		int y=0,d=0,h=0,m=0,s=0;
		int original = second;
		//31,536,000
		y= second / YEAR_FOR_SECOND;
		second %= YEAR_FOR_SECOND;
		d= second / SECOND_FOR_DAY;
		second %= SECOND_FOR_DAY;
		h= second /SECOND_FOR_HOUR ;
		second %= SECOND_FOR_HOUR ;
		m= second / SECOND_FOR_MINUTE;
		second %= SECOND_FOR_MINUTE;
		s = second;
		
	
		//System.out.printf("%d�ʴº�ȯ�ϸ� %d�� %d�� %d�� %d�ð� %d�� %d���Դϴ�.\n",
				//original,y,d,h,m,s);
				
		
		
		System.out.printf("%d�ʴº�ȯ�ϸ� ",original);
		boolean exist =false;	
		if (y!=0) {
			System.out.println(y+"��");
			exist=true;
		}if (exist || d!=0) {
			System.out.println(d+"��");
			exist=true;
		}if (exist || h!=0) {
			System.out.println(h+"�ð�");
			exist=true;
		}if (exist || m!=0) {
			System.out.println(m+"��");
		}
		System.out.println(s+"�� �Դϴ�.");
		/*�ʸ� �Է¹����� ��/��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		 * 
		 * ����ϵ� �ʿ���� ������ �����������
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է����ּ��� :");
		int time = sc.nextInt();
		int min = time/60;
		int sec = time-min*60;
		int hour = min/60;
		int day = hour / 24;
		min = min-hour*60;
		hour =hour-day*24;
		int month = day / 30 ;
		int year = month / 12 ;
		
		
		
	System.out.printf("%d�ʴ� %d�� %d�� %d�� %d�ð� %d�� %d���Դϴ�",
			time,year,month,day,hour,min,sec);
	*/
	}
}
