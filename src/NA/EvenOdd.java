package NA;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
public static void main(String[] args) {
	
	List<Integer> list=List.of(1,2,3,4,5,6);
	
	List<Integer>evenlist=list.stream().filter(e-> e%2==0).collect(Collectors.toList());
	System.out.println(evenlist);
	
	List<Integer>Oddlist=list.stream().filter(e-> e%2==1).collect(Collectors.toList());
	System.out.println(Oddlist);
	
	
}
}
