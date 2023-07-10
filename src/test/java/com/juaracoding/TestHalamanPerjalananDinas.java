package com.juaracoding;

import com.juaracoding.pages.HalamanPerjalananDinas;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanPerjalananDinas {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HalamanPerjalananDinas halamanPerjalananDinas = new HalamanPerjalananDinas();
    static LoginPage loginPage = new LoginPage();

    public TestHalamanPerjalananDinas() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.H.PJD.HLM.001.Masuk Menu Laporan")
    public void tcc_h_pjd_hlm_001_masuk_menu_laporan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.BtnLaporan();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.HLM.001.Masuk Menu Laporan");
    }

    @And("TCC.H.PJD.HLM.001.Pilih Menu perjalanan dinas")
    public void tcc_h_pjd_hlm_001_menu_perjalanan_dinas() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.BtnPerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.HLM.001.Pilih Menu perjalanan dinas");
    }

    @Then("TCC.H.PJD.HLM.001.User get header perjalanan dinas")
    public void  tcc_h_pjd_hlm_001_user_get_header_perjalanan_dinas() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtHeadingPerjalananDinas(), "Perjalanan Dinas");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.HLM.001.User get header perjalanan dinas");
    }

    @When("TCC.H.PJD.HLM.002.Input url invalid")
    public void tcc_h_pjd_hlm_002_input_url_invalid() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinast");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.HLM.002.Input url invalid");
    }

    @Then("TCC.H.PJD.HLM.002.Menampilkan 404 page not found")
    public void  tcc_h_pjd_hlm_002_menampilkan_404_page_not_found() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxt404(), "404");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.HLM.002.Menampilkan 404 page not found");
    }

    @When("TCC.H.PJD.SEARCH.001.Input data")
    public void tcc_h_pjd_search_001_input_data() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.Inputsearch("Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.001.Input data");
    }

    @And("TCC.H.PJD.SEARCH.001.Klik Search")
    public void tcc_h_pjd_search_001_klik_search() {
        halamanPerjalananDinas.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.001.Klik Search");
    }

    @Then("TCC.H.PJD.SEARCH.001.get search name")
    public void tcc_h_pjd_search_001_get_search_name() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtsearchname(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.001.get search name");
    }

    @When("TCC.H.PJD.SEARCH.002.Klik Search")
    public void tcc_h_pjd_search_002_klik_search() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.002.Klik Search");
    }

    @Then("TCC.H.PJD.SEARCH.002.Berhasil menampilkan semua nama")
    public void tcc_h_pjd_search_002_berhasil_menampilkan_semua_nama() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtsearchname(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.002.Berhasil menampilkan semua nama");
    }

    @When("TCC.H.PJD.SEARCH.003.Input data salah")
    public void tcc_h_pjd_search_003_input_data_salah() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.Inputsearch("study");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.003.Input data salah");
    }

    @And("TCC.H.PJD.SEARCH.003.Klik Search")
    public void tcc_h_pjd_search_003_klik_search() {
        halamanPerjalananDinas.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.003.Klik Search");
    }

    @Then("TCC.H.PJD.SEARCH.003.Menampilakan data kosong")
    public void tcc_h_pjd_search_003_menampilkan_data_kosong() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtkosong(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.SEARCH.003.Menampilakan data kosong");
    }

    @When("TCC.H.PJD.RST.001.Klik Button Riset")
    public void tcc_h_pjd_rst_001_klik_button_riset() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.BtnRiset();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RST.001.Klik Button Riset");
    }

    @Then("TCC.H.PJD.RST.001.Menampilkan semua nama User")
    public void tcc_h_pjd_rst_001_menampilkan_semua_nama_user() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtsearchname(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RST.001.Menampilkan semua nama User");
    }

    @When("TCC.H.PJD.FLTR BY.001.Klik Botton By Filter")
    public void tcc_h_pjd_fltr_by_001_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR BY.001.Klik Botton By Filter");
    }

    @And("TCC.H.PJD.FLTR BY.001.Pilih opsi Job Departemen")
    public void tcc_h_pjd_fltr_by_001_pilih_opsi_job_departemen() {
        halamanPerjalananDinas.setInputjobdepartement("IT PROGRAMMER");
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR BY.001.Pilih opsi Job Departemen");
    }

    @And("TCC.H.PJD.FLTR BY.001.Button Terapkan")
    public void tcc_h_pjd_fltr_by_001_button_terapkan() {
        halamanPerjalananDinas.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR BY.001.Button Terapkan");
    }

    @Then("TCC.H.PJD.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih")
    public void tcc_h_pjd_fltr_by_001_menampilkan_data_sesuai_filter_yang_dipilih() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtresultfilterjob(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih");
    }

    @When("TCC.H.PJD.FLTR.BY.002.Klik Botton By Filter")
    public void tcc_h_pjd_fltr_by_002_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR.BY.002.Klik Botton By Filter");
    }

    @And("TCC.H.PJD.FLTR BY.002.Button Terapkan")
    public void tcc_h_pjd_fltr_by_002_button_terapkan() {
        halamanPerjalananDinas.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FLTR BY.002. Button Terapkan");
    }

    @Then("TCC.H.PJD.FLTR.BY.002.Menampilkan semua data")
    public void tcc_h_pjd_fltr_by_002_menampilkan_semua_data() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxt500(), "500");
        extentTest.log(LogStatus.FAIL, "TCC.H.PJD.FLTR.BY.002.Menampilkan semua data");
    }

    @When("TCC.H.PJD.DATE.001.Input Date")
    public void tcc_h_pjd_date_001_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.setInputstartdate("01-05-2023");
        halamanPerjalananDinas.setInputenddate("30-05-2023");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.001.Input Date");
    }

    @And("TCC.H.PJD.DATE.001.Klik Botton Search")
    public void tcc_h_pjd_date_001_klik_botton_search() {
        halamanPerjalananDinas.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.001.Klik Botton Search");
    }

    @Then("TCC.H.PJD.DATE.001.Menampilkam data sesuai dengan start date dan end date")
    public void tcc_h_pjd_date_001_Menampilkam_data_sesuai_dengan_start_date_dan_end_date() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtsearchname(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.001.Menampilkam data sesuai dengan start date dan end date");
    }

    @When("TCC.H.PJD.DATE.002.Input Date")
    public void tcc_h_pjd_date_002_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.setInputstartdate("");
        halamanPerjalananDinas.setInputenddate("");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.002.Input Date");
    }

    @And("TCC.H.PJD.DATE.002.Klik Botton Search")
    public void tcc_h_pjd_date_002_klik_botton_search() {
        halamanPerjalananDinas.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.002.Klik Botton Search");
    }

    @Then("TCC.H.PJD.DATE.002.Menampilkan semua data lembur")
    public void tcc_h_pjd_date_002_Menampilkan_semua_data_lembur() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtsearchname(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.DATE.002.Menampilkan semua data lembur");
    }

    @When("TCC.H.PJD.APR.PJD.001.Approve perjalanan dinas")
    public void tcc_h_pjd_apr_lbr_001_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.setMenuApprove();
        halamanPerjalananDinas.setApprovePerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.001.Approve Lembur");
    }

    @And("TCC.H.PJD.APR.PJD.001.Klik Bottom Setujui")
    public void tcc_h_pjd_apr_lbr_001_klik_bottom_setujui() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.setBtnYa();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.001.Klik Bottom Setujui");
    }

    @Then("TCC.H.PJD.APR.PJD.001.Status berubah menjadi Approved")
    public void tcc_h_pjd_apr_pjd_001_Status_berubah_menjadi_Approved() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.001.Status berubah menjadi Approved");
    }

    @When("TCC.H.PJD.APR.PJD.002.Approve perjalanan dinas")
    public void tcc_h_pjd_apr_pjd_002_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.setMenuApprove();
        halamanPerjalananDinas.setApprovePerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.002.Approve Lembur");
    }

    @And("TCC.H.PJD.APR.PJD.002.Klik Botton tidak")
    public void tcc_h_pjd_apr_pjd_002_klik_botton_tidak() {
        halamanPerjalananDinas.btnTidakAprroved();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.002.Klik Botton tidak");
    }

    @Then("TCC.H.PJD.APR.PJD.002.Status tidak berubah")
    public void tcc_h_pjd_apr_pjd_002_Status_tidak_berubah_() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.APR.PJD.002.Status tidak berubah");
    }

    @When("TCC.H.PJD.RJT.PJD.001.Reject perjalanan dinas")
    public void tcc_h_pjd_rjt_pjd_001_reject_perjalanan_dinas() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.menuReject();
        halamanPerjalananDinas.setRejectPerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.001.Reject perjalanan dinas");
    }

    @And("TCC.H.LBR.RJT.PJD.001.Ketik alasan")
    public void tcc_h_pjd_rjt_pjd_001_ketik_alasan() {
        halamanPerjalananDinas.inputAlasan("-");
        extentTest.log(LogStatus.PASS, "TCC.H.LBR.RJT.PJD.001.Ketik alasan");
    }

    @And("TCC.H.PJD.RJT.PJD.001.Klik Botton Ya")
    public void tcc_h_pjd_rjt_pjd_001_klik_button_ya() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnYaReject();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.001.Klik Botton Ya");
    }

    @Then("TCC.H.PJD.RJT.PJD.001.Status berubah menjadi reject")
    public void tcc_h_pjd_rjt_pjd_001_status_berubah_menjadi_reject() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtStatusReject(), "REJECT");
        extentTest.log(LogStatus.PASS, "tcc_h_pjd_rjt_pjd_001_.Status berubah mmenjadi reject");
    }

    @When("TCC.H.PJD.RJT.PJD.002.Reject perjalanan dinas")
    public void tcc_h_pjd_rjt_pjd_002_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.menuReject();
        halamanPerjalananDinas.setRejectPerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.002.Reject perjalanan dinas");
    }

    @And("TCC.H.PJD.RJT.PJD.002.Ketik alasan")
    public void tcc_h_pjd_rjt_pjd_002_ketik_alasan() {
        halamanPerjalananDinas.inputAlasan("acara keluarga");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.002.Ketik alasan");
    }

    @And("TCC.H.PJD.RJT.PJD.002.Klik Botton Tidak")
    public void tcc_h_pjd_rjt_pjd_002_klik_button_tidak() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnTidakReject();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.002.Klik Botton Tidak");
    }

    @Then("TCC.H.PJD.RJT.PJD.002.Status tidak berubah")
    public void tcc_h_pjd_rjt_pjd_002_status_tidak_berubah() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.gettxtStatusReject(), "REJECT");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.002.Status tidak berubah");
    }

    @When("TCC.H.PJD.RJT.PJD.003.Reject perjalanan dinas")
    public void tcc_h_pjd_rjt_lbr_003_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.menuReject();
        halamanPerjalananDinas.setRejectPerjalananDinas();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.003.Reject perjalanan dinas");
    }

    @And("TCC.H.PJD.RJT.PJD.003.Tidak Ketik alasan")
    public void tcc_h_lbr_rjt_lbr_003_tidak_ketik_alasan() {
        halamanPerjalananDinas.inputAlasan("");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.003.Tidak Ketik alasan");
    }

    @And("TCC.H.PJD.RJT.PJD.003.Klik Botton Tolak")
    public void tcc_h_lbr_rjt_lbr_003_klik_button_tolak() {
        halamanPerjalananDinas.btnYaReject();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.003.Klik Botton Tolak");
    }

    @Then("TCC.H.PJD.RJT.PJD.003.Menampilkan pop up harap isi bidang ini")
    public void tcc_h_pjd_rjt_lbr_003_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtAlasan(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RJT.PJD.003.Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.PJD.RPP.001. pilih row per page 5")
    public void tcc_h_pjd_rpp_001_pilih_row_per_page_5() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.rowPerPage();
        halamanPerjalananDinas.page5();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.001. pilih row per page 5");
    }

    @Then("TCC.H.PJD.RPP.001. Menampilkan row page 5")
    public void tcc_h_pj_rpp_001_menampilkan_row_page_5() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtPage(), "5");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.001. Menampilkan row page 5");
    }

    @When("TCC.H.PJD.RPP.002. pilih row per page 10")
    public void tcc_h_pjd_rpp_002_pilih_row_per_page_10() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.rowPerPage();
        halamanPerjalananDinas.page10();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.002. pilih row per page 10");
    }

    @Then("TCC.H.PJD.RPP.002. Menampilkan row page 10")
    public void tcc_h_pjd_rpp_002_menampilkan_row_page_10() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtPage(), "10");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.002. Menampilkan row page 10");
    }

    @When("TCC.H.PJD.RPP.003. pilih row per page 25")
    public void tcc_h_pjd_rpp_003_pilih_row_per_page_25() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        halamanPerjalananDinas.rowPerPage();
        halamanPerjalananDinas.page25();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.003. pilih row per page 25");
    }

    @Then("TCC.H.PJD.RPP.003. Menampilkan row page 25")
    public void tcc_h_pjd_rpp_003_menampilkan_row_page_25() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtPage(), "25");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.RPP.003. Menampilkan row page 25");
    }

    @When("TCC.H.PJD.NXT.PG.001. klik button next page")
    public void tcc_h_lbr_nxt_001_klik_button_nex_page() {
        driver.get("https://dev.dikahadir.com/laporan/perjalanan-dinas");
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.rowPerPage();
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.page5();
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnNextPage();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.NXT.PG.001. klik button next page");
    }

    @Then("TCC.H.PJD.NXT.PG.001. Menampilkan halaman next page")
    public void tcc_h_pjd_nxt_001_menampilkan_halaman_next_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtNextBackLastFirstPage(), "Aldi Piero Ashady");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.NXT.PG.001. Menampilkan halaman next page");
    }

    @When("TCC.H.PJD.PRE.PG.001. klik button previous page")
    public void tcc_pjd_pre_001_klik_button_previous_page() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnPreviousPage();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.PRE.PG.001. klik button previous page");
    }

    @Then("TCC.H.PJD.PRE.PG.001. Menampilkan halaman previous page")
    public void tcc_h_pjd_pre_001_menampilkan_halaman_previous_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtNextBackLastFirstPage(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.PRE.PG.001. Menampilkan halaman previous pagee");
    }

    @When("TCC.H.PJD.LST.PG.001. klik button last page")
    public void tcc_h_pjd_lst_001_klik_button_last_page() {
        halamanPerjalananDinas.btnLastPage();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.LST.PG.001. klik button last page");
    }

    @Then("TCC.H.PJD.LST.PG.001. Menampilkan halaman last page")
    public void tcc_h_pjd_lst_001_menampilkan_halaman_last_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtNextBackLastFirstPage(), "Aldi Piero Ashady");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.LST.PG.001. Menampilkan halaman last page");
    }

    @When("TCC.H.PJD.FRT.PG.001. klik button first page")
    public void tcc_h_pjd_frt_001_klik_button_first_page() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnFirstPage();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FRT.PG.001. klik button first page");
    }

    @Then("TCC.H.PJD.FRT.PG.001. Menampilkan halaman first page")
    public void tcc_h_pjd_frt_001_menampilkan_halaman_first_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxtNextBackLastFirstPage(), "Dummy Staff");
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.FRT.PG.001. Menampilkan halaman first page");
    }

    @When("TCC.H.PJD.VIEW.001. klik button view")
    public void tcc_h_pjd_view_001_klik_button_view() {
        Hooks.delay(Constants.DETIK);
        halamanPerjalananDinas.btnView();
        extentTest.log(LogStatus.PASS, "TCC.H.PJD.VIEW.001. klik button view");
    }

    @Then("TCC.H.PJD.VIEW.001. Menampilkan halaman view dokumen")
    public void tcc_h_pjd_view_001_menampilkan_halaman_view_dokumen() {
        driver.get("https://api-dev.dikahadir.com/uploads/fa135343f668efe92ba1d763dbe7d4e3140d2b3c44247209f5c97585f1242986.jpeg");
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanPerjalananDinas.getTxt404View(), "404");
        extentTest.log(LogStatus.FAIL, "TCC.H.PJD.VIEW.001. Menampilkan halaman view dokumen");
    }
}
