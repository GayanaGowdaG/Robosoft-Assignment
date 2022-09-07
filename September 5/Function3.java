package sept05;
import java.util.Date;
import java.util.function.Supplier;
public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<Date> date=()->new Date();
{
System.out.println("date is:"+date.get());
	}

}
}