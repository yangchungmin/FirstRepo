package study;

public class C05_Inheritance {
	
	
	public static void main(String[] args) {
		/*
		 Ŭ���� ���
		 - �̹� �����ϴ� Ŭ������ �״�� �����޾Ƽ� ����ϰų� ���ļ� ����ϴ°�
		 -������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ����Ŭ������� �Ѵ�
		 -��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ���� ��� �Ѵ�
		 -
		 */
		Person[] persons = new Person[3];
		
		persons[0] = new Person("ȫ�浿",10,10);
		persons[1] = new Person("��浿",45,15);
		persons[2] = new Person("�̱浿",30,12);
	
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		//�θ� Ŭ������ ������� ����� �����Ӱ� ����Ҽ� �ִ�
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("�Ѹ�");
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
		//�������� :���̸� �������� �����ϰ� �λ��ϵ��� ��������
		if(age<=10 && age >=25) {
		System.out.printf("�ȳ��ϼ���! �� �̸��� %s�̿�. ���̴� %d�̿���\n",name,age);
		}else {
		System.out.printf("�ȳ�! ���̸��� %s��. ���̴� %d��\n",name,age);
		}
	}
	void walk() {
		System.out.printf(" %s���� %d���͸�ŭ �ɾ����ϴ�\n",name,speed/2);
	}
	void run() {
		System.out.printf(" %s���� %d���͸�ŭ �پ����ϴ�\n",name,speed);
	}
	
	
}

/*
 1.	��ӹ޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ��Ѵ�
  	�θ�Ŭ������ �⺻�����ڰ� �����ϸ� �����Ҽ������� �������� �������� ������ �Ұ����ϴ�
 2. �ڽ� Ŭ������ �θ��� �ż��带 ������� ���ļ� ����Ҽ� �ִ�(�������̵�,Override)
 3. �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ���
  	super�� this�� ��Ȯ�ϰ� �����Ҽ��ִ�
 */
class Police extends Person{
	
	//String name ="������";
	
	//�ڽ� Ŭ������ �����ڿ����� ù�ٿ� super()�� �޵�� ȣ���ؾ��Ѵ� (�ʼ�)
	public Police() {
		super("�����",23,20);
		//super():�θ� Ŭ������ �����ڸ� ȣ���ҋ� ����Ѵ�.
	}
	void sayHi() {
		System.out.printf("�ȳ��Ͻʴϱ� ���� %s�����Դϴ�\n",name);//������
	}
	void thisSuperTest(String name) {
		System.out.println("�׳� name: "+name);//�Ѹ�
		System.out.println("this.name: "+this.name);//������
		System.out.println("super.name: "+super.name);//�����
	}	
	void arrest(String suspect) {
		System.out.printf("%s����� ������ %s���� ü���߽��ϴ�",name,suspect);
		
	}
}

//class  Programmer extends Person{
	//��� �����ڸ�  �����ҽ�
	//�ڽ� Ŭ�������� �⺻�����ڰ� ����� �θ� Ŭ������ �⺻�����ڸ� ����Ѵ�
//}