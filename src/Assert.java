import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "hello";
		
	
		org.testng.Assert.assertEquals(actualTitle, expectedTitle);
	}






}
