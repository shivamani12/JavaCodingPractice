package Coding;

public class MissingNumberArray {
public static void main(String[] args) {
	
	
	int arr[]= {1,2,3,4,6};
	
	int sum1=0;
	int sum2=0;
	
	for(int i=0; i<=arr.length-1; i++) {
		
		sum1=sum1+arr[i];
		
	}
	
	int n=arr.length+1;
	int exsum=n*(n+1)/2;
	
	
	
	System.out.println(exsum-sum1+"=\sis missing number" );
	
}
}
