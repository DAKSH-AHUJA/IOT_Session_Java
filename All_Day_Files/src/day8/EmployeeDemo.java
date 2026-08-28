package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employe{
	String name;
	String department;
	int salary;
	Employe(String name, String department, int salary){
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String toString() {
		return name + " - " + department + " - " + salary;
	}
}
//custom comparator
public class EmployeeDemo {
	public static void main(String[] args) {
		
		List<Employe> employees = Arrays.asList(
				new Employe("Ravi", "IT", 60000),
				new Employe("Anil", "HR", 60000),
				new Employe("Priya", "IT", 60000),
				new Employe("Amit", "HR", 60000),
				new Employe("Rahul", "AT", 60000)
				);
		
		employees.sort(
				Comparator.comparing((Employe e) -> e.department) // 1.Department
					.thenComparing((Employe e) -> e.salary, Comparator.reverseOrder()) // 2. Salary
					.thenComparing(e -> e.name)                   // 3.Name
				
				);
		for (Employe e : employees) {
			System.out.println(e);
		}
		
		
	}
}
