package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 ���� �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 
	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ,�ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦�����Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 	factorial : (n)*(n-1)*(n-2).....3*2*1
	 */
	
	//1.
	public static boolean alphabet(char alpha) {
		
		return (alpha >='A'&& alpha <='Z' ||alpha >='a'&& alpha <='z' );
	}
			
	
	//2.
	public static boolean num (int number) {
		
		return number % 3 ==0;
	}
	
	
	
	//3.	
	public static String num1(int num) {
			return num%2==0? "¦���Դϴ�":"Ȧ���Դϴ�";
			
		}
		
	//4.	
	public static int[] FindDivide(int num) {
		
		
		
		boolean[] divide = new boolean[num];
		int count =0;
		for(int i =1;i<=num;++i){
			if(num%i==0) {
				divide[i-1]=true;
				count++;
			}	
			
		}
		int[] result = new int[count];
		int index =0;
		
		for(int i =0;i<divide.length;++i) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
	
		return result;
		
		
	}
	
	//5.
	public static boolean num2(int num) {
		
			
		double sqrt =Math.sqrt(num);
		
		for(int i=2;i<=sqrt;i++) {
			if(num%i==0) {
				return  false;
				
			}
		}
		return true;
	}
		
	//6.	
	
	public static int factorial(int n) {
	
		if (n==2) {
			return 2;
		}
	
		return n * factorial(n-1);
	}
	
	
	
	
	public static void main(String[] args) {
		
			
	
		System.out.println(Arrays.toString(FindDivide(120)));
		
		for(int i=1;i<10;i++) {
			System.out.println(factorial(11));
		}
	
	}
}
