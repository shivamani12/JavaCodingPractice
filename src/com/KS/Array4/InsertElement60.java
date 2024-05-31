package com.KS.Array4;

import java.util.Arrays;

public class InsertElement60 {
public static void main(String[] args) {
	
	// insert element in an array at specific position
	
	int a[]= {10,20,40,50};
	
	
	int position=2;
	int element=100;
	
	int newA[]=new int[a.length+1];
	int index=0;
	
	for(int i=0; i<a.length; i++) {
		newA[index++]=a[i];
	}
	
	for(int i=newA.length-1; i>position; i--) {
		newA[i]=newA[i-1];
	}
	newA[position]=element;
	
	System.out.println(Arrays.toString(newA));
	
	
	
	
	
	
	
	
	
	
	
}
}
