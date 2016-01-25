package com.bfs.example;

public class Calculate {

	public static void main(String[] args) {
		
		Calculator Cl = new Calculator();
		int result = Cl.add(5,1);
		if(result>10){
			System.out.println("Result is greater than 10");
			
		}else{
			System.out.println("Result is less than 10");
		}

	}

}
