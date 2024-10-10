import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1=new FirefoxDriver();
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver1.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		/*
     // 1st Condition
	driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
	Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("1st condition success");
		// click on cancel-- 2nd condition
		Thread.sleep(4000);
	driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("2nd condition success");
		//getting Text &using sendkeys
		// 3rd Condition
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Textbox']")).click();
		Thread.sleep(2000);
		String PrintText = driver.switchTo().alert().getText();
		System.out.println(PrintText);
		System.out.println("3rdt condition success");
		
// adding text
		driver.switchTo().alert().sendKeys("Ajay Master");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String PrintText1 = driver.switchTo().alert().getText();
        System.out.println(PrintText1);
		
       String Print = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
       System.out.println(Print);
	}
*/
		
		
	driver1.findElement(By.xpath("//*[@id='promptBox']")).click()	;
	Thread.sleep(3000);
	driver1.switchTo().alert().sendKeys("Ajay");
	
	Thread.sleep(3000);
	String aj = driver1.switchTo().alert().getText();
		System.out.println(aj);
		
		driver1.switchTo().alert().accept()	;
		
		
		
		
		
		
	}
		
		
		
		
}
