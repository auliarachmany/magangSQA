package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PengaturanPerusahaan;
import com.juaracoding.pages.PerusahaanAdmin;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPengaturanPerusahaan {

    static WebDriver driver;
    static ExtentTest extentTest;
    static PengaturanPerusahaan pengaturanPerusahaan = new PengaturanPerusahaan();
    static LoginPage loginPage = new LoginPage();

    public TestPengaturanPerusahaan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.H.PP.HLM.001.Masuk Menu Perusahaan")
    public void tcc_h_pp_hlm_001_menu_perusahaan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        pengaturanPerusahaan.menuPerusahaan();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.HLM.001.Masuk Menu Perusahaan");
    }

    @And("TCC.H.PP.HLM.001.Pilih Menu pengaturan perusahaan")
    public void tcc_h_prs_hlm_001_Pilih_Menu_pengaturan_Perusahaan() {
        pengaturanPerusahaan.pengaturanPerusahaan();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.HLM.001.Pilih Menu pengaturan perusahaan");
    }

    @Then("TCC.H.PP.HLM.001.Menampilan halaman pengaturan perusahaan")
    public void tcc_h_pp_hlm_001_Menampilkan_Halaman_pengaturan_Perusahaan() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPeengaturanPerusahaan(), "Pengaturan Perusahaan");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.HLM.001.Menampilan halaman pengaturan perusahaan");
    }

    @When("TCC.H.PP.TMB.001.klik button tambahkan")
    public void tcc_h_pp_edt_001_klik_button_tambahkan() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.btnTambahkan();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.TMB.001.klik button tambahkan");
    }

    @And("TCC.H.PP.TMB.001.input max radius")
    public void tcc_h_pp_tmb_001_input_max_radius() {
        pengaturanPerusahaan.inpuMaxRadius("2");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.TMB.001.input max radius");
    }

    @And("TCC.H.PP.TMB.001.klik button tambah")
    public void tcc_h_pp_tmb_001_klik_button_tambah() {
        pengaturanPerusahaan.btnTambah();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.TMB.001.klik button tambah");
    }

    @Then("TCC.H.PP.TMB.001.menampilkan popup")
    public void tcc_h_pp_tmb_001_Menampilkan_pop_up() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPopUpResponse(), "Gagal menambahkan data company setting");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.TMB.001.menampilkan popup");
    }

    @When("TCC.H.PP.EDT.001.klik menu edit")
    public void tcc_h_pp_edt_001_klik_menu_edit() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.menuEdit();
        pengaturanPerusahaan.edit();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.001.klik menu edit");
    }

    @And("TCC.H.PP.EDT.001.input max radius")
    public void tcc_h_pp_edt_001_input_max_radius() {
        pengaturanPerusahaan.inpuMaxRadius("5");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.001.input max radius");
    }

    @And("TCC.H.PP.EDT.001.klik button simpan")
    public void tcc_h_pp_edt_001_klik_button_simpan() {
        pengaturanPerusahaan.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.001.klik button simpan");
    }

    @Then("TCC.H.PP.EDT.001.menampilkan popup")
    public void tcc_h_pp_edt_001_Menampilkan_pop_up() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPopUpResponse(), "Berhasil menambahkan data company setting");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.001.menampilkan popup");
    }

    @When("TCC.H.PP.EDT.002.klik menu edit")
    public void tcc_h_pp_edt_002_klik_menu_edit() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.menuEdit();
        pengaturanPerusahaan.edit();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.002.klik menu edit");
    }

    @And("TCC.H.PP.EDT.002.tidak input max radius")
    public void tcc_h_pp_edt_002_input_max_radius() {
        pengaturanPerusahaan.inpuMaxRadius("");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.002.tidak input max radius");
    }

    @And("TCC.H.PP.EDT.002.klik button simpan")
    public void tcc_h_pp_edt_002_klik_button_simpan() {
        pengaturanPerusahaan.btnSimpan();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.002.klik button simpan");
    }

    @Then("TCC.H.PP.EDT.002.menampilkan popup harap isi bidang ini")
    public void tcc_h_pp_edt_001_Menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtNotInputMaxRadius(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.EDT.002.menampilkan popup harap isi bidang ini");
    }

    @When("TCC.H.PP.SELF.IN.001.klik swipe self in")
    public void tcc_h_pp_self_in_001_klik_swipe_self_in() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.btnSelfIn();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.SELF.IN.001.klik swipe self in");
    }

    @Then("TCC.H.PP.SELF.IN.001.menampilkan popup sukses")
    public void tcc_h_pp_self_in_001_Menampilkan_pop_up_sukses() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getAlert(), "Sukses");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.SELF.IN.001.menampilkan popup sukses");
    }

    @When("TCC.H.PP.SELF.IN.002.klik swipe self in")
    public void tcc_h_pp_self_in_002_klik_swipe_self_in() {
        pengaturanPerusahaan.getOk();
        driver.get("https://dev.dikahadir.com/company/company-setting");
        Hooks.delay(Constants.DETIK);
        pengaturanPerusahaan.btnSelfIn();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.SELF.IN.002.klik swipe self in");
    }

    @Then("TCC.H.PP.SELF.IN.002.menampilkan popup sukses")
    public void tcc_h_pp_self_in_002_Menampilkan_pop_up_sukses() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getAlert(), "Sukses");
        pengaturanPerusahaan.getOk();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.SELF.IN.002.menampilkan popup suksess");
    }

    @When("TCC.H.PP.DLT.001.klik menu delete")
    public void tcc_h_pp_dlt_001_klik_menu_delete() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.menuEdit();
        pengaturanPerusahaan.btnDelete();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.DLT.001.klik menu delete");
    }

    @And("TCC.H.PP.DLT.001.klik button ya")
    public void tcc_h_pp_dlt_001_klik_button_ya() {
        Hooks.delay(Constants.DETIK);
        pengaturanPerusahaan.btnYa();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.DLT.001.klik button ya");
    }

    @Then("TCC.H.PP.DLT.001.menampilkan popup berhasil menghapus data company setting")
    public void tcc_h_pp_dlt_001_Menampilkan_pop_up() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPopUpResponse(), "Berhasil menghapus data company setting");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.DLT.001.menampilkan popup berhasil menghapus data company setting");
    }

    @When("TCC.H.PP.RPP.001. pilih row per page 5")
    public void tcc_h_pp_rpp_001_pilih_row_per_page_5() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.rowPerPage();
        pengaturanPerusahaan.page5();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.001. pilih row per page 5");
    }

    @Then("TCC.H.PP.RPP.001. Menampilkan row page 5")
    public void tcc_h_pp_rpp_001_menampilkan_row_page_5() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPage(), "5");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.001. Menampilkan row page 5");
    }

    @When("TCC.H.PP.RPP.002. pilih row per page 10")
    public void tcc_h_pp_rpp_002_pilih_row_per_page_10() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.rowPerPage();
        pengaturanPerusahaan.page10();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.002. pilih row per page 10");
    }

    @Then("TCC.H.PP.RPP.002. Menampilkan row page 10")
    public void tcc_h_pp_rpp_002_menampilkan_row_page_10() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPage(), "10");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.002. Menampilkan row page 10");
    }

    @When("TCC.H.PP.RPP.003. pilih row per page 25")
    public void tcc_h_pp_rpp_003_pilih_row_per_page_25() {
        driver.get("https://dev.dikahadir.com/company/company-setting");
        pengaturanPerusahaan.rowPerPage();
        pengaturanPerusahaan.page25();
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.003. pilih row per page 25");
    }

    @Then("TCC.H.PP.RPP.003. Menampilkan row page 25")
    public void tcc_h_pp_rpp_003_menampilkan_row_page_25() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(pengaturanPerusahaan.getTxtPage(), "25");
        extentTest.log(LogStatus.PASS, "TCC.H.PP.RPP.003. Menampilkan row page 25");
    }
}
