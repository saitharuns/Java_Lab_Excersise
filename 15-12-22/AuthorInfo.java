package javathurlab;

import java.sql.*;

public class AuthorInfo {

	public static void main(String[] args) {

		// JDBC driver name and database URL
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://127.0.0.1:21212/javaex";

		// Database credentials
		final String USER = "root";
		final String PASS = "12345";

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(JDBC_DRIVER);

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT author_id, name, city FROM authors WHERE city LIKE 'S%'";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int authorId = rs.getInt("author_id");
				String name = rs.getString("name");
				String city = rs.getString("city");

				System.out.println("Author ID: " + authorId);
				System.out.println("Name: " + name);
				System.out.println("City: " + city);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}

/*
 data in database
id	name	city
101	toni	Salem
102	vijay	Sattur
103	sai	nellai
104	tharun	ambai
105	sundar	kalidai

 */

/*
 * output......
 * 
Connecting to database...
Creating statement...
Author ID: 101
Name: toni
City: Salem
Author ID: 102
Name: vijay
City: Sattur

 */