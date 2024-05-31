package com.KS.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class checkDuplicatesOrNot92 {
public static void main(String[] args) {
	
	
	String []dup=new String[] {"java","oracle","java","python"};
	
//	List<String> list=new ArrayList(dup);  // you can not do like that
	
	// convert  into list
	List<String> list=Arrays.asList(dup);
	
	
	// convert list into set
	Set<String> hs=new HashSet<String>(list);
	
	if(list.size()!=hs.size()) {
		System.out.println("contains duplicates");
	}else {
		System.out.println("not contains");
	}
}
}
