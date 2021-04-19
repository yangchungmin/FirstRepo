package study;



import java.util.ArrayList;
import java.util.Iterator;

public class B17_ArrayList {
public static void main(String[] args) {
	/*
	 배열
	 -같은 타입 변수를 한번에 여러개 선언하는 방법
	 -같은 이름으로 변수를 여러개 선언한뒤 인덱스를 활용해 구분한다
	 -배열은 한번 크기가 정해지면 크기를 변경할수없다
	 -배열은 생성과 동시에 초기화가 되어있다
	 	(정수:0,실수:0.0,boolean:false,참조형:null)
	 
	
	int[] score=new int[133];
	int sum =0;
	//double avg;
	//배열도 배열.length를 통해 길이를 알수있다
	for(int index =0; index <score.length; index++) {
		score[index]=(int)(Math.random()*101);
		sum += score[index];
	}
	System.out.println("10번째 학생의 점수"+score[9]);
	
	//연습문제 1: score의 총합과 평균(소수 둘째자리 )을 출력해보세요
	System.out.println("score의 총합:"+sum);
	System.out.printf("score의 평균:%.2f\n",sum/(double)score.length);
	*/
	/*
	 배열을 선언하는방법
	 1.타입[] 배열이름 = new 타입[배열크기];
	 2.타입[] 배열이름 = {값1,값2,값3...};
	 3.타입[] 배열이름 = new 타입[] {값1,값2,값3...};
	 
	char[] grade = new char[50];
	
	
	int[] age = {10,15,20,18,31,80,75};
	boolean[] passExam = {true,false,true,true,false};
	
	String[] animals = new String[] {"Lion","tiger","penguin","monkey"};
		System.out.println(animals[0]);
		System.out.println(animals[3]);
	if(passExam[3]) {
		System.out.println("4번째 사람은 시험을 통과했습니다.");
	}
	
	for(int i =0;i<grade.length;++i) {
		System.out.println((int)grade[i]);
		
	}
	
	//배열은 변수와 다르게 초기화가 자동으로 되어있다
	int[] arr = new int[3];
	int a,b,c;
	
	System.out.println("arr[0]:"+arr[0]);
	
	//String은 char형 배열로 변환할수있다
	char[] msg1 = new char[] {'h','e','l','l','o'};
	String msg2 ="hello";
	char[] msg3 = msg2.toCharArray();
	
	
	
	System.out.println(msg1[0]);
	System.out.println(msg1[1]);
	System.out.println(msg1[2]);
	System.out.println();
	System.out.println(msg2.charAt(0));
	System.out.println(msg2.charAt(1));
	System.out.println(msg2.charAt(2));
	System.out.println();
	System.out.println(msg3[0]);
	System.out.println(msg3[1]);
	
*/


	/*
	 * ArrayList
	 * - ArrayList 에서는 객체를 index 로 관리합니다
	 * - 저장용량이 초과되면 자동으로 늘어납니다
	 * 
	 * Iterator
	 * - collection 에 보관하고 있는 데이터에 순차적으로 접근 할 때 사용합니다
	 *   > hasNext() : 데이터가 있는지 확인
	 *     next()    : 데이터 가져오기
	 *     remove()  : 데이터 삭제
	 * 
	 */

			
			ArrayList<String> al = new ArrayList<>();
			
			// add( value ) : 데이터 추가
			al.add("추신수");
			al.add("류현진");
			al.add("손흥민");
			System.out.println(al);
			
			// add( index, value ) : index 위치에 추가
			al.add(1, "이강인");
			System.out.println(al);
			
			// size() : 데이터 수
			System.out.println("al 데이터 수 : " + al.size());
			
			// contains() : 데이터 확인
			System.out.println("박지성 확인 :" + al.contains("박지성"));
			System.out.println("손흥민 확인 :" + al.contains("손흥민"));
			
			// remove() : 데이터 삭제
			System.out.println("추신수 삭제 : " + al.remove("추신수"));
			System.out.println(al);
			
			// get( index ) : index 위치의 데이터 가져오기
			System.out.println("1번 index : " + al.get(1));
			
			System.out.println();
			
			// 각 객체 확인
			for(int i=0 ; i<al.size() ; i++) {
				System.out.println(i+1 + "번 - " + al.get(i));
			}
			System.out.println();
			
			for( String data : al ) {
				System.out.println(data);
			}
			System.out.println();
			
			// Iterator
			Iterator it = al.iterator();
			while(it.hasNext()) {                 // 데이터가 있는지 확인
				String data = (String)it.next();  // 현재 데이터 가져오기
				System.out.println(data);
			}
			System.out.println();
			
		
		
}
}
