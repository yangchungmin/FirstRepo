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
 * -중복값을 저장할수없다
 * -데이터를 저장할떄 Comparator를 이용해 미리 정렬한다
 * -요소로 null을 허용하지않는다
 * -처음에 정렬해서 넣기때문에 HashSet에 비해 저장속도가 느리다
 * -하지만 TreeSet은 정렬이 미리되어있기 때문에 정렬된 순서로 데이터를 꺼내는 것을 가장 빠르다
 * 
 
 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_GNO기준_내림차순());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_오름차순());
		TreeSet<Mango> mango_tree = new TreeSet<>();
		//해당 객체 자체가 비교 가능한 객체라면 ComParator를 사용하지 않을수있다
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
		
		//TreeSet 활용
		//descendingSet() : 원래 정렬해놓은 반대방향의 set 인스턴스를 반환
		System.out.println(grape_tree.descendingSet());
		//headSet(toElement): 맨앞부터 원하는 요소까지 자른 set을 반환
		System.out.println(grape_tree.headSet(new Grape().setGno("3")));
		//tailSet(toElement) : 원하는 요소부터 맨뒤까지 자른 set을 반환
		System.out.println(grape_tree.tailSet(new Grape().setGno("3")));
		//subset(fromElement,toElement):원하는 요소부터 시작해서 원하는 요소까지 자른 set을 반환
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
		
		//ceil(element) : 원하는 가장 가까운 요소를 올려서 선택 (전달한 값도 포함)
		System.out.println(int_tree.ceiling(21));
		//floor(element) :원하는 가장 가까운 요소를 내려서 선택 (전달한 값도 포함)
		System.out.println(int_tree.floor(21));
		//higher(element) : 원하는 가장 가까운 요소를 올려서 선택 (전달한 값 미포함)
		System.out.println(int_tree.higher(21));
		//lower(element) : 원하는 가장 가까운 요소를 내려서 선택 (전달한 값 미포함)
		System.out.println(int_tree.lower(21));
		
		
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)),10, 5));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 5, 8));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 15, 3));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 20, 7));
		mangos.add(new Mango(String.format("PODO%04d",(int)(Math.random() * 10000)), 12, 9));
		
		//System.out.println(grape_tree);
		//System.out.println(grape_tree2);
		
		
		
		//연습문제:망고트리에 망고를 5개 추가할때 mno기준 오름차순 정렬이 되도록 만들고 확인
		
		 
		   
		 // System.out.println("#### mno 기준 오름차순 ####");
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
	
	//this vs 매개변수로 compare메서드를 구현하면 된다
	@Override
	public int compareTo(Mango o) {
		
		return this.mno.compareTo(o.mno);
	}
}