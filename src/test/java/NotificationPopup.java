
public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications-");
		
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		
		
		
		
		
	}
}
