package com.program.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class DistinctCharacters {
	
	public static void main(String[] args) {
		
		String word ="Swara";
		
		Stream.of(word)
		.map(w -> w.split(""))
		.flatMap(Arrays::stream)
		.distinct()
		.forEach(System.out::print);
			
		}

}
