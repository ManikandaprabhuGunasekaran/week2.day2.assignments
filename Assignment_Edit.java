package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Edit {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement text1 = driver.findElement(By.xpath("(//label[contains(@for,'email')])[1]"));
		System.out.println(text1.getText());
		
		
		WebElement TextBox1 = driver.findElement(By.xpath("//input[@id='email']"));
		TextBox1.sendKeys("abx@testleaf.com");
		
		WebElement text2 = driver.findElement(By.xpath("(//label[contains(@for,'email')])[2]"));
		System.out.println(text2.getText());
		
		 WebElement TextBox2=driver.findElement(By.xpath("//input[starts-with(@value,'Append')]"));
		 String text = TextBox2.getText();
		 TextBox2.sendKeys(text+" textvalue");
		 
		 WebElement text3 = driver.findElement(By.xpath("//label[contains(text(),\"Get default text entered\")]"));
		System.out.println(text3.getText());
		
		WebElement TextBox3 = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]"));
		TextBox3.getAttribute("value");
		
		String Text4=driver.findElement(By.xpath("(//label)[4]")).getText();
		
		WebElement TextBox4=driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]"));
		TextBox4.clear();
		
		WebElement Text5=driver.findElement(By.xpath("//label[@for=\"disabled\"]"));
		System.out.println(Text5.getText());
		
		WebElement TextBox5=driver.findElement((By.xpath("//label[@for=\"disabled\"]/following::input")));
		Boolean flag=TextBox5.isEnabled();
		if(flag==false)
			System.out.println("text box is disabled");
		else 
			System.out.println("textbox is enabled");
		
	
	
	
	}
}
