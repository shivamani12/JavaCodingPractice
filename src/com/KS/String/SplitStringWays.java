package com.KS.String;

import java.nio.file.spi.FileSystemProvider;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitStringWays {
	
	public static void printString(String str[],String approach) {
		System.out.println("Spliting by"+"-"+ approach);
		for(String st:str) {
			System.out.println(st);
		}
		
	}
	
public static void main(String[] args) {
	
	// split a string ways 77
	
	/* ways->
	
		a) String class split method
		b) Pattern.compile(regex).splitAsString(String)
		c) String tokenizer
		d) StringUtils.split(String,"exp");
		5) Splitter.on("-").split(s)
	*/
	
	String s="091-123456";
	
	String str[]=s.split("-");
	printString(str,"split method"); 
	
	// ---- Second way ------
	Pattern.compile("-").splitAsStream(s).forEach(System.out::println);
	
	// third way
	StringTokenizer st=new StringTokenizer(s,"-");
	
	while(st.hasMoreTokens()) {
		String st2=st.nextToken();
		System.out.println(st2);
	}
	
	
	
}
}
