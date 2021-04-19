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
		
	
	//private static String[] coffee_names = {"�Ƹ޸�ī��","ī���","ī���ī","ī��� �����ƶ�"};
	
	//private static String[] origin_names = {"�ݷӺ��","�����","��Ƽ���Ǿ�","�ɳ�","�ε�"};
	
	//�ڵ��ȣ
	public final static CoffeeCode AMERICANO =new CoffeeCode(0,"�Ƹ޸�ī��");
	public final static CoffeeCode CAFEE_LATTE =new CoffeeCode(1,"ī���");
	public final static CoffeeCode CAFEE_MOCHA =new CoffeeCode(2,"ī���ī");
	
	public final static OriginCode  COLOMBIA =new OriginCode(0,"�ݷҺ��");
	public final static OriginCode BRAZIL =new OriginCode(1,"�����");
	public final static OriginCode  ETHIOPIA=new OriginCode(2,"��Ƽ���Ǿ�");
	
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
		System.out.println("Ŀ������ : "+coffee+"���� :"+price+"��"+"ī���� :"+caffeine+"������ :"+ origin+"��");
	}

	public  void main(String[] args) {
	Coffee coffee =  new Coffee(Coffee.AMERICANO,1500,10,Coffee.COLOMBIA);
	Coffee coffee1 = new Coffee(Coffee.CAFEE_LATTE,1800,15,Coffee.BRAZIL);
	Coffee coffee2 = new Coffee(Coffee.CAFEE_MOCHA,2500,20,Coffee.ETHIOPIA);
	Coffee coffee3 = new Coffee(Coffee.CAFEE_MOCHA,3500,15,Coffee.ETHIOPIA);
	
	
	//coffee.origin_names = new String[] {"�ѱ�","�߱�","�Ϻ�","���þ�"};
	}

	
	


}
