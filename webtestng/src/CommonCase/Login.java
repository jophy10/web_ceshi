package CommonCase;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
	
	WebDriver dr = new ChromeDriver();
	
	public WebDriver login() throws InterruptedException {
		
		Properties properties = properties();
		
		dr.get(properties.getProperty("url"));
		dr.manage().window().maximize(); // 最大化
		Thread.sleep(3000);
		dr.findElement(By.id("txtaccount")).sendKeys(
				properties.getProperty("user"));
		dr.findElement(By.id("txtpassword")).sendKeys(
				properties.getProperty("pwd"));
		dr.findElement(By.xpath("//div[@id='btlogin']")).click();
		Thread.sleep(3000);
		/**
		 * 校验登录后的页面（首页）,断言
		 * 
		 */
		
		Thread.sleep(3000);
		return dr;
	}
	

 	public Properties properties(){
 		Properties pp = new Properties();
	try {
		
		//加载配置文件
		 pp.load(Login.class.getClassLoader().getResourceAsStream(
				"TestSuites/db.properties"));
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pp;
}


}