package Coding;

import java.util.Arrays;
import java.util.Collections;

public class rough {		
public static void main(String[] args) {
	
	
	Integer num[]= {5,1,2,3,4,5};
	
	Arrays.sort(num);
	
	System.out.println(Arrays.toString(num));
	
	Arrays.sort(num,Collections.reverseOrder());
	System.out.println(Arrays.toString(num));
}
}
