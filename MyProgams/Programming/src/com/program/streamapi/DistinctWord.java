package com.program.streamapi;

import java.util.Arrays;
import java.util.List;

public class DistinctWord {
	public static void main(String[] args) {
		
	List<String> list = Arrays.asList("Java", "Paython", "Java", "React");
	
	list.stream().distinct().forEach(System.out::println);
			
		
	}
}
