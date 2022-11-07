import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String user_name = "standard_user";
		String password  = "secret_sauce";
		
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
	
	}


	

}
