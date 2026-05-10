package assignment;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class FileReading {

	public static void main(String[] args) {
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file:");
		String file=sc.nextLine();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		
		String strr="";
		int lcount=0;
		int wcount=0;
		int chcount=0;
	
		String st;
		while((st=br.readLine())!=null)
		{
			
			System.out.println(st);
			lcount++;
		
		
      	
		String[] str=st.split(" ");
      	wcount=wcount+str.length;
      	
      	chcount=chcount+st.length();
      	
      	for(String word:str)
      	{
      		if(word.length()>strr.length())
      			strr=word;
      	}
     
		}
		
		
		System.out.println( "Total lines :"+lcount);
		
		System.out.println( "Total words :"+wcount);
     	System.out.println( "Total characters :"+chcount);
     	System.out.println("Longest Word :"+strr);

	}
	
     catch(Exception ex)
     {
    	 System.out.println(ex.getMessage());
     }
	
	}

}
