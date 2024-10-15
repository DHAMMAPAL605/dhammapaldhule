package com.program.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargeNoList {
	public static void main(String[] args) {
		
	List<Integer> intergerList = Arrays.asList(5, 3, 9, 11, 7, 4);
	int secondLargestNo = intergerList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed())
			.collect(Collectors.toList()).get(1);
	
	System.out.print(secondLargestNo);
	}
}
