package pageObjects;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//
public class YourDetailsObjects {
///**************************************************************************************************************************************/
    //Title
    public static WebElement lstTitle(WebDriver driver)
    {
        return driver.findElement(By.xpath("//select[@id='title']"));
    }
///**************************************************************************************************************************************/
}
