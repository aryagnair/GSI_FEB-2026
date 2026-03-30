package assignment;

public class Fibonacci {

	public static void main(String[] args) {
	    int s=0,p=1;
	   
	 int c=1;
	 
	    System.out.println("Fibonacci Series:"); 
	    while(c<=10)
	    {
	 
	            System.out.print(s + " ");

	            int t = s + p;
	            s = p;
	            p = t;
	            c++;
	    	
	    }
	   /*int count=10;

		int num1=0;

		int num2=1;

		System.out.print(num1+" "+num2+" ");

		int i=1;

		count=count-2;

		while(i<=count)

		{			//num3=3

			int num3=num1+num2;

			System.out.print(num3+" ");

			num1=num2;

			num2=num3;

			i++;

		}*/
    	
	}

}
