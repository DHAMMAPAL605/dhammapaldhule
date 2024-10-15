package com.program.streamapi;

public class NonRepeatedString {

	public static void main(String[] args) {

		String name = "aabbccbdee";

		for (char i : name.toCharArray()) {

			if (name.indexOf(i) == name.lastIndexOf(i)) {

				System.out.print(i);
				break;
			}

		}

	}

}
