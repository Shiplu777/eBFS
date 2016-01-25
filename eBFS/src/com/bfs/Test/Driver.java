package com.bfs.Test;

public class Driver {

	public static void main(String[] args) {
		int Result;
		CalculateTax clt = new CalculateTax();
		Result = clt.TaxCal(60000, "NY");
		System.out.println("NY Tax is: " + Result);	
		
		ExcelEx excel = new ExcelEx();
		excel.ExcelMan();
				
		
	}

}

