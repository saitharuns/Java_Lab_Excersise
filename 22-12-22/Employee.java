package Sampleworks;

public class Employee extends Member {
	String specialization;

	public Employee(String name, int age, long phoneNumber, String address, int salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
}
