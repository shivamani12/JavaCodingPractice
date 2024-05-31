package com.KS.Array4;

public class FindLargestOfThreeNumbers {
public static void main(String[] args) {
	
	int a=15;
	int b=25;
	int c=30;
	
	if(a>=b && a>=c) {
		System.out.println(a);
	}else if(b>=a && b>=c) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
	
}
}
