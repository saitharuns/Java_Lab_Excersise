package Sampleworks;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	int salary;

	public Member(String name, int age, long phoneNumber, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary = " + salary);
	}
}
