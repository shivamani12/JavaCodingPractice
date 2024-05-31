package com.KS.String;

public class SortNamesStringArray {
public static void main(String[] args) {
	
	
	
	String fruits[]= {"Banana","Apple","Cheeku"};
	
//	for(int i=0; i<fruits.length; i++) {
//		for(int j=i+1; j<fruits.length; j++) {
//			
//			if(fruits[i].compareTo(fruits[j])>0) {
//				
//				String temp=fruits[i];
//				fruits[i]=fruits[j];
//				fruits[j]=temp;		
//			}
//		}
//	}
//	
//	for(String names:fruits) {
//		System.out.println(names);
//	}
	
	
	
	
	for(int i=0; i<fruits.length; i++) {
		for(int j=i+1; j<fruits.length; j++) {
			
			if(fruits[i].compareTo(fruits[j])>0) {
				
				String temp=fruits[i];
				fruits[i]=fruits[j];
				fruits[j]=temp;
				
			}
			
		}
	}
	
	for(String names:fruits) {
		System.out.println(names);
	}
	
	
}
}
