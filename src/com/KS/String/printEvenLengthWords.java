package com.KS.String;

import java.util.Arrays;

public class printEvenLengthWords {

	public static String getString (String str) {
			
			for(String s: str.split(" ")) {
				if(s.length()%2==0) {
					return s;
				}
			}
			throw new RuntimeException("not found");
		}
	
public static void main(String[] args) {

	// write a java program to print even length words in String
	
String str= "Hell World";		
System.out.println(getString(str));
	
	//using java 8	
	String arr[]=str.split(" ");
	Arrays.stream(arr).filter(e-> e.length()%2==0).forEach(System.out::println);
}
	
}
