

public class Ball extends CoordinateGenerator{
private int X=0,Y=0;
	
	public Ball(){
	}
	
	public void positionBall() throws Out,Goal,Corner{
		this.X=this.generateX();
		this.Y=this.generateY();
		
		if ((Y==0)||(Y==50)) throw new Out("Ball is out!");
		if (((X==0)||(X==100))&&((Y>=20)&&(Y<=30))) throw new Goal("Gol!");
		if (((X==0)||(X==100))&&((Y<20)||(Y>30))) throw new Corner("Corner!");
		
	}
	
	public int getX(){
		return this.X;
	}
	
	public int getY(){
		return this.Y;
	}
	
	public void putGoal(){
		this.X=50;
		this.Y=25;
	}
	
	public String toString(){
		return "("+X+" "+Y+")";
	}
	
}
