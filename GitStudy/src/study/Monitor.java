package study;

import java.util.Scanner;

/*
 * Monitor class 를 정의하고 MointorManager class 에서 테스트 하세요
 */

public class Monitor {
	// 필드 : 제조회사, 화면크기, 패널 형태(평명, 커브드)
	String company;
	String size;
	String panel;
	
	// 모니터 정보 입력
	void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("제조회사 입력 > ");
		company = scanner.next();
		System.out.print("화면크기 입력 > ");
		size = scanner.next();
		System.out.print("패널형태 입력 > ");
		panel = scanner.next();
		System.out.println();
	}
	
	// 모니터 정보 출력
	void info() {
		System.out.println("--- 모니터 정보 ---");
		System.out.println("제조회사 : " + company);
		System.out.println("크      기 : " + size);
		System.out.println("패널형태 : " + panel);
	}
	
}
