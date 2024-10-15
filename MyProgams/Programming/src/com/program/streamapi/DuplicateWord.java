package com.program.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWord {
	
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Java", "Paython", "Java", "React");
	
		
		Map<String,Long> counterMap = stringList.stream()
		.collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		
		 counterMap.forEach((k, v) -> {
			if(v > 1) {
				System.out.println(k+": "+v);
			}
		});
		
		}

}
