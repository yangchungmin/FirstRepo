package study;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	public static void main(String[] args) {
	HashSet<Integer> numbers = new 	HashSet<>();
	
	numbers.add(100);
	numbers.add(100);
	numbers.add(100);
	numbers.add(100);
	numbers.add(100);
	
	System.out.println(numbers);
	
	//같은 컬렉션 인터페이스이기 때문에 ArrayList에 있는 메서드들이 여기에도 있다
	if (numbers.remove(100)) {
		System.out.println("지우기성공");
	}else {
		System.out.println("지우기 실패");
	}
	System.out.println(numbers);
	
	//이름에 해쉬가 들어간 알고리즘들은 순서가 없다
	HashSet<String> eng = new HashSet<>();
	
	eng.add("zebra");
	eng.add("airplane");
	eng.add("bio");
	eng.add("cat");
	eng.add("elephant");
	
	System.out.println(eng);
	
	//set은 인덱스가 없기떄문에 for-each만 사용할수있다
	for(String word : eng) {
		System.out.println(word);
	}
	//컬렉션 끼리는 변환이 자유롭다
	//set의 내용을 정렬할 필요성이 생기면 List로 변환하여 사용할수있다	
	//List의 내용들중 중복을 제거한 목록이 필요하다면 Set으로 변환하여 사용할수있다
	ArrayList<String> eng_list = new ArrayList<>(eng);
	Collections.sort(eng_list);
	System.out.println(eng_list);
	
	ArrayList<Integer> numbers2 = new ArrayList<>();
	
	numbers2.add(1);
	numbers2.add(1);
	numbers2.add(1);
	numbers2.add(3);
	numbers2.add(6);
	numbers2.add(6);
	numbers2.add(7);
	numbers2.add(13);
	System.out.println(numbers2);
	System.out.println(new HashSet<>(numbers2));
	
	//컬렉션들을 배열로 반환하기
	Object[] arr1= eng.toArray(); //1번방법 Object[]을생성
	
	String[] arr2 = new String[eng.size()];//2번방법 미리 만들어둔 배열을 전달
	eng.toArray(arr2);
	
	System.out.println("Object[]로 변환된 english:"+Arrays.toString(arr1));
	System.out.println("배열로 변환된 english:"+Arrays.toString(arr2));
	
	//제네릭을 요구하는 클래스나 제네릭을 사용하지 않는 경우 모든 타입을 넣을수있다
	//-모든 타입이 Object타입으로 업캐스팅되어 저장된다
	//-해당 값을 다시 제대로사용하기 위해서는 다운캐스팅이 필요해서 번거롭다
	
	ArrayList numbers3 = new ArrayList();
	
	numbers3.add("홍길동");
	numbers3.add('A');
	numbers3.add(123.123);
	numbers3.add(333);
	
	//String str = (String) numbers3.get(3);//자바 문법상으로 아무 문제없음
	
	//contains(value) :컬렉션에 해당 요소가 포함되어있는지 여부를 반환
	System.out.println(eng.contains("apple"));
	System.out.println(eng.contains("banana"));
	
	
	System.out.println(eng_list.contains("apple"));
	System.out.println(eng_list.contains("banana"));
	
	//contains(Collection) : 전달한 컬렉션이 모두 포함되어 있는지를 검사
	
	Set<String> subset = new HashSet<>();
	List<String> sublist= new ArrayList<>();
	
	subset.add("zebra");
	subset.add("drama");
	subset.add("tiger");
	
	sublist.add("apple");
	sublist.add("apple");
	sublist.add("apple");
	
	
	
	System.out.println("eng에는 subset의 모든 내용이 들어있난요?"+eng.containsAll(subset));
	
	System.out.println("eng에는 sublist의 모든 내용이 들어있난요?"+eng.containsAll(sublist));
	
	//addAll(Collection) : 전달한 컬렉션의 내용을 모두 추가
	//-새로 추가된 것이 있으면 true
	//-이미 모두 포함된 경우에는 false를 반환한다
	
	System.out.println(eng.addAll(subset));
	System.out.println(eng.addAll(subset));
	
	//removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두제거
	//-지워진게 있으면 true 없으면  false
	System.out.println(eng_list.removeAll(sublist));
	System.out.println(eng_list);
	
	//retainAll(Collection) :전달한 컬렉션과 일치하는 내용만 남긴다
	//-변한것이 있다면 true 없으면  false
	eng.retainAll(subset);
	System.out.println(eng);
	
	//isEmpty() : 해당 컬렉션이 비어있으면 true
	System.out.println(!eng.isEmpty());
	
	Set<String> subset2 = subset; //clone과 동일
	
	
	
	
	}
	}

