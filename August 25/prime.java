package robosoft;
import java.util.*;
public class prime {
	public static void main(String args[]) {
		int a,b, flag=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be checked");
		b = sc.nextInt();
		a=b/2;
		for(i=2;i<=a;i++) {
			if(b%2==0) {
				System.out.print("the number is not prime");
				flag=0;
				break;
			}
				
			}
		if(flag==1)
			System.out.print("the number is prime");
			
		}
			
	}


