package javathurlab;
import java.util.*;
public class StudentRank // class
{ 
	public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in); //Scanner class is used for input purpose
	    int n,i,j; // n is for number of students
	    System.out.println("Enter the no. of students:");
	    n=in.nextInt();
	    int a[]=new int[n];// a is used for marks 
	    String b[]=new String[n]; // b is used for name
	    System.out.println("Enter the names of the students:");
	    for(i=0;i<n;i++)// this is used to collect the names to array
	    {
	      b[i]=in.next();// input is given here for name
	    }
	    System.out.println("Enter the marks of the students:");
	    for(i=0;i<n;i++)// this is used to collect the marks to array
	    {
	      System.out.println(b[i]);
	      a[i]=in.nextInt();// input is given here for marks
	    }
	    // sorting takes place
	    for(i=0;i<n;i++)
	    {
	      for(j=i+1;j<n;j++)
	      {
	        if(a[i]>a[j])// checks two values if the condition satisfy then the swapping process takes place
	        {
	        	// swapping takes place for marks
	          int t=a[i];
	          a[i]=a[j];
	          a[j]=t;
	       // swapping takes place for name
	          String s=b[i];
	          b[i]=b[j];
	          b[j]=s;
	        }
	      }
	    }
	    System.out.println("Rank\tName\tMarks");
	    for(i=0;i<n;i++)// this for loop is used to collect all the values and for print the output
	    {
	      System.out.println((i+1)+"\t"+b[i]+"\t"+a[i]); //output will be printed
	    }
	  }
}