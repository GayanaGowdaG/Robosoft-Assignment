package robosoft;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10; 
		int b=20;
	 System.out.println("before swap");
	 System.out.println("a="+a);
	 System.out.println("b="+b);
 
	int temp=a;
	a=b;
	b=temp;
	
	 System.out.println("after swap");
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 
}

}
