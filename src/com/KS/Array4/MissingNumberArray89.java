package com.KS.Array4;

public class MissingNumberArray89 {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,6};  // numbers should be natural
	int n=a.length+1;
	int totalEle=n*(n+1)/2; // formula for get total of natural number, 1+2+3+4+5+6
	
	int total=0;
	for(int i=0; i<a.length; i++) {
		total=total+a[i];
	}
	
	int result=totalEle-total;
	System.out.println(result);
	
	
}
}
