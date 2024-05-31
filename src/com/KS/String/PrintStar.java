package com.KS.String;

public class PrintStar {
public static void main(String[] args) {
	
//	 print star
		for(int i=0; i<4; i++) {
	for(int j=0; j<4; j++) {
		System.out.print("*");
	}
	System.out.println();
		}
	System.out.println("===================================");
		
	// floyd triangle
	int n=1;
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(n);
			n++;
		}
		System.out.println();
	}
	System.out.println("===================================");
	// pyramid pattern
	
	for(int i=5; i>0; i--) {
		for(int j=1; j<i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println("===================================");
		
}
}
