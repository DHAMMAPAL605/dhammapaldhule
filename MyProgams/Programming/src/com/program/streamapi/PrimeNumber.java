package com.program.streamapi;

import java.util.stream.IntStream;

public class PrimeNumber {
public static void main(String[] args) {
	int num=3;
	
	System.out.print(IntStream.rangeClosed(2, num/2).noneMatch(i -> num % i==0));
}
}
