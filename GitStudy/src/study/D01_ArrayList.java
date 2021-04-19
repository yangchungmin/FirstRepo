package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D01_ArrayList {
/*
1.java collections
-자바에서 기본적으로 제공하는 자료구조 인터페이스
-Collection 인터페이스를  상속받은 인터페이스로는 List,Set 등이있다

2.java.util.ArrayList
-배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
-배열과 유사한 형태다
-순차적으로 모든 데이터에 접근해야할떄 가장 유리하다
 */
	public static void main(String[] args) {
		
		//타입을 지정하며 ArrayList 생성하기
		//타입을 지정할때 사용하는 <>를 제네릭(Generic) 이라고 부른다
		//제네릭에는 기본형 타입을 사용할수없다(기본타입의 WrapperClass 사용)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		//add(item):리스트에 원하는 데이터를 순차적으로 맨뒤에 추가한다
		
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
	
		
		//add(index,item) : 리스트의 원하는 위치에 데이터를 넣는다
		
		fruits.add(2,"orange");
		fruits.add(2,"peach");
		fruits.add(2,"grape");
		
		System.out.println(fruits);
		System.out.println(numbers);
		//get(index) : 리스트에서 원하는 인덱스의 데이터를 하나 꺼낸다
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
		//size():해당 컬렉션의 크기를 반환한다
		System.out.println("fruits의 크기"+fruits.size());
		System.out.println("numbers의 크기"+numbers.size());
		
		//remove(index):해당번쨰의 데이터를 삭제한뒤 지운 데이터를 반환한다
		String deleted_fruit =fruits.remove(4);
		System.out.println("삭제후: "+fruits);
		System.out.println("삭제된것: "+deleted_fruit);
		
		//remove(item) : 해당 데이터를 삭제한다
		if(fruits.remove("strawberry")){
			System.out.println("딸기를 성공적으로 삭제했습니다");
		}else {
			System.out.println("딸기가 없어서  삭제하지못했습니다");
		}
		//정렬
		Collections.sort(fruits);
		System.out.println(fruits);
		//배열정렬
		int[] lottos = {1,45,7,13,8,20,11};
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos));
	}

}
