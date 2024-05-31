package com.KS.Array4;

public class CountDigits74 {
public static void main(String[] args) {
	
	
	
	int a=123;
	int count=0;
	while(a!=0) {
		
		a=a/10;
		count++;
		
	}
	System.out.println(count);
    
}
}
