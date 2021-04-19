package myobj;

public class Coffee {
	
		private static class CoffeeCode {
		
		int code;
		String name;
	    String originname;
		
		
		
		
		private CoffeeCode(int code, String name){
			this.code =code;
			this.name = name;
			}
		
	
	    }
		private static class OriginCode {
			String originname;
			int origincode;

		private OriginCode(int origincode, String originname){
			this.origincode= origincode;
			this.originname= originname;
			}

	
		}
		
	
	//private static String[] coffee_names = {"아메리카노","카페라떼","카페모카","카라멜 마끼아또"};
	
	//private static String[] origin_names = {"콜롭비아","브라질","에티오피아","케냐","인도"};
	
	//코드번호
	public final static CoffeeCode AMERICANO =new CoffeeCode(0,"아메리카노");
	public final static CoffeeCode CAFEE_LATTE =new CoffeeCode(1,"카페라떼");
	public final static CoffeeCode CAFEE_MOCHA =new CoffeeCode(2,"카페모카");
	
	public final static OriginCode  COLOMBIA =new OriginCode(0,"콜롬비아");
	public final static OriginCode BRAZIL =new OriginCode(1,"브라질");
	public final static OriginCode  ETHIOPIA=new OriginCode(2,"에티오피아");
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	OriginCode origin;
	
	boolean hot;
	
		
	public Coffee(CoffeeCode coffee, int price, int caffeine, OriginCode origin) {
	this.coffee = coffee;
	this.price = price;
	this.caffeine = caffeine;
	this.origin = origin;
	this.hot = true;
	
	}
	
	public String  getCoffeeName() {
	
		return coffee.name;
	}
	public int getCoffeeCode() {
		return coffee.code;
	}
	public String getOriginName() {
	
		return coffee.originname;
	}
	
	public void info() {
		System.out.println("커피종류 : "+coffee+"가격 :"+price+"원"+"카페인 :"+caffeine+"원산지 :"+ origin+"산");
	}

	public  void main(String[] args) {
	Coffee coffee =  new Coffee(Coffee.AMERICANO,1500,10,Coffee.COLOMBIA);
	Coffee coffee1 = new Coffee(Coffee.CAFEE_LATTE,1800,15,Coffee.BRAZIL);
	Coffee coffee2 = new Coffee(Coffee.CAFEE_MOCHA,2500,20,Coffee.ETHIOPIA);
	Coffee coffee3 = new Coffee(Coffee.CAFEE_MOCHA,3500,15,Coffee.ETHIOPIA);
	
	
	//coffee.origin_names = new String[] {"한국","중국","일본","러시아"};
	}

	
	


}
