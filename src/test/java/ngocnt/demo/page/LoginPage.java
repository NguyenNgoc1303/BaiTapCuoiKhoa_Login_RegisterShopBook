package ngocnt.demo.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageFactory {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@id='main-nav']//a[text()='My Account']")
    WebElement myAccountMenu;

    @FindBy(id = "username")
    WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[text()='Dashboard']")
    WebElement dashboard;

    @FindBy(xpath = "//div[@class='woocommerce']//li")
    WebElement errorLabel;



    public void clickOnMyAccountMenu(){
        myAccountMenu.click();
    }

    public void login(String username,String password){
        inputUsername(username);
        inputPassword(password);
        clickOnLoginButton();
    }



    public void inputUsername(String username){
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }

    public void inputPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickOnLoginButton(){
        btnLogin.click();
    }

    public void verifyDashboardDisplayed(){
        Assert.assertTrue(dashboard.isDisplayed());
    }
    public void pageRefresh(){
        driver.navigate().refresh();
    }
    public  void verifyErrorMessage(String message)
    {
        Assert.assertEquals(message,errorLabel.getText());
    }
    public  void displayPasswordOnScreen(){
       Assert.assertTrue(txtPassword.isDisplayed());
}
}
