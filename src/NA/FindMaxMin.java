package NA;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxMin {
public static void main(String[] args) {
	
	
	List<Integer> list=List.of(1,3,10,20,15,12,22,44);
	
	//max
	int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(max);

	// min
	int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(min);
	
	
	
	
	
}
}
