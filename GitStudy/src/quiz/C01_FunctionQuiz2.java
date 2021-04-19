package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 1.�ִ밪�� �Ű������� ���޹����� 0���� �ִ밪�̸��� ��簪�� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� 
	 range�Լ��� ��������(�ִ밪�̸�)
	 ex) range(10)�� ��� : [0,1,2,3,4,5,6,7,8,9]
	 2.�ּҰ��� �ִ밪�� �Ű������� ������ �� ���̿� �����ϴ� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� 
	 range�Լ��� �������� (�ּҰ��̻� �ִ밪�̸�)
	 ex) range(5,10)�� ��� : [5,6,7,8,9]
	 3.�ּҰ���  �ִ밪�� �������� �Ű������� ������ �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
	 range�Լ��� ��������(�ּҰ��̻�, �ִ밪�̸�)
	 
	  ex) range(50,56,5)�� ��� : [50,55]
	  	  range(50,55,5)�� ��� : [50]
	 */
	
	//1������
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
	
	//2������
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
	
	//3������
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
