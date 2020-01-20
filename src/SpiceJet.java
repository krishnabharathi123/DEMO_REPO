import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUMDrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
WebElement from = driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT"));
from.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[starts-with(text(),' Coimbatore')]")).click();
//driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(1000);
//driver.findElement(By.xpath("(//div[@id='dropdownGroup1'] //a[@text='Chennai (MAA)'])[2]")).click();
//driver.findElement(By.xpath("(//div[@id='dropdownGroup1'] //a[@text='Chennai (MAA)'])")).click();
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
driver.findElement(By.cssSelector("[value='RoundTrip']")).click();
//driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("(//a[Conatins(@id,'ui-state-active'])[2]")).click();
//driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
//driver.findElement(By.cssSelector("a.ui-state-default ui-state-highlight.ui-state-active")).click();
//driver.findElement(By.xpath("//div[@style='display']")).click();
//driver.findElement(By.xpath("//div[@id='divAdult'] //span[@id='hrefIncAdt']")).click();
//driver.findElement(By.xpath("//div[@id='divAdult'] //span[@id='hrefIncAdt']")).click();
//driver.findElement(By.xpath("//div[@id='divAdult'] //span[@id='hrefIncAdt']")).click();
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
driver.findElement(By.id("hrefIncAdt")).click();
driver.findElement(By.id("hrefIncAdt")).click();
Thread.sleep(2000);
int i =0;
while(i<=1) {
driver.findElement(By.id("hrefIncInf")).click();
i++;
}
Thread.sleep(2000);
Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
s.selectByValue("AED");
driver.findElement(By.xpath("//*[@value='Search']")).click();
}
}
