package com.KS.String;

import java.util.Arrays;

public class SortTheCharactersOfString {
public static void main(String[] args) {
	
	String str="Shivam";
	
	System.out.println(sortStr(str));
		
}
	public static String sortStr(String str) {
				
		String finalString=null;
			
			if(str.length()!=0) {
			 str=str.toLowerCase();
				char ch[]=str.toCharArray();
				Arrays.sort(ch);
				 finalString =new String(ch);	
			}
			return finalString;
	}
	
	
}
