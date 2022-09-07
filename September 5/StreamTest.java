package sept05;
import java.util.stream.*;
import java.util.*;
public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*List<String> fruits=new ArrayList<>();
fruits.add("Apple");
fruits.add("Mango");
fruits.add("Banana");
fruits.add("Orange");
fruits.add("Chikku");
List<String>sorted=fruits.stream().sorted().collect(Collectors.toList());
System.out.println(sorted);
	
List<String>sort=fruits.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
System.out.println(sort);*/
		List<Integer> numbers = Arrays.asList(1,3,9,5,2);
		  
	    // collect method returns a set
	   // Set<Integer> squareSet =
	         numbers.stream()
	         .map(x->x*x)
	         .forEach(y-> System.out.println(y));
	        // numbers.stream().map(x->x*x).forEach(y->System.out.println(y));
	         int even =
	        	       numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	        	  
	        	    System.out.println(even);
	   
}
}
