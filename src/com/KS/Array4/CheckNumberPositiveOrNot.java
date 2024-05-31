package com.KS.Array4;

public class CheckNumberPositiveOrNot {
public static void main(String[] args) {
	
	// check number is +ve or not
	
	int a=-123;
	
	check(a);
	
	
}
public static void check(int a) {

	if(a>0) {
		System.out.println("Given number is positive="+a);
	}else {
		System.out.println("not");
	}
	
}
}
