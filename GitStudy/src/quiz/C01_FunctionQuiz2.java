package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 1.최대값을 매개변수로 전달받으면 0부터 최대값미만의 모든값을 포함하는 int배열을 생성하여 반환하는 
	 range함수를 만들어보세요(최대값미만)
	 ex) range(10)의 결과 : [0,1,2,3,4,5,6,7,8,9]
	 2.최소값과 최대값을 매개변수로 받으면 그 사이에 존재하는 모든 값을 포함하는 int배열을 생성하여 반환하는 
	 range함수를 만들어보세요 (최소값이상 최대값미만)
	 ex) range(5,10)의 결과 : [5,6,7,8,9]
	 3.최소값과  최대값과 증가값을 매개변수로 받으면 최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int배열을 생성하여 반환하는
	 range함수를 만들어보세요(최소값이상, 최대값미만)
	 
	  ex) range(50,56,5)의 결과 : [50,55]
	  	  range(50,55,5)의 결과 : [50]
	 */
	
	//1번문제
	public static int[] max(int num) {
		boolean[] number = new boolean[num];
		int count =0;
		for(int i =1;i<=num;++i){
				number[i-1]=true;
				count++;
		}
		int[] result = new int[count];
		int index =0;
		
		for(int i =0;i<number.length;++i) {
			if(number[i]) {
				result[index++] = i ;
			}
		}
	
		return result;
	}
	
	//2번문제
	public static int[] range(int min,int max) {
		
		boolean[] number = new boolean[max];
		int count =0;
		for(int i =min;i<=max;++i){
				number[i-1]=true;
				count++;
		}
		int[] result = new int[count-1];
		int index =0;
		
		for(int i=min;i<number.length;++i) {
			if(number[i]) {
				result[index++] = i ;
			}
		}
	
		return result;
	}
	
	//3번문제
	public static int[] range2(int min,int max,int val) {
		
		boolean[] number = new boolean[max];
		int count =0;
		for(int i =min;i<=max;i+=val){
				number[i]=true;
				count++;
		}
		int[] result = new int[count];
		int index =0;
		
		for(int i=min;i<number.length;i+=val) {
			if(number[i]) {
				result[index++] = i ;
			}
		}
	
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	
		//System.out.println(Arrays.toString(max(20)));
		//System.out.println(Arrays.toString(range(11,15)));
		System.out.println(Arrays.toString(range2(5,21,5)));
	
	}
}
