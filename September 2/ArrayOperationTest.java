package sept02;
import java.util.Scanner;

import p1.*;
public class ArrayOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int array=sc.nextInt();
		 int[] arr = new int[array];
		 System.out.println("enter the array elements");
		 for(int i=0;i<array;i++) {
			arr[i]=sc.nextInt();
		 }
		 ArrayOperation operation=new ArrayOperation();
		int n= operation.minimum(arr);
		arr=operation.scaler(arr,2);
		System.out.println("the multiplied array is");
		for(int i=0;i<array;i++) {
			System.out.println(arr[i]);
		}
	}

}
