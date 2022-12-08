package javathurlab;

// this was created in my sql database
/*
 * show databases;
use javaex;
show tables;
create table contacts(name varchar(20),number varchar(11), email varchar(30));
desc table contacts;
alter table contacts add primary key (number);
 */


import java.sql.*;
import java.util.*;
 
public class ContactBook {
 
	public static void main(String[] args) {
 
		String url = "jdbc:mysql://127.0.0.1:21212/javaex";
		String user = "root";
		String pass = "12345";
 
		HashSet<String> numbers = new HashSet<>();
 
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement st = con.prepareStatement("SELECT number FROM contacts");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				numbers.add(rs.getString("number"));
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name of the contact: ");
			String name = scan.nextLine();
			System.out.println("Enter the contact number of the contact: ");
			String number = scan.nextLine();
			System.out.println("Enter the email of the contact: ");
			String email = scan.nextLine();
 
			if (!numbers.contains(number)) {
				st = con.prepareStatement("INSERT INTO contacts(name,number,email) VALUES(?,?,?)");
				st.setString(1, name);
				st.setString(2, number);
				st.setString(3, email);
				st.executeUpdate();
				System.out.println("Contact added to contactbook successfully!");
			} else {
				System.out.println("Contact already exists!");
			}
			scan.close();
			con.close();
 
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
	}
 
}