package com.KS.String;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates91 {
public static void main(String[] args) {
	
	
	String dupE[]=new String[] {"Java","Python","Java"};
	
	Set<String> nondup=new HashSet<String>();
	
	for(String e : dupE) {
		
			if(nondup.contains(e)) {
				System.out.println(e);
			}else {
				nondup.add(e);
			}
		
	}
	
	
}
}
