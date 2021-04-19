package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class D07_PhoneBook {
final int INSERT = 0;
final int SEARCH = 1;
final int ALLNUM = 2;
final int EXIT = 3;
private String group,name,telnum;
Scanner scanner = new Scanner(System.in);
HashMap<String, D07_phone> map = new HashMap<>();

	public void run() {
		while(true) {
			System.out.println("-----------��ȭ��ȣ��----------");
			System.out.println("�׷� �߰�:0, ã��1, ��ü����2, ����3");
			System.out.print("�Է� : ");
			int menu = scanner.nextInt();
			switch (menu) {
			case INSERT:
				insert();
				break;
			case SEARCH:
				search();
				break;
			case ALLNUM:
				allnum();
				break;
			case EXIT:
				System.out.println("���α׷��� �����մϴ�");
				return;
			
			}
		}
	}
	public void insert() {
		System.out.print("�׷� :");
		group = scanner.next();
		if(map.get(group) != null) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�");
			return;
		}
		System.out.print("��ȭ��ȣ : ");
		telnum=scanner.next();
		System.out.print("�̸� : ");
		name = scanner.next();
		
		map.put(name, new D07_phone(group, name, telnum));
		
	}
	public void search() {
		System.out.print("�̸� :");
		name = scanner.next();
		if(map.get(name) == null) {
			System.out.println("���������ʴ� �̸��Դϴ�");
			return;
	}
		D07_phone p = map.get(name);
		System.out.println(p.toString());
}
	public void allnum() {
		Set<String> keylist = map.keySet();
		Iterator<String> it = keylist.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(map.get(name));
		}
	}
	public static void main(String[] args) {
		D07_PhoneBook pb = new D07_PhoneBook();
		pb.run();
	}
	
}
