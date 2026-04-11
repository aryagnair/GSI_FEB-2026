package assignment;



public class SmallestOfArray {
	
 public static void main(String[] args) {
		int arry[]= {1,9,8,0,4};
		
		
		System.out.println("Array: "+arry[1]);
		
		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		
		// SMALLEST
		for(int i=0;i<=arry.length-1;i++)
		
			if(arry[i]<small)
			{
				small=arry[i];
			}
		System.out.println("Smallest number is : "+small);
		
		
		// SECOND SMALLEST
		
		for(int i=0;i<=arry.length-1;i++)
			
		{
			
			if(arry[i]>small && arry[i]<secsmall )
			{
				secsmall=arry[i];
			}
			
		}
		if (secsmall==Integer.MAX_VALUE)
		{
			System.out.println("No Second Smallest");
		}
		else
		{
			System.out.println("Second Smallest Number is : "+secsmall);
			
		}
 }	
	}	
		