package com.KS.String;

import java.util.Arrays;
import java.util.Collections;

public class sortElements86 {
public static void main(String[] args) {
	
	
	String []str= {"a","b","c","d"};
	
	// desc
	Arrays.sort(str,Collections.reverseOrder());
	
	System.out.println(Arrays.toString(str));
	
	// asc
	Arrays.sort(str);
	System.err.println(Arrays.toString(str));
	
}
}
