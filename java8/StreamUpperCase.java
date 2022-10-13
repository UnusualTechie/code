//input "aa","bb","cc","dd"
import java.util.*;
import java.util.stream.*;
class StreamUpperCase{
	public static void main(String[] args){
		
		List<String> upperCaseList=Arrays.asList("aa","bb","cc","dd");
		List<String> convertedList=upperCaseList.stream().map(String::toUpperCase)
		.collect(Collectors.toList());
		System.out.println(convertedList);
		
	}
		

}