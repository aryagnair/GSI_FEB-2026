package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class Product
{
	int id;
	String productName;
    double price;
   
	 Product(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	 @Override
	 public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	 }

}
public class StreamAPI {

	public static void main(String[] args) {
		
		List<String>filtername=new ArrayList<String>();
		filtername.add("Aman");
		filtername.add("Riya");
		filtername.add("Ankit");
		filtername.add("Tushar");
		
		System.out.println("FILTER NAME ENDS WITH YOR A");
	
         filtername
		.stream()
		.filter(n->n.toLowerCase().endsWith("a"))
		.forEach(n->System.out.println(n));
         
         // Filter String with Length Greater Than 5
         List<String>words=new ArrayList<>();
         words.add("Java");
         words.add("Automation");
         words.add("API");
         words.add("Playwright");
         
         System.out.println("String GreaterThan 5");
         words.stream().filter(n->n.length()>5)
         .forEach(n->System.out.println(n));
         
         //Print using Method Reference
         
         List<String>letters=new ArrayList<>();
         letters.add("A");
         letters.add("B");
         letters.add("C");
         
	     System.out.println("Print Using Method reference");
	     letters.forEach(System.out::println);

	     // Sorted using Method 
	     
	     List<String>sort=new ArrayList<>();
         sort.add("40");
         sort.add("10");
         sort.add("30");
         sort.add("20");
         
         System.out.println("Sorted Numbers:");
         sort.stream().sorted().forEach(s->System.out.println(s));
         
         
         //Sorted list of Products
         Product p1=new Product(1, "Mobile", 90000);
         Product p2=new Product(2, "Remote", 300);
         Product p3=new Product(3, "Fridge", 900);
         Product p4=new Product(4, "Laptop", 25000);
 		
 		List<Product>list=new ArrayList<Product>();
 		list.add(p1);
 		list.add(p2);
 		list.add(p3);
 		list.add(p4);
 	    System.out.println("Print the list");
 	 
 	    list.stream().filter(p->p.price>1000).toList().
 	    forEach(p->System.out.println(p.id+":"+p.productName+":"+p.price));
 	    
 	    
 	    
 	    
		
	}

}
