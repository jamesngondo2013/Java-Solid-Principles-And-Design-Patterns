package com.james.design.principles.single.responsibility;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

	public void saveEmployee(Employee emp) {

		/*DatabaseConnectionManager conn = DatabaseConnectionManager.getConnectionManagerInstance();
		conn.connect();
		try {
			
			PreparedStatement stmt= conn.getConn().prepareStatement("INSERT INTO automation.employees values(?,?,?)");
			stmt.setInt(1,emp.getEmpid());//1 specifies the first parameter in the query  
			stmt.setString(2,emp.getName());
			stmt.setString(3,emp.getDepartment());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("New Employee details saved...");
		emp.getEmployeeDetails();
	}

	public void deleteEmployee(Employee emp) {

		/*DatabaseConnectionManager conn = DatabaseConnectionManager.getConnectionManagerInstance();
		conn.connect();
		try {
			
			PreparedStatement stmt= conn.getConn().prepareStatement("DELETE FROM automation.employees WHERE empid=?");
			stmt.setInt(1,emp.getEmpid());//1 specifies the first parameter in the query  
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Employee details deleted..." );
		emp.getEmployeeDetails();
	}
}
