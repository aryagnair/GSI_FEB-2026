package assignment;

public class LongestCommonPrefix {
	
	public static String Longestprefix(String[] str)
	{
		 String prefix=str[0];
		for(int i=1;i<str.length;i++)
	    {
	    	while(!str[i].startsWith(prefix))
	    	{
	    		prefix=prefix.substring(0, prefix.length()-1);
	    		
	    		if(prefix.isEmpty())
	    		{
	    			
	    			return "";
	    		}
	    	}
	    }
		return prefix;
	}
	

	public static void main(String[] args) {
		String[] str1={"flower","flow","flight"};
		String[] str2= {"dog","racecar","car"};
	    String[] str3= {"interview","internet","internal","interval"};
	    
	    
	   
	    System.out.println("Longest Common Prefix: "+Longestprefix(str1));
	    System.out.println("Longest Common Prefix: "+Longestprefix(str2));
	    System.out.println("Longest Common Prefix: "+Longestprefix(str3));
	    
	    
	   
	}

}
