//input 10,15,5,6,90,87,15
import java.util.*;
import java.util.stream.*;
class MaxStreamTest{
	public static void main(String []args){
		List<Integer> list=Arrays.asList(10,15,5,6,90,87,15);
		int max=list.stream().min(Integer::compare).get();
		System.out.println(max);
		
	}
}