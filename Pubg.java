package PrinciplesOfOops;
//METHOD OVERRIDING
public class Pubg
{
	int bullets=30;
	public void fire()
	{
		bullets--;
		System.out.println("Fired!");
		System.out.println("Bullets left "+bullets);
	}
	
	public void reload()
	{
		bullets = 30;
		System.out.println("Gun Reloaded");
	}
	
	public void teasure()
	{
		
		bullets = (int)(Math.random()*10);
		System.out.println("Congrats! You got extra "+bullets+" bullets");
	}
	public void turnRight()
	{
		System.out.println("Turned Right");
	}
	
	//ASSUMING THAT THERE IS A BUG
	public void turnLeft()
	{
		System.out.println("Tured Right");
	}
	
	public void moveForward(int steps)
	{
		System.out.println("Moved Backward");
	}
	
	public void moveBackward(int steps)
	{
		System.out.println("Moved Backward");
	}
}
