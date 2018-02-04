package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Toolsqa {

	public static void main(String [] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\Desktop\\Driver_Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://www.google.com");
		System.out.println(driver.getPageSource().length());
		By locator= By.id("lst-ib");
		WebElement text= driver.findElement(locator);
		text.sendKeys("I am Happy!");
		text.submit();*/
		
		/*driver.get("https://www.google.com");
		WebElement input= driver.findElement(By.id("lst-ib"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;')", input);
		
		EventFiringWebDriver eDriver= new EventFiringWebDriver(driver);
		File srcFile= eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("C:\\Users\\mohin\\Desktop\\Error1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container")));
		
		
		driver.switchTo().
		
		
		driver.quit();
		
	}
}
