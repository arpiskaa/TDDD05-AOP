package loggingWithoutAOP;

public class Game {
	private int A;
	private int B;
	private	Ball M=new Ball();
	
	public Game (){
		Logger.entry("Game()");
		this.A=0;
		this.B=0;
		Logger.exit("Game()");
	}

	
	public void play(){
		Logger.entry("play()");
		int i=0;
		int countingOut=0;
		int countingCorner=0;

		
		do{
			try{
				i++;
				M.positionBall();
				System.out.println("The ball is at the following coordinates: "+M);
			}
			catch(Out e){
				countingOut++;
				System.out.println(e.getMessage());
			}
			catch(Goal e){
				if (M.getX()==0) A++;
				if (M.getX()==100) B++;
				M.putGoal();
				System.out.println(e.getMessage());
			}
			catch(Corner e){
				countingCorner++;
				System.out.println(e.getMessage());
			}
		}while (i<1000);
		System.out.println ("Score: "+A+"-"+B+" Nr of corners: "+countingCorner+" Nr of outs: "+countingOut);
		if (A>B) System.out.println("team A wins!");
		if (B>A) System.out.println("team B wins!");
		if (A==B) System.out.println("draw!");
		Logger.exit("play()");
	}
}
