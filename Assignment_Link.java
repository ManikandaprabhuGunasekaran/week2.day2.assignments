package week2.day2.Assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Link {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		WebElement link1=driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		WebElement link2 = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String href_attribute = link2.getAttribute("href");
		System.out.println(href_attribute);
		
		WebElement link3 = driver.findElement(By.linkText("Verify am I broken?"));
		String url = link3.getAttribute("href");
		
		
		HttpURLConnection urlconnection = (HttpURLConnection) (new URL(url).openConnection());
        urlconnection.setRequestMethod("HEAD");
        urlconnection.connect();
        int responseCode = urlconnection.getResponseCode();
        
        if(responseCode>=400)
        {
        	System.out.println("URL "+url+" is broken");
        }
        else
        {
        	System.out.println("URL is not broken");
        }
        
        WebElement link4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
        link4.click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        
        WebElement link5 = driver.findElement(By.linkText("How many links are available in this page?"));
        List<WebElement> urlList = driver.findElements(By.tagName("a"));
        System.out.println(urlList.size());
        
        driver.close();
	}
}
