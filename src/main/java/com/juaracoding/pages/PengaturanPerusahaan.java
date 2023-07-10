package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PengaturanPerusahaan {

    private WebDriver driver;

    public PengaturanPerusahaan() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div[2]/p")
    WebElement menuPerusahaan;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div[2]/p")
    WebElement pengaturanPerusahaan;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/p")
    WebElement txtPengaturanPerusahaan;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/button")
    WebElement btnTambahkan;

    @FindBy(id = "max-radius")
    WebElement inputMaxRadius;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/button[1]")
    WebElement btnTambah;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    WebElement txtPopUpResponse;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[4]/div/div/button")
    WebElement menuEdit;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    WebElement edit;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[2]/button[1]")
    WebElement btnSimpan;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[3]/span/span[1]/input")
    WebElement btnSelfIn;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    WebElement delete;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[2]/button[1]")
    WebElement btnYa;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[2]/div")
    WebElement rowPerPage;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    WebElement page5;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    WebElement page10;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]")
    WebElement page25;

    public void menuPerusahaan() {
        menuPerusahaan.click();
    }

    public void pengaturanPerusahaan() {
        pengaturanPerusahaan.click();
    }

    public void btnTambahkan() {
        btnTambahkan.click();
    }

    public void inpuMaxRadius(String maxRadius){
        inputMaxRadius.clear();
        inputMaxRadius.sendKeys(maxRadius);
    }

    public void btnTambah() {
        btnTambah.click();
    }

    public void menuEdit() {
        menuEdit.click();
    }

    public void edit() {
        edit.click();
    }

    public void btnSimpan() {
        btnSimpan.click();
    }

    public void btnSelfIn() {
        btnSelfIn.click();
    }

    public void btnDelete(){
        delete.click();
    }

    public void btnYa() {
        btnYa.click();
    }

    public void rowPerPage() {
        rowPerPage.click();
    }

    public void page5() {
        page5.click();
    }

    public void page10() {
        page10.click();
    }

    public void page25() {
        page25.click();
    }

    public String getTxtPeengaturanPerusahaan() {
        return txtPengaturanPerusahaan.getText();
    }

    public String getTxtPopUpResponse(){   // Gagal menambahkan data company setting
        return  txtPopUpResponse.getText();
    }

    public String getTxtNotInputMaxRadius() {
        return inputMaxRadius.getAttribute("required");
    }

    public String getAlert() {
       return driver.switchTo().alert().getText();
    }

    public void getOk() {
        driver.switchTo().alert().accept();
    }

    public String getTxtPage() {
        return rowPerPage.getText();
    }

}
