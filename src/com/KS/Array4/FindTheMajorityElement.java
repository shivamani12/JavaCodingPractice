package com.KS.Array4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElement {
public static void main(String[] args) {
	
	
	String []fruits= {"banana","apple","chiki"};
	
	
	for(int i=0; i<fruits.length; i++) {
		
		for(int j=i+1; j<fruits.length; j++) {
			
			if(fruits[i].compareTo(fruits[j])>0) {
				
				String temp=fruits[i];
				fruits[i]=fruits[j];
				fruits[j]=temp;
				
			}
			
		}
		
	}
	for(String e: fruits) {
		System.out.println(e);
	}
	System.out.println(fruits[0].compareTo(fruits[1]));
	
		
	
}
}
