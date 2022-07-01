package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

		driver.findElement(By.id("home")).click();

		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();

		int x = location.getX();
		int y = location.getY();
		System.out.println(x + "," + y);

		String attribute = driver.findElement(By.id("color")).getAttribute("style");

		System.out.println(attribute);

		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);

		driver.close();
	}
}
