package com.KS.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class checkElementPresentInTwoArray73 {
public static void main(String[] args) {
	
	Integer a[]= {1,2,3,9,8,7};
	Integer b[]= {4,1,2,10,15};
	Integer c[]= {5,1,2,4,10};
	
	HashSet <Integer>hs =new HashSet<Integer>();
	
	List<Integer> l1=Arrays.asList(a);
	List<Integer> l2=Arrays.asList(b);
	List<Integer> l3=Arrays.asList(c);
	
	hs.addAll(l1);
	hs.addAll(l2);
	hs.addAll(l3);
	
	List<Integer> finalList=new ArrayList<Integer>();
	
	for(Integer number: hs) {
		
		if(l1.contains(number) && l2.contains(number) || 
									l2.contains(number) && l3.contains(number) || 
									 (l3.contains(number) && l1.contains(number))) 
									{
								finalList.add(number);
									}
	}
	
		System.out.println(finalList);
	
}
}
