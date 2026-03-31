package assignment;

public class PrimeFactor {

	public static void main(String[] args) {
		int n=60;
		for(int fact=2;fact<n;fact++)
		{
				if(fact>n/2)
					break;
			
				boolean prime=true;
			
				for(int j=2;j<=Math.sqrt(fact);j++)
				{
					if(fact%j==0)
					{
						prime=false;
						break;
					}
					
				}
					
				if(prime==true && n%fact==0)
				
				System.out.println(fact);
			
			
		}
		
			
		

	}
	}


