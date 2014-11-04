package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriverBackedSelenium;


public class TicTacToeWeb {

    public Selenium selenium;

    static WebDriver driver;
    static String baseUrl;
    static String port;

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
        baseUrl = "http://sniglartest1.herokuapp.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriver driver2 = new FirefoxDriver();
        String baseUrl2 = "http://sniglartest1.herokuapp.com/";
        selenium = new WebDriverBackedSelenium(driver2, baseUrl2);

    }

    @Test
    public void assertTitle() {
        // String port = System.getenv("PORT");
        // if (port == null){
        //  port = "7055";
        // }
     //    driver.get("https://sniglartest1.herokuapp.com:" + port);

        driver.get(baseUrl);

        assertEquals("TicTacToe", driver.getTitle());
    }

    // @Test
    // public void testWhenOWins() throws Exception {
    //     selenium.open("/");
    //     selenium.click("id=4");
    //     TimeUnit.SECONDS.sleep(1);
    //     selenium.click("id=0");
    //     TimeUnit.SECONDS.sleep(1); 
    //     selenium.click("id=6");
    //     TimeUnit.SECONDS.sleep(1);
    //     selenium.click("id=1");
    //     TimeUnit.SECONDS.sleep(1);
    //     selenium.click("id=8");
    //     TimeUnit.SECONDS.sleep(1);
    //     selenium.click("id=2");
    //     TimeUnit.SECONDS.sleep(1);
    //     selenium.setSpeed("5000");
    //     assertEquals("O", selenium.getValue("id=2"));
    //     TimeUnit.SECONDS.sleep(1);
    // }


      @Test
    public void testWhenOWins() throws Exception {
        selenium.open("/");
        selenium.click("id=4");
        TimeUnit.SECONDS.sleep(1);
        selenium.setSpeed("5000");
        assertEquals("O", selenium.getValue("id=4"));

    }
}
