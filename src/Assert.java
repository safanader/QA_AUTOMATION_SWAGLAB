import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String actuaTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actuaTitle, expectedTitle);

	}

	private static void assertEquals(String actuaTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}

}
