package com.KS.Array4;

public class squar65 {
public static void main(String[] args) {
	
// given number is perfect square or not
	
int number=9;
	
	checkNumber(number);
	
}
public static int checkNumber(int number) {
		
for(int i=1; i<number; i++) {
		
		if(i*i==number) {
			System.out.println("given number is square of =" + i );
		}
		
	}
return 0;
}
}
