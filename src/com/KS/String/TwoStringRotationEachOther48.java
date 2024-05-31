package com.KS.String;

public class TwoStringRotationEachOther48 {
public static void main(String[] args) {
	
	String str="abcd";
	System.out.println(isRotated(str,"dabc"));
	
}

public static boolean isRotated(String str, String Rotated) {
	
		if(str==null || Rotated==null) {
			return false;
		}else if(str.length()!=Rotated.length()){
				return false;
			}else {
				String Concatenated= str+str;
				return Concatenated.contains(Rotated);
			}
		
}

}
