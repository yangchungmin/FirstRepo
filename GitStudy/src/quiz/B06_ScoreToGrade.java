package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
/*
 ������ �Է¹޴��� ������ �ش��ϴ� ����� ������ִ� ���α׷�
 
 90���̻� A���
 80���̻� B���
 70���̻� C���
 60���̻� D���
 �׿� F���
 */
		System.out.print("������ �Է����ּ���:");
		int grade = sc.nextInt();
		char score = 'F';
		if(grade < 0 || grade > 100) {		
			System.out.println("�߸��� �����Է��Դϴ�.");
		}else if(grade>=90 ) {
			score ='A';
		}else if(grade >= 80) {
			score ='B';
		}else if(grade >= 70) {
			score ='C';
		}else if(grade >= 60 ) {
			score ='D';
		}
		
		System.out.printf("����� ������%d������ \"%c\"����Դϴ�.\n"
				,grade,score);
		
		
	}	
}