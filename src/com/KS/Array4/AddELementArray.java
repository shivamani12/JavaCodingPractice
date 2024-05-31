package com.KS.Array4;

import java.util.Arrays;

public class AddELementArray {
public static void main(String[] args) {
	
	int[] arr=new int[5];
	
	for(int i=0; i<5; i++) {
		arr[i]=i;
	}
	
	int sum =0;
	for(int i: arr) {
		sum=sum+i;
	}
	System.out.println(sum);
}

}
