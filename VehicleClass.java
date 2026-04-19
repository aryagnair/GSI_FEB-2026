package assignment;

class Vehicle
{
	String brand;
	int speed;
	static String company="Auto World Ltd";
	
	Vehicle(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
	void display() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
	
	void run()
	{
		System.out.println("Vehicle is running");
	}
	static void displayCompany()
	{
		System.out.println("Company Name: "+company);
	}
	final void  engineType()
	{
		System.out.println("Engine Type: Standard Engine");
	}
}

class Car extends Vehicle
{
	String fuelType;
	Car(String brand,int speed,String fuelType)
	{
	super(brand, speed);
	this.fuelType=fuelType;
	}
	void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }
	void run()
	{
		System.out.println("Car is running smoothly");
	}
/*	void engineType()  Cannot override the final method from Vehicle
	{
		System.out.println("Engine Type: Different Engine");
	}*/
	
}


public class VehicleClass {

	public static void main(String[] args) {

	Car cars=new Car("Hundai", 120, "Petrol");
	cars.display();
	
	System.out.println();
	
	Vehicle vehicle=new Vehicle(null, 0); 
	vehicle.run();
	cars.run();
	System.out.println();
		
	Vehicle.displayCompany();
	System.out.println();
	
	vehicle.engineType();
	System.out.println();
	
	String BrandName="Hyundai";
	String Reverse="";
	for(int i=BrandName.length()-1;i>=0;i--)
	{
	Reverse	=Reverse+BrandName.charAt(i);
	}
	System.out.println(Reverse);
	System.out.println(BrandName.replaceAll("[aeiouAEIOU]","*"));
	System.out.println(BrandName.equalsIgnoreCase(BrandName));
	}

}
