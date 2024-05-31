package com.KS.String;

public class PrintCharacterCountEachWord {
public static void main(String[] args) {
	
	
	String str="Hello World";

		char ch[]=str.toCharArray();
		String s="";
		
		for(int i=0; i<str.length(); i++) {
			
			while(i<ch.length && ch[i]!=' ') {
				s=s+ch[i];
				i++;
			}
			
		}
		System.out.println(s.length());
}
}
