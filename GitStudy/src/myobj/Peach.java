package myobj;

public class Peach {
	
	public int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	
	//다른 패키지에서 가져다쓰고 싶을때는 public을 붙여야한다
	public void eat() {
		size--;
		calorie -=10;
	}
}