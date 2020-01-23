package page.actions;


import org.openqa.selenium.WebDriver;
import page.objects.LoginPageObjects;
import util.DriverFactory;


public class LoginPageActions {

        public static void loginWithCredentials() throws  Exception{
            WebDriver driver = DriverFactory.getDriver();
            try{
                LoginPageObjects.userName(driver).sendKeys("Admin");
                LoginPageObjects.password(driver).sendKeys("admin123");
                LoginPageObjects.loginBtn(driver).click();

                //if we write the click and send keys in Utility class as a common function, we can easily pass the action status to the test report.
            }
           catch (Exception e)
           {
          // Will add the reporting stuff here when we progress
           }

        }

}
