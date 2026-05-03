package assignment;
import java.util.*;
class Mobile implements Comparable<Mobile>
{
	String brand;
	String model;
	int price;
	public Mobile(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public int compareTo(Mobile m)
	{
		return m.price-this.price;
	}
	void display()
	{
		System.out.println(brand+" "+model+" "+price);
	}
}

public class MobileStore {

	public static void main(String[] args) {
		Mobile mb1=new Mobile("Samsung", "S23", 70000);
		Mobile mb2=new Mobile("Apple", "iPhone 15", 80000);
		Mobile mb3=new Mobile("OnePlus", "12", 60000);
		Mobile mb4=new Mobile("Vivo", "V30", 35000);
		Mobile mb5=new Mobile("Realme", "GT", 30000);
	
		ArrayList<Mobile>mobile=new ArrayList<Mobile>();

		mobile.add(mb1);
		mobile.add(mb2);
		mobile.add(mb3);
		mobile.add(mb4);
		mobile.add(mb5);
		
		// Display all Mobiles
		System.out.println("Original Mobiles:");
		 for(Mobile m:mobile)
		 {
			 m.display();
		 }
	
		 System.out.println();
		 // SORT DECENDING
		 System.out.println("After Sorting Decending:");
		 Collections.sort(mobile);
		 for(Mobile m:mobile)
		 {
			 m.display();
		 }
		 
		 //After Removing The Expensive Mobile
		 System.out.println();
		 System.out.println("After Removing The Expensive Mobile:");
		 mobile.remove(0);
		 for(Mobile m:mobile)
		 {
			 m.display();
		 }
		 
		 //Brand Search
		 System.out.println();
		 String brandname="Vivo";
		 for(Mobile m:mobile)
		 {
			if(m.brand.equalsIgnoreCase(brandname))
				
		    System.out.println("Brand Found :"+brandname);
		 }
		 
		 //After price Update
		 System.out.println();
		 System.out.println("After price Update:");
		 for(Mobile m:mobile)
		 {
			if(m.brand.equals("Samsung"))
				m.price=68000;
			m.display();
		 }
		 
		 //Final List
		 System.out.println();
		 System.out.println("Final List:");
		 for(Mobile m:mobile)
		 {
			 m.display();
		 }
		
	}
		 
	}


