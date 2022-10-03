package coreJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_8 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//implicit wait - To wait for specified times for the object to be available, this wait is applicable for all steps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String user = "Dharanisankarm";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(user);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		//Added sleep as page takes sometime to login
		Thread.sleep(2000);
		//locating with tagname
		String LogonMsg = driver.findElement(By.tagName("p")).getText();
		String greetings = driver.findElement(By.cssSelector("div[class ^= 'login'] h2")).getText();
		System.out.println(LogonMsg);
		System.out.println(greetings);
		Assert.assertEquals(LogonMsg, "You are successfully logged in.");
		Assert.assertEquals(greetings, "Hello "+user+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
		

	}
}
