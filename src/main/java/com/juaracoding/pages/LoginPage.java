package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Masuk']")
    WebElement btnLogin;
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement btnLogout;
    @FindBy(xpath = "//h5[normalize-space()='QA Tester']")
    WebElement btnProfile;

    @FindBy(xpath = "//h5[normalize-space()='QA Tester']")
    WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    WebElement txtInvalidCredentials;


    public void Btnlogout() { btnLogout.click();}

    public void enterUsername(String username) {this.username.sendKeys(username);}

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void BtnLogin(){
        btnLogin.click();
    }
    public void BtnProfile(){
        btnProfile.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

    public String getAtributUsername(){
        return username.getAttribute("required"); // return true, value dari required
    }

}
