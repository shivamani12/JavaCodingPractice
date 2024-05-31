package com.KS.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {

	public static void main(String[] args) {
		

		String str="Shivam Tomar";
		frequency(str);
	}
	
	static void frequency(String str) {
		str=str.replaceAll(" ", "");
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		//convert the string to array
		char[] strArr=str.toCharArray();
		
		// if the char present in map
		for(char k: strArr) {
			
			if(map.containsKey(k)) {
				map.put(k, map.get(k)+1);
			}else {
				map.put(k, 1);
			}
			
		}
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		
		
	}
	
}
