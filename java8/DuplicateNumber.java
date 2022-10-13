//input 10,15,5,10,98,5,98,32,15

import java.util.*;
import java.util.stream.*;
class DuplicateNumber{
	public static void main(String []args){
		
		List<Integer> list= Arrays.asList(10,15,5,10,98,5,98,32,15);
		Set<Integer> set= new HashSet();
		
		list.stream().filter(e->!set.add(e))
		.forEach(System.out::println);
	
		
		
	}
	
}