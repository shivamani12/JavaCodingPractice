package com.KS.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraysToArrayList {
public static void main(String[] args) {
	
	
	Integer[] arr={1,2,3,4};
	
//	List l=Arrays.asList(arr);
//	System.out.println(l);
	
	List<Integer> l1=new ArrayList<>();
	Collections.addAll(l1, arr);
	System.out.println(l1);
	
	for(int e: arr) {
		l1.add(e);
	}
	System.out.println(l1);
	
}
}
