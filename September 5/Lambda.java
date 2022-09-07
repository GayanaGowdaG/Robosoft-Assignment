package sept05;
import java.util.Scanner;
interface Drawable{
	void draw() ;
} 
	public class Lambda{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	 int a;
	;
	 System.out.println("Enter value of a");
	 a=sc.nextInt();
	 

	Drawable d;
	 d=new Drawable() {
  public void draw(){ 
	// Drawable d=()->{
	System.out.println("width is " +a);
   }
	 };
	 d.draw();
	 }
	}
	                                              
	