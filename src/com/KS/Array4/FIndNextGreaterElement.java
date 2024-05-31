package com.KS.Array4;

public class FIndNextGreaterElement {
public static void main(String[] args) {
	
	int arr[]= {11,21,13,14};
	
	printNextGreater(arr);
	
	
}

private static void printNextGreater(int arr[]) {
	
	for(int i=0; i<arr.length; i++) {
		
		int next=-1;
		
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				next=arr[j];
				break;
			}
		}
		System.out.println(arr[i]+"- "+next);
	}
	
}

}
