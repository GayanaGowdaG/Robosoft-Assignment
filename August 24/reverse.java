package robosoft;
import java.util.*;
public class reverse{

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
		
		int a=n;
		for(int i=0;i<a;i++)
		{
			int temp=array[i];
			array[i]=array[a-1];
			array[a-1]=temp;
			a--;
			
		}
		for( int i=0;i<n;i++)
			System.out.println(array[i]);
	}
}
		
		