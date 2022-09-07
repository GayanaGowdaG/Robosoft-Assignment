package robosoft;

import java.util.Arrays;
import java.util.Scanner;

public class second {
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
		Arrays.sort(array);
		System.out.println(array[n-2]);
}
}
