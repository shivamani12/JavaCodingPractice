package com.KS.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {
public static void main(String[] args) {
	
	
	// aaabbbccc a3b3c3
	
	String str="aaabbbccc";
	
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	char c[]=str.toCharArray();
	
	for(char k:c) {
		if (map.containsKey(k)){
			map.put(k,map.get(k)+1);
		}else {
			map.put(k,1);
		}
	}
		
	StringBuilder sb=new StringBuilder();
	for(Entry<Character, Integer> entry:map.entrySet()) {
		sb.append(entry.getKey());
		sb.append(entry.getValue());
	}
	System.out.println(sb.toString());
}
}
