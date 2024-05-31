package com.KS.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
public static char getFirstNonRepeatedChar(String str) {
		
			char[] ch=str.toCharArray();
			
			Map<Character, Integer> countMap=new LinkedHashMap<Character, Integer>();
			
			for(char c: ch){
				if(countMap.containsKey(c)){
					countMap.put(c,countMap.get(c)+1);
				}else {
					countMap.put(c,1);
				}
			}
			
				
			for(Entry<Character, Integer> entry: countMap.entrySet()) {
					if(entry.getValue()==1) {
						  return entry.getKey();
					}
			}
			throw new RuntimeException("Did not find any non repeated value");
			
}

public static void main(String[] args) {
	
// get first non repeated character	
		
	String str="aabbfgh";
	
	
	System.out.println(getFirstNonRepeatedChar(str));
	
}
}
