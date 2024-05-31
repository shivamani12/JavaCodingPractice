package com.KS.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sortHashMapKeys88 {
public static void main(String[] args) {
	
	
	Map<String,String> unsortedMap=new HashMap<String, String>();
	
	unsortedMap.put("apple", "apple");
	unsortedMap.put("banana", "banana");
	unsortedMap.put("c", "c");	
	unsortedMap.put("d", "d");
	
	for(Map.Entry<String, String>entry: unsortedMap.entrySet()) {
		System.out.println("Unsorted="+entry.getKey());
	}
	TreeMap<String,String> tm=new TreeMap<String, String>(unsortedMap);
	
	for(Map.Entry<String, String> entry: tm.entrySet()) {
		System.out.println(entry.getKey());
	}
	

}
}
