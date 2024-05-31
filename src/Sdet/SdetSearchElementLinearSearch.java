package Sdet;

public class SdetSearchElementLinearSearch {
public static void main(String[] args) {
	
	
	int arr[]= {1,2,3,4,5,6};
	int target=55;
	int foundAt=searchEle(arr,target);
	System.out.println(foundAt);
}

public static int searchEle(int arr[], int tgt) {
		boolean flag=false;
		int foundElement=0;
		for(int i=0; i<=arr.length; i++) {
			
			if(tgt==arr[i]) {
				foundElement=i;
				flag=true;
				break;
			}else {
				return -1;
			}
			
		}
	 return foundElement;
}

}
