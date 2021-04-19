package quiz;
import java.util.Scanner;
import java.util.Random;

class WordScramble{ 
	String[]  fruit ={"apple","banana","kiwi","orange","peach",
			"strawberry","pineapple"};
	String random ="";
	
	public String getAnswer() {
		int idx = new Random().nextInt(fruit.length);
		return fruit[idx];
	}
	public String getQuestion(String str) {
		int[] inArr = new int[str.length()];
		
		outer:for(int i =0; i<inArr.length;) {
			inArr[i] = new Random().nextInt(str.length());
			for(int j=0;j<i;j++) {
				if(inArr[i]==inArr[j]) {
					continue outer;
				}
			}
			i++;
		}
		for (int i=0;i<str.length();i++) {
			random +=str.charAt(inArr[i]);
		}
		return random;
		
	}
	 
}


public class B17_CountRandomFruit2 {
	public static void main(String[] args) {
		
	
	
	
	WordScramble ws = new WordScramble();
	
	String answer =ws.getAnswer();
	
	String question=ws.getQuestion(answer);
	
	System.out.println("question:"+question);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
