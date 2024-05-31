package com.KS.Array4;

import java.util.Arrays;

public class DeleteELementFromAnArray {
public static void main(String[] args) {
	
	
	
	int []arr= {1,2,3,4,5};
	int target=3;
	
	int b[]=removeElement(arr,target);
	
	System.out.println(Arrays.toString(b));
	
	
	//using java 8
	
//	Arrays.stream(arr).filter(e->e!=target).forEach(System.out::println);
//    int[] newArr=Arrays.stream(arr).filter(n->n!=target).toArray();
//	System.out.println(Arrays.toString(newArr));  */
}

public static int[] removeElement(int []arr, int target) {
		
		int newArr[]=new int[arr.length-1];		
		int index=0;
		for(int i=0; i<arr.length; i++) {	
			if(arr[i]!=target) {
				newArr[index++]=arr[i];
			}
		}
		return newArr;
}}
