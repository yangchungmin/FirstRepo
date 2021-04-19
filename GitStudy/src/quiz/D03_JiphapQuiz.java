package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class D03_JiphapQuiz {
	

	
	public static void main(String[] args) {
		HashSet<Integer> arr = new HashSet<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
	    HashSet<Integer> arr2 = new HashSet<>();
	    arr2.add(4);
	    arr2.add(5);
	    arr2.add(6);
	    arr2.add(7);
	    Set list = gethap(arr, arr2);
	    Set list2 = getgyo(arr, arr2);
		System.out.println(list);
		System.out.println(list2);
	
	}
/*
 1.두 컬렉션을 매개변수로 전달받으면 두컬렉션의 합집합을 set타입으로 반환하는 메서드
 2.두 컬렉션을 매개변수로 전달받으면 두컬렉션의 교집합을 set타입으로 반환하는 메서드
 3.두 컬렉션을 매개변수로 전달받으면 두컬렉션의 차집합을 set타입으로 반환하는 메서드
 */
		
	
	public static Set gethap(HashSet arr, HashSet arr2) {
		Set hap = new HashSet<>();
		//hap.addAll(arr);
		//hap.addAll(arr2);
	    Iterator<Integer> it = arr.iterator();
	   	while (it.hasNext()) {
	   		hap.add(it.next());
	  	}
	  	it = arr2.iterator();
	  	while(it.hasNext()) {
	  		hap.add(it.next());	
	  	}
		return hap;
	}
	
	public static Set getgyo(HashSet arr, HashSet arr2) {
		Set hap = gethap (arr,arr2);
		Set gyo = new HashSet<>();
		//gyo.add(hap.retainAll(arr)&&hap.retainAll(arr2));
		
		Iterator<Integer> it = arr2.iterator();
		while(it.hasNext()) {
			int temp =it.next();
			if(arr.contains(temp)) {
				gyo.add(temp);
			}
		}
		return gyo;
	}
	
	public static Set getcha(HashSet arr,HashSet arr2) {
		Set hap = gethap (arr,arr2);
		Set gyo = getgyo (arr,arr2);
		Set cha = new HashSet<>();
		//cha.add(hap.removeAll(gyo));
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			int temp =  it.next();
			if(!arr2.contains(temp)) {
				cha.add(temp);
			}
		}
		return cha;
	}
	
}
