package com.program.streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,4,33,44,55,66,77,11,21);
	
	list.stream().filter(i -> i % 2==0).forEach(System.out::println);

	}

}
