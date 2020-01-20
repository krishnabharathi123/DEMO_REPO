
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement e = driver.findElement(By.id("name"));
		e.click();
		e.sendKeys("krishna");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		//Alert e1 = driver.switchTo().alert();
		//e1.getText();
		//e1.accept();
		driver.switchTo().alert().accept();
	}

}
