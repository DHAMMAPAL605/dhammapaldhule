package com.program.java;

public class RandomNumberExample2 {
	public static void main( String args[] )   
	{  
	int min = 200;  
	int max = 400;  
	
	System.out.println("Random value of type double between "+min+" to "+max+ ":");  
	double a = Math.random()*(max-min+1)+min;   
	System.out.println(a);  
	
	System.out.println("Random value of type int between "+min+" to "+max+ ":");  
	int b = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(b);  
	}  
}
