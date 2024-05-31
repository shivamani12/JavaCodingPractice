package com.KS.Array4;

import java.util.Arrays;

public class LeftRotateArray59 {
public static void main(String[] args) {
	
	
	int a[]= {10,20,30,40};
	
	int temp=a[0];
	System.out.println(Arrays.toString(a));
	for(int i=1; i<a.length; i++) {
		a[i-1]=a[i];
	}
	a[a.length-1]=temp;
	System.out.println(Arrays.toString(a));
	
	// right rotate
	

//	int a[]= {1,2,3,4};
//	int temp=a[a.length-1];
//	
	
//for(int i=a.length-1; i>0; i--) {
//			
//	a[i]=a[i-1];
//
//}
//a[0]=temp;
//	System.out.println(Arrays.toString(a));
	

	
}
}
