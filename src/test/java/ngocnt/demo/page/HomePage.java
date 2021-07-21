package ngocnt.demo.page;

import ngocnt.demo.common.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//nav[@id='main-nav-wrap']//a[text()='Shop']")
    WebElement shopMenu;

    @FindBy(xpath = "//div[@id='content']/nav/a[text()='Home']")
    WebElement homeMenuButton;

    @FindBy(xpath = "//div[@class='row_inner']//div[@data-slide-duration='0']//img")
    List<WebElement> listSlider;

    @FindBy(xpath = "//div[@class='woocommerce']//a/img")
    List<WebElement> listArrivals;
    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[text()='Dashboard']")
    WebElement dashboard;


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickOnShopMenu(){
        shopMenu.click();
        waitForSec(3);
    }


    public void verifyDashboardDisplayed(){
        Assert.assertTrue(dashboard.isDisplayed());
    }
    public void  openHomePage(){
    getDriver().get("http://practice.automationtesting.in/");
    }

    public void clickOnHomeMenuButton(){
        homeMenuButton.click();
    }


    public void verifyNumberOfSliders(int i){
        Assert.assertEquals(3,listSlider.size());
    }

}
