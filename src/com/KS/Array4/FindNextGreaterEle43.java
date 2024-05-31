package com.KS.Array4;

public class FindNextGreaterEle43 {
public static void main(String[] args) {
	
	
	int a[]= {11,21,13,14};
	
	for(int i=0; i<a.length; i++) {
			int next=-1;
			
		for(int j=i+1; j<a.length; j++) {
			if(a[j]>a[i]) {
				next=a[j];
				break;
			}	
		}
		System.out.println(a[i]+"- "+next);
	}
	
	
}
}
