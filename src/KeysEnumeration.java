import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnumeration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\Chromedriver78\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//*[text()='From']")).click();
driver.findElement(By.xpath("//*[@placeholder='From']")).click();
driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("che");
driver.findElement(By.xpath("//*[@placeholder='To']")).click();
/*driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.ENTER);
*/
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@role='combobox']/input[1]")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.xpath("//*[@role='combobox']/input[1]")).sendKeys(Keys.ENTER);
//driver.findElement(By.className("dateInnerCell")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='dateInnerCell']/p")).click();



	}

}
