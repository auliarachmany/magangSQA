Feature: Halaman Laporan Perjalanan Dinas
  Scenario: Mengakses Halaman Perjalanan Dinas
    When TCC.H.PJD.HLM.001.Masuk Menu Laporan
    And TCC.H.PJD.HLM.001.Pilih Menu perjalanan dinas
    Then TCC.H.PJD.HLM.001.User get header perjalanan dinas

  Scenario: Mengakses Halaman Perjalanan Dinas URL Invalid
    When TCC.H.PJD.HLM.002.Input url invalid
    Then TCC.H.PJD.HLM.002.Menampilkan 404 page not found

  Scenario: Mengakses Fitur Search Berdasarkan Nama
    When TCC.H.PJD.SEARCH.001.Input data
    And TCC.H.PJD.SEARCH.001.Klik Search
    Then TCC.H.PJD.SEARCH.001.get search name

  Scenario: TCC.H.PJD.SEARCH.002.Tidak Menginput Fitur Search Berdasarkan Nama
    When TCC.H.PJD.SEARCH.002.Klik Search
    Then TCC.H.PJD.SEARCH.002.Berhasil menampilkan semua nama

  Scenario: Menginput data yang tidak sesuai
    When TCC.H.PJD.SEARCH.003.Input data salah
    And TCC.H.PJD.SEARCH.003.Klik Search
    Then TCC.H.PJD.SEARCH.003.Menampilakan data kosong

  Scenario: Reset Search dengan Button Riset
    When TCC.H.PJD.RST.001.Klik Button Riset
    Then TCC.H.PJD.RST.001.Menampilkan semua nama User

  Scenario: Filter By Job Departement
    When TCC.H.PJD.FLTR BY.001.Klik Botton By Filter
    And  TCC.H.PJD.FLTR BY.001.Pilih opsi Job Departemen
    And  TCC.H.PJD.FLTR BY.001.Button Terapkan
    Then TCC.H.PJD.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih

  Scenario: Tidak Memilih Filter By Job Departement
    When TCC.H.PJD.FLTR.BY.002.Klik Botton By Filter
    And  TCC.H.PJD.FLTR BY.002.Button Terapkan
    Then TCC.H.PJD.FLTR.BY.002.Menampilkan semua data

  Scenario: Start date and end date
    When TCC.H.PJD.DATE.001.Input Date
    And  TCC.H.PJD.DATE.001.Klik Botton Search
    Then TCC.H.PJD.DATE.001.Menampilkam data sesuai dengan start date dan end date

  Scenario: Tidak Memilih Start date and end date
    When TCC.H.PJD.DATE.002.Input Date
    And  TCC.H.PJD.DATE.002.Klik Botton Search
    Then TCC.H.PJD.DATE.002.Menampilkan semua data lembur

  Scenario: Approve Perjalanan Dinas
    When TCC.H.PJD.APR.PJD.001.Approve perjalanan dinas
    And  TCC.H.PJD.APR.PJD.001.Klik Bottom Setujui
    Then TCC.H.PJD.APR.PJD.001.Status berubah menjadi Approved

  Scenario: Cancel Approve Perjalanan Dinas
    When TCC.H.PJD.APR.PJD.002.Approve perjalanan dinas
    And  TCC.H.PJD.APR.PJD.002.Klik Botton tidak
    Then TCC.H.PJD.APR.PJD.002.Status tidak berubah

  Scenario: Reject Perjalanan Dinas
    When TCC.H.PJD.RJT.PJD.001.Reject perjalanan dinas
    And  TCC.H.LBR.RJT.PJD.001.Ketik alasan
    And  TCC.H.PJD.RJT.PJD.001.Klik Botton Ya
    Then TCC.H.PJD.RJT.PJD.001.Status berubah menjadi reject

  Scenario: Cancel Reject Perjalanan Dinas
    When TCC.H.PJD.RJT.PJD.002.Reject perjalanan dinas
    And  TCC.H.PJD.RJT.PJD.002.Ketik alasan
    And  TCC.H.PJD.RJT.PJD.002.Klik Botton Tidak
    Then TCC.H.PJD.RJT.PJD.002.Status tidak berubah

  Scenario: Tidak menginputkan alasan reject perjalanan dinas
    When TCC.H.PJD.RJT.PJD.003.Reject perjalanan dinas
    And  TCC.H.PJD.RJT.PJD.003.Tidak Ketik alasan
    And  TCC.H.PJD.RJT.PJD.003.Klik Botton Tolak
    Then TCC.H.PJD.RJT.PJD.003.Menampilkan pop up harap isi bidang ini

  Scenario: TCC.H.PJD.RPP.001.Rows per page 5
    When TCC.H.PJD.RPP.001. pilih row per page 5
    Then TCC.H.PJD.RPP.001. Menampilkan row page 5

  Scenario: TCC.H.PJD.RPP.002.Rows per page 10
    When TCC.H.PJD.RPP.002. pilih row per page 10
    Then TCC.H.PJD.RPP.002. Menampilkan row page 10

  Scenario: TCC.H.PJD.RPP.003.Rows per page 25
    When TCC.H.PJD.RPP.003. pilih row per page 25
    Then TCC.H.PJD.RPP.003. Menampilkan row page 25

  Scenario: TCC.H.PJD.NXT.PG.001.Menampilkan data Next page
    When TCC.H.PJD.NXT.PG.001. klik button next page
    Then TCC.H.PJD.NXT.PG.001. Menampilkan halaman next page

  Scenario: TCC.H.PJD.PRE.PG.001.Menampilkan data Previous page
    When TCC.H.PJD.PRE.PG.001. klik button previous page
    Then TCC.H.PJD.PRE.PG.001. Menampilkan halaman previous page

  Scenario: TCC.H.PJD.LST.PG.001.Menampilkan data last page
    When TCC.H.PJD.LST.PG.001. klik button last page
    Then TCC.H.PJD.LST.PG.001. Menampilkan halaman last page

  Scenario: TCC.H.PJD.FRT.PG.001.Menampilkan data first page
    When TCC.H.PJD.FRT.PG.001. klik button first page
    Then TCC.H.PJD.FRT.PG.001. Menampilkan halaman first page

  Scenario: TCC.H.PJD.VIEW.001.Menampilkan dokumen
    When TCC.H.PJD.VIEW.001. klik button view
    Then TCC.H.PJD.VIEW.001. Menampilkan halaman view dokumen
