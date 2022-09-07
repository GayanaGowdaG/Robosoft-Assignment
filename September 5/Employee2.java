package sept05;

import java.util.stream.Stream;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	int id;
	long salary;

	Employee(String name, int id, long salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}

public class Employee2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("gayana", 2, 0000));
		employees.add(new Employee("Vani", 3, 3000));
		employees.add(new Employee("saj", 2, 2000));
		employees.add(new Employee("gayu", 2, 300));
		//Stream<Employee> s = employees.stream();
		
	
long count1=employees.stream().filter(s->s.salary>15000).count();
if(count1>0) {
	employees.stream().filter(s->s.salary>15000).forEach(s1 -> System.out.println(s1.name+" "+s1.id+" "+s1.salary));
}
else {
	System.out.println("not found");
}
	employees.stream().filter(s->s.name.startsWith("V")).forEach(s2->System.out.println("The name is "+s2.name));
Employee maximum=employees.stream().max(Comparator.comparing(s->s.salary)).get();
System.out.println(maximum.salary);
long number=employees.stream().count();
System.out.println(number);
long count=employees.stream().filter(s->s.name.length()>4).count();
	if(count>0) {
		employees.stream().filter(s->s.name.length()>4).forEach(s2->System.out.println("The name is "+s2.name));
	}
	else {
		System.out.println("not found");
	}
	employees.stream().sorted(Comparator.comparing(s->s.name)).forEach(s3->System.out.println(s3.name));
	}
	}

//}
