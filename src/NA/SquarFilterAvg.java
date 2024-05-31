package NA;

import java.util.List;

public class SquarFilterAvg {
public static void main(String[] args) {
	
	// 100, 400, 900, 1600
	// get element > 100
	// find average
	List<Integer> list=List.of(1,20,30,4,5,6);
	
	double result=list.stream()
			.map(e->e*e)
			.filter(e-> e>100)
			.mapToInt(e-> e)
			.average()
			.getAsDouble();
	
	System.out.println(result);
}
}
