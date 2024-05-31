package Sdet;

public class FindTheMax {
public static void main(String[] args) {
	
	
	int arr[]= {11,2,33,44,5};
	
	int max=arr[0];
	
	for(int i=0; i<=arr.length-1; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	System.out.println(max);
}
}

