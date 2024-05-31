package com.KS.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapElementsList {
public static void main(String[] args) {
	
	
	List<Integer> l1=new ArrayList();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	
	Collections.swap(l1, 2,3);  // 2,3 is index so no. will be swap- 4,3
	
	System.out.println(l1);
}
}
