package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sibilings to sibiling and child to parent traverse
		
		//Absolute xpath for login button
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[2]")).getText());
		
		
		//Relative xpaths
		
		// Parent to sibling traverse - following-sibling
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
		//parent to sbiling to preceding-sibling
		////div/button[2]/preceding-sibling::button
		System.out.println(driver.findElement(By.xpath("//div/button[2]/preceding-sibling::button")).getText());
		// Traversing from sibling to parent
		System.out.println(driver.findElement(By.xpath("//div/button[2]/parent::div/button[3]")).getText());
		//Traversing from sibling to anchestor
		////div/button[2]/ancestor::header/a
		System.out.println(driver.findElement(By.xpath("//div/button[2]/ancestor::header/a[2]")).getText());
		driver.close();
		
		
		

	}

}
