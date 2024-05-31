package com.KS.String;

import java.util.HashMap;
import java.util.Map;

public class CleanJunk {
public static void main(String[] args) {
	
	
	 String str="aaabbbccc";
	 
	 	char ch[]=str.toCharArray();
	 	HashMap<Character,Integer> hm=new HashMap();
	
	 	for(char k:ch) {
	 		
	 	if(hm.containsKey(k)) {
	 		hm.put(k,hm.get(k)+1);
	 	}else {
	 		hm.put(k, 1);
	 	}
	 	}
	 	
	 	for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
	 		
	 		System.out.println(entry.getKey()+""+entry.getValue());
	 		
	 	}
	 	
}
}
