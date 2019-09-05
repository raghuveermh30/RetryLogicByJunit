/**
 * 
 */
package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.base.RetryRule;

/**
 * @author raghuveer.mh
 *
 */
public class RetryRuleTest {
	
	static WebDriver driver;
    final private String URL = "https://www.amazon.in/";
 
 

    //Set retry count argument
    @Rule
    public RetryRule retryRule = new RetryRule(3);
 
    @Test
    public void getURLExample() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
      String title =  driver.getTitle();
      Assert.assertEquals(title, "dsds");
      driver.close();
        
    }
	
	
	
	
	
	
	

}
