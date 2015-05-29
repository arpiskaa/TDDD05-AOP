import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Game G=new Game();
		//G.play();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Game G = (Game) context.getBean("Game");
		G.play();
	}

}
