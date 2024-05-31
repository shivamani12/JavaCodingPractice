package com.KS.String;

public class countTheCharactersFromSentence {
	static void count(String str) {
		
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			String s="";			
			while(i<ch.length && ch[i]!=' ') { // when this found space it will break it will break after hello
				
				s=s+ch[i];
				i++;				
			}
		if(s.length()>0){
			System.out.println(s+"->"+s.length());
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		String str= "Hello world";
		
		count(str);
		
	}
	
	
}
