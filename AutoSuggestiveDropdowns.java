package uIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		//as there is a delay to load the dropdowns, wait has to be introduced
		Thread.sleep(2000);
		// To access multiple elements, findelements can be used.
		
		java.util.List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			
		}
		driver.quit();
	}
	
}
