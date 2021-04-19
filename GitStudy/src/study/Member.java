package study;



public class Member {

	private String id;
	private String name;
	private int age;
	
	Member(){
		System.out.println("- constructor -");
	}
	
	Member(String _id, String _name, int _age){
		System.out.println("- constructor2 -");
		id = _id;
		name = _name;
		age = _age;
	}
	
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






















