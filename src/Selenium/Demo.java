package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "\\var\\lib\\jenkins\\workspace\\driver\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
  driver.get("http://www.gmail.com/");
  driver.manage().window().maximize();
  driver.findElement(By.id("identifierId")).sendKeys("@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.className("CwaK9")).click();
  Thread.sleep(2000);
String at =driver.getTitle();
String et ="no";//expected title
driver.close();


//establish test condition

if(at.equalsIgnoreCase(et))
{
	System.out.println("test successful");
}

else {
	System.out.println("test failure");
}
	}

		}

		
