//input 10,15,5,6,90,87,15
import java.util.*;
import java.util.stream.*;
class TotalNumber{
	
	public static void main(String []args){
		List<Integer> list=Arrays.asList(10,15,5,6,90,87,15);
		
		Long count=list.stream().filter(e->e%2==0).count();
		System.out.println(count);
		
	}
}