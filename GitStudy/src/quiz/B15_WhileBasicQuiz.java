package quiz;

public class B15_WhileBasicQuiz {
public static void main(String[] args) {
	/*
	 while���� �̿��Ͽ�
	 
	 1.1���� 100������ 3�� ����� ����
	 2.200���� 1���� ���
	 3.continue�� �̿��Ͽ� 300����500������ 7�� ����� ���
	 4.1���� 200������ ������ 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 */
	//1.
	int sum=0,i=1;
	while(i<=100){
		if(i%3==0) {
			sum+=i;
		}
			i++;
	
	 }
		System.out.println("1����100������3�ǹ������: "+sum);

   

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
	System.out.println("4�� ��:"+sum);
}
}
