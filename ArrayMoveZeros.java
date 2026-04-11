package assignment;

public class ArrayMoveZeros {
	
	static void moveZeroes(int arr[])
	{
		int pos=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
			
	}
	
	public static void main(String[] args) {
	 	
		int arr[]= {1,0,3,0,2};  
		moveZeroes(arr);
		for(int num:arr)
			System.out.print(num+" ");

	}

	}


