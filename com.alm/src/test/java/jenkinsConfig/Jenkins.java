package jenkinsConfig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins {
	
	
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumUpdate\\UpdatedDriver\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("http://demowebshop.tricentis.com/");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.findElement(By.xpath("//a[@class='ico-register']")).click();
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drv.findElement(By.xpath("//input[@id='gender-male']")).click();
		drv.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("jdemon");
		drv.findElement(By.xpath("//input[@id='LastName']")).sendKeys("demon@12");
		drv.findElement(By.xpath("//input[@id='Email']")).sendKeys("demoj@gmail.com");
		
		WebElement ele=drv.findElement(By.xpath("//strong[contains(text(),'Newsletter')]"));
		JavascriptExecutor js=(JavascriptExecutor)drv;
		js.executeScript("scroll(0,200)",ele);
		
		drv.findElement(By.xpath("//input[@id='Password']")).sendKeys("Insert@123");
		drv.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Insert@123");
		
//		drv.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
		
	}

}
