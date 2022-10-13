//String string = "Item1 10 Item2 25 Item3 30 Item4 45";
import java.util.*;
import java.util.stream.*;
class SumOfString{
	public static void main(String []args){
			String string = "Item1 10 Item2 25 Item3 30 Item4 45";
			
			Integer sum=Arrays.stream(string.split(" "))
			.filter(s->s.matches("\\d+"))
			.mapToInt(Integer::valueOf)
			.sum();
			System.out.println("Sum: "+sum);
	}
}