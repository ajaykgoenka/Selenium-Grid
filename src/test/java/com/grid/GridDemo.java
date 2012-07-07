package com.grid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {

	public WebDriver driver;
	
	@Parameters ({"browser"})
	@BeforeClass
	    public void setup(String browser) throws InterruptedException, MalformedURLException {
		File file = new File("C:/Users/Administrator/Dropbox/IEDriver.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\ChromeDriver\\chromedriver.exe");					
		DesiredCapabilities capability=null;
		
		
		   if (browser.equalsIgnoreCase("Firefox")) {
			   System.out.println("Firefox");
			     capability= DesiredCapabilities.firefox();
			     capability.setPlatform(org.openqa.selenium.Platform.ANY);
			        //capability.setVersion("3.6");
		}
		
		   if (browser.equalsIgnoreCase("Internet Explorer")) {
			   System.out.println("Internet Explorer");
			     capability= DesiredCapabilities.internetExplorer();
			     capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			        //capability.setVersion("3.6");			   
			
		}
		
		   if (browser.equalsIgnoreCase("Chrome")) {
			   System.out.println("Chrome");
			     capability= DesiredCapabilities.chrome();
			     capability.setPlatform(org.openqa.selenium.Platform.ANY);
			        //capability.setVersion("3.6");			   
			
		}
		
		    System.out.println("A");
		    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		   //Thread.sleep(50000L);
		    System.out.println("B");
		    driver.get("http://google.com");
		    driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		    
			
	}
	
	@Test	
	public void test_ONE() throws InterruptedException{
		    Thread.sleep(10000L);			
			driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");				
		
	     }
	
	@Test	
	public void test_TWO() throws InterruptedException{
		    Thread.sleep(10000L);			
			driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");				
		
	     }
	
	@Test	
	public void test_THREE() throws InterruptedException{
		    Thread.sleep(10000L);			
			driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");				
		
	     }
	
	
 	 @AfterClass
 	 public void teardown() throws InterruptedException{
	 		Thread.sleep(50000L);
	 		 driver.close();
	 		 
	 		 
	 	 }
	 	 
	
}
