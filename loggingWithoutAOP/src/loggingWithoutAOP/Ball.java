package loggingWithoutAOP;

public class Ball extends CoordinateGenerator{
private int X,Y;
	
	public Ball(){
		Logger.entry("Ball()");
		X=Y=0;
		Logger.exit("Ball()");
	}
	
	public void positionBall() throws Out,Goal,Corner{
		Logger.entry("positionBall()");
		this.X=this.generateX();
		this.Y=this.generateY();
		
		if ((Y==0)||(Y==50)) throw new Out("Ball is out!");
		if (((X==0)||(X==100))&&((Y>=20)&&(Y<=30))) throw new Goal("Gol!");
		if (((X==0)||(X==100))&&((Y<20)||(Y>30))) throw new Corner("Corner!");
		Logger.exit("positionBall()");
		
	}
	
	public int getX(){
		Logger.entry("getX()");
		Logger.exit("getX()");
		return this.X;
	}
	
	public int getY(){
		Logger.entry("getY()");
		Logger.exit("getY()");
		return this.Y;
	}
	
	public void putGoal(){
		Logger.entry("putGoal()");
		this.X=50;
		this.Y=25;
		Logger.exit("putGoal()");
	}
	
	public String toString(){
		Logger.entry("toString()");
		Logger.exit("toString()");
		return "("+X+" "+Y+")";
		
	}
	
}
