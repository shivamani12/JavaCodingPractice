package com.KS.String;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicatesInString97 {
public static void main(String[] args) {
	
	
	String str="sandeep";
	
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	char[] ch=str.toCharArray();	
	
	for(char c: ch) {
		if(!map.containsKey(c)) {
			map.put(c,1);
		}else {
			map.put(c, map.get(c)+1);
		}	
	}
	for(Map.Entry<Character,Integer> entry: map.entrySet()) {
		
		if (entry.getValue()>1) {
			System.out.println("Duplicates is-"+entry.getKey()+":"+entry.getValue());
		}
	}
	
}
}
