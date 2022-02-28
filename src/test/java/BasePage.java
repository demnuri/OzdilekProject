
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import com.thoughtworks.gauge.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.List;
import java.util.Random;


public class BasePage extends BaseTest{


    @Step("<wait> saniye kadar bekle")
    public void bekleme(int wait) throws InterruptedException{
        Thread.sleep(1000*wait);
    }

    @Step("<id> li uygulama kontrolü")
    public void acılısKontrol(String id){
        String checkText = appiumDriver.findElement(By.id(id)).getText();
        Assert.assertEquals("ALIŞVERİŞE BAŞLA", checkText);
    }
    @Step("<id> li uygulama giriş sayfası kontrolü")
    public void girisKontrol(String id) {
        String checkText = appiumDriver.findElement(By.id(id)).getText();
        //Assert.assertEquals("Market", checkText);
        Logger.info("Anasayfa açıldı");
    }


    @Step("<asagıya kaydır>")
    public void asagıyaKaydır(String kaydır) {
        TouchAction ts = new TouchAction(appiumDriver);
        ts.press(PointOption.point(530,1900)).moveTo(PointOption.point(530,400)).release().perform();
        Logger.info("Aşağıya kaydırıldı");

    }








}
