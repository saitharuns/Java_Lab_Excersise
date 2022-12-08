package javathurlab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/* mysql database part
show databases;
use javaex;
show tables;
create table studentdata(id int,name varchar(25));
alter table studentdata add primary key (id);
select * from studentdata;
INSERT INTO studentdata(id,name) VALUES(1,'sai');
INSERT INTO studentdata(id,name) VALUES(2,'vijay');
INSERT INTO studentdata(id,name) VALUES(3,'bigil');

 */


public class IdentifyStudentName {
	public static void main(String[] args) throws Exception {

		// Setting up the database connection information
		String url = "jdbc:mysql://127.0.0.1:21212/javaex";
		String username = "root";
		String password = "12345";

		// Establishing the connection to the database
		Connection connection = DriverManager.getConnection(url, username, password);

		// Executing the query to retrieve the student information
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to Search ");
		int id = sc.nextInt();
		String query = "SELECT * FROM studentdata WHERE id = "+id;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		// Iterating through the result set and getting the student name
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			System.out.println("Student Name: " + name);
		}

		// Closing the connection
		connection.close();
	}
}
/*
Enter the id to Search 
2
Student Name: vijay
*/