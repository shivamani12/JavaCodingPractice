package NA;

import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {
public static void main(String[] args) {
	
// print numbers starts with prefix 2	
	
	List<Integer> list=List.of(2,222,234,567,235,243,546,3,4,5,6);
	
	List<Integer> result=list.stream()
				.map(e-> String.valueOf(e))
				.filter(e-> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
	System.out.println(result);
	
}
}
