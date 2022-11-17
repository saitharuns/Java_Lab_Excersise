package Sampleworks;


import java.util.Scanner;

public class Game {// class name is game 
	static void check(int option) throws GameExp // GameExp is user defined Exception
	{
		int a[] = {1,2,3};
		if(option<0|option>3)
		{
			throw new GameExp("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("1.New Game");
		System.out.println("2.About");
		System.out.println("3.Exit");
		
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("welcome to hangman");
			Hangman hg=new Hangman();
			hg.start();
			break;
		}
		case 2:{
			System.out.println("About Us");
			System.out.println("This project is created by sai tharun s");
			System.out.println();
			System.out.println("__________________________________________");
			System.out.println("for franchisee contact www.tonivijay.com");
			break;
		}
		case 3:{
			System.out.println("thank you");
			break;
		}
		default:{
			System.out.println("");
			
		}
		}
		
		try
		{
			
			check(option);
		}
		catch(Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}

}
