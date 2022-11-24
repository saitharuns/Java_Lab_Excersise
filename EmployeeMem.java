package javathurlab;

class Members{
	String Name;
	int age;
	long phno;
	String address;
	int salary;
	
	
	public Members(String name, int age, long phno, String address, int salary) {
		super();
		Name = name;
		this.age = age;
		this.phno = phno;
		this.address = address;
		this.salary = salary;
	}


	void printSalary(){
		System.out.println("Name : "+Name);
		System.out.println("Age : "+age);
		System.out.println("Phone no : "+phno);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
	}
	
}
class Employees extends Members{
	int empId;
	String empDes;
	String depart;
	
	
	public Employees(String Name,int age, long phno,String address,int empId, String empDes, String depart,int salary) {
		super(Name, age, phno, address, salary);
		this.empId = empId;
		this.empDes = empDes;
		this.depart = depart;
	}
	void printemp() {
		printSalary();
		System.out.println("Employee Id : "+empId);
		System.out.println("Designation : "+empDes);
		System.out.println("Department : "+depart);
		
	}
	
}

class Manager extends Members{
	String manDes;
	int manId;
	String mandepart;

	public Manager(String Name,int age, long phno,String address,int manId, String manDes, String mandepart,int salary) {
		super(Name, age, phno, address, salary);
		this.manId = manId;
		this.manDes = manDes;
		this.mandepart = mandepart;
	}

	void printMan() {
		printSalary();
		System.out.println("Employee Id : "+manId);
		System.out.println("Designation : "+manDes);
		System.out.println("Department : "+mandepart);
		
	}
	
}

public class EmployeeMem {
	
	public static void main(String args[]) {
		Manager m=new Manager("Vijay", 48, 1234567892L, "Chennai", 392130, "Team Leader", "HR", 800000);
		m.printMan();
		Employees e=new Employees("Sai Tharun", 22, 1234567892L, "Bangarapet", 392130, "Debugger", "Developer", 300000);
		e.printemp();
		
	}

}
