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
		System.out.println("��Ź�Ⱑ ������ �����߽��ϴ�");
	}
	@Override
	public void pasueButton() {
		System.out.println("��Ź�Ⱑ ������ �Ͻ������߽��ϴ�");
	}
	@Override
	public void cancelButton() {
		System.out.println("������ ����߽��ϴ�");
	}
	@Override
	public void dry() {
		System.out.println("��Ź�̿Ϸ�Ǿ� Ż���� �����մϴ�");
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

	
