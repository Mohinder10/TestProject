package newpackage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;


public class MyClass {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\Desktop\\Driver_Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait driverWait=new WebDriverWait(driver, 20);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String baseUrl="http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseUrl);
		driver.switchTo().frame("classFrame");
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/ul/li[5]/a")));
		System.out.println("Title of the page is: "+driver.getTitle());		
		if(!driver.getTitle().equals("Google")){
			try{
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File("C:\\Users\\mohin\\Pictures\\Screenshots\\Screenshot1.png"));
			}catch(Exception e){
				e.printStackTrace();	
			}
		}
		driver.quit();
		
		//System.out.println("hello");
	}
}
