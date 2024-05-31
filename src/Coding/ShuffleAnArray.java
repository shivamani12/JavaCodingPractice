package Coding;

import java.util.Random;

public class ShuffleAnArray {
public static void main(String[] args) {
	
	
	int [] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
		Random rand=new Random();
		
		for(int i=arr.length-1; i>0; i--) {
			
			int j = rand.nextInt(i+1);
			
			// Swap elements at indices i and j
			
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
			
		}
	
		for(int num: arr) {
			System.out.println(num);
		}
	
}
}
