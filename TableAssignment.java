package assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
	
		try
		{
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.engineerdiaries.com/selenium");
			Thread.sleep(2000);
			List<WebElement> reportList=driver.findElements(By.xpath("//td//a"));
	        List<String>list=new ArrayList<>();
			
			for(int i=1;i<=reportList.size();i++)
				{
				
				WebElement rd=driver.findElement(By.xpath("(//td//a)["+i+"]"));
			
				String name=driver.findElement(By.xpath("(//tr)["+(i+1)+"]//td[2]")).getText();
				//System.out.println(rd.getText());
				System.out.println("Name :"+name);
				String id=rd.getText();
				int reportId=Integer.parseInt(id);
				System.out.println("Report Id :"+reportId);
				rd.click();
			
				List<WebElement>score=driver.findElements(By.xpath("//tr"));
				int total=0;
				for(int j=2;j<=score.size();j++)
				{
					WebElement rd2=driver.findElement(By.xpath("(//tr)["+j+"]//td[3]"));
				    String id2=rd2.getText();
				    total=total+Integer.parseInt(id2);
				
				}
				
				System.out.println("Total= "+total);
				

			
				if(total!=reportId)
				
					list.add(name);
				
					Thread.sleep(2000);
					driver.navigate().back();
					
				}	
				
					System.out.println(list);
				
		}
				
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
				
			

	}

}
