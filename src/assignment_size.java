import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//int a = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		//System.out.println(a);
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		driver.close();
	}

}
