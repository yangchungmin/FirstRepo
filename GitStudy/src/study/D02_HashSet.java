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
	
	//���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
	if (numbers.remove(100)) {
		System.out.println("����⼺��");
	}else {
		System.out.println("����� ����");
	}
	System.out.println(numbers);
	
	//�̸��� �ؽ��� �� �˰������ ������ ����
	HashSet<String> eng = new HashSet<>();
	
	eng.add("zebra");
	eng.add("airplane");
	eng.add("bio");
	eng.add("cat");
	eng.add("elephant");
	
	System.out.println(eng);
	
	//set�� �ε����� ���⋚���� for-each�� ����Ҽ��ִ�
	for(String word : eng) {
		System.out.println(word);
	}
	//�÷��� ������ ��ȯ�� �����Ӵ�
	//set�� ������ ������ �ʿ伺�� ����� List�� ��ȯ�Ͽ� ����Ҽ��ִ�	
	//List�� ������� �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����Ҽ��ִ�
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
	
	//�÷��ǵ��� �迭�� ��ȯ�ϱ�
	Object[] arr1= eng.toArray(); //1����� Object[]������
	
	String[] arr2 = new String[eng.size()];//2����� �̸� ������ �迭�� ����
	eng.toArray(arr2);
	
	System.out.println("Object[]�� ��ȯ�� english:"+Arrays.toString(arr1));
	System.out.println("�迭�� ��ȯ�� english:"+Arrays.toString(arr2));
	
	//���׸��� �䱸�ϴ� Ŭ������ ���׸��� ������� �ʴ� ��� ��� Ÿ���� �������ִ�
	//-��� Ÿ���� ObjectŸ������ ��ĳ���õǾ� ����ȴ�
	//-�ش� ���� �ٽ� ����λ���ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ�
	
	ArrayList numbers3 = new ArrayList();
	
	numbers3.add("ȫ�浿");
	numbers3.add('A');
	numbers3.add(123.123);
	numbers3.add(333);
	
	//String str = (String) numbers3.get(3);//�ڹ� ���������� �ƹ� ��������
	
	//contains(value) :�÷��ǿ� �ش� ��Ұ� ���ԵǾ��ִ��� ���θ� ��ȯ
	System.out.println(eng.contains("apple"));
	System.out.println(eng.contains("banana"));
	
	
	System.out.println(eng_list.contains("apple"));
	System.out.println(eng_list.contains("banana"));
	
	//contains(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
	
	Set<String> subset = new HashSet<>();
	List<String> sublist= new ArrayList<>();
	
	subset.add("zebra");
	subset.add("drama");
	subset.add("tiger");
	
	sublist.add("apple");
	sublist.add("apple");
	sublist.add("apple");
	
	
	
	System.out.println("eng���� subset�� ��� ������ ����ֳ���?"+eng.containsAll(subset));
	
	System.out.println("eng���� sublist�� ��� ������ ����ֳ���?"+eng.containsAll(sublist));
	
	//addAll(Collection) : ������ �÷����� ������ ��� �߰�
	//-���� �߰��� ���� ������ true
	//-�̹� ��� ���Ե� ��쿡�� false�� ��ȯ�Ѵ�
	
	System.out.println(eng.addAll(subset));
	System.out.println(eng.addAll(subset));
	
	//removeAll(Collection) : ������ �÷��ǰ� ���� ������ �������
	//-�������� ������ true ������  false
	System.out.println(eng_list.removeAll(sublist));
	System.out.println(eng_list);
	
	//retainAll(Collection) :������ �÷��ǰ� ��ġ�ϴ� ���븸 �����
	//-���Ѱ��� �ִٸ� true ������  false
	eng.retainAll(subset);
	System.out.println(eng);
	
	//isEmpty() : �ش� �÷����� ��������� true
	System.out.println(!eng.isEmpty());
	
	Set<String> subset2 = subset; //clone�� ����
	
	
	
	
	}
	}

