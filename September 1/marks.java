package exceptionhandling;
import java.util.*;
class Add extends Exception{
	Add(){
		
	}
	
}
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int internalmarks;
  int externalmarks;
  System.out.println("Enter the internal marks");
  internalmarks=sc.nextInt();
  
	  
	if(internalmarks>40) {
		try {
			throw new Add();
		}
		catch(Add a) {
			System.out.println("The internal Marks is exceed");
		}
		}
	System.out.println("Enter the external marks");
	  externalmarks=sc.nextInt();
	  
		  if(externalmarks>60) {
			try {
				throw new Add();
			
		}
			catch(Add a) {
				System.out.println("The External Marks is exceed");
			}
	}

}
}
