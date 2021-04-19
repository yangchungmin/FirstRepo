package study;

public class C06_Polymorphism {
	
	

	public static void main(String[] args) {
		new Food(new PigMeat(),new Vege(),new Balsamic());
	
		
		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
		Meat meat = new Meat();
		//Meat meat2 = new MainMaterial(); �ȵ�
		
		Police police = new Police();
		police.sayHi();
		police.arrest("�谭��");
		
	
		//person���� ��ĳ���õ� Police�� ü���� �Ҽ�����
		Person person = police;
		Person person2 = new Person("����ġ",20,30);
		
		//person.arrest();
		person.sayHi();
		
		//�ٿ�ĳ������ ���� ��� �ٽ� ����ϱ�
		((Police)person).arrest("��Ҹ�"); //���� �����̾��� �ν��Ͻ� �ٿ�ĳ�����̰���
		//((Police)person2).arrest("�赵��");//������ �ƴϾ��� �ν��Ͻ��� �ٿ�ĳ������ �Ұ���
	}
		/*
		1. ��ü�� ������
		 -����� ������ ���¸� ���Ҽ� �ִ�
		 -����� ����̱⵵ �ϰ� �����̱⵵�ϴ�
		 -������ ���������� ����� �ƴϴ�
		 
		2. �ڽ� Ŭ������ �θ� Ŭ������ �ɼ��ִ�(��ĳ����)
		 -�ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ°��� ��ĳ���� �̶���Ѵ�
		 -��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ������
		 -�������̵�� �״�� �����ȴ�
		 -�������̵�� �޼���� �ڽ� Ŭ�������� ������ ������ ����ȴ�
		
		3. �θ� Ŭ������ �ڽ� Ŭ������ �ɼ�����(�ٿ�ĳ����)
		 -������ ���������� ��ĳ���õǾ��� �ν��Ͻ��� �ٽ� ���� Ÿ�������� �ٿ�ĳ������ �����ϴ�
		 */
	
}

class Food{
	
	MainMaterial mainMat;
	SubMaterial subMat;
	Sauce sauce;
	
	public Food(MainMaterial mainMat ,SubMaterial subMat,Sauce sauce) {
		this.mainMat= mainMat;
		this.subMat = subMat;
		this.sauce  = sauce;
	}
}
class PorkCutlet extends Food{
	
	public PorkCutlet(PigMeat pig, SubMaterial subMat, Sauce sauce) {
		super(pig,subMat,sauce);
	}
}

//���� ���� �θ� Ŭ���� (����� ����� �ҽ�)
class MainMaterial{}
class SubMaterial{}
class Sauce {}
//����Ḧ ��ӹ��� Ŭ������
class Fish extends MainMaterial{}
class Meat extends MainMaterial{}
//����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class PigMeat extends Meat{}
class Tuna extends Fish{}
//����Ḧ ��ӹ��� Ŭ������
class Vege extends SubMaterial{}
class Fruit extends SubMaterial{}
//�ҽ��� ��ӹ��� Ŭ������
class Salsa extends Sauce{}
class Balsamic extends Sauce{}