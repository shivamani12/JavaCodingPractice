package com.KS.Array4;

import java.util.Arrays;

public class MoveNegative58 {
public static void main(String[] args) {

	int a[]= {-1,-20,30,40,50,-8};
	// output {-1,-20,-8,30,40,50
	int newA[]=new int[a.length];
	int index=0;

	int min=0;
	
	
//	for(int i=0; i<a.length; i++) {
//		
//		if(a[i]<min) {
//			newA[index++]=a[i];
//		}
//	}
//	for(int i=0; i<a.length; i++) {
//		if(a[i]>min) {
//			newA[index++]=a[i];
//		}
//	}
//	
//	System.out.println(Arrays.toString(newA));

	// second approach with one loop
	
	int max=a.length-1;
	for(int i=0; i<a.length; i++) {
		if(a[i]<min) {
			newA[index++]=a[i];
		}else {
			newA[max--]=a[i];
		}
		
	}
	System.out.println(Arrays.toString(newA));

}
}
