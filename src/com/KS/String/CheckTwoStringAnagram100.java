package com.KS.String;

import java.util.Arrays;

public class CheckTwoStringAnagram100 {
public static void main(String[] args) {
	
	
	
	String str="Java";
	String str2="avaJ";
	
	
	char c1[]=str.toCharArray();
	char c2[]=str2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean flag=true;
	
	for(int i=0; i<c1.length; i++) {
		if(c1[i]!=c2[i]) {
			flag=false;
		}
	}
	
	
	if(flag) {
		System.out.println("it is anagram");
	}else {
		System.out.println("its not");
	}

	
	// with method
	boolean result=Arrays.equals(c1, c2);
	System.out.println(result);
	
}
}
