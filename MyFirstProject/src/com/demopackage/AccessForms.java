package com.demopackage;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;*/
import org.openqa.selenium.support.ui.WebDriverWait;

/*import com.google.common.collect.ImmutableBiMap.Builder;*/

public class AccessForms {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\Desktop\\Driver_Server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("http://demo.guru99.com/selenium/webform/login.html");
		WebElement email= driver.findElement(By.name("email"));
		WebElement password= driver.findElement(By.name("passwd"));
		email.sendKeys("mohinderbatra");
		password.sendKeys("12345");
		password.submit();
		
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		Select drpDwn= new Select(driver.findElement(By.name("country")));
		drpDwn.selectByIndex(3);*/
		
		/*driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1= driver.findElement(By.id("vfb-7-1"));
		WebElement radio2= driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		radio2.click();
		WebElement chkBox1= driver.findElement(By.id("vfb-6-0"));
		WebElement chkBox2= driver.findElement(By.id("vfb-6-1"));
		WebElement chkBox3= driver.findElement(By.id("vfb-6-2"));
		chkBox1.click();
		chkBox2.click();
		chkBox3.click();
		
		Actions builder = new Actions(driver);
        Action deSelect = builder
        		.click(chkBox1)
        		.click(chkBox2)
        		.click(chkBox3)
                .build();
		
		deSelect.perform();*/
		
		//Implicit Wait
		/*String underConst= "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/newtours/");
		int i=0;
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		String linkTexts[]= new String[allLinks.size()];
		for(WebElement e : allLinks){
			linkTexts[i]=e.getText();
			i++;
		}
		for(String e: linkTexts){
			driver.findElement(By.linkText(e)).click();
			if(driver.getTitle().equals(underConst)){
				System.out.println("Link \""+ e+"\" is under construction!");
			}else{
				System.out.println("Link \""+ e+"\" is working.");
			}
			driver.navigate().back();	
		}*/
		
		//Explicit & Fluent wait
		String underConst= "Under Construction: Mercury Tours";
		/*Wait waitFluent = new FluentWait(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS);*/	
		
		/*WebDriverWait wait = new WebDriverWait(driver,20);		
		driver.get("http://demo.guru99.com/selenium/newtours/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")));
		*/
		//waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")));
		/*int i=0;
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		String linkTexts[]= new String[allLinks.size()];
		for(WebElement e : allLinks){
			linkTexts[i]=e.getText();
			i++;
		}
		for(String e: linkTexts){
			driver.findElement(By.linkText(e)).click();
			if(driver.getTitle().equals(underConst)){
				System.out.println("Link \""+ e+"\" is under construction!");
			}else{
				System.out.println("Link \""+ e+"\" is working.");
			}
			driver.navigate().back();	
		}*/
		
		
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Actions builder= new Actions(driver);
		Action actionEmail = builder
				.moveToElement(email)
				.click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys("hello")
				.keyUp(email, Keys.SHIFT)
				.doubleClick(email)
				.contextClick()
				.sendKeys(Keys.ARROW_DOWN)
				//.sendKeys(Keys.ENTER)
				.build();
		actionEmail.perform();*/
		
		/*WebElement password = driver.findElement(By.id("pass"));
		Action actionPwd = builder
				.moveToElement(password)
				.contextClick()
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.RETURN)
				.build();
		
		actionPwd.perform();*/
		
		/*driver.get("http://newtours.demoaut.com/");
		String text=driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td[1]")).getText();
		System.out.println("Text is:"+text);*/
		
		/*
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("F:\\File1.html");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();*/
		
		/*driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();	
		
        Alert alert = driver.switchTo().alert();
        alert.accept();*/
        
		/*driver.get("http://demo.guru99.com/test/drag_drop.html");
		Properties obj = new Properties();			
		//System.out.println(System.getProperty("user.dir"));
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\ObjectRepo.properties");
		System.out.println(objfile);
		obj.load(objfile);
		Actions actions= new Actions(driver);
		WebElement source= driver.findElement(By.xpath(obj.getProperty("srcLocation")));
		WebElement target= driver.findElement(By.xpath(obj.getProperty("destLocation")));
		actions.dragAndDrop(source,target).build().perform();*/
		
		/*JavascriptExecutor jsExec= (JavascriptExecutor) driver;
		driver.get("http://demo.guru99.com/test/guru99home/");
		jsExec.executeScript("window.scrollBy(0,1000)");*/
		
		
		
		/*driver.get("http://demo.guru99.com/test/guru99home/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement element = driver.findElement(By.id("philadelphia-field-submit"));
		js.executeScript("arguments[0].scrollIntoView();", element);*/
		
		/*
		String PROXY = "199.201.125.147:8080";
		 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(PROXY)
		 .setFtpProxy(PROXY)
		 .setSslProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		driver=new ChromeDriver(cap);*/
		
		String url="https://www.google.com";
		driver.get(url);
		String response = "";
		HttpsURLConnection connection = (HttpsURLConnection)(new URL(url).openConnection());

		try
		{
			connection.connect();
			response = connection.getResponseMessage();	        
			connection.disconnect();

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(response);
		
		
		//driver.quit();
	}
	
}
