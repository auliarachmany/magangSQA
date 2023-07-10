Feature: HalamanLaporanLembur
  Scenario: Mengakses Halaman Lembur
    When Masuk Menu Laporan
    And Pilih Menu Lembur
    Then User get header Lembur

  Scenario: Mengakses Fitur Search Berdasarkan Nama
    When Input data
    And Klik Search
    Then get search name

  Scenario: Tidak Menginput Fitur Search Berdasarkan Nama
    When TCC.H.LBR.SEARCH.002.Klik Search
    Then Berhasil menampilkan semua nama

  Scenario: Menginput data yang tidak sesuai
    When TCC.H.LBR.SEARCH.003.Input data salah
    And TCC.H.LBR.SEARCH.003.Klik Search
    Then Menampilakan data kosong

  Scenario: Reset Search dengan Button Riset
     When TCC.H.LBR.RST.001.Klik Button Riset
     Then Menampilkan semua nama User

  Scenario: Filter By Job Departement
       When TCC.H.LBR.FLTR BY.001.Klik Botton By Filter
       And  TCC.H.LBR.FLTR BY.001. Pilih opsi Job Departemen
       And  TCC.H.LBR.FLTR BY.001. Button Terapkan
       Then Menampilkan data sesuai Filter yang Dipilih

  Scenario: Tidak Memilih Filter By Job Departement
         When TCC.H.LBR.FLTR.BY.002. Klik Botton By Filter
         And  TCC.H.LBR.FLTR BY.002. Button Terapkan
         Then Menampilkan semua data

  Scenario: Start date and end date
         When TCC.H.LBR.DATE.001. Input Date
         And  TCC.H.LBR.DATE.001. Klik Botton Search
         Then Menampilkam data sesuai dengan start date dan end date

  Scenario: Tidak Memilih Start date and end date
         When TCC.H.LBR.DATE.002. Input Date
         And  TCC.H.LBR.DATE.002. Klik Botton Search
         Then Menampilkan semua data lembur

  Scenario: Appopve Lembur
         When TCC.H.LBR.APR LBR.001. Approve Lembur
         And  TCC.H.LBR.APR LBR.001. Klik Bottom Setujui
         Then Status berubah menjadi Approved

  Scenario: Cancel Approve Lembur
        When TCC.H.LBR.APR LBR.002. Approve Lembur
        And  TCC.H.LBR.APR LBR.002. Klik Botton tidak
        Then Status tidak berubah

  Scenario: Reject Lembur
        When TCC.H.LBR.RJT LBR.001. Reject Lembur
        And  TCC.H.LBR.RJT LBR.001. Ketik alasan
        And  TCC.H.LBR.RJT LBR.001. Klik Botton Tolak
        Then Status berubah menjadi reject

  Scenario: Cancel Reject Lembur
        When TCC.H.LBR.RJT LBR.002. Reject Lembur
        And  TCC.H.LBR.RJT LBR.002. Ketik alasan
        And  TCC.H.LBR.RJT LBR.002. Klik Botton Tidak
        Then TCC.H.LBR.RJT LBR.002. Status tidak berubah

  Scenario: Tidak menginputkan alasan reject lembur
        When TCC.H.LBR.RJT LBR.003. Reject Lembur
        And  TCC.H.LBR.RJT LBR.003. Tidak Ketik alasan
        And  TCC.H.LBR.RJT LBR.003. Klik Botton Tolak
        Then TCC.H.LBR.RJT LBR.003. Menampilkan pop up harap isi bidang ini

  Scenario: TCC.H.LBR.RPP.001.Rows per page 5
    When TCC.H.LBR.RPP.001. pilih row per page 5
    Then TCC.H.LBR.RPP.001. Menampilkan row page 5

  Scenario: TCC.H.LBR.RPP.002.Rows per page 10
    When TCC.H.LBR.RPP.002. pilih row per page 10
    Then TCC.H.LBR.RPP.002. Menampilkan row page 10

  Scenario: TCC.H.LBR.RPP.003.Rows per page 25
    When TCC.H.LBR.RPP.003. pilih row per page 25
    Then TCC.H.LBR.RPP.003. Menampilkan row page 25

  Scenario: TCC.H.LBR.NXT.PG.001.Menampilkan data Next page
    When TCC.H.LBR.NXT.PG.001. klik button next page
    Then TCC.H.LBR.NXT.PG.001. Menampilkan halaman next page

  Scenario: TCC.H.LBR.PRE.PG.001.Menampilkan data Previous page
    When TCC.H.LBR.PRE.PG.001. klik button previous page
    Then TCC.H.LBR.PRE.PG.001. Menampilkan halaman previous page

  Scenario: TCC.H.LBR.LST.PG.001.Menampilkan data last page
    When TCC.H.LBR.LST.PG.001. klik button last page
    Then TCC.H.LBR.LST.PG.001. Menampilkan halaman last page

  Scenario: TCC.H.LBR.FRT.PG.001.Menampilkan data first page
    When TCC.H.LBR.FRT.PG.001. klik button first page
    Then TCC.H.LBR.FRT.PG.001. Menampilkan halaman first page

