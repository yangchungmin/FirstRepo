package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 ��Ŀ�� �����غ�����
 1. �ξ� �÷���(Royal Flush a.k.a ��Ƽ��)
���� ������ ī��� 10,J,Q,K,A�� ������ ������ ���̵�

2. ��Ʈ����Ʈ �÷���(Straight Flush a.k.a ��Ƽ��)
���� ���̷� 5���� ���ӵ� ī�带 ������ ������ ���̵�

3. ��ī��(Four of a kind)
���� ������ ī�带 4�� ������ ������ ���̵�

4. Ǯ�Ͽ콺(Full House)
Ʈ���ð� �Բ� �ϳ��� �� ������ ������ ���̵�
���� ��ŷ�� ��� Ʈ������ ���ڰ� ���� �÷��̾ �¸�

5. �÷���(Flush)
���� ������ ī�带 5�� ������ ������ ���̵�
���� ��ŷ�� ��� ���� ���� ���ڸ� ������ �÷��̾ �¸�

6. ��Ʈ����Ʈ(Straight)
���ӵ� 5���� ī�带 ������ ������ ���̵�
A(Ace)�� ���� 10,J,Q,K,A�� A,2,3,4,5�� ����
������ ��� ��Ʈ����Ʈ���� ���� ���� ����̰�, ������ ��찡 ���� ���� ���

7. ���� ���� �� ī�ε�(Three of a kind a.k.a Ʈ����)
���� ������ ī�带 3�� ������ ������ ���̵�

8. �����(Two Pair)
���� ������ ī�� 2���� 2�� �����ϰ� ������ ���̵�

9. �����(One Pair)
���� ������ ī�� 2���� 1�� �����ϰ� ������ ���̵�

10. ����ī��(High Card)
�ƹ��� �� ���� ������ �ִ� ������ ���� ���� ��ġ�� ī��
 */
import java.util.*;



class CardSet{ 

	static final int KIND_MAX = 4;

	static final int NUM_MAX = 13;

	static final int SPADE = 4;

	static final int DIAMOND = 3;

	static final int HEART = 2;

	static final int CLOVER = 1;

	int kind;

	int number;

	

	

	CardSet(int kind, int number){

		this.kind = kind;

		this.number = number;

	}

	public String toString() {

		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};

		String numbers = "23456789XJQKA";

		return kinds[this.kind] + "." + numbers.charAt(this.number);

	}

}



class CardDeck{ 

	final int CARD_NUM = 52;

	CardSet cardArr[] = new CardSet[CARD_NUM];

	

	CardDeck() {

		int i = 0;

		

		for(int k=CardSet.KIND_MAX;k>0;k--) 

			for(int n=0;n<CardSet.NUM_MAX;n++) 

				cardArr[i++] = new CardSet(k,n);

	}

	CardSet pick(int index) {

		return cardArr[index];

	}

	CardSet pick() {

		int index = (int)(Math.random()*CARD_NUM);

		return pick(index);

	}

	void shuffle() {

		for(int i=0;i<cardArr.length;i++) {

			int r = (int)(Math.random() * CARD_NUM);

			

			CardSet temp = cardArr[i];

			cardArr[i] = cardArr[r];

			cardArr[r] = temp;

			

		}

	}

}

public class D05_Poker {



	public static void main(String[] args) {

		CardDeck d = new CardDeck();
		
		d.shuffle();
		CardSet Arr[] = new CardSet[5]; 

		for(int i=0;i<=4;i++)

			Arr[i]=d.pick(i);

		System.out.println(Arrays.toString(Arr));
		System.out.println(rankCheck(Arr));

	}

	static String rankCheck(CardSet[] cards){

		int[] count = new int[5];  

		int[] count2 = new int[13]; 

		

		for(int i=0;i<cards.length;i++) 

			count[cards[i].kind]++;

		

		for(int i=0;i<cards.length;i++) 

			count2[cards[i].number]++;

		

		String result = "";

		
		 for(int i=0;i<count2.length;i++) {

			for(int j =0;j<count2.length;j++) { 

				if(i!=j && count2[i]==2 && count2[j]==2) {

						result = "�����";

						break ;}

				else if((count2[i]==3&&count2[j]==2)||(count2[i]==2&&count2[j]==3)) {

					result = "Ǯ�Ͽ콺";

					break ;}
				}

			 if(i<=8) {

				if(count2[i]==1&&count2[i+1]==1&&count2[i+2]==1&&count2[i+3]==1&&count2[i+4]==1) {

						for(int p=1;p<count.length;p++) {

							if(count[p]==5) {

								if(i==8) {

								result = "�ξ�  �÷���";

								break;

								}else {

									result = "��Ʈ����Ʈ �÷���";

									break ;}
							}

						}

						result = "��Ʈ����Ʈ";

						break ;

					}

				}

			for(int p=1;p<count.length;p++) {

				if(count[p]==5) {

					result = "�÷���";

					break ;}

			}

		if(count2[i]==4) {

			result = "��ī��";

			break;

		}else if(count2[i]==3) {

			result = "Ʈ����";

			break;

		}else if(count2[i]==2) {

			result = "�����";

			break;

		}else {

			result = "NO RANK";

			}

		}

		return result;

	}

}







