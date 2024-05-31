package com.KS.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicationStr {
	public static void main(String[] args) {

		String str = "Shivaam";

		removeDup(str);
		System.out.println(removeDup(str));

	}

	public static String removeDup(String str) {

		Set<Character> charSet = new HashSet();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!charSet.contains(c)) {
				charSet.add(c);
				sb.append(c);
			}
		}

		return sb.toString();

	}

}
