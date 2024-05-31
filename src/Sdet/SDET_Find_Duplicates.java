package Sdet;

public class SDET_Find_Duplicates {
public static void main(String[] args) {
	
	int arr[]={1,2,3,3,4,5,5,1};
	
	boolean flag=false;
	for(int i=0; i<arr.length; i++){
		for(int j=i+1; j<arr.length; j++) {
		if(arr[i]==arr[j]){
		System.out.println("found duplicates "+arr[i]);
		flag =true;
		}
		}
		}
	
	if(flag==false) {
		System.out.println("Duplicates not found");
	}
  	
}
}
