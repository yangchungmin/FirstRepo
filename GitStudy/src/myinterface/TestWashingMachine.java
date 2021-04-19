package myinterface;

public class TestWashingMachine{
	
	public static void main(String[] args) {
		Samsung washMachine = new Samsung();
		washMachine.startButton();
		System.out.println("세탁완료까지 "+washMachine.changeMode(3)+"분 남았습니다.");
	}
	
}