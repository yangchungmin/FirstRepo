package quiz;

import java.util.ArrayList;

import study.Student2;

public class D01_StudentList {
/*
 학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
 1.각 학생의 점수는 랜덤으로 설정됩니다
 2.과목은 국영수 밖에 없습니다
 3.30명의 평균을 출력해주세요
 4.30명중 가장 총점이 높은 학생의 이름과 성적을 출력해주세요
 5.이름은 다음과 같이 생성됩니다
 학생 000000
 학생 000001
 학생 000002
 ....
 */
public static void main(String[] args) {
		
		ArrayList<Student2> students = new ArrayList<>();
		
		for(int i=0 ; i<30 ; i++) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(stu.getTranscript());
		}
		System.out.println("---------- 최고점수 학생----------");
		for(Student2 student : students) {
			if(student.getTotal()==Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
		}
		
	}


}
