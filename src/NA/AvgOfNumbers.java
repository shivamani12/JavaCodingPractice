package NA;

import java.util.List;

public class AvgOfNumbers {
public static void main(String[] args) {
	
	
	List<Integer> list=List.of(1,2,3,4,5,6);
	
	double avg=list.stream().mapToInt(e->e).average().getAsDouble();
	System.out.println(avg);
	
	int su=list.stream().mapToInt(e->e).sum();
	System.out.println(su);
	
	
}
}
