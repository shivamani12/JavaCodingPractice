package com.KS.Array4;

import java.util.Arrays;

public class RotateArrayByTwoPosition {
public static void main(String[] args) {
	
	
	
		int arr[]= {1,2,3,4};
		int tgt=2;
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}		
			}
		
					for(int i=0; i<1; i++){
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
				}
			
					for(int i=2; i<3; i++){
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
				}

			
			System.out.println(Arrays.toString(arr));
			
		
			
	
	
	
}
}
