package com.KS.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 12, 2, 45, 3 };
		
		System.out.println(findInterSection(a,b));
	}
	
	public static List<Integer> findInterSection(int a[],int b[]) {
		
		List<Integer> intersection=new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				
					if(a[i]==b[j]) {
						intersection.add(a[i]);
						break;
					}
			}
			
		}
	
		
		return intersection;
	}
	
}
