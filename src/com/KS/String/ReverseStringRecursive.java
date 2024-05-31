package com.KS.String;

public class ReverseStringRecursive {
public static void main(String[] args) {

	String str="Shivam";
	System.out.println(reverseString(str));
	System.out.println(str.substring(1));
//	System.out.println(str.charAt(0));
}

public static String reverseString(String str){
    if (str.isEmpty())
		return str;
	else{
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}}



