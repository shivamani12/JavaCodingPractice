package Coding;

// check two array contain same element 

public class checkTwoArray {
public static void main(String[] args) {
	
	
	int []a= {1,2,4,8,5};
	int []b= {555,8,84,58,55};
	
	boolean flag=false;
	
	for(int i=0; i<=a.length-1; i++) {
		if(a[i]==b[i]) {
			flag=true;
		}
	}
	
	if(flag) {
		System.out.println("contain same");
	}else {
		System.out.println("not containing the same");
	}
}}