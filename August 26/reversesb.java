package robosoft;
import java.util.*;
public class reversesb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
{
	StringBuilder rev=new StringBuilder("Robosoft");
	for(int i=0;i<rev.length()/2;i++) {
		int front=i;
		int back=rev.length()-i-1;
		
		char frontchar=rev.charAt(front);
		char backchar=rev.charAt(back);
		
		rev.setCharAt(front,backchar);
		rev.setCharAt(back,frontchar);
		
		
		
		
	}
	System.out.println(rev);
}
	}

}
