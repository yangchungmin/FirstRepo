package study;



import java.util.ArrayList;
import java.util.Iterator;

public class B17_ArrayList {
public static void main(String[] args) {
	/*
	 �迭
	 -���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
	 -���� �̸����� ������ ������ �����ѵ� �ε����� Ȱ���� �����Ѵ�
	 -�迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ �����Ҽ�����
	 -�迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�
	 	(����:0,�Ǽ�:0.0,boolean:false,������:null)
	 
	
	int[] score=new int[133];
	int sum =0;
	//double avg;
	//�迭�� �迭.length�� ���� ���̸� �˼��ִ�
	for(int index =0; index <score.length; index++) {
		score[index]=(int)(Math.random()*101);
		sum += score[index];
	}
	System.out.println("10��° �л��� ����"+score[9]);
	
	//�������� 1: score�� ���հ� ���(�Ҽ� ��°�ڸ� )�� ����غ�����
	System.out.println("score�� ����:"+sum);
	System.out.printf("score�� ���:%.2f\n",sum/(double)score.length);
	*/
	/*
	 �迭�� �����ϴ¹��
	 1.Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
	 2.Ÿ��[] �迭�̸� = {��1,��2,��3...};
	 3.Ÿ��[] �迭�̸� = new Ÿ��[] {��1,��2,��3...};
	 
	char[] grade = new char[50];
	
	
	int[] age = {10,15,20,18,31,80,75};
	boolean[] passExam = {true,false,true,true,false};
	
	String[] animals = new String[] {"Lion","tiger","penguin","monkey"};
		System.out.println(animals[0]);
		System.out.println(animals[3]);
	if(passExam[3]) {
		System.out.println("4��° ����� ������ ����߽��ϴ�.");
	}
	
	for(int i =0;i<grade.length;++i) {
		System.out.println((int)grade[i]);
		
	}
	
	//�迭�� ������ �ٸ��� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ�
	int[] arr = new int[3];
	int a,b,c;
	
	System.out.println("arr[0]:"+arr[0]);
	
	//String�� char�� �迭�� ��ȯ�Ҽ��ִ�
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
	 * - ArrayList ������ ��ü�� index �� �����մϴ�
	 * - ����뷮�� �ʰ��Ǹ� �ڵ����� �þ�ϴ�
	 * 
	 * Iterator
	 * - collection �� �����ϰ� �ִ� �����Ϳ� ���������� ���� �� �� ����մϴ�
	 *   > hasNext() : �����Ͱ� �ִ��� Ȯ��
	 *     next()    : ������ ��������
	 *     remove()  : ������ ����
	 * 
	 */

			
			ArrayList<String> al = new ArrayList<>();
			
			// add( value ) : ������ �߰�
			al.add("�߽ż�");
			al.add("������");
			al.add("�����");
			System.out.println(al);
			
			// add( index, value ) : index ��ġ�� �߰�
			al.add(1, "�̰���");
			System.out.println(al);
			
			// size() : ������ ��
			System.out.println("al ������ �� : " + al.size());
			
			// contains() : ������ Ȯ��
			System.out.println("������ Ȯ�� :" + al.contains("������"));
			System.out.println("����� Ȯ�� :" + al.contains("�����"));
			
			// remove() : ������ ����
			System.out.println("�߽ż� ���� : " + al.remove("�߽ż�"));
			System.out.println(al);
			
			// get( index ) : index ��ġ�� ������ ��������
			System.out.println("1�� index : " + al.get(1));
			
			System.out.println();
			
			// �� ��ü Ȯ��
			for(int i=0 ; i<al.size() ; i++) {
				System.out.println(i+1 + "�� - " + al.get(i));
			}
			System.out.println();
			
			for( String data : al ) {
				System.out.println(data);
			}
			System.out.println();
			
			// Iterator
			Iterator it = al.iterator();
			while(it.hasNext()) {                 // �����Ͱ� �ִ��� Ȯ��
				String data = (String)it.next();  // ���� ������ ��������
				System.out.println(data);
			}
			System.out.println();
			
		
		
}
}
