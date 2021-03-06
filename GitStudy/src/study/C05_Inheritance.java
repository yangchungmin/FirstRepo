package study;

public class C05_Inheritance {
	
	
	public static void main(String[] args) {
		/*
		 클래스 상속
		 - 이미 존재하는 클래스를 그대로 물려받아서 사용하거나 고쳐서 사용하는것
		 -상속해주는 클래스를 부모 클래스 또는 슈퍼클래스라고 한다
		 -상속받는 클래스를 자식 클래스 또는 서브 클래스 라고 한다
		 -
		 */
		Person[] persons = new Person[3];
		
		persons[0] = new Person("홍길동",10,10);
		persons[1] = new Person("고길동",45,15);
		persons[2] = new Person("이길동",30,12);
	
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		//부모 클래스에 만들었던 기능을 자유롭게 사용할수 있다
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("둘리");
	}
}
class Person{
	
	 String name;
	 int age;
	 int speed;
	
	 public Person(String name,int age,int speed) {
		this.name =name;
		this.age = age;	
		this.speed =speed;
		
	}
	void sayHi() {
		//연습문제 :나이를 먹을수록 공손하게 인사하도록 만들어보세요
		if(age<=10 && age >=25) {
		System.out.printf("안녕하세요! 제 이름은 %s이요. 나이는 %d이에요\n",name,age);
		}else {
		System.out.printf("안녕! 내이름은 %s야. 나이는 %d야\n",name,age);
		}
	}
	void walk() {
		System.out.printf(" %s씨는 %d미터만큼 걸었습니다\n",name,speed/2);
	}
	void run() {
		System.out.printf(" %s씨는 %d미터만큼 뛰었습니다\n",name,speed);
	}
	
	
}

/*
 1.	상속받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야한다
  	부모클래스에 기본생성자가 존재하면 생략할수있지만 존재하지 않을떄는 생략이 불가능하다
 2. 자식 클래스는 부모의 매서드를 마음대로 고쳐서 사용할수 있다(오버라이드,Override)
 3. 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우
  	super와 this로 정확하게 구분할수있다
 */
class Police extends Person{
	
	//String name ="마동석";
	
	//자식 클래스의 생성자에서는 첫줄에 super()를 받드시 호출해야한다 (필수)
	public Police() {
		super("김경찰",23,20);
		//super():부모 클래스의 생성자를 호출할떄 사용한다.
	}
	void sayHi() {
		System.out.printf("안녕하십니까 저는 %s형사입니다\n",name);//마동석
	}
	void thisSuperTest(String name) {
		System.out.println("그냥 name: "+name);//둘리
		System.out.println("this.name: "+this.name);//마동석
		System.out.println("super.name: "+super.name);//김경찰
	}	
	void arrest(String suspect) {
		System.out.printf("%s형사는 용의자 %s씨를 체포했습니다",name,suspect);
		
	}
}

//class  Programmer extends Person{
	//모든 생성자를  생략할시
	//자식 클래스에도 기본생성자가 생기고 부모 클래스의 기본생성자를 사용한다
//}