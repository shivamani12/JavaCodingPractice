package com.KS.Array4;

import java.util.Arrays;

public class TwoSumProblem {
public static void main(String[] args) {
	
	
	int arr[]= {10,20,30,40,50};
	int Sum=50;
		
	
		
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]+arr[j]==Sum) {
				System.out.println(Arrays.toString(new int[] {i,j}));
			}
		}
}

}


}		
		
		
		
		
		
		
		