package CommonCase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshot {
	public void screenshot(WebDriver dr){
		 File screenshot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			
			try {
			//	FileUtils.copyFile(screenshot, new File("D:screenshotsscreenshots1.jpg"));
				FileUtils.copyFile(screenshot, new File("D:"+File.separator+"Screenshot"+File.separator+getCurrentDateTime()+ ".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	private String getCurrentDateTime() {
		// TODO Auto-generated method stub
		 SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//设置日期格式
		    //System.out.println(df.format(new Date()));
		 return df.format(new Date()); 

		
	}

}
