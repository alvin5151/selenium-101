package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static void newInstance() {
        try {
            //chrome
                System.setProperty("webdriver.chrome.driver", "//usr//bin//chromedriver");  // replace your chrome driver path here
                driver = new ChromeDriver();

            }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }


    public static WebDriver getDriver() {
        return driver;
    }
}

