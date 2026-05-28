package assignment;
interface ReverseString
{
	String Reverse(String str);
}

public class FunctionaLI_2Reverse {

	public static void main(String[] args) {
	
		ReverseString obj=str-> 
		                    new StringBuilder(str).reverse().toString();
		   String str1="programming";
		   String str2=obj.Reverse(str1);
		 
		   
		   System.out.println("Original:"+str1);
		   System.out.println("Reverse:"+str2);
	}

}
