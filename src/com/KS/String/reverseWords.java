package com.KS.String;

public class reverseWords {
public static void main(String[] args) {
	
	
	String str="Welcome to my world";
	
	String []arr=str.split(" ");  //it will split the strings
	
	
	for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
	}
	
}
}
