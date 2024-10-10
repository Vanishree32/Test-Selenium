
public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		/*
		 * System.out.println("Child window opened...");
		 *
		 * String Parent = driver.getWindowHandle();
		 *
		 * System.out.println("Parent address" + Parent);
		 *
		 * Object[] windoHandle = driver.getWindowHandles().toArray();
		 *
		 * driver.switchTo().window((String) windoHandle[2]);
		 *
		 * String title = driver.getTitle();
		 * System.out.println("title of 1st index window" + title);
		 *
		 * driver.close();
		 *
		 * driver.switchTo().window((String) windoHandle[0]);
		 *
		 * System.out.println("coming back to o index ");
		 */
		String exp = "Index";
		Set<String> allWindows = driver.getWindowHandles();
		for (String a : allWindows) {
			driver.switchTo().window(a);
			String actTitle = driver.getTitle();
			if (actTitle.equalsIgnoreCase(exp)) {
				driver.switchTo().window(a);
				break;
			}
		}
		String SuccessWindow = driver.getTitle();
		System.out.println(SuccessWindow);
	}


}
