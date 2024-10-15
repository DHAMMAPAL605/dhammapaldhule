package com.program.streamapi;

public class SwapString {
	
	public static void main(String[] args) {
		String s1 ="FullStack";
		String s2 ="Java";
		
		s1=s1+s2;
		
		s2=s1.substring(0, s1.length() - s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("S1: "+s1+"\nS2 :"+s2);
	}

}
