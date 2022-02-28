import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class AnaSayfa extends BasePage{
    @Step("id <id> li elemente tıkla")
    public void clickByid(String id) {
        appiumDriver.findElement(By.id(id)).click();
        System.out.println(id + "elementine tıklandı");

    }
    @Step("xpath <xpath> li elemente tıkla")
    public void clickXpath(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();

    }
}
