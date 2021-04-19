package myinterface;

public interface WashingMachine {
	void startButton();
	void pasueButton();
	void cancelButton();
	int changeMode(int countMinute);
}
interface DryCourse{
	void dry();
}
class Samsung implements WashingMachine,DryCourse{

	@Override
	public void startButton() {
		System.out.println("세탁기가 빨래를 시작했습니다");
	}
	@Override
	public void pasueButton() {
		System.out.println("세탁기가 빨래를 일시정지했습니다");
	}
	@Override
	public void cancelButton() {
		System.out.println("빨래를 취소했습니다");
	}
	@Override
	public void dry() {
		System.out.println("세탁이완료되어 탈수를 시작합니다");
	}
	@Override
	public int changeMode(int countMinute) {
		int minute = 0;
		
		switch(countMinute) {
		case 1 :
			minute =30;
			break;
		case 2 :
			minute =40;
			break;
		case 3 :
			minute =50;
			break;
		}
		return minute;
	}
}

	
