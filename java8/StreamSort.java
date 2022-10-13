//input 10,15,5,6,90,87,15
import java.util.*;
import java.util.stream.*;
class StreamSort{
	public static void main(String []args){
		List<Integer> list=Arrays.asList(10,15,5,6,90,87,15);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}