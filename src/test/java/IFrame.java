
public class IFrame {

	

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.get("https://ui.vision/demo/webtest/frames");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//				driver.switchTo().frame(0);
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Good morning");
//				
//				Thread.sleep(3000);
				driver.switchTo().frame(2);
				driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("form page ");
				driver.switchTo().frame(0);
				boolean checkbox = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).isSelected();
				System.out.println("the answer is :" + checkbox);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Choose']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Well, now I know :-)']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				System.out.println("Next page enter");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='aCsJod oJeWuf']")).sendKeys("hsgxjhs kjshis xshxuis");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='Pc9Gce Wic03c']")).sendKeys("Longgggg ghxgjsh xsjhgxsx klsx sxsjkx lsxjs xlkjs hxhljks hxk");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
			}


}
