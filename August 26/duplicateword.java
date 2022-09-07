package robosoft;

public class duplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="She sells sea shells in a sea shore";
		int count;
		char string[]=word.toCharArray();
		System.out.println("Duplicate character in the string:");
		
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&&string[i]!=' ') {
					count++;
					string[j]='0';
				}
				
			}
			if(count>1 && string[i]!='0') {
				System.out.println(string[i]);
				
			}
		}
	}

}
