package study;

import java.util.List;
import java.util.ArrayList;




public class Main{
	public static void main(String[] args) {
		Article article1 = new Article(1,"제목1","고질라");
		Article article2 = new Article(2,"제목2","우뢰매");
		Article article3 = new Article(3,"제목3","피카츄");
		
		List<Article> articles = new ArrayList<>();
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
		
		for(int i =0;i<articles.size();i++) {
			System.out.println(articles.get(i));
		 }
	
	   }
	}
class Article {
	private int id;
	private String title;
	private String body;
	
	//public int getId() {
	//	return id;
	//}
	
	public Article() {
		
	}
	public  Article(int id,String title) {
		this(id,title,"내용"+id);
	}
	public Article(int id,String title,String body) {
		
		this.id=id;
		this.title=title;
		this.body=body;
	}
	public String toString() {
		return String.format("[id=%d,title=%s,body=%s]",id,title,body);
	}
}