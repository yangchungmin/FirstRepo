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
	
	//자식 클래스에서 무조건 완성해야됨 일을 양도시킨거임
	abstract public void doAction();
}
	
 class HomeController extends Controller{
	 public void doAction() {
			System.out.println("홈 컨트롤러 작동");
		}
}
	

class ArticleController extends Controller{
	public void doAction() {
		System.out.println("게시물 컨트롤러 작동");
	}
}

