package Coding;

public class PyramidOfCharacter {
public static void main(String[] args) {
	
	
	for(int i=1; i<=5; i++) {
		for(int k=1; k<=5-i; k++) {  // print space
		System.out.print(" ");
	}
	for(int j=1; j<=2*i-1; j++) {  // print character *
		System.out.print("@");
	}
	System.out.println();   // print new line 
	}
	
	
	
}
}



