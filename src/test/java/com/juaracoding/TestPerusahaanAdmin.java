package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PerusahaanAdmin;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPerusahaanAdmin {

    static WebDriver driver;
    static ExtentTest extentTest;
    static PerusahaanAdmin PerusahaanAdmin = new PerusahaanAdmin();
    static LoginPage loginPage = new LoginPage();

    public TestPerusahaanAdmin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.H.PRS.HLM.001.Menu Perusahaan")
    public void tcc_h_prs_hlm_001_menu_perusahaan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        PerusahaanAdmin.BtnPerusahaan();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.HLM.001.Menu Perusahaan");
    }

    @And("TCC.H.PRS.HLM.001.Pilih Menu Perusahaan")
    public void tcc_h_prs_hlm_001_Pilih_Menu_Perusahaan() {
        PerusahaanAdmin.BtnPerusahaanAdmin();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.HLM.001.Pilih Menu Perusahaan");
    }

    @Then("TCC.H.PRS.HLM.001.Menampilkan Halaman Perusahaan")
    public void tcc_h_prs_hlm_001_Menampilkan_Halaman_Perusahaan() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.gettxtperusahaan(), "Perusahaan");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.HLM.001.Menampilkan Halaman Perusahaan");
    }

    @When("TCC.H.PRS.HLM.002.Masukan url invalid")
    public void tcc_h_prs_hlm_002_masukan_url_invallid() {
        Hooks.delay(Constants.DETIK);
        driver.get("https://dev.dikahadir.com/companyy/add-company");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.HLM.002.Masukan url invalid");
    }

    @Then("TCC.H.PRS.HLM.002.tidak Menampilkan Halaman Perusahaan")
    public void tcc_h_prs_hlm_002_tidak_menampilkan_halaman_perusahhaan() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.gettxt404(), "404");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.HLM.002.tidak Menampilkan Halaman Perusahaan");
    }

    @When("TCC.H.PRS.EDT.001.Input data pada company name")
    public void tcc_h_prs_edt_001_input_data_pada_company_name() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.btnEdit();
        PerusahaanAdmin.inputCompanyName("PT. Danamas Insan Kreasi");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.001.Input data pada company name");
    }

    @And("TCC.H.PRS.EDT.001.Input data industry")
    public void tcc_h_prs_edt_001_input_data_industry() {
        PerusahaanAdmin.inputIndustry("Offshore/Outsorcing");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.001.Input data industry");
    }

    @And("TCC.H.PRS.EDT.001.Klik Button Simpan")
    public void tcc_h_prs_edt_001_klik_button_simpan() {
        PerusahaanAdmin.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.001.Klik Button Simpan");
    }

    @Then("TCC.H.PRS.EDT.001.Berhasil mengedit data sesuai yang diinginkan")
    public void tcc_h_prs_edt_001_berhasil_mengedit_dta_sesuai_yang_diinginkan() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtCompanyName(), "PT. Danamas Insan Kreasi");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.001.Berhasil mengedit data sesuai yang diinginkan");
    }

    @When("TCC.H.PRS.EDT.002.Tidak Input data pada company name")
    public void tcc_h_prs_edt_002_tidak_input_data_pada_company_name() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.btnEdit();
        PerusahaanAdmin.inputCompanyName("");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.002.Tidak Input data pada company name");
    }

    @And("TCC.H.PRS.EDT.002.Tidak Input data industry")
    public void tcc_h_prs_edt_002_tidak_input_data_industry() {
        PerusahaanAdmin.inputIndustry("");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.002.Tidak Input data industry");
    }

    @And("TCC.H.PRS.EDT.002.Klik Button Simpan")
    public void tcc_h_prs_edt_002_klik_button_simpan() {
        PerusahaanAdmin.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.002.Klik Button Simpan");
    }

    @Then("TCC.H.PRS.EDT.002.Menampilkan pop up harap isi bidang ini")
    public void tcc_h_prs_edt_002_berhasil_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtInputCompany(), "true");
        Assert.assertEquals(PerusahaanAdmin.getTxtInputIndustry(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.002.Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.PRS.EDT.003.Tidak Input data pada company name")
    public void tcc_h_prs_edt_003_tidak_input_data_pada_company_name() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.btnEdit();
        PerusahaanAdmin.inputCompanyName("");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.003.Tidak Input data pada company name");
    }

    @And("TCC.H.PRS.EDT.003.Input data industry")
    public void tcc_h_prs_edt_003_input_data_industry() {
        PerusahaanAdmin.inputIndustry("Offshore/Outsorcing");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.003.Input data industry");
    }

    @And("TCC.H.PRS.EDT.003.Klik Button Simpan")
    public void tcc_h_prs_edt_003_klik_button_simpan() {
        PerusahaanAdmin.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.003.Klik Button Simpan");
    }

    @Then("TCC.H.PRS.EDT.003.Menampilkan pop up harap isi bidang ini")
    public void tcc_h_prs_edt_003_berhasil_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtInputCompany(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.003.Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.PRS.EDT.004.Input data pada company name")
    public void tcc_h_prs_edt_004_tidak_input_data_pada_company_name() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.btnEdit();
        PerusahaanAdmin.inputCompanyName("PT. Danamas Insan Kreasi ");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.004.Input data pada company name");
    }

    @And("TCC.H.PRS.EDT.004.Tidak Input data industry")
    public void tcc_h_prs_edt_004_Input_data_industry() {
        PerusahaanAdmin.inputIndustry("");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.004.Tidak input data industry");
    }

    @And("TCC.H.PRS.EDT.004.Klik Button Simpan")
    public void tcc_h_prs_edt_004_klik_button_simpan() {
        PerusahaanAdmin.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.004.Klik Button Simpan");
    }

    @Then("TCC.H.PRS.EDT.004.Menampilkan pop up harap isi bidang ini")
    public void tcc_h_prs_edt_004_berhasil_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtInputIndustry(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.EDT.004.Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.PRS.DLT.001.Menu Delete")
    public void tcc_h_prs_dlt_001_menu_delete() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.setBtnDelete();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.DLT.001.Menu Delete");
    }

    @And("TCC.H.PRS.DLT.001.Klik Buttom ya")
    public void tcc_h_prs_edt_001_Klik_ya() {
        Hooks.delay(Constants.DETIK);
        PerusahaanAdmin.setBtnYa();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.DLT.001.Klik Buttom ya");
    }

    @Then("TCC.H.PRS.DLT.001.Berhasil menghapus data")
    public void tcc_h_prs_dlt_001_Berhasil_menghapus_data() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.gettxtgagaldelete(), "Gagal Delete Perusahaan");
        extentTest.log(LogStatus.FAIL, "TCC.H.PRS.DLT.001.Berhasil menghapus data");
    }

    @When("TCC.H.PRS.DLT.002.Menu Delete")
    public void tcc_h_prs_dlt_002_menu_delete() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.Btnmenuperysahaan();
        PerusahaanAdmin.setBtnDelete();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.DLT.002.Menu Delete");
    }

    @And("TCC.H.PRS.DLT.002.Klik Buttom tidak")
    public void tcc_h_prs_edt_002_Klik_Buttom_tidak() {
        Hooks.delay(Constants.DETIK);
        PerusahaanAdmin.BtnTidak();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.DLT.002.Klik Buttom tidak");
    }

    @Then("TCC.H.PRS.DLT.002.Kembali pada menu perusahaan")
    public void tcc_h_prs_dlt_002_Kemballi_pada_menu_perusahaan() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtCompanyName(), "PT. Danamas Insan Kreasi");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS.DLT.002.Kembali pada menu perusahaan");
    }

    @When("TCC.H.PRS. RPP.001. Row Per Page")
    public void tcc_h_prs_001_row_per_page() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.setBtnrowpage();
        PerusahaanAdmin.setBtnrow5();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.001. Row Per Page");
    }

    @Then("TCC.H.PRS. RPP.001. Menampilkan row page 5")
    public void tcc_h_prs_rpp_001_menampilkan_row_page_5() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtPage(), "5");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.001. Menampilkan row page 5");
    }

    @When("TCC.H.PRS. RPP.002. Row Per Page")
    public void tcc_h_prs_002_row_per_page() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.setBtnrowpage();
        PerusahaanAdmin.setBtnrow10();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.002. Row Per Page");
    }

    @Then("TCC.H.PRS. RPP.002. Menampilkan row page 10")
    public void tcc_h_prs_rpp_002_menampilkan_row_page_10() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtPage(), "10");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.002. Menampilkan row page 10");
    }

    @When("TCC.H.PRS. RPP.003. Row Per Page")
    public void tcc_h_prs_003_row_per_page() {
        driver.get("https://dev.dikahadir.com/company/add-company");
        PerusahaanAdmin.setBtnrowpage();
        PerusahaanAdmin.setBtnrow25();
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.003. Row Per Page");
    }

    @Then("TCC.H.PRS. RPP.003. Menampilkan row page 25")
    public void tcc_h_prs_rpp_003_menampilkan_row_page_25() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(PerusahaanAdmin.getTxtPage(), "25");
        extentTest.log(LogStatus.PASS, "TCC.H.PRS. RPP.003. Menampilkan row page 25");
    }
}