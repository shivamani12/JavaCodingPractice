package com.KS.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyInDesc {
public static void main(String[] args) {
	
	
	String str="banana";
	
	
	frequencyDesc(str);
}
	
public static void frequencyDesc(String str) {
	
		HashMap<Character,Integer> cmap=new HashMap<Character, Integer>();
			
		char ch[]=str.toCharArray();
		
		// put the values
		for(char key: ch) {
			//if key has already value there
			if(cmap.containsKey(key)) {
				cmap.put(key, cmap.get(key)+1); 
			}else { // if not put key with value 1
				cmap.put(key,1);
			}
		}
		// convert the map into list
		List<Map.Entry<Character, Integer>>list=new ArrayList(cmap.entrySet());		
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>(){
				public int compare(Map.Entry<Character, Integer> o1,Map.Entry<Character, Integer> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
		});
		// create a hashmap to reserve the order
		
		LinkedHashMap<Character,Integer> sortedMap=new LinkedHashMap<Character, Integer>();	
			
		for(Map.Entry<Character, Integer> entry:list) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	
	
}
	
}
