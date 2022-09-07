package robosoft;
import java.util.*;
public class arrayofobjects {
	public static void main(String args[]) {
	Students college[]=new Students[3];
	college[0]=new Students(2,"gayana");
	college[1]=new Students(3,"aakash");
	college[2]=new Students(4,"vinu");
	college[0].display();
	college[1].display();
	college[2].display();
	}

}
class Students{
	
	int id;
	String name;
		

	Students(int id,String name)
	{
	this.id=id;
	this.name=name;
	}
	void display() {
		System.out.println("student id\t"+id+"\tstudent name\t"+name);
	}
}