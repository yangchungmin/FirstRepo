package study;

public class BookManager {

	public static void main(String[] args) {
		
		Book bookA = new Book("����", "�ڰ渮", 20000, "B");
		bookA.infoBook();
		System.out.println();
		
		Book bookB = new Book("�ﱹ��", "�̹���");
		bookB.infoBook();
		bookB.setPrice(-22000);
		bookB.infoBook();
		bookB.setPrice(22000);
		bookB.setArea("C");
		bookB.infoBook();
		
	}
	
}
