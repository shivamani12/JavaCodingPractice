package com.KS.Array4;

public class printElementAtEven63 {
public static void main(String[] args) {
	
	
	int a[]= {1,2,3,4,6,7,8};
	
	for(int i=0; i<a.length; i++) {
		
		if(a[i]%2==0) {
			System.out.println("index"+i);
			System.out.println(a[i]);
		}
		
	}
	
}
}
