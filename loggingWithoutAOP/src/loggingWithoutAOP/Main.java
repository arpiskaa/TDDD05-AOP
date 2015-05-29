package loggingWithoutAOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.entry("Main()");
		Game G=new Game();
		G.play();
		Logger.exit("Main()");
	}

}
