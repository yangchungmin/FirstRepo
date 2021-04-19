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
			System.out.println("이름은 10글자를 넘길 수 없어요..");
	}
	
	int getAge() { 
		return age; 
	}
	void setAge(int _age) {
		if(_age >= 0 && _age <= 130)
			age = _age;
		else
			System.out.println("나이는 0 ~ 130 사이만 가능합니다..");
	}
	
	void info() {
		System.out.println("--- 회 원 정 보 ---");
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + " 세");
	}
	
}






















