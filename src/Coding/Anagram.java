package Coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String str="Race";
		String str2="Care";
		
		if(str.length()==str2.length()){
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		
		
		char[] charStr=str.toCharArray();
		char[] charStr2=str2.toCharArray();
				
		
		Arrays.sort(charStr);
		Arrays.sort(charStr2);
		
		boolean result= Arrays.equals(charStr, charStr2);
		
		if(result) {
			System.out.println("String is anagram");
		}else {
			System.out.println("it is not");
		}
		
		}else {
			System.out.println("length are not same not anagram");
		}
		
	}
}
