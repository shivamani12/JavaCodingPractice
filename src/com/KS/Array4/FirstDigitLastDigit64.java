package com.KS.Array4;

public class FirstDigitLastDigit64 {
public static void main(String[] args) {
	
	
	int number=123;
	
	int last=number%10;
	
	while(number>10) {
		number=number/10;
	}
	System.out.println(number+last);
	
	
	
}
}
