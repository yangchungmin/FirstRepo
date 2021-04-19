package quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B18_Array2Quiz {
	public static void main(String[] args) {
		int sum =0;
		int sum1=0;
		int count=0;
		double avg;
		
		int[][] numArr	= new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1},
			{1,1,},
			{1,1,1,1}
		};
		
		
	//1.numArr의 모든값을 0~100사이의 랜덤정수로 바꿔보세요
	//2.numArr의 총합과 평균을 구해서출력하세요
	//3.numArr의 각 행의 합을 모두 구해서 출력하세요
	//4.numArr의 각 열의 합을 모두 구해서 출력하세요
	
		
	//1.
		
		for(int i=0;i<numArr.length;++i) {
			count += numArr[i].length;
			
			for(int j=0;j<numArr[i].length;++j) {
				
				numArr[i][j] =(int)(Math.random()*101);
				sum += numArr[i][j];
				//sum1 += numArr[j][i];
				//count++;

			
				
			}
			
		
			
		}
		
		
		System.out.println("----1번문제----");
		for(int i=0;i<numArr.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				
				System.out.print(numArr[i][j]+"\t");
				
				
			}
			System.out.println();
			
		}
		
		
	//2.
		System.out.println("----2번문제----");
		System.out.println("배열요소의 총합:"+sum);
		avg= (double)sum/count;
		System.out.printf("배열요소의 평균:%.2f",avg);
		
			
	
		
		
		//제일 긴 배열 찾기
		int longest =0;
		for(int i=0;i<numArr.length;i++) {
			longest=Math.max(longest,numArr[i].length);
		}
		
		//3,4. row:행  column:열
		
		int[] colSum = new int[7];
		int[] rowSum =new int[5];
		
		for(int i=0;i<colSum.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				rowSum[i] +=numArr[i][j];
				colSum[j] += numArr[i][j];
				
				
			}
			System.out.println();
			
		}
		//Arrays.toString():배열 편하게 출력하기
		System.out.println("행의합:"+Arrays.toString(rowSum));
		System.out.println("열의합:"+Arrays.toString(colSum));
	
	
	}
}
