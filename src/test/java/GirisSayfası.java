import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class GirisSayfası extends BasePage{
    @Step("<id> İd'li elemente <text> değerini yaz")
    public void yaz(String id,String text){
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        System.out.println(id + "elementini bul ve " + text + " değerini yaz"  );
        Logger.info("Kullanıcı adı ve şifre yazıldı.");
    }

}
