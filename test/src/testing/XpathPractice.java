package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("MNM");//xpath with attribute - wrap with index
		driver.findElement(By.xpath("(//input[contains(@name,company)])[40]")).sendKeys("karunya");// xpath with contains -wrap with index
		driver.findElement(By.xpath("(//input)[41]")).sendKeys("moorthy");// xpath with tag name
		driver.findElement(By.xpath("//input[@class='inputBox'][@name='primaryEmail']")).sendKeys("abcdef@gmail.com");//more than 1 xpath
		driver.findElement(By.xpath("//input[@class='inputBox' and @name='primaryPhoneNumber']")).sendKeys("1234567992");// same as previous but used AND to avoid 2 braces
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}

}
