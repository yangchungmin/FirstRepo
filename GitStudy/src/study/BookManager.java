package study;

public class BookManager {

	public static void main(String[] args) {
		
		Book bookA = new Book("토지", "박경리", 20000, "B");
		bookA.infoBook();
		System.out.println();
		
		Book bookB = new Book("삼국지", "이문열");
		bookB.infoBook();
		bookB.setPrice(-22000);
		bookB.infoBook();
		bookB.setPrice(22000);
		bookB.setArea("C");
		bookB.infoBook();
		
	}
	
}
