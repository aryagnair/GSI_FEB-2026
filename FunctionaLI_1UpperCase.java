package assignment;
@FunctionalInterface
interface Uppercase
{
	String upper(String str);
}
public class FunctionaLI_1UpperCase {

	public static void main(String[] args) {
		
		Uppercase obj=str->str.toUpperCase();
		
		String strr="hello java";
		String str2=obj.upper(strr);
		
		System.out.println("Original :"+strr);
		System.out.println("UpperCase :"+str2);

	}

}
