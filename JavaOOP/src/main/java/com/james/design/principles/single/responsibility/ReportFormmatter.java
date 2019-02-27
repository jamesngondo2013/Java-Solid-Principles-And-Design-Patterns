package com.james.design.principles.single.responsibility;

public class ReportFormmatter {

	String formattedOutput;
	
	public ReportFormmatter(Object obj, FormatType formarType) {
		
		switch (formarType) {
		case XML:
			formattedOutput = convertObjectToXML(obj);
			break;
		case CSV:
			formattedOutput = convertObjectToCSV(obj);
		break;

		default:
			break;
		}
	}

	private String convertObjectToXML(Object obj){
		return "XML : <title>"+ obj.toString()+"</title>";
		
	}
	
	private String convertObjectToCSV(Object obj){
		return "CSV : <title>"+ obj.toString()+"</title>";
		
	}

	public String getFormattedOutput() {
		return formattedOutput;
	}
	
}
