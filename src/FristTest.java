import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://sohohospitality.com/");
		Thread.sleep(20000);
		driver.findElement(By.name("your-name")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.name("your-email")).sendKeys("Test@test.com");
		Thread.sleep(3000);
		driver.findElement(By.name("your-number")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.name("your-message")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Send']")).click();
		Thread.sleep(10000);
		String message= driver.findElement(By.xpath("(//div[@role='alert'])[2]")).getText();
		assert message.contains("Your message was sent successfully. Thanks.");
		
		driver.close();
	}

}
