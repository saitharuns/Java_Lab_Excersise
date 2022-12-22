package Sampleworks;

public class Manager extends Member {
	String department;

	public Manager(String name, int age, long phoneNumber, String address, int salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}
}