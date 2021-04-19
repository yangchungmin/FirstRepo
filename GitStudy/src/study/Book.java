package study;

/*
 * Book class 를 정의하고 BookManager class 에서 테스트 하세요
 * - 도서명, 지은이, 가격, 진열위치의 관리가 가능합니다
 * - 생성자 2개 이상 정의
 *   this, this() 사용
 *   가격, 진열위치는 수정 가능
 * 
 */

public class Book {

	private String title;   // 도서명
	private String author;  // 지은이
	private int price;      // 가격
	private String area;    // 진열위치
	
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
		System.out.println("--- 도 서 정 보 ---");
		System.out.println("도서명 : " + title);
		System.out.println("지은이 : " + author);
		System.out.println("가   격 : " + price + " 원");
		System.out.println("진열위치 : " + area + " 블럭");
	}
}


