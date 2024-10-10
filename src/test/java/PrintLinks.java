import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Ajay");
		Thread.sleep(3000);
		List<WebElement> AjayOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']")); // //*[@class='wM6W7d']
		System.out.println("How many options are displyaing :" + AjayOptions.size());

		for (int i = 0; i < AjayOptions.size(); i++) {
			String aj = AjayOptions.get(i).getText();
			System.out.println(aj);
		}

	}

}
