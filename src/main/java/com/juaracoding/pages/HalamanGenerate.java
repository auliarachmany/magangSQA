package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HalamanGenerate {

    private final WebDriver driver;

    public HalamanGenerate() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/p")
    WebElement Laporan;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[11]/div[2]/p")
    WebElement generate;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/p")
    WebElement txtHeadingGenerate;

    @FindBy(xpath = "/html/body/div/div/div/div/h1")
    WebElement txt404;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/div[1]/div/input")
    WebElement inputStartDate;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/div[2]/div/input")
    WebElement inputEndDate;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[2]/div/div/div/input")
    WebElement inputNIK;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[3]/div/div/div/input")
    WebElement inputNamaUser;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[4]/div/div/div/input")
    WebElement inputNamaUpliner;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[1]/div[5]/div/div/div/input")
    WebElement inputUnit;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[2]/div[1]/button")
    WebElement btnGenerate;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/form/div[2]/div[2]/button")
    WebElement btnReset;

    @FindBy(id = "dateColumnHeader")
    WebElement dataModified;

    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[1]/a")
    WebElement txtDowbloadGenerate;


    public void BtnLaporan() {
        Laporan.click();
    }
    public void BtnGenerate() {
        generate.click();
    }

    public void setInputstartdate (String insertstartdate) {
        inputStartDate.sendKeys(insertstartdate);
    }

    public void setInputenddate (String insertenddate) {
        inputEndDate.sendKeys(insertenddate);
    }

    public void setInputNIK(String insertNIK) {
        this.inputNIK.sendKeys(insertNIK);
    }

    public void setInputNamaUser(String insertNamaUser) {
        this.inputNamaUser.sendKeys(insertNamaUser);
    }

    public void setInputNamaUpliner(String insertUpliner) {
        this.inputNamaUpliner.sendKeys(insertUpliner);
    }

    public void setInputUnit(String insertUnit){
        this.inputUnit.sendKeys(insertUnit);

        delay(3);
        inputUnit.sendKeys(Keys.ARROW_DOWN);
        delay(3);
        inputUnit.sendKeys(Keys.ENTER);
    }

    public void setBtnGenerate(){
        btnGenerate.click();
    }

    public void setBtnReset() {
        btnReset.click();
    }

    public void setDataModified() {
        dataModified.click();
    }

    public String getTxtDowbloadGenerate() {
        return  txtDowbloadGenerate.getText();
    }

    public String getTxtHeadingGenerate() {
        return txtHeadingGenerate.getText();
    }

    public String getTxt404() {
        return txt404.getText();
    }

    public String getTxtReset() {
        return btnReset.getText();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
