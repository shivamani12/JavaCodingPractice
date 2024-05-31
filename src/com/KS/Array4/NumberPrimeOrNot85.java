package com.KS.Array4;

public class NumberPrimeOrNot85 {
public static void main(String[] args) {
	
	
	int num=3;
	
	boolean prime=true;
	
	for(int i=2; i<num; i++) {
		
		if(num%i==0) {
			prime=false;
		}
	}
	
	if(prime) {
		System.out.println("Given number prime");
	}else {
		System.out.println("Not");
	}
	
	
}
}
