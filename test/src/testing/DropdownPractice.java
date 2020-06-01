package testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public void selectByindexvalue(WebElement IndexWebElement, int index){
		Select s1 = new Select(IndexWebElement);
		s1.selectByIndex(index);
	}
	public void selectByTextValue(WebElement textvalueElement, String textVal) {
		Select s2 =new Select(textvalueElement);
		s2.selectByVisibleText(textVal);
	}
	public void selectByValuee(WebElement valueElement, String Val) {
		Select s3 =new Select(valueElement);
		s3.selectByValue(Val);
	}
	public void getNoOfOptions(WebElement optionElements) {
		Select s4 =new Select(optionElements);
		List<WebElement> optionvalues= s4.getOptions();
		for (WebElement dropdownoptions : optionvalues) {
		  System.out.println(dropdownoptions.getAttribute("value") +")"+ dropdownoptions.getText());
		}
		/*public void sendkeysToSelectDropdown(WebElement sendkeyoption, String sendkeyval) {
			Select s5 =new Select(sendkeyoption);
			s5.sen
		}*/
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home//administrator//eclipse-workspace//driver//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		DropdownPractice d1 = new DropdownPractice();
		d1.selectByindexvalue(driver.findElement(By.id("dropdown1")), 3);
		d1.selectByTextValue(driver.findElement(By.name("dropdown2")), "Loadrunner");
		d1.selectByValuee(driver.findElement(By.id("dropdown3")), "2");
		d1.getNoOfOptions(driver.findElement(By.className("dropdown")));
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("UFT/QTP");
		driver.findElement(By.xpath("(//select)[6]")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	}

}
