package robosoft;
import java.util.*;
public class findduplicateword {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String s="The company is in Udupi and the company is good";
s=s.toLowerCase();
String words[]=s.split(" ");
System.out.println("dupliacte strings are");
{
	for(int i=0;i<words.length;i++) {
		int count=1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i]==words[j]) {
				count++;
				//words[j]="0"
					
		
	}
	
		}
		
	}
}

	
}

}
