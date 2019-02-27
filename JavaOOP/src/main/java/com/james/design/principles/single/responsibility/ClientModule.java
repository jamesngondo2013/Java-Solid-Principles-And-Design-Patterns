package com.james.design.principles.single.responsibility;

public class ClientModule {
	
	static EmployeeReportFormatter formatter;
	
	public static void main(String[] args) {
		
		Employee davie = new Doctor(1, "James Ngondo", "SAP Ariba Loc Eng");
		EmployeeDAO empDAO = new EmployeeDAO();
		
		hireNewEmployee(davie,empDAO);
		
		
		formatter = new EmployeeReportFormatter(davie, FormatType.CSV);
		
		printEmployeeReport(davie, FormatType.XML);
	}

	public static void hireNewEmployee(Employee emp, EmployeeDAO empDAO){
		//EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.saveEmployee(emp);
	}
	
	public static void terminateEmployee(Employee emp, EmployeeDAO empDAO){
		//EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.deleteEmployee(emp);
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formatType){
		//EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
