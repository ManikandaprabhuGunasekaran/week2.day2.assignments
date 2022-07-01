package week2.day2.Assignment;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Image {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		driver.findElement(By.xpath("(//img)[2]")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		try {
			WebElement img2 = driver.findElement(By.xpath("(//img)[3]"));

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(img2.getAttribute("src"));
			HttpResponse response = client.execute(request);
			/* For valid images, the HttpStatus will be 200 */
			if (response.getStatusLine().getStatusCode() != 200) {
				System.out.println(img2.getAttribute("outerHTML") + " is broken.");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement img4 = driver.findElement(By.xpath("(//img)[4]"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(img4).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}
}
