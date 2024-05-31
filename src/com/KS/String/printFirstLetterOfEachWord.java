package com.KS.String;


public class printFirstLetterOfEachWord {
public static void main(String[] args) {
	
	
	String str="Learn With Krishna Sandeep";
	splitWords(str);
	
	  
}

private static void splitWords(String str) {
	String Words[]=str.split(" ");
	for(int i=0; i < Words.length; i++) {
		String s=Words[i];
		System.out.println(s.charAt(0));
	}
}

}
