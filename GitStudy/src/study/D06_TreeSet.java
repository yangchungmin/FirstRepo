package study;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



public class D06_TreeSet {
/*
 * TreeSet
 * -�ߺ����� �����Ҽ�����
 * -�����͸� �����ҋ� Comparator�� �̿��� �̸� �����Ѵ�
 * -��ҷ� null�� ��������ʴ´�
 * -ó���� �����ؼ� �ֱ⶧���� HashSet�� ���� ����ӵ��� ������
 * -������ TreeSet�� ������ �̸��Ǿ��ֱ� ������ ���ĵ� ������ �����͸� ������ ���� ���� ������
 * 
 
 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_GNO����_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
		TreeSet<Mango> mango_tree = new TreeSet<>();
		//�ش� ��ü ��ü�� �� ������ ��ü��� ComParator�� ������� �������ִ�
		TreeSet<String> word_tree = new TreeSet<>();
		
		for(int i =0; i<5;i++) {
		mango_tree.add(new Mango(String.format("Mango05%d",
				(int)(Math.random() * 10000)),10,10));
		}
		
		
		
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(31));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		
		grape_tree2.addAll(grape_tree);
		TreeSet<Mango> mangos = new TreeSet<>(new MangoCompareByMno());
		
		
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
		
		//System.out.println(word_tree);
		//System.out.println(mango_tree);
		
		//TreeSet Ȱ��
		//descendingSet() : ���� �����س��� �ݴ������ set �ν��Ͻ��� ��ȯ
		System.out.println(grape_tree.descendingSet());
		//headSet(toElement): �Ǿպ��� ���ϴ� ��ұ��� �ڸ� set�� ��ȯ
		System.out.println(grape_tree.headSet(new Grape().setGno("3")));
		//tailSet(toElement) : ���ϴ� ��Һ��� �ǵڱ��� �ڸ� set�� ��ȯ
		System.out.println(grape_tree.tailSet(new Grape().setGno("3")));
		//subset(fromElement,toElement):���ϴ� ��Һ��� �����ؼ� ���ϴ� ��ұ��� �ڸ� set�� ��ȯ
		grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1"));
		
		
		TreeSet<Integer> int_tree = new TreeSet<Integer>();
		
		
		int_tree.add(99);
		int_tree.add(5);
		int_tree.add(15);
		int_tree.add(75);
		int_tree.add(33);
		int_tree.add(21);
		int_tree.add(9);
		int_tree.add(1);
		
		System.out.println(int_tree);
		
		//ceil(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ ���� ����)
		System.out.println(int_tree.ceiling(21));
		//floor(element) :���ϴ� ���� ����� ��Ҹ� ������ ���� (������ ���� ����)
		System.out.println(int_tree.floor(21));
		//higher(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ �� ������)
		System.out.println(int_tree.higher(21));
		//lower(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ �� ������)
		System.out.println(int_tree.lower(21));
		
		
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)),10, 5));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 5, 8));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 15, 3));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 20, 7));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 12, 9));
		
		//System.out.println(grape_tree);
		//System.out.println(grape_tree2);
		
		
		
		//��������:����Ʈ���� ���� 5�� �߰��Ҷ� mno���� �������� ������ �ǵ��� ����� Ȯ��
		
		 
		   
		 // System.out.println("#### mno ���� �������� ####");
		 // System.out.println(mangos);
		   
	
	}     
	
}	

//class MangoCompareBySweetAsc implements Comparator<Mango>{
	
	
//	@Override
//	public int compare(Mango o1, Mango o2) {
//		if(o1.sweet > o2.sweet){
//			return 1;
//			return -1;
//		}else {
//			return 0;
//		}
		
//	}
	
//}
	class MangoCompareByMno implements Comparator<Mango>{
	
	
	@Override
	public int compare(Mango o1, Mango o2) {
	return o1.mno.compareTo(o2.mno);
	
}

	}

class Mango implements Comparable<Mango>{
	String mno;
	int sweet;
	int size;


	public Mango(String mno, int sweet,int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;
	}
	Mango setMno(String mno) {
		this.mno = mno;
		return this;
	}
	public String toString() {                
		   return mno+ "/" + sweet + "/" + size;
			}
	
	//this vs �Ű������� compare�޼��带 �����ϸ� �ȴ�
	@Override
	public int compareTo(Mango o) {
		
		return this.mno.compareTo(o.mno);
	}
}