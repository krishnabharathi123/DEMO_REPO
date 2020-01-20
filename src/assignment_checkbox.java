import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");

WebElement element = driver.findElement(By.cssSelector("#checkBoxOption1"));
element.click();
Assert.assertTrue(element.isSelected());
element.click();
Assert.assertFalse(element.isSelected());
	}

}
