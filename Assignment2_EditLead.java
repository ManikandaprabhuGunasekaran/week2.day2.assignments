package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_EditLead {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

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

		WebElement EditButton = driver.findElement(By.linkText("Edit"));
		EditButton.click();

		WebElement description_updatelead = driver.findElement(By.id("updateLeadForm_description"));
		description_updatelead.clear();
		String DescTextUpdate = "this is updated description";
		description_updatelead.sendKeys("this is updated description");

		WebElement UpdateButton = driver.findElement(By.xpath("//*[@value=\"Update\"]"));
		UpdateButton.click();

		WebElement DescTextValidation = driver.findElement(By.id("viewLead_description_sp"));
		String text = DescTextValidation.getText();
		if (text.equals(DescTextUpdate)) {
			System.out.println("Updated description text is validated :" + DescTextUpdate);
		}
		
		String title = driver.getTitle();
		System.out.println("Page title :"+title);
		
		driver.close();

	}
}
