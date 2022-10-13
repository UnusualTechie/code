import java.util.*;
import java.util.stream.*;
class SumOfListOfList{
	public static void main(String []args){
		
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
  //{5, 7, 11,13,1, 3, 5,2, 4, 6, 8)
        List<List<Integer>> listOfListofInts = 
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
				
				Integer sum=listOfListofInts.stream().flatMap(s->s.stream()).collect(Collectors.summingInt(Integer::intValue));
				
				System.out.println("Sum:"+sum);
		
	}
		
	
}
	
	