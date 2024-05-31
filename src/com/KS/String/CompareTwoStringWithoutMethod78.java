package com.KS.String;

public class CompareTwoStringWithoutMethod78 {
public static void main(String[] args) {
	
	String str="Shivam";
	String str2="Shivam";
	boolean flag=false;
	
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)!=str2.charAt(i)) {
			flag=false;
			break;
		}else {
			flag=true;
		}
	}
	if(flag){
		System.out.println("both are same");
	}else {
		System.out.println("not");
	}

	// with method
	boolean r=str.equals(str2);
	System.out.println(r);
	

}
}
