import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// invoking browser
		// sel runs on chrome, firefox, edge, safari etc
		// for each browser, selenium team release class called Driver(ChromeDriver -->
		// methods)
		// To access methods from class,object has to be created
		// to open a browser get method has to be used.
		// WebDriver is an interface with empty methods, implementations has to come
		// from class.
		// ChromeDriver will have webdirver class as well as own class.
		// webdriver.chrome.driver - > values of the path

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
