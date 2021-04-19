package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� ���� �ְԵȴ�
//���� ������ Object�� �����ȴ�
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
	//�ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� �����Ҷ� ���� �����Ͽ� �����Ѵ�
	int int_a = 20;
	int int_b =  30;
	
	System.out.println(plus(int_a,int_b));
	System.out.println("plus �� int_a�� �� :" + int_a);
	
	
	
	//�빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� �����ҋ� �ּҸ� �����Ͽ� �����Ѵ�
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
	
	System.out.println("union�� �����ϱ����� a:"+ a);
	System.out.println(jihap_tools.union(a,b));
	System.out.println("union�� ������ ���� a:"+ a);
	System.out.println(jihap_tools.union(a,c));
	
	System.out.println(jihap_tools.intersection(jihap_tools.intersection(a, b),c));
}
}
