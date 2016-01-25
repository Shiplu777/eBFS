package com.bfs.example;
import com.bfs.eBFS.HelloWorld;

public class DriveCar {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println("1.  Car1 Color ="+car1.Color + "   Car2 Color ="+car2.Color);
		car1.Color = "Black";
		System.out.println("2.  Car1 Color ="+car1.Color + "   Car2 Color ="+car2.Color);
		HelloWorld hw = new HelloWorld();
		
		car1.drive();
		car2.turnleft();
		hw.main(args);

	}

}
