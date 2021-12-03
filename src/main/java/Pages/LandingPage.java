package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signInButton= By.cssSelector("[alt='Sign in with Google']");
    private By usernameField= By.xpath("//*[@id=\"identifierId\"]");
   // private By passwordField= ;


    public HomePage getHomePage(/**String email, String password**/){
        driver.findElement(signInButton).click();
//        driver.findElement(usernameField).sendKeys(email);
//        driver.findElement(passwordField).sendKeys(password);
       return new HomePage(driver);
    }
}
