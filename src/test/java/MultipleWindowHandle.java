
public class MultipleWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		System.out.println("Child window opened...");
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> allWindows = driver.getWindowHandles();
		for (String a : allWindows) {
			if (!(a.equals(Parent))) {
				driver.switchTo().window(a);
			}
		}
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		System.out.println("Its executed in child window");
		
		driver.switchTo().window(Parent);
	}
}
