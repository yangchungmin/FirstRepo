package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	public static void main(String[] args) {
		
		
		System.out.print("초입력 :");
		int second =new Scanner(System.in).nextInt();
		//1년 : 60 * 60 * 24 * 365 초
		//1일: 60 * 60 * 24 초
		//1시간 : 60*60 초
		//1분 : 60초
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
		
	
		//System.out.printf("%d초는변환하면 %d년 %d월 %d일 %d시간 %d분 %d초입니다.\n",
				//original,y,d,h,m,s);
				
		
		
		System.out.printf("%d초는변환하면 ",original);
		boolean exist =false;	
		if (y!=0) {
			System.out.println(y+"년");
			exist=true;
		}if (exist || d!=0) {
			System.out.println(d+"일");
			exist=true;
		}if (exist || h!=0) {
			System.out.println(h+"시간");
			exist=true;
		}if (exist || m!=0) {
			System.out.println(m+"분");
		}
		System.out.println(s+"초 입니다.");
		/*초를 입력받으면 년/월/일/시간/분/초로 변환하여 출력해보세요
		 * 
		 * 출력하되 필요없는 단위는 출력하지말것
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해주세요 :");
		int time = sc.nextInt();
		int min = time/60;
		int sec = time-min*60;
		int hour = min/60;
		int day = hour / 24;
		min = min-hour*60;
		hour =hour-day*24;
		int month = day / 30 ;
		int year = month / 12 ;
		
		
		
	System.out.printf("%d초는 %d년 %d월 %d일 %d시간 %d분 %d초입니다",
			time,year,month,day,hour,min,sec);
	*/
	}
}
