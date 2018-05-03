package g1;

import static org.junit.Assert.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.*;
import com.hpe.leanft.selenium.By;
import com.hpe.leanft.selenium.ByEach;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class SeleniumTest  {
    WebDriver driver;

    public SeleniumTest() {
    //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        RemoteWebDriver driver;


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setVersion("latest");
        capabilities.setCapability("platform", "Windows 8.1");
        capabilities.setCapability("testName", "Selenium JAVA desktop");
        capabilities.setCapability("SRF_CLIENT_ID", "t511780658_oauth2-ycYmLAZOUvnSDinyr2FK@hpe.com");
        capabilities.setCapability("SRF_CLIENT_SECRET", "TVQJVju2fDFgU5y3yL2o");
        capabilities.setCapability("resolution", "1366x768");
        capabilities.setCapability("browserName", "FireFox");

        driver = new RemoteWebDriver(new URL("https://ftaas.saas.hpe.com/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://advantageonlineshopping.com/#");
        Thread.sleep(10*1000);

        driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"speakersTxt\"]")).click();
        driver.findElement(org.openqa.selenium.By.linkText("Bose Soundlink Bluetooth Speaker III")).click();
        driver.findElement(org.openqa.selenium.By.xpath("//DIV[@id=\"productProperties\"]/DIV/BUTTON[normalize-space()=\"ADD TO CART\"]")).click();
        Thread.sleep(5*1000);
        driver.findElement(org.openqa.selenium.By.id("shoppingCartLink")).click();
        Thread.sleep(15*1000);
        // note - the following object is the price to the right of the item, above the EDIT | REMOVE LINKS
        // also, the xpath is simplified from what the spy found, which was //*[@id='shoppingCart']/table/tbody/tr/td[5]/p
        String foundPrice = driver.findElement(By.xpath("//*[@id='shoppingCart']//p")).getText();
        System.out.println("The captured price is: " + foundPrice);
        assertEquals("$269.99",foundPrice);//Checking item price

    }
}