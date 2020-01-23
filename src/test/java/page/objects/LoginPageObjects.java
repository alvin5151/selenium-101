package page.objects;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//
public class LoginPageObjects {
    ///**************************************************************************************************************************************/
    //user name
    public static WebElement userName(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='txtUsername']"));
    }
    //password
    public static WebElement password(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='txtPassword']"));
    }
    //Login Button
    public static WebElement loginBtn(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='btnLogin']"));
    }
}
