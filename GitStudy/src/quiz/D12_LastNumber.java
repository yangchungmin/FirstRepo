package quiz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D12_LastNumber {
	public static void main(String[] args) {
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		
		String[] weekDay = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };     

		   Calendar cal = Calendar.getInstance(); 

		      int num = cal.get(Calendar.DAY_OF_WEEK)-1; 

		      String today = weekDay[num]; 

		      String car_num = "";
		      
		      switch (num){ 
		      case 1: 
		    	  car_num = "���� ����ȣ 1,6������ �����մϴ�";
		    	  break;
		      case 2:
		    	  car_num = "���� ����ȣ 2,7������ �����մϴ�";
		    	  break;
		      case 3:
		    	  car_num = "���� ����ȣ 3,8������ �����մϴ�";
		    	  break;
		      case 4:
		    	  car_num = "���� ����ȣ 4,9������ �����մϴ�";
		    	  break;
		      case 5:
		    	  car_num = "���� ����ȣ 5,0������ �����մϴ�";
		    	  break;
		      case 6:
		    	  car_num = "�������� ���������Դϴ�";
		    	  break;
		      case 0:
		    	  car_num = "�������� ���������Դϴ�";
		    	  break;
		      
		      }
		      
		     System.out.printf("%s�� %s�̹Ƿ� %s",date.format(Calendar.getInstance().getTime()),today,car_num);
	 }
	
}
