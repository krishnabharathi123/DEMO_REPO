package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class testleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "//home//administrator//eclipse-workspace//driver//chromedriver");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

	}

}
