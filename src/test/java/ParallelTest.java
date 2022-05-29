import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	public WebDriver driver;
    @Test
    public void FirefoxTest() {	 
        //Initializing the firefox driver (Gecko)
    try {
    System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    driver = new FirefoxDriver();	  
    driver.get("https://www.Bing.com"); 
    System.out.println("Welcome to: " + driver.getTitle());
    WebElement searchBar = driver.findElement(By.name("q"));
    searchBar.clear();
    searchBar.sendKeys("Maven with Selenium");
    searchBar.sendKeys(Keys.ENTER);
    
    driver.quit();
    }
    catch (Exception e)
    {
    	System.out.println(e.getMessage());
    }
   }

   
    @Test
	public void ChromeTest()
	{ 
    	try {
   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.google.com"); 
  System.out.println("Welcome to: " + driver.getTitle());
  WebElement searchBar = driver.findElement(By.name("q"));
  searchBar.clear();
  searchBar.sendKeys("Maven with Selenium");
  searchBar.sendKeys(Keys.ENTER);  
  driver.quit();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
	}
}
