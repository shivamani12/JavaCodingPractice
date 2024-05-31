package Coding;


import java.util.List;

// check if a list contains only odd numbers

public class ListCheckContainOdd {
public static void main(String[] args) {
	
	
	List<Integer> al =List.of(1,2,3,4,5,6,7,8,9,10);
	
		
		for(int i=0; i<=al.size()-1; i++ ) {
			
			if(al.get(i)%2==0) {
				
				continue;
			}else {
				System.out.println("list does not contain only odd numbers"+al.get(i)+"==it is odd Numbers ");
			}
			
		}
		
}
}
