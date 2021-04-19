package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D01_ArrayList {
/*
1.java collections
-�ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
-Collection �������̽���  ��ӹ��� �������̽��δ� List,Set �����ִ�

2.java.util.ArrayList
-�迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
-�迭�� ������ ���´�
-���������� ��� �����Ϳ� �����ؾ��ҋ� ���� �����ϴ�
 */
	public static void main(String[] args) {
		
		//Ÿ���� �����ϸ� ArrayList �����ϱ�
		//Ÿ���� �����Ҷ� ����ϴ� <>�� ���׸�(Generic) �̶�� �θ���
		//���׸����� �⺻�� Ÿ���� ����Ҽ�����(�⺻Ÿ���� WrapperClass ���)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		//add(item):����Ʈ�� ���ϴ� �����͸� ���������� �ǵڿ� �߰��Ѵ�
		
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
	
		
		//add(index,item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´�
		
		fruits.add(2,"orange");
		fruits.add(2,"peach");
		fruits.add(2,"grape");
		
		System.out.println(fruits);
		System.out.println(numbers);
		//get(index) : ����Ʈ���� ���ϴ� �ε����� �����͸� �ϳ� ������
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
		//size():�ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println("fruits�� ũ��"+fruits.size());
		System.out.println("numbers�� ũ��"+numbers.size());
		
		//remove(index):�ش������ �����͸� �����ѵ� ���� �����͸� ��ȯ�Ѵ�
		String deleted_fruit =fruits.remove(4);
		System.out.println("������: "+fruits);
		System.out.println("�����Ȱ�: "+deleted_fruit);
		
		//remove(item) : �ش� �����͸� �����Ѵ�
		if(fruits.remove("strawberry")){
			System.out.println("���⸦ ���������� �����߽��ϴ�");
		}else {
			System.out.println("���Ⱑ ���  �����������߽��ϴ�");
		}
		//����
		Collections.sort(fruits);
		System.out.println(fruits);
		//�迭����
		int[] lottos = {1,45,7,13,8,20,11};
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos));
	}

}
