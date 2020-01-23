package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LearnSelenium{

    @Test
    public void sampleTest() throws Exception {
        DriverFactory.newInstance();
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.orangehrm.com/");
    }

}


