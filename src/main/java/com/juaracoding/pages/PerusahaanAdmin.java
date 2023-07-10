package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerusahaanAdmin {

    private WebDriver driver;

    public PerusahaanAdmin() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div[2]/p")
    WebElement Perusahaan;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/div/div[1]/div[2]/p")
    WebElement PerusahaanAdmin;
    @FindBy (xpath = "/html/body/div[1]/div/header/div/p")
    WebElement txtperusahaan;
    @FindBy (xpath = "/html/body/div/div/div/div/h1")
    WebElement txt404;
    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/table/tbody/tr/td[4]/div/div/button")
    WebElement Btnmenuperusahaan;
    @FindBy (xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    WebElement Btnedit;

    @FindBy(id = "name")
    WebElement inputCompanyName;

    @FindBy(id = "industry")
    WebElement inputIndustry;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[2]/button[1]")
    WebElement btnSimpan;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/table/tbody/tr/td[1]/h6")
    WebElement txtCompanyName;

    @FindBy (xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    WebElement BtnDelete;

    @FindBy (xpath = "/html/body/div[4]/div[3]/div/form/div/div[2]/button[1]")
    WebElement BtnYa;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    WebElement txtgagaldelete;

    @FindBy (xpath = "/html/body/div[4]/div[3]/div/form/div/div[2]/button[2]")
    WebElement getBtnTidak;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div")
    WebElement Btnrowpage;

    @FindBy (xpath = "/html/body/div[4]/div[3]/ul/li[1]")
    WebElement Btnrow5;

    @FindBy (xpath = "/html/body/div[4]/div[3]/ul/li[2]")
    WebElement Btnrow10;

    @FindBy (xpath = "/html/body/div[4]/div[3]/ul/li[3]")
    WebElement Btnrow25;

    public void BtnPerusahaan() { Perusahaan.click();
    }
    public void BtnPerusahaanAdmin() {
        PerusahaanAdmin.click();
    }
    public void Btnmenuperysahaan() {
        Btnmenuperusahaan.click();
    }
    public void btnEdit() {
        Btnedit.click();
    }
    public void BtnTidak() {
        getBtnTidak.click();
    }

    public void inputCompanyName(String inputCompany){
        inputCompanyName.clear();
        delay(1);
        this.inputCompanyName.sendKeys(inputCompany);
    }

    public void inputIndustry(String inputIndustry){
        this.inputIndustry.clear();
        delay(1);
        this.inputIndustry.sendKeys(inputIndustry);
    }

    public void btnSimpan() {
        btnSimpan.click();
    }

    public void setBtnDelete () {
        BtnDelete.click();
    }
    public void setBtnYa () {
        BtnYa.click();
    }
    public  void setBtnrowpage () {
        Btnrowpage.click();
    }

    public void setBtnrow5 (){
        Btnrow5.click();
    }

    public void setBtnrow10 (){
        Btnrow10.click();
    }

    public void setBtnrow25 (){
        Btnrow25.click();
    }
    public String gettxtperusahaan() {
        return txtperusahaan.getText();
    }
    public String gettxt404 () {
        return txt404.getText();
    }

    public String getTxtCompanyName(){
        return  txtCompanyName.getText();
    }
    public String gettxtgagaldelete(){
        return txtgagaldelete.getText();
    }

    public String getTxtInputCompany() {
        return inputCompanyName.getAttribute("required");

    }

    public String getTxtInputIndustry() {
        return inputIndustry.getAttribute("required");
    }


    public String getTxtPage() {
        return Btnrowpage.getText();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
