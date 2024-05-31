package Coding;

public class BinarySearch {
	public static int binarySearch(int arr[],int target){
		
		int low=0;
		int high=arr.length-1;
		
		while (low<=high) {
			
			int mid= high+low/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			// if the target is greater then mid element so search the right half
			else if(arr[mid]<target) {
				
				low=mid+1;
				
			}
			
			// if the target is smaller then the mid element so search the left half
			else {
				high=mid-1;
				
			}
		}
		
		// if the target not found return -1
		return -1;
	}
	
public static void main(String[] args) {
	
	int arr[]= {2,4,6,8,11,12,13,98,105,230,240};
	
	int target=230;
	
	
		int result=binarySearch(arr,target);
	
		if(result != -1) {
			System.out.println("element found at index= "+ result);
		}else {
			System.out.println("element not found in the array");
		}
	
}
}
