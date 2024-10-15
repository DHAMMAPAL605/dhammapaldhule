package com.program.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountWords {
	
	public static void main(String[] args) {
		
		String name = "Java Paython Java React";
		
		long count = Arrays.asList(name.split(" ")).stream()
		.collect(Collectors.counting());
		
				System.out.println("Words Count: "+count);
			
		}

}
