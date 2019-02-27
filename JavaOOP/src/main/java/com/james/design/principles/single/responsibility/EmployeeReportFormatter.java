package com.james.design.principles.single.responsibility;

public class EmployeeReportFormatter extends ReportFormmatter{

	public EmployeeReportFormatter(Employee emp, FormatType formarType) {
		super(emp, formarType);
		
	}
	
	public String getFormattedEmployee(){
		return getFormattedOutput();
		
	}

}
