import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CalendarPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@class='col-xs-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='15']")).click();
		Thread.sleep(2000);
		// To calender - 2nd
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		Thread.sleep(3000);
		WebElement months = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select s = new Select(months);
		s.selectByIndex(7);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='datepick-month']//*[text()='21']")).click();
	}
}
