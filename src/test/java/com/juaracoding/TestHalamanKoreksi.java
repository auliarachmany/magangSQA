package com.juaracoding;

import com.juaracoding.pages.HalamanKoreksi;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanKoreksi {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HalamanKoreksi halamanKoreksi = new HalamanKoreksi();
    static LoginPage loginPage = new LoginPage();

    public TestHalamanKoreksi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.H.KRS.HLM.001.Masuk Menu Laporan")
    public void tcc_h_krs_hlm_001_masuk_menu_laporan() {
        driver.get(Constants.URL);
        loginPage.enterUsername("qa.tester@hadir.com");
        loginPage.enterPassword("qatester@dika");
        loginPage.BtnLogin();
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.BtnLaporan();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.HLM.001.Masuk Menu Laporan");
    }

    @And("TCC.H.KRS.HLM.001.Pilih Menu koreksi")
    public void tcc_h_krs_hlm_001_menu_koreksi() {
        halamanKoreksi.BtnKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.HLM.001.Pilih Menu koreksi");
    }

    @Then("TCC.H.KRS.HLM.001.User get header koreksi")
    public void  tcc_h_krs_hlm_001_user_get_header_koreksi() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtHeadingKoreksi(), "Koreksi");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.HLM.001.User get header koreksi");
    }

    @When("TCC.H.KRS.HLM.002.Input url invalid")
    public void tcc_h_krs_hlm_002_input_url_invalid() {
        driver.get("https://dev.dikahadir.com/laporan/koreksii");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.HLM.002.Input url invalid");
    }

    @Then("TCC.H.KRS.HLM.002.Menampilkan 404 page not found")
    public void  tcc_h_krs_hlm_002_menampilkan_404_page_not_found() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxt404(), "404");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.HLM.002.Menampilkan 404 page not found");
    }

    @When("TCC.H.KRS.SEARCH.001.Input data")
    public void tcc_h_krs_search_001_input_data() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.Inputsearch("Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.001.Input data");
    }

    @And("TCC.H.KRS.SEARCH.001.Klik Search")
    public void tcc_h_krs_search_001_klik_search() {
        halamanKoreksi.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.001.Klik Search");
    }

    @Then("TCC.H.KRS.SEARCH.001.get search name")
    public void tcc_h_krs_search_001_get_search_name() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.001.get search name");
    }

    @When("TCC.H.KRS.SEARCH.002.Klik Search")
    public void tcc_h_krs_search_002_klik_search() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.002.Klik Search");
    }

    @Then("TCC.H.KRS.SEARCH.002.Berhasil menampilkan semua nama")
    public void tcc_h_krs_search_002_berhasil_menampilkan_semua_nama() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.002.Berhasil menampilkan semua nama");
    }

    @When("TCC.H.KRS.SEARCH.003.Input data salah")
    public void tcc_h_krs_search_003_input_data_salah() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.Inputsearch("study");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.003.Input data salah");
    }

    @And("TCC.H.KRS.SEARCH.003.Klik Search")
    public void tcc_h_krs_search_003_klik_search() {
        halamanKoreksi.BtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.003.Klik Search");
    }

    @Then("TCC.H.KRS.SEARCH.003.Menampilakan data kosong")
    public void tcc_h_krs_search_003_menampilkan_data_kosong() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtkosong(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.SEARCH.003.Menampilakan data kosong");
    }

    @When("TCC.H.KRS.RST.001.Klik Button Riset")
    public void tcc_h_krs_rst_001_klik_button_riset() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.BtnRiset();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RST.001.Klik Button Riset");
    }

    @Then("TCC.H.KRS.RST.001.Menampilkan semua nama User")
    public void tcc_h_krs_rst_001_menampilkan_semua_nama_user() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RST.001.Menampilkan semua nama User");
    }

    @When("TCC.H.KRS.FLTR BY.001.Klik Botton By Filter")
    public void tcc_h_krs_fltr_by_001_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR BY.001.Klik Botton By Filter");
    }

    @And("TCC.H.KRS.FLTR BY.001.Pilih opsi Job Departemen")
    public void tcc_h_krs_fltr_by_001_pilih_opsi_job_departemen() {
        halamanKoreksi.setInputjobdepartement("IT PROGRAMMER");
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR BY.001.Pilih opsi Job Departemen");
    }

    @And("TCC.H.KRS.FLTR BY.001.Button Terapkan")
    public void tcc_h_krs_fltr_by_001_button_terapkan() {
        halamanKoreksi.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR BY.001.Button Terapkan");
    }

    @Then("TCC.H.KRS.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih")
    public void tcc_h_krs_fltr_by_001_menampilkan_data_sesuai_filter_yang_dipilih() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtresultfilterjob(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih");
    }

    @When("TCC.H.KRS.FLTR.BY.002.Klik Botton By Filter")
    public void tcc_h_krs_fltr_by_002_klik_botton_by_filter() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.BtnFilter();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR.BY.002.Klik Botton By Filter");
    }

    @And("TCC.H.KRS.FLTR BY.002.Button Terapkan")
    public void tcc_h_krs_fltr_by_002_button_terapkan() {
        halamanKoreksi.setBtnTerapkan();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FLTR BY.002.Button Terapkan");
    }

    @Then("TCC.H.KRS.FLTR.BY.002.Menampilkan semua data")
    public void tcc_h_krs_fltr_by_002_menampilkan_semua_data() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxt500(), "500");
        extentTest.log(LogStatus.FAIL, "TCC.H.KRS.FLTR.BY.002.Menampilkan semua data");
    }

    @When("TCC.H.KRS.DATE.001.Input Date")
    public void tcc_h_krs_date_001_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setInputstartdate("01-06-2023");
        halamanKoreksi.setInputenddate("30-06-2023");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.001.Input Date");
    }

    @And("TCC.H.KRS.DATE.001.Klik Botton Search")
    public void tcc_h_krs_date_001_klik_botton_search() {
        halamanKoreksi.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.001.Klik Botton Search");
    }

    @Then("TCC.H.KRS.DATE.001.Menampilkam data sesuai dengan start date dan end date")
    public void tcc_h_krs_date_001_Menampilkam_data_sesuai_dengan_start_date_dan_end_date() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.001.Menampilkam data sesuai dengan start date dan end date");
    }

    @When("TCC.H.KRS.DATE.002.Input Date")
    public void tcc_h_krs_date_002_input_date() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setInputstartdate("");
        halamanKoreksi.setInputenddate("");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.002.Input Date");
    }

    @And("TCC.H.KRS.DATE.002.Klik Botton Search")
    public void tcc_h_krs_date_002_klik_botton_search() {
        halamanKoreksi.BtnSearch();
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.002.Klik Botton Search");
    }

    @Then("TCC.H.KRS.DATE.002.Menampilkan semua data lembur")
    public void tcc_h_krs_date_002_Menampilkan_semua_data_lembur() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtsearchname(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.DATE.002.Menampilkan semua data lembur");
    }

    @When("TCC.H.KRS.APR.KRS.001.Approve koreksi")
    public void tcc_h_krs_apr_lbr_001_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setMenuApprove();
        halamanKoreksi.setApproveKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.001.Approve koreksi");
    }

    @And("TCC.H.KRS.APR.KRS.001.Klik Bottom Setujui")
    public void tcc_h_krs_apr_lbr_001_klik_bottom_setujui() {
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.setBtnSetujui();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.001.Klik Bottom Setujui");
    }

    @Then("TCC.H.KRS.APR.KRS.001.Status berubah menjadi Approved")
    public void tcc_h_krs_apr_pjd_001_Status_berubah_menjadi_Approved() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.001.Status berubah menjadi Approved");
    }

    @When("TCC.H.KRS.APR.KRS.002.Approve koreksi")
    public void tcc_h_krs_apr_pjd_002_Approve_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setMenuApprove();
        halamanKoreksi.setApproveKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.002.Approve koreksi");
    }

    @And("TCC.H.KRS.APR.KRS.002.Klik Botton batal")
    public void tcc_h_pjd_apr_pjd_002_klik_botton_tidak() {
        halamanKoreksi.btnBatalAprroved();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.002.Klik Botton batal");
    }

    @Then("TCC.H.KRS.APR.KRS.002.Status tidak berubah")
    public void tcc_h_krs_apr_pjd_002_Status_tidak_berubah() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtStatus(), "APPROVED");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.APR.KRS.002.Status tidak berubah");
    }

    @When("TCC.H.KRS.RJT.KRS.001.Reject koreksi")
    public void tcc_h_krs_rjt_krs_001_reject_perjalanan_dinas() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setMenuApprove();
        halamanKoreksi.setRejectKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.001.Reject koreksi");
    }

    @And("TCC.H.KRS.RJT.KRS.001.Ketik alasan")
    public void tcc_h_krs_rjt_krs_001_ketik_alasan() {
        halamanKoreksi.inputAlasan("-");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.001.Ketik alasan");
    }

    @And("TCC.H.KRS.RJT.KRS.001.Klik Botton tolak")
    public void tcc_h_krs_rjt_krs_001_klik_button_tolak() {
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.btnTolakReject();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.001.Klik Botton tolak");
    }

    @Then("TCC.H.KRS.RJT.KRS.001.Status berubah menjadi reject")
    public void tcc_h_krs_rjt_krs_001_status_berubah_menjadi_reject() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtStatus(), "REJECT");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.001.Status berubah menjadi reject");
    }

    @When("TCC.H.KRS.RJT.KRS.002.Reject koreksi")
    public void tcc_h_krs_rjt_krs_002_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setMenuApprove();
        halamanKoreksi.setRejectKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.002.Reject koreksi");
    }

    @And("TCC.H.KRS.RJT.KRS.002.Ketik alasan")
    public void tcc_h_krs_rjt_krs_002_ketik_alasan() {
        halamanKoreksi.inputAlasan("acara keluarga");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.002.Ketik alasan");
    }

    @And("TCC.H.KRS.RJT.KRS.002.Klik Botton batal")
    public void tcc_h_krs_rjt_krs_002_klik_button_batal() {
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.btnBatalReject();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.002.Klik Botton batal");
    }

    @Then("TCC.H.KRS.RJT.KRS.002.Status tidak berubah")
    public void tcc_h_pjd_rjt_pjd_002_status_tidak_berubah() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.gettxtStatus(), "REJECT");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.002.Status tidak berubah");
    }

    @When("TCC.H.KRS.RJT.KRS.003.Reject koreksi")
    public void tcc_h_krs_rjt_lbr_003_reject_lembur() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.setMenuApprove();
        halamanKoreksi.setRejectKoreksi();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.003.Reject koreksi");
    }

    @And("TCC.H.KRS.RJT.KRS.003.Tidak Ketik alasan")
    public void tcc_h_krs_rjt_lbr_003_tidak_ketik_alasan() {
        halamanKoreksi.inputAlasan("");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.003.Tidak Ketik alasan");
    }

    @And("TCC.H.KRS.RJT.KRS.003.Klik Botton tolak")
    public void tcc_h_krs_rjt_lbr_003_klik_button_tolak() {
        halamanKoreksi.btnTolakReject();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.003.Klik Botton tolak");
    }

    @Then("TCC.H.KRS.RJT.KRS.003.Menampilkan pop up harap isi bidang ini")
    public void tcc_h_krs_rjt_lbr_003_menampilkan_pop_up_harap_isi_bidang_ini() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtAlasan(), "true");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RJT.KRS.003.Menampilkan pop up harap isi bidang ini");
    }

    @When("TCC.H.KRS.RPP.001. pilih row per page 5")
    public void tcc_h_krs_rpp_001_pilih_row_per_page_5() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.rowPerPage();
        halamanKoreksi.page5();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.001. pilih row per page 5");
    }

    @Then("TCC.H.KRS.RPP.001. Menampilkan row page 5")
    public void tcc_h_krs_rpp_001_menampilkan_row_page_5() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtPage(), "5");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.001. Menampilkan row page 5");
    }

    @When("TCC.H.KRS.RPP.002. pilih row per page 10")
    public void tcc_h_krs_rpp_002_pilih_row_per_page_10() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.rowPerPage();
        halamanKoreksi.page10();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.002. pilih row per page 10");
    }

    @Then("TCC.H.KRS.RPP.002. Menampilkan row page 10")
    public void tcc_h_krs_rpp_002_menampilkan_row_page_10() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtPage(), "10");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.002. Menampilkan row page 10");
    }

    @When("TCC.H.KRS.RPP.003. pilih row per page 25")
    public void tcc_h_krs_rpp_003_pilih_row_per_page_25() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        halamanKoreksi.rowPerPage();
        halamanKoreksi.page25();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.003. pilih row per page 25");
    }

    @Then("TCC.H.KRS.RPP.003. Menampilkan row page 25")
    public void tcc_h_krs_rpp_003_menampilkan_row_page_25() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtPage(), "25");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.RPP.003. Menampilkan row page 25");
    }

    @When("TCC.H.KRS.NXT.PG.001. klik button next page")
    public void tcc_h_krs_nxt_001_klik_button_nex_page() {
        driver.get("https://dev.dikahadir.com/laporan/koreksi");
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.btnNextPage();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.NXT.PG.001. klik button next page");
    }

    @Then("TCC.H.KRS.NXT.PG.001. Menampilkan halaman next page")
    public void tcc_h_krs_nxt_001_menampilkan_halaman_next_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtNextBackLastFirstPage(), "WAHYU FADILLAH P.Y");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.NXT.PG.001. Menampilkan halaman next page");
    }

    @When("TCC.H.KRS.PRE.PG.001. klik button previous page")
    public void tcc_krs_pre_001_klik_button_previous_page() {
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.btnPreviousPage();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.PRE.PG.001. klik button previous page");
    }

    @Then("TCC.H.KRS.PRE.PG.001. Menampilkan halaman previous page")
    public void tcc_h_pjd_pre_001_menampilkan_halaman_previous_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtNextBackLastFirstPage(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.PRE.PG.001. Menampilkan halaman previous page");
    }

    @When("TCC.H.KRS.LST.PG.001. klik button last page")
    public void tcc_h_krs_lst_001_klik_button_last_page() {
        halamanKoreksi.btnLastPage();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.LST.PG.001. klik button last page");
    }

    @Then("TCC.H.KRS.LST.PG.001. Menampilkan halaman last page")
    public void tcc_h_krs_lst_001_menampilkan_halaman_last_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtNextBackLastFirstPage(), "Indra Gunawan");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.LST.PG.001. Menampilkan halaman last page");
    }

    @When("TCC.H.KRS.FRT.PG.001. klik button first page")
    public void tcc_h_krs_frt_001_klik_button_first_page() {
        Hooks.delay(Constants.DETIK);
        halamanKoreksi.btnFirstPage();
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FRT.PG.001. klik button first page");
    }

    @Then("TCC.H.KRS.FRT.PG.001. Menampilkan halaman first page")
    public void tcc_h_pjd_frt_001_menampilkan_halaman_first_page() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(halamanKoreksi.getTxtNextBackLastFirstPage(), "Prod Test Leader");
        extentTest.log(LogStatus.PASS, "TCC.H.KRS.FRT.PG.001. Menampilkan halaman first page");
    }
}
