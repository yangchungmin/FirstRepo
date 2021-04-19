package myobj;



public class Score {
	public static void main(String[] args) {
		System.out.println(MyScore.kor);
		System.out.println(MyScore.eng);
		System.out.println(MyScore.math);
	}
	
}
	class MyScore{
		
		static int kor = 80;
		static int eng = 85;
		static int math= 70;
		
		static void ChangeScore(int kor,int eng,int math) {
			MyScore.kor = kor;
			MyScore.eng = eng;
			MyScore.math = math;
			
		}
	}

