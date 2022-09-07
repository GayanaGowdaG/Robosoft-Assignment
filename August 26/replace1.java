package robosoft;

public class replace1 {
	public static void main(String Args[]) {
		StringBuilder str= new StringBuilder("Tony Stark");
		System.out.println("String = "+ str.toString());
		StringBuilder strReturn = str.replace(4,5, " is not ");
		System.out.println("After Replace= " + strReturn.toString());
}


	}

