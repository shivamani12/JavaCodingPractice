package Sdet;

import java.util.Arrays;

public class SdetBinarySearh {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,3};  // should be sort
		int key=3;
		Arrays.sort(arr);
		
		boolean flag=false;
		int low=0;
		int high=arr.length-1;		
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(key==arr[mid]) {
				System.out.println("Element found");
				flag=true;
				break;
				
			} else if(key<arr[mid]){
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		if(flag!=true) {
			System.out.println("Element not found");
		}
		
	}
}
