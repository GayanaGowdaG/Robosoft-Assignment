package exceptionhandling;
import java.util.*;
class Adding extends Exception{
	Adding(){
	System.out.println();	
	}
}

public class Handling {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int internalmarks;
	int externalmarks;
System.out.println("Enter the internal marks");
  internalmarks=sc.nextInt();
  
		try {
			if(internalmarks>40){
			throw new Add();
			
		}
		}
		catch(Add a) {
			System.out.println("The internal Marks is exceed");
		}
		
	System.out.println("Enter the external marks");
	  externalmarks=sc.nextInt();
	  
		 
			try {
				 if(externalmarks>60) {
				throw new Add();
			
		}
			}
			catch(Add a) {
				System.out.println("The External Marks is exceed");
			}

}
}