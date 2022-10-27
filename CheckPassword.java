package javaproject;
import java.util.Scanner;


public class CheckPassword {
	String a,b;// declared a String Variables;	
	void getpass(String a, String b){ //getting the value;
		
		this.a=a;//a in method is assigned to a in class
		this.b=b;//b in method is assigned to b in class
	}
	void checkpass(){ // used to check password;
		if(this.a.equals(b)) { // it checks the condition
			System.out.println("The Given Password is Matching");
		}else {
			System.out.println("Error Check Again");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckPassword cp=new CheckPassword();// 
		Scanner sc = new Scanner(System.in);
		String c,d;
		System.out.println("Enter Your Password ");
		c=sc.next();
		System.out.println("Re-enter Your Password ");
		d=sc.next();
		cp.getpass(c, d);
		cp.checkpass();

	}

}
