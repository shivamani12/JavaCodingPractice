package com.KS.String;

public class ReverseString {
public static void main(String[] args) {
	
	String str="Shivam";
	char[] ch=str.toCharArray();
	
	int left=0;
	int right=str.length()-1;
	
	while(left<right) {
		char temp=ch[left];
		ch[left]=ch[right];
		ch[right]=temp;
	left++;
	right--;
	}
	
	String s=new String(ch);
	System.out.println(s);
	
}
}