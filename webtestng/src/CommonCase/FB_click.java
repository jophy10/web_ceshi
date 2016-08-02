package CommonCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author zhou
 *点击发布按钮 发布竞价单
 */
public class FB_click {
	
	public void Fb_click(WebDriver dr) throws InterruptedException{

		// 发布
		dr.findElement(By.id("publish")).click();
		Thread.sleep(1000);
		dr.switchTo().defaultContent(); //退出 tabs_iframe
//		Thread.sleep(1000);		
//        String window= dr.getWindowHandle();   //获取当前窗口的句柄
//        Thread.sleep(1000);
//        dr.switchTo().window(window);//到当前句柄位置
		
		//Alert confirm = dr.switchTo().alert();  //捕获confirm
		//Thread.sleep(2000);
		//confirm.accept();  
		Thread.sleep(6000);
		dr.findElement(By.xpath("/html/body/div[11]/div[3]/a[1]")).click();
		Thread.sleep(5000);
		
	}
}
