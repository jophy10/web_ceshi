package CommonCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * 简易发货选择到货时间和开始时间
 */
public class selectTime {

	public void SelectTime(WebDriver dr) throws InterruptedException {

		// 到货时间
		dr.findElement(By.id("gmtEndPeriod")).click();
		Thread.sleep(1000);
		// 跳出当前frame，到默认frame
		dr.switchTo().defaultContent();
		Thread.sleep(1000);
		// 跳入时间控件的frame
		WebElement frameElement = dr.findElement(By
				.xpath("/html/body/div[9]/iframe"));
		Thread.sleep(1000);
		dr.switchTo().frame(frameElement);
		Thread.sleep(1000);
		WebElement Time = dr.findElement(By
				.xpath("//td[@onclick='day_Click(2016,6,30);']"));
		dr.findElement(By.xpath("//td[@onclick='day_Click(2016,6,30);']"))
				.click(); // 这里需要修改
		Thread.sleep(1000);
		dr.switchTo().defaultContent();
		dr.switchTo().frame("tabs_iframe");
		Thread.sleep(1000);

	}

	public void SelectStrTime(WebDriver dr) throws InterruptedException {
		// 开始时间
		dr.findElement(By.id("gmtStartPeriod")).click();
		Thread.sleep(1000);
		// 跳出当前frame，到默认frame
		dr.switchTo().defaultContent();
		Thread.sleep(1000);
		// 跳入时间控件的frame
		WebElement frameElement = dr.findElement(By
				.xpath("/html/body/div[9]/iframe"));
		Thread.sleep(1000);
		dr.switchTo().frame(frameElement);
		Thread.sleep(1000);
		WebElement Time = dr.findElement(By
				.xpath("//td[@onclick='day_Click(2016,6,30);']"));
		dr.findElement(By.xpath("//td[@onclick='day_Click(2016,6,30);']"))
				.click(); // 这里需要修改
		Thread.sleep(1000);
		dr.switchTo().defaultContent();
		dr.switchTo().frame("tabs_iframe");
		Thread.sleep(1000);

	}
	public void EndTime(WebDriver dr) throws InterruptedException {
		// 开始时间
		dr.findElement(By.id("endTime")).click();
		Thread.sleep(1000);
		// 跳出当前frame，到默认frame
		dr.switchTo().defaultContent();
		Thread.sleep(1000);
		// 跳入时间控件的frame
		WebElement frameElement = dr.findElement(By
				.xpath("/html/body/div[9]/iframe"));
		Thread.sleep(1000);
		dr.switchTo().frame(frameElement);
		Thread.sleep(1000);
		WebElement Time = dr.findElement(By
				.xpath("//td[@onclick='day_Click(2016,6,30);']"));
		dr.findElement(By.xpath("//td[@onclick='day_Click(2016,6,30);']"))
				.click(); // 这里需要修改
		Thread.sleep(1000);
		dr.switchTo().defaultContent();
		dr.switchTo().frame("tabs_iframe");
		Thread.sleep(1000);

	}

}
