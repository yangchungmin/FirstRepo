package study;

public class C10_LocalInnerClass {
/*
 지역 내부 클래스
 -메서드 내부에서 선언하여 사용하는 클래스
 -메서드가 끝나면 해당클래스도 수명이 다한다
 */
	public static void main(String[] args) {
		
		//지역 내부클래스(메서드가 끝나면 이 클래스도 사라지게된다)
		class Apple{
			String size;
			String color;
			String insert;
		}
	
	Apple a =new Apple();
	AppleBox.Apple a2 = new AppleBox("고구마 박스").new Apple();
	
	//내부 지역 클래스가 업캐스팅 되어있는상태
	Fruiti banana = getBanana();
	
	banana.eat();
	}
	public static Fruiti getBanana() {
		class Banana extends Fruiti{
			int fruit;
			int[] color;
			
			public Banana(int fruit) {
				this.fruit = fruit;
			}
			
			void eat() {
				System.out.println("열매가"+fruit+"개 열린 바나나는 맛있습니다");

			}
			void banana만가지고있는고유의기능() {
				System.out.println("엄청난 기능");
			}
		}
		return new Banana(20);
	}

}
abstract class Fruiti {
	abstract void eat();
}