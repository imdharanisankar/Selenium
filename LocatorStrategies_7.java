package coreJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategies_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Locator will give us information about the attribute on the HTML Page
		//LOcator is used to identify an element on the webpage
		//Locator provides unique locator for each element to steer from selenium
		//Selenium supports, ID, Xpath, CSS, Name, ClassName, Tagname, linktext, partial link text
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//implicit wait - To wait for specified times, this wait is applicable for all steps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Dharanisankarm");
		driver.findElement(By.name("inputPassword")).sendKeys("Dharani");
		//IF there are space in the value(class), they have multiple class.
		//<button class="submit signInBtn" type="submit">Sign In</button>
		driver.findElement(By.className("signInBtn")).click();
		//To get the text of the element getText method can be used
		//below step failed because of synhronization issue. Browser took few seconds to load the page
		
		String error = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(error);
		
		// IF tag name is a(anchor) that element is a link.
		// LInk text locator to use the text of the element.
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Chropath or selectorHub plugin to cehck if identified locator is unique or not
		
		//All other locators are readily available in the HTML. only CSS and Xpath need to be constructed.
		
		// syntax to construct xpath - //Tagname[@attribute="Value"]
		// to check xpath from console $x('') - $x('//input[@placeholder="Name"]')
		//, to check the CSS $('') - $('p.error')
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dharanisankar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dhranisnkar@test.com");
		//to clear the value
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//When multiple elements are matching, index can be used to identify the exact element.
		//In case of CSS - input[type='text']:nth-child(3)
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("dharanisankar@test.com");
		
		//Building Xpath without attributes and only with Tagnames
		
		driver.findElement(By.xpath("//div//form/input[3]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		
		String passwordtext = driver.findElement(By.cssSelector("form p.infoMsg")).getText();
		
		System.out.println(passwordtext);
		
		

	}

}
