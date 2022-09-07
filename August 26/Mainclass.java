package robosoft;
import java.util.*;
class Member{
	String Name;
	int Age;
	int phno;
	String Address;
	double Salary;
	void printSalary() {
		System.out.println("Salary:"+Salary);
	}
	
}
class Employee extends Member{
	String specialization;
	Employee(String Name,int Age,int phno,String Address,double Salary,String specialization){
		this.Name=Name;
		this.Age=Age;
		this.phno=phno;
		this.Address=Address;
		this.Salary=Salary;
	    this.specialization=specialization;
	}
}
class Manager extends Member{
	String department;
	Manager(String Name,int Age,int phno,String Address,double Salary,String department){
		this.Name=Name;
		this.Age=Age;
		this.phno=phno;
		this.Address=Address;
		this.Salary=Salary;
	    this.department=department;
}
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("gayana",21,11111,"abc",3000,"Engineer");
	Manager man=new Manager("gayu",22,11113,"abd",4000,"ISE");
	emp.printSalary();
	man.printSalary();
		}

}

