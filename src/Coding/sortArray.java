package Coding;

public class sortArray {
public static void main(String[] args) {
	
	
	
	int arr[]= {22,4,5,2,6,9,10};
	
	for(int i=0; i<=arr.length-1; i++) {
		for(int j=0; j<arr.length-1; j++) {
			
			if(arr[j]>arr[j+1]){
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;		
			}
		}	
	}
	for(int element :arr) {
		System.out.println(element);
	}
	
	
}
}
