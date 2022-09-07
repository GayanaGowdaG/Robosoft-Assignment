package sept05;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;

public class Employeeee {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		List<String> memberNames = new ArrayList<>();

		memberNames.add("Gayana");

		memberNames.add("Vivek");

		memberNames.add("Sachin");

		memberNames.add("Shravan");

		memberNames.add("Vindu");

		memberNames.add("Vishwas");

		memberNames.add("Skanda");

		memberNames.add("Rohith");

		Stream<String> s = memberNames.stream();

		memberNames.forEach((i) -> System.out.println(i));

		System.out.println("filtering operation");

		memberNames.stream().filter((i) -> i.startsWith("V"))

				.forEach(s1 -> System.out.println(s1));

	}

}
//class Employee {
	//String name;
	//int id;
	//long salary;

	//Employee(String name, int id, long salary) {
	//	this.name = name;
		//this.id = id;
		//this.salary = salary;
//	}
//}

