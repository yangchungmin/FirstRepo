package study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D13_Time {
/*
 java.time.Time
 -Calendar의 인스턴스를 set()을 통해 변화시킨다는 단점을 보완한 클래스
 -java.time 패키지의 클래스들은 시간을 계산한뒤 새로운 인스턴스를 반환하고
     원본 인스턴스는 그대로 유지한다
  -LocalDate, LocalTime, LocalDateTime 이 있다
 */
	public static void main(String[] args) {
		
		//1.now() : 지금 시간의 인스턴스를 생성하는 메서드
		
		//LocalDate : 날짜만 저장하기 위한 클래스
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalTime : 시간만 저장하기 위한 클래스
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//LocalTime : 날짜와 시간을 저장하기 위한 클래스
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
				
		//2.of() :원하는 날짜/시간의 인스턴스를 생성할수있는 메서드
		
		LocalDate childrensDay = LocalDate.of(2021,5,5);
		System.out.println(childrensDay);
		
		LocalTime promise = LocalTime.of(17,8);
		System.out.println(promise);
		
		LocalDateTime my_promise = LocalDateTime.of(childrensDay,promise);
		System.out.println(my_promise);
		
		//3.시간 변경하기
		//Calender는 원본을 훼손하는 안좋은 설계였기 때문에 여기서 차이가 난다
		//java.time 패키지의 클래스들은 시간이 변경된 새로운 인스턴스를 반환한다
		System.out.println(promise.plusHours(3));//약속시간보다 3시간뒤인 인스턴스를 반환
		System.out.println(promise);
		
		System.out.println(childrensDay.getMonth());
		System.out.println(childrensDay.minusWeeks(1));
		System.out.println(childrensDay.plusWeeks(3));
		
		//4. 시간을 문자열로 변환하기
		//-DateTimeFormatter클래스를 사용한다
		//-다양한 static 메서드와 표준들을 이용해 문자열 형식을 지정할수있다
		
		//.ofPattern() : 포맷 직접만들기
		System.out.println(childrensDay.format(DateTimeFormatter.ofPattern("y년M월d일")));
		
		//.다양한 표준이름들 : 표쥰 사용하기
		System.out.println(my_promise.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(my_promise.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		LocalDate christmas = LocalDate.of(2020, 12, 25);
		
		System.out.println("2021년 어린이날이 2020년 크리스마스보다 뒤인가요?"+
		childrensDay.isAfter(christmas));
		System.out.println("2021년 어린이날이 2020년 크리스마스보다 앞인가요?"+
			childrensDay.isBefore(christmas.plusYears(1)));
	
	
	}    
	
}
