package com.KS.String;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class splitString {
public static void main(String[] args) {
	
	
	String str="012-2 51515";
	
	//aprroach one with split method it will return array
	String[] s=str.split("-");
	
	
	// another approach Pattern class it will return List
	List<String> list=Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
	
	
	for(String sr:list) {
		System.out.println(sr);
	}
}
}
