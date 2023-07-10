package com.juaracoding;

import com.juaracoding.pages.HalamanLaporanLembur;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanLembur {

    static WebDriver driver;
    static ExtentTest extentTest;
    static HalamanLaporanLembur Halamanlaporanlembur = new HalamanLaporanLembur();
    static LoginPage loginPage = new LoginPage();

    public TestHalamanLembur() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Masuk Menu Laporan")
    public void masuk_menu_laporan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.BtnLaporan();
        extentTest.log(LogStatus.PASS, "Masuk Menu Laporan");
    }

    @And("Pilih Menu Lembur")
    public void pilih_menu_lembur() {
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.BtnLaporanLembur();
        extentTest.log(LogStatus.PASS, "Pilih Menu Lembur");
    }

    @Then("User get header Lembur")
    public void user_get_header_lembur() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtHeadingLembur(), "Lembur");
        extentTest.log(LogStatus.PASS, "user get header lembur");
    }

    @When("Input data")
    public void input_data() {
        Halamanlaporanlembur.Inputsearch("Prod Test Leader");
        extentTest.log(LogStatus.PASS, "Input data");
    }

    @And("Klik Search")
    public void klik_search() {
        Halamanlaporanlembur.BtnSearch();
        extentTest.log(LogStatus.PASS, "klik seach");
    }

    @Then("get search name")
    public void get_search_name() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "get search name");
    }

    @When("TCC.H.LBR.SEARCH.002.Klik Search")
    public void tcc_h_lbr_search_klik_search() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.BtnSearch();
        extentTest.log(LogStatus.PASS, "002klik search");
    }

    @Then("Berhasil menampilkan semua nama")
    public void berhasil_menampilkan_semua_nama() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "berhasil menampilkan semua nama");
    }

    @When("TCC.H.LBR.SEARCH.003.Input data salah")
    public void tcc_h_lbr_search_003_input_data_salah() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.Inputsearch("study");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.SEARCH.003.Input data salah");
    }

    @And("TCC.H.LBR.SEARCH.003.Klik Search")
    public void tcc_h_lbr_search_003_klik_search() {
        Halamanlaporanlembur.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.SEARCH.003.Klik Search");
    }

    @Then("Menampilakan data kosong")
    public void menampilkan_data_kosong() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtkosong(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "Menampilakan data kosong");
    }

    @When("TCC.H.LBR.RST.001.Klik Button Riset")
    public void tcc_h_lbr_rst_001_klik_button_riset() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.BtnRiset();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RST.001.Klik Button Riset");
    }

    @Then("Menampilkan semua nama User")
    public void menampilkan_semua_nama_user() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "Menampilkan semua nama User");
    }

    @When("TCC.H.LBR.FLTR BY.001.Klik Botton By Filter")
    public void tcc_h_lbr_fltr_by_001_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FLTR BY.001.Klik Botton By Filter");
    }

    @And("TCC.H.LBR.FLTR BY.001. Pilih opsi Job Departemen")
    public void tcc_h_lbr_fltr_by_001_pilih_opsi_job_departemen() {
        Halamanlaporanlembur.setInputjobdepartement("HR Project & Comben");
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FLTR BY.001.Pilih opsi Job Departemen");
    }

    @And("TCC.H.LBR.FLTR BY.001. Button Terapkan")
    public void tcc_h_lbr_fltr_by_001_button_terapkan() {
        Halamanlaporanlembur.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FLTR BY.001. Button Terapkan");
    }

    @Then("Menampilkan data sesuai Filter yang Dipilih")
    public void menampilkan_data_sesuai_filter_yang_dipilih() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtresultfilterjob(), "Wahyu Nurherdianto");
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai Filter yang Dipilih");
    }

    @When("TCC.H.LBR.FLTR.BY.002. Klik Botton By Filter")
    public void tcc_h_lbr_fltr_by_002_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FLTR.BY.002. Klik Botton By Filter");
    }

    @And("TCC.H.LBR.FLTR BY.002. Button Terapkan")
    public void tcc_h_lbr_fltr_by_002_button_terapkan() {
        Halamanlaporanlembur.setBtnTerapkan();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FLTR BY.002. Button Terapkan");
    }

    @Then("Menampilkan semua data")
    public void menampilkan_semua_data() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxt500(), "500");
        extentTest.log(LogStatus.FAIL, "Menampilkan semua data");
    }

    @When("TCC.H.LBR.DATE.001. Input Date")
    public void tcc_h_lbr_date_001_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setInputstartdate("01-06-2023");
        Halamanlaporanlembur.setInputenddate("30-06-2023");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.DATE.001. Input Date");
    }

    @And("TCC.H.LBR.DATE.001. Klik Botton Search")
    public void tcc_h_lbr_date_001_klik_botton_search() {
        Halamanlaporanlembur.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.DATE.001. Klik Botton Search");
    }

    @Then("Menampilkam data sesuai dengan start date dan end date")
    public void Menampilkam_data_sesuai_dengan_start_date_dan_end_date() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "Menampilkan semua data");
    }

    @When("TCC.H.LBR.DATE.002. Input Date")
    public void tcc_h_lbr_date_002_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setInputstartdate("");
        Halamanlaporanlembur.setInputenddate("");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.DATE.002. Input Date");
    }

    @And("TCC.H.LBR.DATE.002. Klik Botton Search")
    public void tcc_h_lbr_date_002_klik_botton_search() {
        Halamanlaporanlembur.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.DATE.002. Klik Botton Search");
    }

    @Then("Menampilkan semua data lembur")
    public void Menampilkan_semua_data_lembur() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "Menampilkan semua data");
    }

    @When("TCC.H.LBR.APR LBR.001. Approve Lembur")
    public void tcc_h_lbr_apr_lbr_001_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setMenuApprove();
        Halamanlaporanlembur.setApprovelembur();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.APR LBR.001. Approve Lembur");
    }

    @And("TCC.H.LBR.APR LBR.001. Klik Bottom Setujui")
    public void tcc_h_lbr_apr_lbr_001_klik_bottom_setujui() {
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.setSetujui();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.APR LBR.001. Klik Bottom Setujui");
    }

    @Then("Status berubah menjadi Approved")
    public void Status_berubah_menjadi_Approved() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "Status berubah menjadi Approved");
    }

    @When("TCC.H.LBR.APR LBR.002. Approve Lembur")
    public void tcc_h_lbr_apr_lbr_002_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setMenuApprove();
        Halamanlaporanlembur.setApprovelembur();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.APR LBR.002. Approve Lembur");
    }

    @And("TCC.H.LBR.APR LBR.002. Klik Botton tidak")
    public void tcc_h_lbr_apr_lbr_002_klik_botton_tidak() {
        Halamanlaporanlembur.btnTidakAprroved();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.APR LBR.002. Klik Botton tidak");
    }

    @Then("Status tidak berubah")
    public void Status_tidak_berubah_() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "Status tidak berubah");
    }

    @When("TCC.H.LBR.RJT LBR.001. Reject Lembur")
    public void tcc_h_lbr_rjt_lbr_001_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setMenuApprove();
        Halamanlaporanlembur.setRejectLembur();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.001. Reject Lembur");
    }

    @And("TCC.H.LBR.RJT LBR.001. Ketik alasan")
    public void tcc_h_lbr_rjt_lbr_001_ketik_alasan() {
        Halamanlaporanlembur.inputAlasan("acara keluarga");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.001. Ketik alasan");
    }

    @And("TCC.H.LBR.RJT LBR.001. Klik Botton Tolak")
    public void tcc_h_lbr_rjt_lbr_001_klik_button_tolak() {
        Halamanlaporanlembur.btnTolak();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.001. Klik Botton Tolak");
    }

    @Then("Status berubah menjadi reject")
    public void Status_berubah_menjadi_reject() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtStatus(), "REJECT");
        extentTest.log(LogStatus.PASS, "Status berubah menjadi reject");
    }

    @When("TCC.H.LBR.RJT LBR.002. Reject Lembur")
    public void tcc_h_lbr_rjt_lbr_002_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setMenuApprove();
        Halamanlaporanlembur.setRejectLembur();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.002. Reject Lembur");
    }

    @And("TCC.H.LBR.RJT LBR.002. Ketik alasan")
    public void tcc_h_lbr_rjt_lbr_002_ketik_alasan() {
        Halamanlaporanlembur.inputAlasan("acara keluarga");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.002. Ketik alasan");
    }

    @And("TCC.H.LBR.RJT LBR.002. Klik Botton Tidak")
    public void tcc_h_lbr_rjt_lbr_002_klik_button_tidak() {
        Halamanlaporanlembur.btnTidakTolak();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.001. Klik Botton Tidak");
    }

    @Then("TCC.H.LBR.RJT LBR.002. Status tidak berubah")
    public void tcc_h_lbr_rjt_lbr_002_status_tidak_berubah() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.gettxtStatus(), "REJECT");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.002. Status tidak berubah");
    }

    @When("TCC.H.LBR.RJT LBR.003. Reject Lembur")
    public void tcc_h_lbr_rjt_lbr_003_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.setMenuApprove();
        Halamanlaporanlembur.setRejectLembur();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.003. Reject Lembur");
    }

    @And("TCC.H.LBR.RJT LBR.003. Tidak Ketik alasan")
    public void tcc_h_lbr_rjt_lbr_003_tidak_ketik_alasan() {
        Halamanlaporanlembur.inputAlasan("");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.003. Tidak Ketik alasan");
    }

    @And("TCC.H.LBR.RJT LBR.003. Klik Botton Tolak")
    public void tcc_h_lbr_rjt_lbr_003_klik_button_tolak() {
        Halamanlaporanlembur.btnTolak();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT LBR.003. Klik Botton Tolak");
    }

    @Then("TCC.H.LBR.RJT LBR.003. Menampilkan pop up harap isi bidang ini")
    public void tcc_h_lbr_rjt_lbr_003_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtAlasan(), "true");
        extentTest.log(LogStatus.PASS, "STCC.H.LBR.RJT LBR.003. Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.LBR.RPP.001. pilih row per page 5")
    public void tcc_h_lbr_rpp_001_pilih_row_per_page_5() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.rowPerPage();
        Halamanlaporanlembur.page5();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.001. pilih row per page 5");
    }

    @Then("TCC.H.LBR.RPP.001. Menampilkan row page 5")
    public void tcc_h_lbr_rpp_001_menampilkan_row_page_5() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtPage(), "5");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.001. Menampilkan row page 5");
    }

    @When("TCC.H.LBR.RPP.002. pilih row per page 10")
    public void tcc_h_lbr_rpp_002_pilih_row_per_page_10() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.rowPerPage();
        Halamanlaporanlembur.page10();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.002. pilih row per page 10");
    }

    @Then("TCC.H.LBR.RPP.002. Menampilkan row page 10")
    public void tcc_h_lbr_rpp_002_menampilkan_row_page_10() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtPage(), "10");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.002. Menampilkan row page 10");
    }

    @When("TCC.H.LBR.RPP.003. pilih row per page 25")
    public void tcc_h_lbr_rpp_003_pilih_row_per_page_25() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Halamanlaporanlembur.rowPerPage();
        Halamanlaporanlembur.page25();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.003. pilih row per page 25");
    }

    @Then("TCC.H.LBR.RPP.003. Menampilkan row page 25")
    public void tcc_h_lbr_rpp_003_menampilkan_row_page_25() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtPage(), "25");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RPP.003. Menampilkan row page 25");
    }

    @When("TCC.H.LBR.NXT.PG.001. klik button next page")
    public void tcc_h_lbr_nxt_001_klik_button_nex_page() {
        driver.get("https://dev.dikahadir.com/laporan/overtime");
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.btnNextPage();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.NXT.PG.001. klik button next page");
    }

    @Then("TCC.H.LBR.NXT.PG.001. Menampilkan halaman next page")
    public void tcc_h_lbr_nxt_001_menampilkan_halaman_next_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtNextBackLastFirstPage(), "Test User V3");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.NXT.PG.001. Menampilkan halaman next page");
    }

    @When("TCC.H.LBR.PRE.PG.001. klik button previous page")
    public void tcc_h_lbr_pre_001_klik_button_previous_page() {
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.btnPreviousPage();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.PRE.PG.001. klik button previous page");
    }

    @Then("TCC.H.LBR.PRE.PG.001. Menampilkan halaman previous page")
    public void tcc_h_lbr_pre_001_menampilkan_halaman_previous_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtNextBackLastFirstPage(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.PRE.PG.001. Menampilkan halaman previous page");
    }

    @When("TCC.H.LBR.LST.PG.001. klik button last page")
    public void tcc_h_lbr_lst_001_klik_button_last_page() {
        Halamanlaporanlembur.btnLastPage();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.LST.PG.001. klik button last page");
    }

    @Then("TCC.H.LBR.LST.PG.001. Menampilkan halaman last page")
    public void tcc_h_lbr_lst_001_menampilkan_halaman_last_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtNextBackLastFirstPage(), "Sunandar");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.LST.PG.001. Menampilkan halaman last page");
    }

    @When("TCC.H.LBR.FRT.PG.001. klik button first page")
    public void tcc_h_lbr_frt_001_klik_button_first_page() {
        Hooks.delay(Constants.DETIK);
        Halamanlaporanlembur.btnFirstPage();
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FRT.PG.001. klik button first page");
    }

    @Then("TCC.H.LBR.FRT.PG.001. Menampilkan halaman first page")
    public void tcc_h_lbr_frt_001_menampilkan_halaman_first_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(Halamanlaporanlembur.getTxtNextBackLastFirstPage(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.FRT.PG.001. Menampilkan halaman first page");
    }
}