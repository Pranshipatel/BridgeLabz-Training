package com.searching;

public class CompareBufferAndBuilder {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hey";
		StringBuilder sb = new StringBuilder();
		StringBuffer su = new StringBuffer();
		
		long startTimeBuilder = System.nanoTime();
		sb.append(str1);
		sb.append(str2);
		long endTimeBuilder = System.nanoTime();
		long durationBuilder = endTimeBuilder - startTimeBuilder;
		
		long startTimeBuffer = System.nanoTime();
		su.append(str1);
		su.append(str2);
		long endTimeBuffer = System.nanoTime();
		long durationBuffer = endTimeBuffer - startTimeBuffer;
		
		System.out.println("For String Builder time is : " + durationBuilder);
		System.out.println("For String Buffer time is : " + durationBuffer);
	}

}
