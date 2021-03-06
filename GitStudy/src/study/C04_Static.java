package study;

public class C04_Static {
	public static void main(String[] args) {
		/*
		 static (정적영역,클래스 영영 <==> 인스턴스영역)
		 -static은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다
		 -앞에static이 붙은 클래스의 자원은 모든 인스턴스에서 같은 값을 지니게된다
		 -static영역은 클래스당 하나밖에 생성되지 않으므로 메모리가 절약된다
		 -static영역은 클래스당 하나이기 때문에 클래스명에 .을 찍고 접근하는 것이 좋다
		 -static영역의 자원은 인스턴스가 생기기전에도 호출할수있다
		 -인스턴스가 존재하지 않을때에도 static이 사용될 가능성이 있기 때문에
		   static메서드에서는 인스턴스 자원을 사용할수없다
		 */
		
		//아직 생성된 인스턴스가 없더라도 static 자원을 사용할수있다
		//static자원은 클래스명에 .을 찍고 접근할수있다
		System.out.println(Lamp.width);
		System.out.println(Lamp.height);
		
		Lamp.changeWidth(500);
		//Lamp.turnOn();
		
		Lamp lamp01 =new Lamp();
		Lamp lamp02 =new Lamp();
		Lamp lamp03 =new Lamp();
		Lamp lamp04 =new Lamp();
		
		lamp03.width =30;
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
	}
}

class Lamp{
	//강의장 내부의 모든 형광등의 너비와 높이는 일정하다
	static int width = 50;
	static int height= 200;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	// static메서드에서  static변수에 접근하는것은 가능
	static void changeWidth(int width) {
		Lamp.width = width;
	}
	//static 영역에서 인스턴스 자원에 접근하는것은 불가능
	//static void turnOn() {
	//	this.powerOn = true;
	//}
}

/*
 myobj 패키지에 static 변수를 포함한 클래스를 하나 정의 해보세요
 
 
 */



