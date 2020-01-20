import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver_win32.exe");
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
Assert.assertFalse(driver.findElement(By.xpath("//*[contains(@id,'friendsandfamily')]")).isSelected());

driver.findElement(By.cssSelector("[id*='friendsandfamily']")).click();
//Assert.assertFalse(driver.findElement(By.xpath("//*[contains(@id,'friendsandfamily')]")).isSelected());//test case gets failed becauseassertfalse expects only false but here true gets returned
System.out.println(driver.findElement(By.xpath("//*[contains(@id,'friendsandfamily')]")).isSelected());
Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@id,'friendsandfamily')]")).isSelected());
Thread.sleep(2000);
//System.out.println(driver.findElements(By.xpath("//*[@input='checkbox']")).size());
System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
//System.out.println(driver.findElement(By.xpath("//*[@type='checkbox']")).size());//size() will not work for findelement, will wrk only for find elements 
//Assert.assertEquals(driver.findElements(By.xpath("//*[@type='checkbox']")).size(), 5);// test case got failed as the actual result is 6 but expected result is 5
driver.quit();
	}

}
