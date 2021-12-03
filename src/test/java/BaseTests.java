

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;



public class BaseTests {
    private WebDriver driver;
    LandingPage signIn;

    private final String baseUrl ="http://localhost:3000";


    //This sets up an optional configuration to run the test(s) within the class
    @BeforeTest
    @Parameters({"browser", "url"})
    public void setup(@Optional("chrome")String browser, @Optional(baseUrl)String url) throws MalformedURLException {
        TestDriverSetUp testDriverSetUp = new TestDriverSetUp(browser, url);
        driver = testDriverSetUp.getDriver();
        System.out.println(driver.getTitle());
        signIn = new LandingPage(driver);
    }


    //@AfterTest
    public void endSession() {
        driver.quit();
    }

}

