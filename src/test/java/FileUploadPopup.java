import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement BrowseBtn = driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']"));
		BrowseBtn.click();
//		Thread.sleep(3000);
//		String projectpath = System.getProperty("user.dir");
//
//		// BrowseBtn.sendKeys("C:\\Users\\Brigosha_Guest\\Downloads\\blog7.jpg");
//		BrowseBtn.sendKeys(projectpath + "\\Photos\\blog7.jpg");
		Robot rb = new Robot();
		rb.delay(2000);
		// copying path to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Brigosha_Guest\\Downloads\\blog7.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cltr+v method
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
