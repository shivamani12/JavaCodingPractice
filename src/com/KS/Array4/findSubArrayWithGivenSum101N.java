package com.KS.Array4;

import java.util.Arrays;

public class findSubArrayWithGivenSum101N {
public static void main(String[] args) {
	
	
	
	int arr[] = { 10 , 12 , 2 , 4, 13 , 19 ,52};
	
	int sum=18;
	int s=0;
	
	for(int i=0; i<arr.length; i++) {
		
			for(int j=i+1; j<arr.length; j++) {
				
				s=arr[i]+arr[j];
				
				arr[i]=s;
				System.out.println(arr[i]);
				if(s==sum) {
					int newA[]= {i,j};
					System.out.println(Arrays.toString(newA));
					
				}}
	
	}
	
	
}}

