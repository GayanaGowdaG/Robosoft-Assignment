package robosoft;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for( int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j]) {

				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
		}
		System.out.println("The sorted array is");
		for(int i=0;i<n;i++)
			System.out.println( array[i]);
	}
	 
	
}
