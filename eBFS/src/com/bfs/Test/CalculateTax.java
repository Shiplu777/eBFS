package com.bfs.Test;

public class CalculateTax {
	public int TaxCal(int Salary, String State){
		int ResultSalary=0;
		if(State.equalsIgnoreCase("NY")){
			ResultSalary = (int) (Salary*0.70);
			return ResultSalary;
		}else if(State.equalsIgnoreCase("NJ")){
			 ResultSalary = (int)(Salary*0.81);
			 return ResultSalary;
		}else if(State.equalsIgnoreCase("PA")){
			ResultSalary = (int)(Salary*0.85);
			return ResultSalary;
		}else if(State.equalsIgnoreCase("DA")){
			ResultSalary = Salary;
			return ResultSalary;
		}else{
			System.out.println("State is Wrong");
			return ResultSalary;
			
		}
		
		
	}

}
