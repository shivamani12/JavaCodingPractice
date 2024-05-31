package com.KS.Array4;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestSmallestInArray86 {
public static void main(String[] args) {
	
	int arr[]=new int[] {1,100,58,20,30};
	
	int largest=Integer.MIN_VALUE; // minimum se badi honi chahiye koi 
	
	int minimum=Integer.MAX_VALUE;
	
	for(int num:arr) {
		if(num>largest) {
			largest=num;
		}
		if(num<minimum) {
			minimum=num;
		}
	}
	
	Integer a= Arrays.stream(arr).boxed().mapToInt(e->e).min().getAsInt();
	Integer b= Arrays.stream(arr).boxed().mapToInt(e->e).max().getAsInt();
	System.out.println(a);
	System.out.println(b);
	System.out.println("Largest"+largest);
	System.out.println("minimum"+minimum);
}
}
