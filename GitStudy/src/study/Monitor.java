package study;

import java.util.Scanner;

/*
 * Monitor class �� �����ϰ� MointorManager class ���� �׽�Ʈ �ϼ���
 */

public class Monitor {
	// �ʵ� : ����ȸ��, ȭ��ũ��, �г� ����(���, Ŀ���)
	String company;
	String size;
	String panel;
	
	// ����� ���� �Է�
	void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����ȸ�� �Է� > ");
		company = scanner.next();
		System.out.print("ȭ��ũ�� �Է� > ");
		size = scanner.next();
		System.out.print("�г����� �Է� > ");
		panel = scanner.next();
		System.out.println();
	}
	
	// ����� ���� ���
	void info() {
		System.out.println("--- ����� ���� ---");
		System.out.println("����ȸ�� : " + company);
		System.out.println("ũ      �� : " + size);
		System.out.println("�г����� : " + panel);
	}
	
}
