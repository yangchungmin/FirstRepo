package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
/*
 점수를 입력받느면 점수에 해당하는 등급을 출력해주는 프로그램
 
 90점이상 A등급
 80점이상 B등급
 70점이상 C등급
 60점이상 D등급
 그외 F등급
 */
		System.out.print("점수를 입력해주세요:");
		int grade = sc.nextInt();
		char score = 'F';
		if(grade < 0 || grade > 100) {		
			System.out.println("잘못된 점수입력입니다.");
		}else if(grade>=90 ) {
			score ='A';
		}else if(grade >= 80) {
			score ='B';
		}else if(grade >= 70) {
			score ='C';
		}else if(grade >= 60 ) {
			score ='D';
		}
		
		System.out.printf("당신의 점수는%d점으로 \"%c\"등급입니다.\n"
				,grade,score);
		
		
	}	
}