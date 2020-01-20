import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://my.naukri.com/account/createaccount");
driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
driver.findElement(By.xpath("//*[contains(@class,'input')]")).sendKeys("krishna");
Thread.sleep(1000);
driver.findElement(By.cssSelector("span.ddIcon.srchTxt")).click();
Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@name='expYear']")).sendKeys("5");
WebElement e =driver.findElement(By.xpath("//*[@name='expMonth']"));
e.click();
e.sendKeys(Keys.ARROW_UP);
Thread.sleep(1000);
e.click();


//driver.findElement(By.cssSelector("span.ddIcon.srchTxt")).sendKeys("2");
//driver.findElement(By.cssSelector("span.ddIcon.srchTxt")).sendKeys(Keys.ARROW_DOWN);

//Thread.sleep(4000);

//driver.findElement(By.cssSelector("span.ddIcon.srchTxt")).sendKeys(Keys.ENTER);



	}

}
