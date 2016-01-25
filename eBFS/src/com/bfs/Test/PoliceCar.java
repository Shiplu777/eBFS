package com.bfs.Test;

public class PoliceCar extends Car {
	
	private void FlushLight(){
		drive();
		System.out.println("This will flushlight");
	}
	
	public void drive(){
		System.out.println("This method is from police car");
	}
	
	public static void main(String[] args) {
		PoliceCar pc = new PoliceCar();

		pc.FlushLight();
		
		
	}

}
