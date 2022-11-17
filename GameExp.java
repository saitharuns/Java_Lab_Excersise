package Sampleworks;
// this is used for userdefined exception that is used in the game.java
public class GameExp extends Exception{ 
	public GameExp(String str)
	{
		super(str);
		System.out.println("There is no such options");
	}

}
