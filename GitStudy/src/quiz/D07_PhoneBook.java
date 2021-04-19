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
			System.out.println("-----------전화번호부----------");
			System.out.println("그룹 추가:0, 찾기1, 전체보기2, 종료3");
			System.out.print("입력 : ");
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
				System.out.println("프로그램을 종료합니다");
				return;
			
			}
		}
	}
	public void insert() {
		System.out.print("그룹 :");
		group = scanner.next();
		if(map.get(group) != null) {
			System.out.println("이미 존재하는 그룹입니다");
			return;
		}
		System.out.print("전화번호 : ");
		telnum=scanner.next();
		System.out.print("이름 : ");
		name = scanner.next();
		
		map.put(name, new D07_phone(group, name, telnum));
		
	}
	public void search() {
		System.out.print("이름 :");
		name = scanner.next();
		if(map.get(name) == null) {
			System.out.println("존재하지않는 이름입니다");
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
