package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를수 있게된다
//고르지 않으면 Object로 설정된다
public class D03_jiphapQuiz2<T> {
	
public  Set<T> union(Collection<? extends T> a,Collection<? extends T> b) {
	Set<T> union_set=new HashSet<>(a);
	
	union_set.addAll(b);
	
	 return union_set;
}

public Set<T> intersection(Collection <? extends T>a,Collection<? extends T> b){
	Set<T> inter_set=new HashSet<>(a);
	
	inter_set.retainAll(b);
	
	return inter_set;
	
}

public Set<T> diff(Collection <? extends T>a,Collection<? extends T> b){
	Set<T> diff_set=new HashSet<>(a);
	
	diff_set.removeAll(b);
	
	return diff_set;
	
}
public static int plus(int a, int b) {
	a +=b;
	return a;
}

public static void main(String[] args) {
	//소문자로 시작하는 타입들(기본형)은 매개변수로 전달할때 값을 복사하여 전달한다
	int int_a = 20;
	int int_b =  30;
	
	System.out.println(plus(int_a,int_b));
	System.out.println("plus 후 int_a의 값 :" + int_a);
	
	
	
	//대문자로 시작하는 타입들(참조형)은 매개변수로 전달할떄 주소를 복사하여 전달한다
	List<String> a = new ArrayList<>();
	Set<String> b = new HashSet<>();
	Set<String> c = new HashSet<>();
	
	a.add("abc");
	a.add("application");
	a.add("advertise");
	a.add("apple");
	
	b.add("banana");
	b.add("ballon");
	b.add("bike");
	b.add("apple");
	
	c.add("cow");
	c.add("cat");
	c.add("crack");
	c.add("apple");
	
	D03_jiphapQuiz2<String> jihap_tools = new D03_jiphapQuiz2<String>();
	D03_jiphapQuiz2<Integer> jihap_tools2 = new D03_jiphapQuiz2<Integer>();
	
	System.out.println("union을 실행하기전의 a:"+ a);
	System.out.println(jihap_tools.union(a,b));
	System.out.println("union을 실행한 후의 a:"+ a);
	System.out.println(jihap_tools.union(a,c));
	
	System.out.println(jihap_tools.intersection(jihap_tools.intersection(a, b),c));
}
}
