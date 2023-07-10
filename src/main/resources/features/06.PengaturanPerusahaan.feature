Feature: Pengaturan Perusahaan
  Scenario: Mengakses Halaman Pengaturan Perusahaan
    When TCC.H.PP.HLM.001.Masuk Menu Perusahaan
    And TCC.H.PP.HLM.001.Pilih Menu pengaturan perusahaan
    Then TCC.H.PP.HLM.001.Menampilan halaman pengaturan perusahaan

  Scenario: Menambahkan max radius
    When TCC.H.PP.TMB.001.klik button tambahkan
    And TCC.H.PP.TMB.001.input max radius
    And TCC.H.PP.TMB.001.klik button tambah
    Then TCC.H.PP.TMB.001.menampilkan popup

  Scenario: Mengedit max radius
    When TCC.H.PP.EDT.001.klik menu edit
    And TCC.H.PP.EDT.001.input max radius
    And TCC.H.PP.EDT.001.klik button simpan
    Then TCC.H.PP.EDT.001.menampilkan popup

  Scenario: Mengedit dengan tidak input max radius
    When TCC.H.PP.EDT.002.klik menu edit
    And TCC.H.PP.EDT.002.tidak input max radius
    And TCC.H.PP.EDT.002.klik button simpan
    Then TCC.H.PP.EDT.002.menampilkan popup harap isi bidang ini

  Scenario: Mematikan self in
    When TCC.H.PP.SELF.IN.001.klik swipe self in
    Then TCC.H.PP.SELF.IN.001.menampilkan popup sukses

  Scenario: Menyalakan self in
    When TCC.H.PP.SELF.IN.002.klik swipe self in
    Then TCC.H.PP.SELF.IN.002.menampilkan popup sukses

  Scenario: Delete Pengaturan Perusahaan
    When TCC.H.PP.DLT.001.klik menu delete
    And TCC.H.PP.DLT.001.klik button ya
    Then TCC.H.PP.DLT.001.menampilkan popup berhasil menghapus data company setting

  Scenario: Rows per page 5
    When TCC.H.PP.RPP.001. pilih row per page 5
    Then TCC.H.PP.RPP.001. Menampilkan row page 5

  Scenario: Rows per page 10
    When TCC.H.PP.RPP.002. pilih row per page 10
    Then TCC.H.PP.RPP.002. Menampilkan row page 10

  Scenario: Rows per page 25
    When TCC.H.PP.RPP.003. pilih row per page 25
    Then TCC.H.PP.RPP.003. Menampilkan row page 25