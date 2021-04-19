package study;

/*
 * Book class �� �����ϰ� BookManager class ���� �׽�Ʈ �ϼ���
 * - ������, ������, ����, ������ġ�� ������ �����մϴ�
 * - ������ 2�� �̻� ����
 *   this, this() ���
 *   ����, ������ġ�� ���� ����
 * 
 */

public class Book {

	private String title;   // ������
	private String author;  // ������
	private int price;      // ����
	private String area;    // ������ġ
	
	Book(){
		this.title = "none";
		this.author = "none";
		this.price = 0;
		this.area = "A";
	}
	
	Book(String title, String author){
		this();
		this.title = title;
		this.author = author;
	}
	
	Book(String title, String author, int price, String area){
		this.title = title;
		this.author = author;
		this.price = price;
		this.area = area;
	}
	
	void setPrice(int price) {
		if(price >= 0)
			this.price = price;
	}
	
	void setArea(String area) {
		this.area = area;
	}
	
	void infoBook() {
		System.out.println("--- �� �� �� �� ---");
		System.out.println("������ : " + title);
		System.out.println("������ : " + author);
		System.out.println("��   �� : " + price + " ��");
		System.out.println("������ġ : " + area + " ��");
	}
}


