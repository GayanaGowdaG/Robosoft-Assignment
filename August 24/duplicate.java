package robosoft;

import java.util.*;

public class duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		Set<Integer> un=new HashSet<>();
		Set<Integer> d=new HashSet<>();
		for(Integer i:array) {
			if(!un.add(i))
				d.add(i);
		}
		for(int i:d)
			
		{
			System.out.println(i);
		}
			
				
		}
}
