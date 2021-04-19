package quiz;

public class B15_WhileBasicQuiz {
public static void main(String[] args) {
	/*
	 while문을 이용하여
	 
	 1.1부터 100까지의 3의 배수의 총합
	 2.200부터 1까지 출력
	 3.continue를 이용하여 300부터500사이의 7의 배수만 출력
	 4.1부터 200까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 */
	//1.
	int sum=0,i=1;
	while(i<=100){
		if(i%3==0) {
			sum+=i;
		}
			i++;
	
	 }
		System.out.println("1부터100까지의3의배수총합: "+sum);

   

	//2.
	
	i=200;
	while(i>0) {
		System.out.println(i--);
		
	}
	
	//3.
	
	i=299;

	while(i++ <= 500){
		
		if(i % 7 != 0) {
		continue;
			
		}
		System.out.println(i);
	}
	
	i =1;
	sum=0;
	
	while (i++ <200) {
		if(i%2 !=0 && i%3 != 0) {
			sum += i;
		}
	}
	System.out.println("4번 답:"+sum);
}
}
