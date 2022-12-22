package Sampleworks;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("toni", 22, 1234567890l, "Bangarpet", 50000, "Java Developer");
		Manager manager = new Manager("vijay", 49, 9876543210l, "Chennai", 70000, "Marketing");

		System.out.println("Employee Details");
		System.out.println("Name: " + employee.name);
		System.out.println("Age: " + employee.age);
		System.out.println("Phone Number: " + employee.phoneNumber);
		System.out.println("Address: " + employee.address);
		System.out.println("Salary: ");
		employee.printSalary();
		System.out.println("Specialization: " + employee.specialization);

		System.out.println("Manager Details");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone Number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		System.out.println("Salary: ");
		manager.printSalary();
		System.out.println("Department: " + manager.department);
	}
}

/*
 * Employee Details Name: toni Age: 22 Phone Number: 1234567890 Address:
 * Bangarpet Salary: Salary = 50000 Specialization: Java Developer Manager
 * Details Name: vijay Age: 49 Phone Number: 9876543210 Address: Chennai Salary:
 * Salary = 70000 Department: Marketing
 */