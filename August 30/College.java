package robosoft;
import java.util.*;
class Student{
	String studentname;
	int rollnumber; 
	Student(){
		
	}
Student (String studentname,int rollnumber) {
	this.studentname=studentname;
	this.rollnumber=rollnumber;
}
void show() {
	System.out.println("The student name "+studentname);
	System.out.println("roll number "+rollnumber);
}
}
class Test extends Student{
	int mark1;
	int mark2;
	int mark3;
	
Test(String studentname,int rollnumber,int mark1,int mark2,int mark3){
	super(studentname, rollnumber);
	this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
}
void show_marks() {
	System.out.println("First mark "+mark1);
	System.out.println("Second mark "+mark2);
	System.out.println("Third mark "+mark3);
}

}
interface Sports{
	int sportsmarks=6;
	static void show_sportswt() {
		System.out.println("The sports marks"+sportsmarks);
	}
}
class Result extends Test implements Sports{
	Result(String studentname,int rollnumber,int mark1,int mark2,int mark3) {
		super( studentname, rollnumber, mark1,mark2, mark3);
		
			
		}
	void result() {
		double average=(mark1+mark2+mark3)/3;
		double total=average+sportsmarks;
		System.out.println("Total marks"+total);
	}
}

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name;
int rollnumber;
int mark1;
int mark2;
int mark3;
System.out.println("Enter the name of the student");
name=sc.next();
System.out.println("Enter roll number:");
rollnumber=sc.nextInt();
System.out.println("enter mark 1:");
mark1=sc.nextInt();
System.out.println("enter mark 2:");
mark2=sc.nextInt();
System.out.println("enter mark 3:");
mark3=sc.nextInt();
Result result=new Result(name,rollnumber,mark1,mark2,mark3);
result.show();
result.show_marks();
result.result();


	}

}
