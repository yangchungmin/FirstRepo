package quiz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D12_LastNumber {
	public static void main(String[] args) {
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		
		String[] weekDay = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };     

		   Calendar cal = Calendar.getInstance(); 

		      int num = cal.get(Calendar.DAY_OF_WEEK)-1; 

		      String today = weekDay[num]; 

		      String car_num = "";
		      
		      switch (num){ 
		      case 1: 
		    	  car_num = "차량 끝번호 1,6출입을 제한합니다";
		    	  break;
		      case 2:
		    	  car_num = "차량 끝번호 2,7출입을 제한합니다";
		    	  break;
		      case 3:
		    	  car_num = "차량 끝번호 3,8출입을 제한합니다";
		    	  break;
		      case 4:
		    	  car_num = "차량 끝번호 4,9출입을 제한합니다";
		    	  break;
		      case 5:
		    	  car_num = "차량 끝번호 5,0출입을 제한합니다";
		    	  break;
		      case 6:
		    	  car_num = "출입제한 적용제외입니다";
		    	  break;
		      case 0:
		    	  car_num = "출입제한 적용제외입니다";
		    	  break;
		      
		      }
		      
		     System.out.printf("%s은 %s이므로 %s",date.format(Calendar.getInstance().getTime()),today,car_num);
	 }
	
}
