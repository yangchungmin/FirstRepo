package study;

import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	/*
	 연결 리스트
	 -ArrayList보다 삽입/삭제에 유리한 리스트
	 -데이터 중간에 삽입이 발생했을때 ArrayList는 데이터를 뒤로 밀어야하지만
	    링크드 리스트는 연결된 노드만 변경하기 때문에 훨씬 빠르다
	   -ArrayList는 데이터 보관 및 읽기에 유리하고
	   -LinkedList는 데이터 추가 수정및 삭제에 유리하다
	 */
	public static void main(String[] args) {
		LinkedList<String> animals =new LinkedList<String>();
		
		//LinkedList의 add들
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		
		System.out.println(animals);
		
		animals.addFirst("turtle");
		animals.addLast("monkey");
		
		System.out.println(animals);
		
		//LinkedList의 get들
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
	
	
		//pop(),poll() :리스트의 맨앞의 데이터를 읽고 버린다
		while(animals.size()!=0) {
		System.out.println("after pop :"+animals.pop());
		}
		//pollLast() : 리스트의 맨뒤 데이터를 읽고 버린다
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabbit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");
		cage.add("dog");
		
		animals.addAll(cage);
		
		while(animals.size() != 0) {
			System.out.println("뒤에서 부터 꺼내기 :"+animals.pollLast());
		}
		//성능 테스트
		int testSize = 1000000;
		ArrayList<Integer> arr = new ArrayList<>(testSize);
		 
		
		
	}
}
