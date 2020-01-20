import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\Chromedriver78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/dp/B07RB1T7SJ/ref=sspa_dk_detail_5?psc=1&pd_rd_i=B07RB1T7SJ&pd_rd_w=JwQX2&pf_rd_p=357151f8-058c-46f1-b7d1-fa3647ce3999&pd_rd_wg=fRYNS&pf_rd_r=Q5FY74BKW45DZTP93ZR4&pd_rd_r=f3415d56-5054-4a82-90e6-b004f0d039a0&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUE0TVFZWkJIWTNFRU4mZW5jcnlwdGVkSWQ9QTA2OTQ4NzkyQTVOODJYMFFOVzlWJmVuY3J5cHRlZEFkSWQ9QTA1NzgzNDkzQllJRjBDVjJLMFgyJndpZGdldE5hbWU9c3BfZGV0YWlsJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().build().perform();
	}

}
