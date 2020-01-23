package test;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import page.actions.LoginPageActions;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void sampleTest() throws Exception {
        DriverFactory.newInstance();
        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().setSize(new Dimension(1000, 1000));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //The above things can be moved to a common funtion or to @Before

        driver.get("https://opensource-demo.orangehrmlive.com/");
        LoginPageActions.loginWithCredentials();


        driver.close();
        driver.quit();
    }

}


