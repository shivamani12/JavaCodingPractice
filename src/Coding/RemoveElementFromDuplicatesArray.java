package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveElementFromDuplicatesArray {
public static void main(String[] args) {
	
	
	
	int arr[]= {8,1,2,4,4,5,1,9};
	
	
	// convert the array to set
	// to preserve the order of elements	
	Set<Integer> set=new LinkedHashSet<>();
	
	for(int num: arr) {
		set.add(num);
//		System.out.println(set);
	}
	
	int[] resultArray=new int[set.size()];
	
//	System.out.println(set.size());
	
	int index=0;
	
	for(int num: set) {
		resultArray[index++]=num;
	}
	System.out.println(Arrays.toString(resultArray));
	
	
	List <Integer> list=new ArrayList();
	for(int num:set) {
		list.add(num);
	}
	System.out.println(list);
	 	 	
	
	
}
}
