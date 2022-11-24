package javathurlab;

import java.util.Scanner;


class Person{
	String firstName;
	String lastName;
	int age;
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public void displayPerson() {
		System.out.println("First Name "+firstName);
		System.out.println("Last Name "+lastName);
		System.out.println("Age "+age);
	}
	
	
}

class Student extends Person{
	int studentId;
	String courseEnrolled;
	public Student(String firstName, String lastName, int age, int studentId, String courseEnrolled) {
		super(firstName, lastName, age);
		this.studentId=studentId;
		this.courseEnrolled=courseEnrolled;
		
	}
	
	public void displayStudent() {
		displayPerson();
		System.out.println("Student ID: "+studentId);
		System.out.println("Course Enrolled: "+courseEnrolled);
		
	}
	
}


class Employee extends Person{
	
	int employeeId;
	String departmentName;
	String designation;
	int salary;	

	public Employee(String firstName, String lastName, int age, int employeeId, String departmentName,
			String designation, int salary) {
		super(firstName, lastName, age);
		this.employeeId = employeeId;
		this.departmentName = departmentName;
		this.designation = designation;
		this.salary = salary;
	}
	public void displayEmployee() {
		displayPerson();
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Department Name: "+departmentName);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: Rs."+salary);
		
	}
}


public class LernMoreUniversity {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select your choice 1 for student and 2 for employee ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter the First Name :");
			String fn=sc.next();
			System.out.println("Enter the Last Name :");
			String ln=sc.next();
			System.out.println("Enter age :");
			int ag=sc.nextInt();
			System.out.println("Enter the Student ID :");
			int sid=sc.nextInt();
			System.out.println("Enter the Course Enrolled :");
			String ce=sc.next();
			Student st = new Student(fn, ln, ag, sid, ce);
			st.displayStudent();
			break;
			
		}
		case 2:{
			System.out.println("Enter the First Name :");
			String fn=sc.next();
			System.out.println("Enter the Last Name :");
			String ln=sc.next();
			System.out.println("Enter the Age :");
			int ag=sc.nextInt();
			System.out.println("Enter the Employee ID :");
			int eid=sc.nextInt();
			System.out.println("Enter the Department Name :");
			String dn=sc.next();
			System.out.println("Enter the Designation :");
			String ds=sc.next();
			System.out.println("Enter the Salary :");
			int Sal = sc.nextInt();
			Employee emp=new Employee(fn, ln, ag, eid, dn, ds, Sal);
			emp.displayEmployee();
			break;
		}
		default:{
			System.out.println("Invalid Input");
		}
		
		}
		sc.close();
		
	}

}