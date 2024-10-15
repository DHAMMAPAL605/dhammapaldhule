package com.program.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordString {
	
	public static void main(String[] args) {
		

	String name = "Java Paython Java React";
	
	Map<String,Long> counterMap = Arrays.asList(name.toLowerCase().split(" ")).stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	 counterMap.forEach((k, v) -> {
		if(v > 1) {
			System.out.println(k+": "+v);
		}
	});
	
	}
}
