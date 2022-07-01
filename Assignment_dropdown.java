package week2.day2.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		// dropdown1

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select dp1 = new Select(dropdown1);
		dp1.selectByIndex(3);

		// dropdown2
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select dp2 = new Select(dropdown2);
		dp2.selectByVisibleText("UFT/QTP");

		// dropdown3
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select dp3 = new Select(dropdown3);
		dp3.selectByValue("4");

		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select drp4 = new Select(dropdown4);
		List<WebElement> options = drp4.getOptions();
		System.out.println(options.size());

		WebElement dropdown5=driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
		dropdown5.sendKeys("Appium");
		
		WebElement dropdown6=driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		
		Select drp6=new Select(dropdown6);
		drp6.selectByIndex(2);
		drp6.selectByIndex(1);
		drp6.selectByIndex(3);
	}

}
