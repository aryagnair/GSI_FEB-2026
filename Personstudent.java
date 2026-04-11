package assignment;

class Person
{
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}

class Student extends Person
{
	int marks;
	Student(String name,int age,int marks)
	{
		super(name,age);
		this.marks=marks;
	}
 
void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
	}
}

public class Personstudent {
	
	
	public static void main(String[] args) {
		Student s1=new Student("Priya", 32, 65);
		s1.display();
		
	}

}
