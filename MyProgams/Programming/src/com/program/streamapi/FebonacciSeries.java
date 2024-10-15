package com.program.streamapi;

public class FebonacciSeries {
	
	public static void main(String[] args) {
		int t1=0,t2=1,sum=0;
		
	for(int i=1; i<=10;++i) {
		sum =t1+t2;
		t1=t2;
		t2=sum;
		
		System.out.print(" "+t2);
		}
		
	}

}
