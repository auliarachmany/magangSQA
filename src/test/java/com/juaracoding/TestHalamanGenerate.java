package com.juaracoding;

import com.juaracoding.pages.HalamanGenerate;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanGenerate {

    static WebDriver driver;
    static ExtentTest extentTest;
    static HalamanGenerate halamanGenerate = new HalamanGenerate();
    static LoginPage loginPage = new LoginPage();

    public TestHalamanGenerate() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.H.GNR.HLM.001.Masuk Menu Laporan")
    public void tcc_h_gnr_hlm_001_masuk_menu_laporan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        halamanGenerate.BtnLaporan();
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.HLM.001.Masuk Menu Laporan");
    }

    @And("TCC.H.GNR.HLM.001.Pilih Menu generate")
    public void tcc_h_gnr_hlm_001_menu_generate() {
        halamanGenerate.BtnGenerate();
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.HLM.001.Pilih Menu generate");
    }

    @Then("TCC.H.GNR.HLM.001.User get header generate")
    public void  tcc_h_gnr_hlm_001_user_get_header_generate() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanGenerate.getTxtHeadingGenerate(), "Generate");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.HLM.001.User get header generate");
    }

    @When("TCC.H.GNR.HLM.002.Input url invalid")
    public void tcc_h_gnr_hlm_002_input_url_invalid() {
        driver.get("https://dev.dikahadir.com/laporan/generatee");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.HLM.002.Input url invalid");
    }

    @Then("TCC.H.GNR.HLM.002.Menampilkan 404 page not found")
    public void  tcc_h_gnr_hlm_002_menampilkan_404_page_not_found() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanGenerate.getTxt404(), "404");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.HLM.002.Menampilkan 404 page not found");
    }

    @When("TCC.H.GNR.TGD.001.Input date")
    public void tcc_h_gnr_tgd_001_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/generate");
        halamanGenerate.setInputstartdate("01-06-2023");
        halamanGenerate.setInputenddate("30-06-2023");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Input date");
    }

    @And("TCC.H.GNR.TGD.001.Input NIK")
    public void tcc_h_gnr_tgd_001_input_nik() {
        halamanGenerate.setInputNIK("");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Input NIK");
    }

    @And("TCC.H.GNR.TGD.001.Input Nama User")
    public void tcc_h_gnr_tgd_001_input_nama_user() {
        halamanGenerate.setInputNamaUser("");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Input Nama User");
    }

    @And("TCC.H.GNR.TGD.001.Input Nama Upliner")
    public void tcc_h_gnr_tgd_001_input_nama_upliner() {
        halamanGenerate.setInputNamaUpliner("");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Input Nama Upliner");
    }

    @And("TCC.H.GNR.TGD.001.Input Unit")
    public void tcc_h_gnr_tgd_001_input_unit() {
        halamanGenerate.setInputUnit("IT Programmer");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Input Unit");
    }

    @And("TCC.H.GNR.TGD.001.button generate")
    public void tcc_h_gnr_tgd_001_button_generate() {
        Hooks.delay(Constants.DETIK);
        halamanGenerate.setBtnGenerate();
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.button generate");
    }

    @Then("TCC.H.GNR.TGD.001.Berhasil generate data")
    public void  tcc_h_gnr_tgd_001_menampilkan_generate_data() {
        Hooks.delay(Constants.DETIK);
        driver.get("file:///C:/Users/Moh_Eko11/Downloads/");
        halamanGenerate.setDataModified();
        Assert.assertTrue(halamanGenerate.getTxtDowbloadGenerate().contains("rekap-absen"));
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Berhasil generate data");
    }

    @When("TCC.H.GNR.TGD.002.Input date")
    public void tcc_h_gnr_tgd_002_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/generate");
        halamanGenerate.setInputstartdate("");
        halamanGenerate.setInputenddate("");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.002.Input date");
    }

    @And("TCC.H.GNR.TGD.002.button generate")
    public void tcc_h_gnr_tgd_002_button_generate() {
        Hooks.delay(Constants.DETIK);
        halamanGenerate.setBtnGenerate();
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.002.button generate");
    }

    @Then("TCC.H.GNR.TGD.002.Berhasil generate data")
    public void  tcc_h_gnr_tgd_002_menampilkan_generate_data() {
        Hooks.delay(Constants.DETIK);
        driver.get("file:///C:/Users/Moh_Eko11/Downloads/");
        halamanGenerate.setDataModified();
        Assert.assertTrue(halamanGenerate.getTxtDowbloadGenerate().contains("rekap-absen"));
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.TGD.001.Berhasil generate data");
    }

    @When("TCC.H.GNR.RST.001.Button reset")
    public void tcc_h_gnr_rst_001_button_reset() {
        driver.get("https://dev.dikahadir.com/laporan/generate");
        halamanGenerate.setBtnReset();
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.RST.002.Button reset");
    }

    @Then("TCC.H.GNR.RST.001.Berhasil reset penarikan data")
    public void  tcc_h_gnr_rst_001_berhasil_reset_penarikan_data() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanGenerate.getTxtReset(),"Reset");
        extentTest.log(LogStatus.PASS, "TCC.H.GNR.RST.001.Berhasil reset penarikan data");
    }
}
