//20,8,15,6,49,10,12
import java.util.*;
import java.util.stream.*;
class StartWith1{
	public static void main(String []args){
		List<Integer> list=Arrays.asList(20,8,15,6,49,10,12);
		
		list.stream().map(e->e+"")
		.filter(e->e.startsWith("1"))
		.forEach(System.out::println);
	}
}
