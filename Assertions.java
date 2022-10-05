package uIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework with selenium.
//Assertion to check if the result of the code is expected. if expected, assertion will pass. otherwise it will fail


public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Asserting to check if the result is false. if not false, test will fail.
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//to check if checkbox is selected
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		// to check how many checkboxes are there in the page
		// Take a common locator and use size method
		
		Assert.assertEquals(6, driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();


	}

}
