Feature: Halaman Laporan Koreksi
  Scenario: Mengakses Halaman Koreksi
    When TCC.H.KRS.HLM.001.Masuk Menu Laporan
    And TCC.H.KRS.HLM.001.Pilih Menu koreksi
    Then TCC.H.KRS.HLM.001.User get header koreksi

  Scenario: Mengakses Halaman Koreksi URL Invalid
    When TCC.H.KRS.HLM.002.Input url invalid
    Then TCC.H.KRS.HLM.002.Menampilkan 404 page not found

  Scenario: Mengakses Fitur Search Berdasarkan Nama
    When TCC.H.KRS.SEARCH.001.Input data
    And TCC.H.KRS.SEARCH.001.Klik Search
    Then TCC.H.KRS.SEARCH.001.get search name

  Scenario: TCC.H.KRS.SEARCH.002.Tidak Menginput Fitur Search Berdasarkan Nama
    When TCC.H.KRS.SEARCH.002.Klik Search
    Then TCC.H.KRS.SEARCH.002.Berhasil menampilkan semua nama

  Scenario: Menginput data yang tidak sesuai
    When TCC.H.KRS.SEARCH.003.Input data salah
    And TCC.H.KRS.SEARCH.003.Klik Search
    Then TCC.H.KRS.SEARCH.003.Menampilakan data kosong

  Scenario: Reset Search dengan Button Riset
    When TCC.H.KRS.RST.001.Klik Button Riset
    Then TCC.H.KRS.RST.001.Menampilkan semua nama User

  Scenario: Filter By Job Departement
    When TCC.H.KRS.FLTR BY.001.Klik Botton By Filter
    And  TCC.H.KRS.FLTR BY.001.Pilih opsi Job Departemen
    And  TCC.H.KRS.FLTR BY.001.Button Terapkan
    Then TCC.H.KRS.FLTR BY.001.Menampilkan data sesuai Filter yang Dipilih

  Scenario: Tidak Memilih Filter By Job Departement
    When TCC.H.KRS.FLTR.BY.002.Klik Botton By Filter
    And  TCC.H.KRS.FLTR BY.002.Button Terapkan
    Then TCC.H.KRS.FLTR.BY.002.Menampilkan semua data

  Scenario: Start date and end date
    When TCC.H.KRS.DATE.001.Input Date
    And  TCC.H.KRS.DATE.001.Klik Botton Search
    Then TCC.H.KRS.DATE.001.Menampilkam data sesuai dengan start date dan end date

  Scenario: Tidak Memilih Start date and end date
    When TCC.H.KRS.DATE.002.Input Date
    And  TCC.H.KRS.DATE.002.Klik Botton Search
    Then TCC.H.KRS.DATE.002.Menampilkan semua data lembur

  Scenario: Approve Koreksi
    When TCC.H.KRS.APR.KRS.001.Approve koreksi
    And  TCC.H.KRS.APR.KRS.001.Klik Bottom Setujui
    Then TCC.H.KRS.APR.KRS.001.Status berubah menjadi Approved

  Scenario: Cancel Approve Koreksi
    When TCC.H.KRS.APR.KRS.002.Approve koreksi
    And  TCC.H.KRS.APR.KRS.002.Klik Botton batal
    Then TCC.H.KRS.APR.KRS.002.Status tidak berubah

  Scenario: Reject Koreksi
    When TCC.H.KRS.RJT.KRS.001.Reject koreksi
    And  TCC.H.KRS.RJT.KRS.001.Ketik alasan
    And  TCC.H.KRS.RJT.KRS.001.Klik Botton tolak
    Then TCC.H.KRS.RJT.KRS.001.Status berubah menjadi reject

  Scenario: Cancel Reject Koreksi
    When TCC.H.KRS.RJT.KRS.002.Reject koreksi
    And  TCC.H.KRS.RJT.KRS.002.Ketik alasan
    And  TCC.H.KRS.RJT.KRS.002.Klik Botton batal
    Then TCC.H.KRS.RJT.KRS.002.Status tidak berubah

  Scenario: Tidak menginputkan alasan reject koreksi
    When TCC.H.KRS.RJT.KRS.003.Reject koreksi
    And  TCC.H.KRS.RJT.KRS.003.Tidak Ketik alasan
    And  TCC.H.KRS.RJT.KRS.003.Klik Botton tolak
    Then TCC.H.KRS.RJT.KRS.003.Menampilkan pop up harap isi bidang ini

  Scenario: TCC.H.KRS.RPP.001.Rows per page 5
    When TCC.H.KRS.RPP.001. pilih row per page 5
    Then TCC.H.KRS.RPP.001. Menampilkan row page 5

  Scenario: TCC.H.KRS.RPP.002.Rows per page 10
    When TCC.H.KRS.RPP.002. pilih row per page 10
    Then TCC.H.KRS.RPP.002. Menampilkan row page 10

  Scenario: TCC.H.KRS.RPP.003.Rows per page 25
    When TCC.H.KRS.RPP.003. pilih row per page 25
    Then TCC.H.KRS.RPP.003. Menampilkan row page 25

  Scenario: TCC.H.KRS.NXT.PG.001.Menampilkan data Next page
    When TCC.H.KRS.NXT.PG.001. klik button next page
    Then TCC.H.KRS.NXT.PG.001. Menampilkan halaman next page

  Scenario: TCC.H.KRS.PRE.PG.001.Menampilkan data Previous page
    When TCC.H.KRS.PRE.PG.001. klik button previous page
    Then TCC.H.KRS.PRE.PG.001. Menampilkan halaman previous page

  Scenario: TCC.H.KRS.LST.PG.001.Menampilkan data last page
    When TCC.H.KRS.LST.PG.001. klik button last page
    Then TCC.H.KRS.LST.PG.001. Menampilkan halaman last page

  Scenario: TCC.H.KRS.FRT.PG.001.Menampilkan data first page
    When TCC.H.KRS.FRT.PG.001. klik button first page
    Then TCC.H.KRS.FRT.PG.001. Menampilkan halaman first page