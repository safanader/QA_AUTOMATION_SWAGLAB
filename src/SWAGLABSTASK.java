import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SWAGLABSTASK {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	
		String user_name = "standard_user";
		String password  = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(1000);
		List <WebElement> element = driver.findElements(By.tagName("button"));

		for(WebElement webElement: element)
		{	
		webElement.click();
			Thread.sleep(1000);
		}
		Integer actualValue = Integer.valueOf (driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText());
		int expectedValue = 4;
		Assert.assertEquals(actualValue, expectedValue);
	}
}
