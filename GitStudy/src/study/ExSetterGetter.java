package study;

/*
 * getter �޼ҵ�
 * - class �ܺο��� ������ ��ü�� ����ʵ� ���� ����ϴ� �뵵�� �޼ҵ� �Դϴ�
 * 
 * setter �޼ҵ�
 * - class �ܺο��� ������ ��ü�� ����ʵ� ���� ���� or �����ϴ� �뵵�� �޼ҵ� �Դϴ�
 * 
 */

class ship {
	
	private String id;
	private String name;
	private int age;
	
	String getId() { 
		return id; 
	}
	void setId(String _id) {
		id = _id;
	}
	
	String getName() { 
		return name; 
	}
	void setName(String _name) {
		if(_name.length() <= 10)
			name = _name;
		else
			System.out.println("�̸��� 10���ڸ� �ѱ� �� �����..");
	}
	
	int getAge() { 
		return age; 
	}
	void setAge(int _age) {
		if(_age >= 0 && _age <= 130)
			age = _age;
		else
			System.out.println("���̴� 0 ~ 130 ���̸� �����մϴ�..");
	}
	
	void info() {
		System.out.println("--- ȸ �� �� �� ---");
		System.out.println("ID : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + " ��");
	}
}

public class ExSetterGetter {

	public static void main(String[] args) {
		
		ship memA = new ship();
//		memA.id = "001";
//		memA.name = "memA";
//		memA.age = -100;
		
		memA.setId("001");
		memA.setName("a;klsdjfl;kaskl;djfl;asdklf");
		memA.setName("memA");
		memA.setAge(-100);
		memA.setAge(50);
		memA.info();
		System.out.println();
		
		System.out.println("ID : " + memA.getId());
		System.out.println("�̸� : " + memA.getName());
		System.out.println("���� : " + memA.getAge());
		
		
	}
	
}














