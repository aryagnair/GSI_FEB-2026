package assignment;

@FunctionalInterface
interface VowelCount
{
	int count(String str);
}
public class FunctionaLI_3CountVowels {

	public static void main(String[] args) {
	
		VowelCount obj=str->
		{
			int count =0;
			
			for(char ch:str.toLowerCase().toCharArray())
			{
				if("aeiou".indexOf(ch)!=-1)
				{
					count++;
				}
			}
			return count;
		};
		
		String str1="automation";
		int str2=obj.count(str1);
		System.out.println("VowelCounts:"+str2);
				
		
		

	}

}
