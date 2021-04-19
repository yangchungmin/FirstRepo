package study;

public class StaticTest {

	public static void main(String[] args) {
		
		System.out.println("staValue : " + StaticEx.staValue);
		StaticEx.staticMethod();
		System.out.println();
		
		StaticEx seA = new StaticEx();
		StaticEx seB = new StaticEx();
		System.out.println();
		
		seA.staValue = 0;
		
		seA.info();
		System.out.println();
		seB.info();
		
		
	}
	
}