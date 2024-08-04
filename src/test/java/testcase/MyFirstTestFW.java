package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest{
    @Test
	public static void LoginTest() throws InterruptedException {
		System.out.println("clicked successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath(loc.getProperty("signin_link"))).click();
		//driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("dipakmusale90@gmail.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("Netking@7890");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	}
}
