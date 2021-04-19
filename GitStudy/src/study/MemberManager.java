package study;

public class MemberManager {

	public static void main(String[] args) {
		
		Member memA = new Member();
		memA.info();
		System.out.println();
		
		Member memB = new Member("002", "memB", 20);
		memB.info();
		
	}
	
}
