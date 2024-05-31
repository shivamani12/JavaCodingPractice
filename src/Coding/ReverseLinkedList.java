package Coding;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {
public static void main(String[] args) {
	
	
	List<Integer> ll=new LinkedList<>();
	
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	
	 		
			ListIterator<Integer> itr=ll.listIterator(ll.size());  // we pass end of the index by size
			
			while(itr.hasPrevious()) {
				
				Integer e=itr.previous();
				System.out.println(e);
			}
	
}
}
