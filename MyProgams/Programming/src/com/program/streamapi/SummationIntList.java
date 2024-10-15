package com.program.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummationIntList {
	
	public static void main(String[] args) {
				
		List<Integer> intergerList = Arrays.asList(5, 3, 9, 11, 7, 4);
		int sum = intergerList.stream()
				.collect(Collectors.summingInt(Integer::intValue));
		
		System.out.print(sum);
		}

}
