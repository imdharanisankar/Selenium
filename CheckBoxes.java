package uIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//to check if checkbox is selected
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		// to check how many checkboxes are there in the page
		// Take a common locator and use size method
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
