package collectionclass;
import java.util.*;
class Employee{
String Employee_name;
int Employee_id;
double Employee_salary;

Employee(String Employee_name,int Employee_id,double Employee_salary){
	this.Employee_name=Employee_name;
	this.Employee_id=Employee_id;
	this.Employee_salary=Employee_salary;
}

}
public class ArrayList1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Employee e;
ArrayList<Employee>list=new ArrayList<Employee>();
while(true) {
	System.out.println("Enter the choice");
	System.out.println("1. Insert\n 2. Delete\n 3. Display");
	int choice=sc.nextInt();
	switch(choice){
	case 1:System.out.println("Enter the Employee name");
	 		String Employee_name=sc.next();
	 		System.out.println("Enter the Employee id");
	 		int Employee_id=sc.nextInt();
	 		System.out.println("Enter the Employee Salary");
	 		double Employee_salary=sc.nextDouble();
	 		list.add( e=new Employee(Employee_name,Employee_id,Employee_salary));
	 		break;
	case 2: System.out.println("Enter the id to be deleted");
	        int id=sc.nextInt();
	        Employee emp=null;
	        for(Employee i:list ) {
	        	if(i.Employee_id==id) {
	        		emp=i;
	        }
	        	
	        	
	        }
	       
	       if(emp==null) {
	    	   System.out.println("id is not present");
	       }
	       else {
	    	   list.remove(emp);
	       }
	       break;
	case 3:for(Employee i:list) {
		
	
		System.out.println(i.Employee_name+" "+i.Employee_id+" "+ i.Employee_salary);
	}
}

	}
	}
}


