package Google_Search_results_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


import static Google_Search_results_Test.Helpers.*;


public class Google_Search_tests {

    public static WebDriver driver = null;
    public static LocatorsForWebElements webElement = null;

    @Before
    public void beforeEach() {
        /*
        System.setProperty("webdriver.chrome.driver", "F://Auto//Chrome_driver//chromedriver.exe");
        driver = new ChromeDriver();
        */
        System.setProperty("webdriver.gecko.driver", "F://Auto//Firefox_driver//geckodriver.exe");
        driver = new FirefoxDriver();
        webElement = new LocatorsForWebElements(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        goToUrl(driver, "https://www.google.com");
    }

    @After
    public void afterEach(){
        driver.quit();
    }

    @Test
    public void test_1_FindTextAfterSearch(){
        sendTextToWebElement(webElement.fieldSearch, "Selenium IDE export to C#");
        clickButton(webElement.buttonSearchInDropDownList);
        //webElement.fillSearchField("Selenium IDE export to C#");
        Assert.assertTrue(recieveElementText(webElement.searchResult).contains("Selenium IDE"));
    }

}
