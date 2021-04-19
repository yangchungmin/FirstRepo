package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {



public static void main(String[] args) {
	/*
	 1.사용자로부터 배열의 크기를 입력받는다
	 2.해당 크기만큼의 배열에 랜덤과일 문자열을 저장한다
	 (랜덤으로 등장하는과일 : apple,banana,kiwi,orange,peach,strawberry,pineapple)
	 3.각 과일이 몇번 등장했는지 모두 기록하고 출력해본다
	 
*/
	
	
	Scanner sc =new Scanner(System.in);
	System.out.print("크기 입력 : ");
	int input=sc.nextInt();
	Random ran = new Random();
	
	String[]  fruit = new String[]{"apple","banana","kiwi","orange","peach",
									"strawberry","pineapple"};
	//String[] fruitrandom =new String[input];
	
	for(int i=0;i<input;i++) {
		int random =(int)(Math.random()*7);
		System.out.println(fruit[random]);
	
	
	
	
		}
 	}
}

