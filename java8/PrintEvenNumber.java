//10,20,15,8,7,30
import java.util.*;
import java.util.stream.*;
class PrintEvenNumber{
	public static void main(String []args){
		List<Integer> list=Arrays.asList(10,20,15,8,7,30);
		list.stream().filter(n->n%2!=0).forEach(System.out::println);
	}
	
}