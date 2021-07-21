package ngocnt.demo.page;

import ngocnt.demo.common.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//ul[@id='main-nav']//a[text()='My Account']")
    WebElement myAccountMenu;

    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[text()='Logout']")
    WebElement logout;

    @FindBy(xpath = "//div[@class='woocommerce']//li")
    WebElement errorLabel;

    @FindBy(id = "reg_email")
    WebElement regUsername;

    @FindBy(id = "reg_password")
    WebElement regPassword;
    @FindBy(xpath =  "//label[@for='reg_password']")
    WebElement label;

    @FindBy(xpath = "//input[@name='register']")
    WebElement btnRegister;
    public void register(String username,String password){
        inputUsernameRegis(username);
        inputPasswordRegis(password);
        clickOnRegisterButton();
    }


    public void clickOnMyAccountMenu(){
        myAccountMenu.click();
    }



    public void clickOnRegisterButton(){
        label.click();
        waitForSec(10);
        btnRegister.click();
    }

    public void inputUsernameRegis(String username){
        regUsername.clear();
        regUsername.sendKeys(username);
    }

    public void inputPasswordRegis(String password) {
        regPassword.clear();
        regPassword.sendKeys(password);
    }


    public void verifyLogoutDisplayed(){
        Assert.assertTrue(logout.isDisplayed());
    }
    public  void verifyErrorMessage(String message)
    {
        Assert.assertEquals(message,errorLabel.getText());
    }
    public  void displayPasswordOnScreen(){
       Assert.assertTrue(regPassword.isDisplayed());
}
}
