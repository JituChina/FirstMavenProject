import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


 public class FirstTest {

	 public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	
	try {
		driver.get("https://google.com");
		driver.manage().window().maximize();
	
		System.out.println("Welcome to : " + driver.getTitle());
		
	}
	
	
	catch (Exception e) {
		System.out.println("Sorry: " + e.getMessage());
	}
	
	finally {
		System.out.println("Thank You!");
		driver.close();
	}
	 }
}


