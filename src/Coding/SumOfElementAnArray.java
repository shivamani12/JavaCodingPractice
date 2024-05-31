package Coding;


// sum of all elements in an integer array

public class SumOfElementAnArray {
public static void main(String[] args) {
	
	
	int a[]= {1,5,10,20,10};
	
	int sum=0;
	
	for(int i=0; i<=a.length-1; i++) {
		sum= sum+a[i]; 
		}		
	System.out.println(sum);
			
}
}
