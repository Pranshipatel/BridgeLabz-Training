package com.searching;

public class ConcatenateString {
	public static void main(String[] args) {
		String arr[] = {"This" , " is " , "Pranshi"};
		StringBuffer sb = new StringBuffer();
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb.toString());
 	}

}
