package assignment;
class Employee
{
	int id;
	String name;
	double basicSalary;
	double totalSalary;
	Employee(int id,String name,double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		
	}
	
	void calculateSalary()
	{ 
	    double hra=(20*basicSalary)/100;
		double bonus=(10*basicSalary)/100;
		totalSalary=basicSalary+hra+bonus;
		
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		
		System.out.println("Total Salary: "+totalSalary);
	}
}


public class SalaryCalcu {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Remya", 45000);
		e1.calculateSalary();
		e1.display();
		

	}

}
