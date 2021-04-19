package study;

import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	/*
	 ���� ����Ʈ
	 -ArrayList���� ����/������ ������ ����Ʈ
	 -������ �߰��� ������ �߻������� ArrayList�� �����͸� �ڷ� �о��������
	    ��ũ�� ����Ʈ�� ����� ��常 �����ϱ� ������ �ξ� ������
	   -ArrayList�� ������ ���� �� �б⿡ �����ϰ�
	   -LinkedList�� ������ �߰� ������ ������ �����ϴ�
	 */
	public static void main(String[] args) {
		LinkedList<String> animals =new LinkedList<String>();
		
		//LinkedList�� add��
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		
		System.out.println(animals);
		
		animals.addFirst("turtle");
		animals.addLast("monkey");
		
		System.out.println(animals);
		
		//LinkedList�� get��
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
	
	
		//pop(),poll() :����Ʈ�� �Ǿ��� �����͸� �а� ������
		while(animals.size()!=0) {
		System.out.println("after pop :"+animals.pop());
		}
		//pollLast() : ����Ʈ�� �ǵ� �����͸� �а� ������
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabbit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");
		cage.add("dog");
		
		animals.addAll(cage);
		
		while(animals.size() != 0) {
			System.out.println("�ڿ��� ���� ������ :"+animals.pollLast());
		}
		//���� �׽�Ʈ
		int testSize = 1000000;
		ArrayList<Integer> arr = new ArrayList<>(testSize);
		 
		
		
	}
}
