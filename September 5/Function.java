package sept05;
import java.util.function.Predicate;
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Predicate<Integer> number = (x) -> x%2==0;
		        if(number.test(3)) {
		            System.out.println("even");
		        }
		        else
		        {

		            System.out.println("odd");
		        }
		    }
		}
	


