package javathurlab;

import java.sql.*;

/* mysql database part
 * show databases;
use javaex;
show tables;
create table employees(emp_id int primary key, name varchar(25), working_years int, salary int);
insert into employees(emp_id,name,working_years,salary) values(101,'toni',2,20000);
insert into employees(emp_id,name,working_years,salary) values(102,'vijay',4,30000);
insert into employees(emp_id,name,working_years,salary) values(103,'rayappan',2,40000);
insert into employees(emp_id,name,working_years,salary) values(105,'veera ragavan',5,45000);
select * from employees;
 * 
 */

public class IncrementSalary
{
    public static void main(String args[])
    {
    	String url = "jdbc:mysql://127.0.0.1:21212/javaex";
		String user = "root";
		String pass = "12345";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null; 
        try
        {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.prepareStatement("SELECT * FROM employees WHERE working_years > 3");
            rs = stmt.executeQuery();
            while (rs.next())
            {
                int salary = rs.getInt("salary");
                int newSalary = (int)Math.round(salary * 1.1);
                stmt = con.prepareStatement("UPDATE employees SET salary = ? WHERE working_years > 3");
                stmt.setInt(1, newSalary);
                stmt.executeUpdate();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (con != null)
                    con.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

//after the execution of the program
/*
101	toni			2	20000
102	vijay			4	54450
103	rayappan		2	40000
105	veera ragavan	5	54450
*/