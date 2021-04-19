package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 포커를 구현해보세요
 1. 로얄 플러쉬(Royal Flush a.k.a 로티플)
같은 무늬의 카드로 10,J,Q,K,A를 가지고 있으면 메이드

2. 스트레이트 플러쉬(Straight Flush a.k.a 스티플)
같은 무늬로 5장의 연속된 카드를 가지고 있으면 메이드

3. 포카드(Four of a kind)
같은 숫자의 카드를 4장 가지고 있으면 메이드

4. 풀하우스(Full House)
트리플과 함께 하나의 페어를 가지고 있으면 메이드
같은 랭킹일 경우 트리플의 숫자가 높은 플레이어가 승리

5. 플러쉬(Flush)
같은 무늬의 카드를 5장 가지고 있으면 메이드
같은 랭킹일 경우 가장 높은 숫자를 보유한 플레이어가 승리

6. 스트레이트(Straight)
연속된 5장의 카드를 가지고 있으면 메이드
A(Ace)의 경우는 10,J,Q,K,A와 A,2,3,4,5가 가능
전자의 경우 스트레이트에서 가장 높은 등급이고, 후자의 경우가 가장 낮은 등급

7. 쓰리 오브 어 카인드(Three of a kind a.k.a 트리플)
같은 숫자의 카드를 3장 가지고 있으면 메이드

8. 투페어(Two Pair)
같은 숫자의 카드 2장을 2개 보유하고 있으면 메이드

9. 원페어(One Pair)
같은 숫자의 카드 2장을 1개 보유하고 있으면 메이드

10. 하이카드(High Card)
아무런 페어가 없이 가지고 있는 숫자중 가장 높은 수치의 카드
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

						result = "투페어";

						break ;}

				else if((count2[i]==3&&count2[j]==2)||(count2[i]==2&&count2[j]==3)) {

					result = "풀하우스";

					break ;}
				}

			 if(i<=8) {

				if(count2[i]==1&&count2[i+1]==1&&count2[i+2]==1&&count2[i+3]==1&&count2[i+4]==1) {

						for(int p=1;p<count.length;p++) {

							if(count[p]==5) {

								if(i==8) {

								result = "로얄  플러쉬";

								break;

								}else {

									result = "스트레이트 플러쉬";

									break ;}
							}

						}

						result = "스트레이트";

						break ;

					}

				}

			for(int p=1;p<count.length;p++) {

				if(count[p]==5) {

					result = "플러쉬";

					break ;}

			}

		if(count2[i]==4) {

			result = "포카드";

			break;

		}else if(count2[i]==3) {

			result = "트리플";

			break;

		}else if(count2[i]==2) {

			result = "원페어";

			break;

		}else {

			result = "NO RANK";

			}

		}

		return result;

	}

}







