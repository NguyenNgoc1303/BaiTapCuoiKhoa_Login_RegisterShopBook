package ngocnt.demo.steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ngocnt.demo.common.DriverFactory;
import ngocnt.demo.page.HomePage;
import ngocnt.demo.page.LoginPage;
import ngocnt.demo.page.RegisterPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage ;
    RegisterPage registerPage;
    public LoginSteps() {
        this.driver = DriverFactory.createDriver();
        loginPage = new LoginPage(this.driver);
        homePage  = new HomePage(this.driver);
        registerPage  = new RegisterPage(this.driver);

    }

    @Given("^Open the homepage$")
    public void openHomePage(){
        homePage.openHomePage();

    }
    @And("^Click on My Account Menu$")
    public void clickOnMyAccount(){
    loginPage.clickOnMyAccountMenu();
    }

    @And("^Enter registered (.*) in username textbox$")
    public void enterUserName(String username) {

        loginPage.inputUsername(username);
    }
    @And("^Enter (.*) in password textbox$")
    public void enterPassword(String password) {
    loginPage.inputPassword(password);
    }
    @And("^Enter the (.*) field with some characters.$")
    public void getPasswordCharacters(String text) {
        loginPage.inputPassword(text);
    }

    @And("^Click on login button$")
    public void clickButtonLogin() {
    loginPage.clickOnLoginButton();
    }
    @Then("^User must successfully login to the web page$")
    public void  verifyLoginSuccess(){
    loginPage.verifyDashboardDisplayed();
    }
    @Then("^User will be registered successfully and will be navigated to the Home page$")
    public void  verifyRegisSuccess(){
        registerPage.verifyLogoutDisplayed();
    }
    @Then("^Proper error must be displayed(.*)$")
    public void  verifyErrorMessage(String message){
        loginPage.verifyErrorMessage(message);
    }
    @Then("^The password field should display the characters in asterisks$")
    public void  displayPasswordCharacter(){
        loginPage.displayPasswordOnScreen();
    }
    @And("^Enter the case changed (.*) in username textbox$")
    public void sendUserChanged(String username){
        loginPage.inputUsername(username);
    }
    @And("^Enter the case changed (.*) in the password tetxbox$")
    public void sendPasswordChanged(String passnew ){
        loginPage.inputPassword(passnew);

    }
    @And("^Login must fail saying (.*)$")
    public void  verifyErrorMessages(String message ) {
        loginPage.verifyErrorMessage(message);
    }
    @And("^Once your are logged in, sign out of the site, press back button$")
    public void    BackLogin(){
        driver.navigate().back();
    }
    @And("^User shouldn’t be signed in to his account rather a general webpage must be visible$")
     public void   ScreenLogoutFail() {

      loginPage.pageRefresh();

    }

    @And("^Enter registered (.*) in Email-Address textbox$")
    public void RegisterAccount(String userName){
        registerPage.inputUsernameRegis(userName);
    }
    @And("^Enter (.*) in password new textbox$")
    public void enterPasswordRegis(String password) {
       registerPage.inputPasswordRegis(password);

    }
    @And("^Click on Register button$")
    public  void clickRegister()  {

        registerPage.clickOnRegisterButton();
    }

   @And("^Enter (.*) in Email-Address textbox$")
   public  void enterUserRegis(String username){

       registerPage.inputUsernameRegis(username);
   }

   @And("^Registration must fail with a warning message(.*)$")
   public void  verifyErrorMessagesRegis(String message )
   {
       registerPage.verifyErrorMessage(message);
   }

    @After
    public void afterTest(Scenario scenario){
        if (true){
            final  byte [] screenshot  =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png","anh");
           homePage.getDriver().quit();
        }
    }
}
