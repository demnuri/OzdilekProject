import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class RastgeleUrunSecimi extends BasePage{
    @Step("<Rasgele bir ürün seç> rastgele ürün secildi")
    public void selectRondamproduct(String rastgele) {
        Random rdn = new Random();
        List<MobileElement> pd = appiumDriver.findElements(By.xpath(rastgele));
        System.out.println("pd" + pd);
        MobileElement element = pd.get(rdn.nextInt(pd.size()));
        System.out.println("element" + element);
        element.click();
    }
}
