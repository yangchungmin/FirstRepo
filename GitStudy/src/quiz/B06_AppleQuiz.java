package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
public static void main(String[] args) {
	Scanner apple =new Scanner(System.in);
	/*
	 사과를 10개씩 담을 수있는 바구니가 있다
	 사용자 구매하고싶은 사과의 개수를 입력하면 
	 사과를 모두담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요
	 
	 */
	
  
  

  System.out.print("원하는 사과의개수를 입력해주세요 :");
  int want= apple.nextInt();
  int basket;
  basket =want/10;
 
  if(want%10 ==0) {
	  System.out.println("바구니가"+basket+"개 필요합니다");
	 }else{
	  System.out.println("바구니가"+(basket+1)+"개 필요합니다");
	 }
  
		
  
}
}
