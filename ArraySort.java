package assignment;

public class ArraySort {
	
	 static boolean isSorted(int[] arr)
	  {
		  for(int i=0;i<arr.length-1;i++)
		  {
			  if(arr[i]>arr[i+1])
			  
	         return false;
			  
		  }
		  return true;
		  
	  }

	public static void main(String[] args) {
		// ASCENDING ORDER SORTING
		
				int arr[]={5,19,17,18,24}; 
				if(isSorted(arr))
				{
					System.out.println("The Array is Sorted ");
					
				}
				else
				{
					System.out.println("The Array is Not Sorted ");
					
				}
			
	
				
				
			}

		


	}


