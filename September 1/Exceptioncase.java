package exceptionhandling;
import java.util.*;
class AddException extends Exception{
	AddException(String s){
		System.out.println(s);
		
	}
}
public class Exceptioncase {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number1;
int number2;
int result;
System.out.println("Enter number 1");
number1=sc.nextInt();
System.out.println("Enter the second number");
number2=sc.nextInt();

 result=number1+number2;
 
if(result<100) {
System.out.println("The sum is less than 100");	
System.out.println("the result is:"+result);
	}
else {
	try {
		
	
	throw new AddException("Exception");
	}
	catch(AddException a) {
		System.out.println("Exception caught in Catch block");
	}

}
}
}

