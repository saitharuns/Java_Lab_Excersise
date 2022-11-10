package javathurlab;
import java.util.*;// this is used for Scanner class
//student class is created
public class Student {
    public static void main(String[] args) {
        int num_students;//asking total number of students
        String name;// declaring student name
        int year;// declaring student name
        String combination;//declaring grade of the student
        int i;
        Scanner input = new Scanner(System.in);//is created for taking input
        System.out.println("Enter number of students: ");
        num_students = input.nextInt();// asking for total number of students
        String[] students = new String[num_students];
        for (i = 0; i < num_students; i++) {// for loop is declared to take number of inputs 
            
            System.out.println("Enter name of student "+(i + 1)+": ");
            name = input.next();// declaring name of the student
            System.out.println("Enter Year of student "+(i + 1)+" Studying in : ");
            year = input.nextInt(); // declaring year of the student
            input.nextLine();
            System.out.println("Enter combination of student "+(i + 1) +": ");
            combination = input.nextLine(); // declaring combination of the student
            students[i] = "Student Name: "+name+", Year: " +year+ ", Combination: "+combination;
        }

        input.close();
        System.out.println("\nStudents list:");
        for (i = 0; i < num_students; i++) {//this for loop is used to print the students that we have declared
        	System.out.println(students[i]);// printing students that is stored in array
        }
    }
}