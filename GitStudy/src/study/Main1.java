package study;
import java.util.HashMap;

public class Main1{
	public static void main(String[] args) {
		HomeController homeController = new HomeController();
		ArticleController articleController = new ArticleController();
	
		HashMap<String,Controller> controllers = new HashMap<>();
		controllers.put("home",homeController) ; 
		controllers.put("article",articleController);
		
		
		controllers.get("home").doAction();
	}
}
abstract class Controller{
	
	//�ڽ� Ŭ�������� ������ �ϼ��ؾߵ� ���� �絵��Ų����
	abstract public void doAction();
}
	
 class HomeController extends Controller{
	 public void doAction() {
			System.out.println("Ȩ ��Ʈ�ѷ� �۵�");
		}
}
	

class ArticleController extends Controller{
	public void doAction() {
		System.out.println("�Խù� ��Ʈ�ѷ� �۵�");
	}
}

