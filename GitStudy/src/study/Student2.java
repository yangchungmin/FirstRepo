package study;

import java.util.ArrayList;
import java.util.Random;

public class Student2 {
private int kor;
private int eng;
private int math;
private String name;


private static Random ran = new Random();
public static int BEST_TOTAL=0;
private static int sno = 0;


private static int getRandomScore() {
	return ran.nextInt(101);
}

public Student2() {
	kor = getRandomScore();
	eng = getRandomScore();
	math = getRandomScore();
	name = String.format("ÇÐ»ý%06d", sno++);
	BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
}
//public int  getTotal() {
//	return kor + eng + math;
//}
public double getAvg() {
	return getTotal() / 3.0;
}


public  String getTranscript() {
	return String.format("%s / %3d / %.2f",name,getTotal(),getAvg());
	
}

public int getTotal() {
	
	return kor + eng + math;
}




}


