package p1;
import java.util.*;

public class ArrayOperation {
	
	public int minimum(int[] array) {
		
			
		 Arrays.sort(array);
			int min=array[0];
		return min;
	}
	public int[] scaler(int[] array,int n) {
		for(int i=0;i<array.length;i++) {
		array[i]=array[i]*n;
		
		}
		return array;
	}
}
	