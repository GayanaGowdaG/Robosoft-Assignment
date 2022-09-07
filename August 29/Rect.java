package robosoft;
import java.util.*;
class Rectangle
{
	double width;
	double height;
	
public Rectangle(double width,double height){
	this.width=width;
	this.height=height;
	}

double getArea()
{
	double area=width*height;
	return area;
}
void minarea()
{
	
}
}
public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number of Rectangle instances");
int n=sc.nextInt();
Rectangle[] r=new Rectangle[n];
for(int i=0;i<n;i++) {
	System.out.println("Enter the width and height");
	double width=sc.nextDouble();
	double height=sc.nextDouble();
	r[i]=new Rectangle(width,height);
	
}
double max=0;
double min=r[0].getArea();
Rectangle maxref=null,minref=r[0];

for(int i=0;i<n;i++) {
	if(r[i].getArea()>max) {
		max=r[i].getArea();
		maxref=r[i];
	
	}
	if(r[i].getArea()<min) {
		min=r[i].getArea();
		minref=r[i];
		
		
	}
	
}
System.out.println(" Max height is "+maxref.height+" Max width is "+maxref.width);
System.out.println(" Min height is "+minref.height+" Min width is "+minref.width);
	}

}
