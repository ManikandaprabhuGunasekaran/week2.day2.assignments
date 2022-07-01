package week2.day2.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_radio {
		
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");

		driver.findElement(By.id("yes")).click();

		WebElement UnChecked_rb = driver.findElement(By.xpath("(//input)[3]"));
		boolean uncheckedrb = UnChecked_rb.isSelected();

		WebElement Checked_rb = driver.findElement(By.xpath("(//input)[4]"));
		boolean checkedrb = Checked_rb.isSelected();

		if (uncheckedrb == true) {
			System.out.println("By default unchecked radio button is selected");
		} else {
			System.out.println("By default checked radio button is selected");
		}

		WebElement ageGroup = driver.findElement(By.xpath("(//*[@name=\"age\"])[2]"));
		boolean selected = ageGroup.isSelected();

		if (selected == true) {
			System.out.println("correct age group is selected by default");
		} else {
			ageGroup.click();
		}
		
	}
}
