package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home//administrator//eclipse-workspace//driver//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/logout");
		driver.manage().window().maximize();
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElementByClassName("loginButton").click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElementById("createLeadForm_companyName").sendKeys("abcd");
		driver.findElementById("createLeadForm_firstName").sendKeys("kavya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
