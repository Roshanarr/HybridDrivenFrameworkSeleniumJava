package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountRegisterationPage extends BasePage{
    //constructor
    public AccountRegisterationPage(WebDriver driver){
        super(driver);
    }
    //LOcators
    @FindBy(xpath="//input[@id='input-firstname']")
    WebElement txtFirstname;

    @FindBy(xpath="//input[@id='input-lastname']")
    WebElement txtLasttname;

    @FindBy(xpath="//input[@id='input-email']")
    WebElement txtEmail;

    @FindBy(xpath="//input[@id='input-telephone']")
    WebElement txtTelephone;

    @FindBy(xpath="//input[@id='input-password']")
    WebElement txtPassword;

    @FindBy(xpath="//input[@id='input-confirm']")
    WebElement txtConfirmPassword;

    @FindBy(xpath="//input[@name='agree']")
    WebElement chkdPolicy;

    @FindBy(xpath="//input[@value='Continue']")
    WebElement btnContinue;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;

    //ActionMthods
    public void setFirstName(String fname) {
        txtFirstname.sendKeys(fname);

    }

    public void setLastName(String lname) {
        txtLasttname.sendKeys(lname);

    }

    public void setEmail(String email) {
        txtEmail.sendKeys(email);

    }

    public void setTelephone(String tel) {
        txtTelephone.sendKeys(tel);

    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);

    }

    public void setConfirmPassword(String pwd) {
        txtConfirmPassword.sendKeys(pwd);

    }

    public void setPrivacyPolicy() {
        chkdPolicy.click();

    }
    public void clickContinue() {
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
    }

    public String getConfirmationMsg() {
        try {
            return (msgConfirmation.getText());
        } catch (Exception e) {
            return (e.getMessage());

        }

    }
    }

