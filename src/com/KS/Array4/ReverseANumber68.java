package com.KS.Array4;

public class ReverseANumber68 {
public static void main(String[] args) {
	
	int num=123;
	int rev=0;
	while(num!=0) {
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
		System.out.println(rev);
}
}
