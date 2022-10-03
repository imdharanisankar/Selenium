package uIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {
	public static void main(String[] args) throws InterruptedException {
		//Dynamic dropdowns will get loaded only after clicking on the element.
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(@text, 'BLR')]")).click();
		Thread.sleep(2000);;
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[contains(@text, 'MAA')])[2]")).click();
		//Parent child relationship xpath,=.
		//first write the xpath for parent followed by space and xpath of the child to identify the element uniquely
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
	}

}
