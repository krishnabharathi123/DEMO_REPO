package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads_Xpath {

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
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[contains(text(),'Find')]")).click();
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]/em/span/span").click();
		driver.findElementByXPath("//input[contains(@name,'phoneNumber')]").sendKeys("1",Keys.ENTER);
		Thread.sleep(2000);
        WebElement lead= driver.findElementByXPath("(//*[@class='x-grid3-row-table'])[1]/tbody/tr/td");
        String firstLead=lead.getText();
        System.out.println(firstLead);
        driver.findElement(By.xpath("(//*[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a")).click();
        driver.findElementByXPath("//div[@class='form']/preceding::a[text()='Delete']").click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[contains(text(),'Find')]")).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-form-element'] //input[@name='id']").sendKeys(firstLead, Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//div[@class='x-panel-bbar']/div/div").getText());
		driver.close();        

	}

}
