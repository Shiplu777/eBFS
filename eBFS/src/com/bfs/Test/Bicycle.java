package com.bfs.Test;

public class Bicycle {
	String Color="Blue";
	int numofWheels=4;
	boolean isBellPresent;
	
	public void RideLeftSide(){
		System.out.println("This will ride in the Left Side");
	}
	
	public void RideRightSide(){
		System.out.println("This will ride in the Right Side");
	}
	
	public String GetInfo(String args){
		if(args.equalsIgnoreCase("Color")){
			System.out.println("Color is "+ Color);
			return Color;
		}else if(args.equalsIgnoreCase("numofWheels" )){
			System.out.println("Number of Wheels is " + numofWheels);
			return Integer.toString(numofWheels);
		}else{
			System.out.println("Please pass right argument");
			return "Wrong Argument";
		}
			
		
		
	}

}
