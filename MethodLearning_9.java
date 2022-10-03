package coreJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MethodLearning_9 {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// implicit wait - To wait for specified times for the object to be available,
		// this wait is applicable for all steps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String user = "Dharanisankarm";
		String password = getPassword(driver);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(user);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String greetings = driver.findElement(By.xpath("//div/p")).getText();
		Assert.assertEquals(greetings, "You are successfully logged in.");
		driver.quit();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Dharanisankarm");
		driver.findElement(By.name("inputPassword")).sendKeys("Dharani");
		driver.findElement(By.className("signInBtn")).click();
		String error = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(error);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dharanisankar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dhranisnkar@test.com");
		driver.findElement(By.xpath("//div//form/input[3]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p.infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordtext.split("'");
		
		for(int i=0; i<passwordArray.length; i++) {
			System.out.println(passwordArray[i]);
		}
		
		//passwordArray[0] - Please use temporary password , passwordArray[1] = rahulshettyacademy' to Login.
		
		String password = passwordArray[1].split("'")[0];
		//[0] of above result will contain rahulshettyacademy, [1] above result will contain to Login
		return password;
		

	}

}
