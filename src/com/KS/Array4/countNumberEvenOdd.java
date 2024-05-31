package com.KS.Array4;

public class countNumberEvenOdd {
public static void main(String[] args) {
	
	
		int number=123;
		int evenCount=0;
		int OddCount=0;
		while(number!=0) {
			int digit=number%10;
			if(digit%2==0) {
				evenCount++;
			}else {
				OddCount++;
			}
			number=number/10;
		}
		System.out.println(evenCount);
		System.out.println(OddCount);
	
}
}
