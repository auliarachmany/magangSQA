Feature: HalamanLaporanLembur
  Scenario: Mengakses Halaman Perusahaan URL Valid
    When TCC.H.PRS.HLM.001.Menu Perusahaan
    And TCC.H.PRS.HLM.001.Pilih Menu Perusahaan
    Then TCC.H.PRS.HLM.001.Menampilkan Halaman Perusahaan

  Scenario: Mengakses Halaman Perusahaan URL inValid
    When TCC.H.PRS.HLM.002.Masukan url invalid
    Then TCC.H.PRS.HLM.002.tidak Menampilkan Halaman Perusahaan

   Scenario: Edit Company Setting
     When TCC.H.PRS.EDT.001.Input data pada company name
     And TCC.H.PRS.EDT.001.Input data industry
     And TCC.H.PRS.EDT.001.Klik Button Simpan
     Then TCC.H.PRS.EDT.001.Berhasil mengedit data sesuai yang diinginkan

     Scenario: Tidak input company name dan industry
          When TCC.H.PRS.EDT.002.Tidak Input data pada company name
          And TCC.H.PRS.EDT.002.Tidak Input data industry
          And TCC.H.PRS.EDT.002.Klik Button Simpan
          Then TCC.H.PRS.EDT.002.Menampilkan pop up harap isi bidang ini

   Scenario: Tidak input company name
          When TCC.H.PRS.EDT.003.Tidak Input data pada company name
          And TCC.H.PRS.EDT.003.Input data industry
          And TCC.H.PRS.EDT.003.Klik Button Simpan
          Then TCC.H.PRS.EDT.003.Menampilkan pop up harap isi bidang ini

  Scenario: Tidak input data industry
          When TCC.H.PRS.EDT.004.Input data pada company name
          And TCC.H.PRS.EDT.004.Tidak Input data industry
          And TCC.H.PRS.EDT.004.Klik Button Simpan
          Then TCC.H.PRS.EDT.004.Menampilkan pop up harap isi bidang ini

  Scenario: Delete Company Setting
           When TCC.H.PRS.DLT.001.Menu Delete
           And TCC.H.PRS.DLT.001.Klik Buttom ya
           Then TCC.H.PRS.DLT.001.Berhasil menghapus data

  Scenario: Tidak Delete Company Setting
           When TCC.H.PRS.DLT.002.Menu Delete
           And TCC.H.PRS.DLT.002.Klik Buttom tidak
           Then TCC.H.PRS.DLT.002.Kembali pada menu perusahaan

Scenario: Rows per page 5
          When TCC.H.PRS. RPP.001. Row Per Page
          Then TCC.H.PRS. RPP.001. Menampilkan row page 5

Scenario: Rows per page 10
          When TCC.H.PRS. RPP.002. Row Per Page
          Then TCC.H.PRS. RPP.002. Menampilkan row page 10

Scenario: Rows per page 25
          When TCC.H.PRS. RPP.003. Row Per Page
          Then TCC.H.PRS. RPP.003. Menampilkan row page 25
