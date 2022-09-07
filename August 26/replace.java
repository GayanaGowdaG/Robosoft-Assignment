package robosoft;
import java.util.*;
public class replace {
public static void main(String Args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string 1");
	StringBuilder s1=new StringBuilder(sc.next());
	
	System.out.println("Enter the string 2");
	StringBuilder s2=new StringBuilder(sc.next());
	
	StringBuilder mergestr=new StringBuilder();
	for(int i=0;i<s1.length();i++) {
		if(Character.isUpperCase(s1.charAt(i))) {
			mergestr.append(s1.charAt(i));
			
		}
	}
		for(int j=0;j<s2.length();j++) {
			if(Character.isUpperCase(s2.charAt(j))) {
				mergestr.append(s2.charAt(j));
		}
		}
	 System.out.println(mergestr);
		
}
}

