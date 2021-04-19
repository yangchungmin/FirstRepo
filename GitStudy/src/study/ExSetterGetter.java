package study;

/*
 * getter 메소드
 * - class 외부에서 생성된 객체의 멤버필드 값을 사용하는 용도의 메소드 입니다
 * 
 * setter 메소드
 * - class 외부에서 생성된 객체의 멤버필드 값을 설정 or 수정하는 용도의 메소드 입니다
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
		System.out.println("이름 : " + memA.getName());
		System.out.println("나이 : " + memA.getAge());
		
		
	}
	
}














