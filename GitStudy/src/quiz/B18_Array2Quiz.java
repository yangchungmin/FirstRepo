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
		
		
	//1.numArr�� ��簪�� 0~100������ ���������� �ٲ㺸����
	//2.numArr�� ���հ� ����� ���ؼ�����ϼ���
	//3.numArr�� �� ���� ���� ��� ���ؼ� ����ϼ���
	//4.numArr�� �� ���� ���� ��� ���ؼ� ����ϼ���
	
		
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
		
		
		System.out.println("----1������----");
		for(int i=0;i<numArr.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				
				System.out.print(numArr[i][j]+"\t");
				
				
			}
			System.out.println();
			
		}
		
		
	//2.
		System.out.println("----2������----");
		System.out.println("�迭����� ����:"+sum);
		avg= (double)sum/count;
		System.out.printf("�迭����� ���:%.2f",avg);
		
			
	
		
		
		//���� �� �迭 ã��
		int longest =0;
		for(int i=0;i<numArr.length;i++) {
			longest=Math.max(longest,numArr[i].length);
		}
		
		//3,4. row:��  column:��
		
		int[] colSum = new int[7];
		int[] rowSum =new int[5];
		
		for(int i=0;i<colSum.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				rowSum[i] +=numArr[i][j];
				colSum[j] += numArr[i][j];
				
				
			}
			System.out.println();
			
		}
		//Arrays.toString():�迭 ���ϰ� ����ϱ�
		System.out.println("������:"+Arrays.toString(rowSum));
		System.out.println("������:"+Arrays.toString(colSum));
	
	
	}
}
