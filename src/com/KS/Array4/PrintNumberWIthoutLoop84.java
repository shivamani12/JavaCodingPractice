package com.KS.Array4;

public class PrintNumberWIthoutLoop84 {
public static void main(String[] args) {
	
	printN(5);
	
	
}

public static void printN(int n) {
	if(n<=10) {
	System.out.println(n++);
	printN(n);
	}
	
}

}
