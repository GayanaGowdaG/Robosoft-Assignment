package robosoft;
import java.util.*;
abstract class Figure{
	abstract void area();
	int dimension1;
	int dimension2;
}
class Rectangl extends Figure{
	Rectangl(int dim1,int dim2){
	dimension1=dim1;
	dimension2=dim2;
	}	
	void area() {
		System.out.println("area of the rectangle "+dimension1*dimension2);
	}
}
	class Triangle extends Figure{
		Triangle(int dim1,int dim2){
			dimension1=dim1;
			dimension2=dim2;
		}
	
	void area() {
		
	System.out.println("Area of Triangle "+0.5*dimension1*dimension2);
	
	}
}
	class Square extends Figure{
		Square(int dim1){
			dimension1=dim1;
		}
			
		void area() {
	System.out.println("Area of Square "+dimension1*dimension1);
		}
	}
public class ag29 {
	public static void main(String args[]) {
		Rectangl a=new Rectangl(4,5);
		a.area();
		Triangle b=new Triangle(4,8);
		b.area();
		Square c=new Square(4);
		c.area();
		
	}

}
