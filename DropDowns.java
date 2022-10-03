package uIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when there is tag with Select, separate class available in Selenium
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//select class in selenium to handle dropdonws
		//Webelement of slect tag should be given into select
		//if tagname is select, then it is static dropdown.
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		//selectbyindex method to select the value based on index
		
		dropdown.selectByIndex(3);
		// to get selected option - getFirstSelectedOption, this method return a webelement of an value that is slected.
		
		// to get all selected options - getAllSelectedOptions
		String Dropdownvalue = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(Dropdownvalue, "USD");
		//dropdown.getAllSelectedOptions()
		//selecting based on visible text
		
		dropdown.selectByVisibleText("AED");
		String value = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(value,  "AED");
		
		//selecting by value
		
		dropdown.selectByValue("INR");
		String value1 = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(value1,  "INR");
		
		
		
		
		

	}

}
