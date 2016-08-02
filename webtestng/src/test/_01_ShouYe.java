package test;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import CommonCase.Login;

public class _01_ShouYe {



    @Parameters({"user","pwd"})
    @Test(groups="parameter")
	public void test_shouye(String user,String pwd) throws InterruptedException {
/**
 * 登录后校验 首页的内容
 */
    	WebDriver dr = new ChromeDriver();
		dr.get("http://hz.redlion56.com/login/");
		dr.manage().window().maximize(); // 最大化
		Thread.sleep(3000);
		dr.findElement(By.id("txtaccount")).sendKeys(user);
		dr.findElement(By.id("txtpassword")).sendKeys(pwd);
		dr.findElement(By.xpath("//div[@id='btlogin']")).click();
		Thread.sleep(3000);
		
		dr.switchTo().frame("tabs_iframe"); // 进入iframe
		Thread.sleep(3000);
		AssertJUnit.assertTrue(dr.getPageSource().contains("货主信息页"));
		//AssertJUnit.assertTrue(dr.getPageSource().contains(""));
		dr.quit();
	}

}