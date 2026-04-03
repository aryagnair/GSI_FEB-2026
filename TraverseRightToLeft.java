package assignment;

public class TraverseRightToLeft {

	public static void main(String[] args) {
	int position=1;
	int n=25382;
	int result=0,placevalue=1;
	int newdigit;
	
	while(n>0)
	{
		int digit=n%10;
		if(position%2!=0)
		{
			if(digit<=4)
			{
				newdigit=digit*2;
			}
			else
			{
				newdigit=digit;
			}
		}
		else
		
			newdigit=1;
		
		result=result+(newdigit*placevalue);
		
		        n=n/10;
				placevalue=placevalue*10;
				position++;
				
	}
               System.out.println("Tranverse Digit:"+result);
	}

}
