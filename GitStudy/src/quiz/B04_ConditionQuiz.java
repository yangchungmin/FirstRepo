package quiz;

public class B04_ConditionQuiz {
	public static void main(String[] args) {
		int a=11,b=12,c=14,hour=13,d=15,e=45,year = 2100,
			minage = 20,chulage =18,minbirth = 7,chulbirth =10;
		boolean powerOn =false;
		String str = "yes";
		/*
        [ 알맞은 비교연산을 만들어보세요 ]
            
        1. int형 변수 a가 10보다 크고 20보다 작을 때 true
        2. int형 변수 b가 짝수일 때 true                
        3. int형 변수 c가 7의 배수일 때 true
        4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
        5. int형 변수 d와 e의 차이가 30일 때 true                
        6. int형 변수 year가 400으로 나누어 떨어지면 true  
                      또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
        7. 민수가 철수보다 2살 많으면 true
        8. 민수가 철수보다 생일이 3달 빠르면 true  
        9. boolean형 변수 powerOn이 false일 때 true
        10. 문자열 참조변수 str이 "yes"일 때 true
*/        
		System.out.println(a>10 && a<20 );
		System.out.println(b%2 == 0 );
		System.out.println(c%7 == 0 );
		System.out.println(!(hour <0 || hour>=24) && hour>=12 );
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year%400 ==0 || (year%4 ==0 && 
				year%100 != 0) );
		System.out.println(minage-chulage == 2);
		System.out.println(minbirth + 3 == chulbirth);
	    System.out.println(!powerOn);
		//문자열(참조형 타입)은 ==으로 비교하면안된다.
	    //참조형 타입의 값을 비교할때는 해당클래스에 정의 되어있는 equals()라는 
	    //메서드를 이용해야한다
	    System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		
		//기본형 타입과 참조형 타입의 차이점
		//-기본타입은 내부데이터의 크기를 예측하기 쉽다(차곡차곡 쌓이는 메모리를 사용,Stack)
		//-참조형 타입은 내부 데이터의 크기를 예측하기 어렵다(여기저기 막쓰는 메모리를 사용,Heap)
		
		String str1="yes";
		String str2=new String("yes");
		
		//저장되는 주소가 달라서  false가 나옴
		System.out.println("str1 == str2" + (str == str2));
		//equals가 주소안의 내용물을 정확히 파악해줌
		System.out.println("str1.equals(str2)" + str1.equals(str2));
		
		
		
	}
}
