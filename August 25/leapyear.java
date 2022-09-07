package robosoft;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2035;
if(((a%4==0)&&(a%100!=0))||(a%400==0)){
	System.out.println("The year is leap year");
}
else {
	System.out.print("The year is not a leap year");
}
}
	}

