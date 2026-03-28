package assignment;

public class Fibonacci {

	public static void main(String[] args) {
	    int s=0,p=1;
	   
	 int c=0;
	 
	    System.out.println("Fibonacci Series:"); 
	    while(c<=10)
	    {
	 
	            if (s > 100) 
	            {
	                break;
	            }

	            System.out.print(s + " ");

	            int t = s + p;
	            s = p;
	            p = t;
	            c++;
	    	
	    }
	   
    	
	}

}
