package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1
{
	int id;
	String name;
	String department;
	double salary;
	int age;
	Employee1(int id, String name, String department, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		 return "Employee1 [id=" + id +
		            ", name=" + name +
		            ", department=" + department +
		            ", salary=" + salary +
		            ", age=" + age + "]";
	}

	


	
}

public class StreamAPI_Employee {

	public static void main(String[] args) {
	
		List<Employee1> employees = Arrays.asList(
			    new Employee1(1, "Rahul", "IT", 75000, 25),
			    new Employee1(2, "Sneha", "HR", 50000, 30),
			    new Employee1(3, "Aman", "IT", 90000, 28),
			    new Employee1(4, "Priya", "Finance", 65000, 32),
			    new Employee1(5, "Karan", "HR", 45000, 24),
			    new Employee1(6, "Neha", "IT", 85000, 27));
		
		//Salary greater than 70000
		
        System.out.println("Salary greater than 70000");
		employees.stream().filter(e->e.salary>70000).
		forEach(e->System.out.println(e.name));
		
		//Group by department
		
		System.out.println("Department with Number of Employee");
		Map<String, Long >depcount=employees.stream().
		collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
		
		depcount.forEach((dept,count)->System.out.println(dept+"->"+count));;
		
		
		//Highest salary
		
		System.out.println("Highest Salary");
		Employee1 emp=employees.stream().max(Comparator.comparing(Employee1::getSalary)).get();
		System.out.println(emp);
	    
	
	
	
	}

}
