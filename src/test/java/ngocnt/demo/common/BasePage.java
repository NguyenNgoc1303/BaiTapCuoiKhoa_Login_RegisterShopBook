package ngocnt.demo.common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageFactory {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public BasePage() {

    }

    public WebDriver getDriver() {
        return driver ;
    }
    public void waitForSec(int time){
        try {
            Thread.sleep(time*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}