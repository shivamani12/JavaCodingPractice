package com.KS.String;

public class compareTwoStrings {
public static void main(String[] args) {
	
	
	String str="Shivam";
	String str2="Shivae";
	
	boolean flag=true;
	
	for(int i=0; i<=str.length()-1; i++) {
		if(str.charAt(i)!=str2.charAt(i)) {
			flag=false;
			break;
		}
		
	}
	
	if(flag) {
		System.out.println("Contain same");
	}else {
		System.out.println("not same");
	}
	
	
	
	
}
}
