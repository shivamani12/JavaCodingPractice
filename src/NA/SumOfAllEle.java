package NA;

import java.util.*;

public class SumOfAllEle {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3,4,5,6);
		
		Optional <Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
		
		
	}
}
