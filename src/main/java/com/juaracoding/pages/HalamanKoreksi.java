package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HalamanKoreksi {
    private final WebDriver driver;

    public HalamanKoreksi() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/p")
    WebElement Laporan;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[10]/div[2]/p")
    WebElement koreksi;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/p")
    WebElement txtHeadingKoreksi;

    @FindBy(xpath = "/html/body/div/div/div/div/h1")
    WebElement txt404;

    @FindBy(id = "search")
    WebElement inputsearch;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td[2]/h6")
    WebElement txtsearchname;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[2]/div/button[3]")
    WebElement btnSearch;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/p[2]")
    WebElement txtkosong;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[2]/div/button[2]")
    WebElement getBtnRiset;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[2]/div/button[1]")
    WebElement getBtnFilter;

    @FindBy(id = "job_departement")
    WebElement inputjobdepartement;
    @FindBy (xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    WebElement btnTerapkan;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td[2]/h6")
    WebElement txtresultfilterjob;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/h1")
    WebElement txt500;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
    WebElement inputstartdate;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[2]/div/input")
    WebElement inputenddate;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td[10]/div/div/button")
    WebElement MenuApprove;

    @FindBy (xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    WebElement ApproveKoreksi;

    @FindBy (xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    WebElement btnSetujui;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td[8]/div/h6")
    WebElement txtStatus;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    WebElement btnBatalApproved;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    WebElement rejectKoreksi;

    @FindBy(id = "rejectReason")
    WebElement inputAlasan;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    WebElement btnTolakReject;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    WebElement btnBatalReject;

    @FindBy(id = "mui-2")
    WebElement rowPerPage;

    @FindBy(xpath = "/html/body/div[13]/div[3]/ul/li[1]")
    WebElement page5;

    @FindBy(xpath = "/html/body/div[13]/div[3]/ul/li[2]")
    WebElement page10;

    @FindBy(xpath = "/html/body/div[13]/div[3]/ul/li[3]")
    WebElement page25;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/button[3]")
    WebElement btnNextPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/button[2]")
    WebElement btnPreviousPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/button[4]")
    WebElement btnLastPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/button[1]")
    WebElement btnFirstPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td[2]/h6")
    WebElement txtNextBackLastFirstPage;


    public void BtnLaporan() {
        Laporan.click();
    }
    public void BtnKoreksi() {
        koreksi.click();
    }

    public String getTxtHeadingKoreksi() {
        return txtHeadingKoreksi.getText();
    }

    public String getTxt404() {
        return txt404.getText();
    }

    public void BtnSearch(){
        btnSearch.click();
    }

    public void Inputsearch(String inputname) {
        this.inputsearch.sendKeys(inputname);
    }

    public void BtnRiset(){
        getBtnRiset.click();
    }
    public void BtnFilter(){
        getBtnFilter.click();
    }
    public void setInputjobdepartement(String insertjobdepartement){

        this.inputjobdepartement.sendKeys(insertjobdepartement);
        delay(3);
        inputjobdepartement.sendKeys(Keys.ARROW_DOWN);
        delay(3);
        inputjobdepartement.sendKeys(Keys.ENTER);
    }
    public void setBtnTerapkan(){
        btnTerapkan.click();
    }

    public void setInputstartdate (String insertstartdate) {
        inputstartdate.sendKeys(insertstartdate);
    }

    public void setInputenddate (String insertenddate) {
        inputenddate.sendKeys(insertenddate);
    }

    public void setMenuApprove () {
        MenuApprove.click();
    }

    public void setApproveKoreksi () {
        ApproveKoreksi.click();
    }

    public void setBtnSetujui () {
        btnSetujui.click();
    }

    public void btnBatalAprroved() {
        btnBatalApproved.click();
    }

    public void setRejectKoreksi() {
        rejectKoreksi.click();
    }

    public void inputAlasan(String isiAlasan){
        this.inputAlasan.sendKeys(isiAlasan);
    }

    public void btnTolakReject() {
        btnTolakReject.click();
    }

    public void btnBatalReject() {
        btnBatalReject.click();
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

    public void btnNextPage() {
        btnNextPage.click();
    }

    public void btnPreviousPage() {
        btnPreviousPage.click();
    }

    public void btnLastPage() {
        btnLastPage.click();
    }

    public void btnFirstPage() {
        btnFirstPage.click();
    }

    public String gettxtsearchname(){
        return txtsearchname.getText();
    }
    public String gettxtkosong(){
        return txtkosong.getText();
    }

    public String gettxtresultfilterjob(){
        return txtresultfilterjob.getText();
    }

    public String gettxt500() {
        return txt500.getText();
    }

    public String gettxtStatus() {
        return txtStatus.getText();
    }

    public String getTxtAlasan() {
        return inputAlasan.getAttribute("required");
    }

    public String getTxtPage() {
        return rowPerPage.getText();
    }

    public String getTxtNextBackLastFirstPage() {
        return txtNextBackLastFirstPage.getText();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
