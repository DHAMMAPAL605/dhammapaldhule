package com.program.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class RepeatedCharacter {
	
public static void main(String[] args) {
		
		String word ="Swara";
		
		char str [] =word.toCharArray();
		Arrays.sort(str);
		
		for(int i=0; i<word.length(); i++) {
			int count=1;
			char temp=str[i];
			
			for(int j=i+1; j<word.length(); j++) {
				if(str[i]==str[j]) {
					count++;
					i++;
				}
				
			}
		
			if(count>1) {
				System.out.println(temp+": "+count);
			}
			
		}
		
}
}
