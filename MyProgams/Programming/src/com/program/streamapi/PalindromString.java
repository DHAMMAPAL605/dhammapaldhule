package com.program.streamapi;

public class PalindromString {
	
	public static void main(String[] args) {
		
		String name="madam";
		
		String Reverse="";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			Reverse=Reverse+name.charAt(i);
		
		}
		
		if(name.equals(Reverse)) {
		System.out.print("It Is Palindrom");
		}else {
			System.out.print("It Is Not Palindrom");
		}
	  }

}
