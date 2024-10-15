package com.program.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNo {

	public static void main(String[] args) {
		
		List<Integer> intergerList = Arrays.asList(7,4,5, 3, 9, 11, 7, 4);
		
		Map<Integer,Long> counterMap = intergerList.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 counterMap.forEach((k, v) -> {
			if(v > 1) {
				System.out.println(k+": "+v);
			}
		});
		
		}

}
