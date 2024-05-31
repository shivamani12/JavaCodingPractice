package NA;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {
public static void main(String[] args) {
	
	List<Integer> list=List.of(1,3,10,20,30,3,43,4,43,5,76,5,3,3);
	
	Set<Integer> set=list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
	System.out.println(set);
	
//	Collections.frequency(list,e)>1 => list-> which i perform operation on that 
//										e-> each Element
//										>1=> element occurs more then 1 then collect
//										>2 => element occures more then 2 then collect
	
	
}
}
