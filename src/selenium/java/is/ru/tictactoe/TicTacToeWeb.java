package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import com.thoughtworks.selenium.Selenium;
import java.util.concurrent.TimeUnit;


public class TicTacToeWeb {

    static WebDriver driver;
    static String baseUrl;
    static String port;
    private Selenium selenium;

    // @BeforeClass
    // public static void before() {
       
    // }

    @AfterClass
    public static void after() {
        // Will be run after all tests in class have run
        driver.close();
    }

    @Before
    public void setup() {
        // Will be run before each test in class is run

         // Will be run before all tests in class are run
        driver = new FirefoxDriver();
        // port = System.getenv("PORT");
        // if(port == null) {
        //     port = "4567";
        // }
        // baseUrl = "http://sniglartest1.herokuapp.com/";
        String baseUrl = "http://sniglartest1.herokuapp.com/";
        selenium = new WebDriverBackedSelenium(driver, baseUrl);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }

    @Test
    public void assertTitle() {
    	// String port = System.getenv("PORT");
    	// if (port == null){
    	// 	port = "7055";
    	// }
     //    driver.get("https://sniglartest1.herokuapp.com:" + port);

        //driver.get(baseUrl);

        assertEquals("TicTacToe", selenium.getTitle());
    }


    @Test
    public void testAllgramtictactoeIT() throws Exception {

        selenium.open("/");
        selenium.click("id=0");
        TimeUnit.SECONDS.sleep(1);
        selenium.click("id=4");
        TimeUnit.SECONDS.sleep(1);
        selenium.click("id=1");
        TimeUnit.SECONDS.sleep(1);
        selenium.click("id=5");
        TimeUnit.SECONDS.sleep(1);
        selenium.click("id=2");
        TimeUnit.SECONDS.sleep(1);
        selenium.setSpeed("5000");
        assertEquals("X", selenium.getValue("id=2"));
        TimeUnit.SECONDS.sleep(1);
    }

     public void tearDown() throws Exception {
        selenium.stop();
    }
}


    
   
//     @Test
//     public void assertSpecificJoke() {
//         driver.get(baseUrl + "/specific.html");
//         driver.findElement(By.id("number")).clear();
//         driver.findElement(By.id("number")).sendKeys("5");
//         driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//         WebDriverWait wait = new WebDriverWait(driver, 10);
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
//         String expectedJoke = "Chuck Norris lost his virginity before his dad did.";
//         String foundJoke = driver.findElement(By.id("results")).getText();
//         assertEquals(foundJoke, expectedJoke);
//     }
// }
