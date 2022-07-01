package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		WebElement Crm_sfa = driver.findElement(By.linkText("CRM/SFA"));
		Crm_sfa.click();

		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();

		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
		CreateLead.click();

		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("agilysis");

		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("ak");

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("ak");

		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("pk");

		WebElement departmentName = driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("IT");

		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("testleaf");

		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("agilysis@testleaf.com");

		WebElement ElementState_Province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dropdown = new Select(ElementState_Province);
		dropdown.selectByValue("NY");

		WebElement CreateLeadButton = driver.findElement(By.className("smallSubmit"));
		CreateLeadButton.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
}
