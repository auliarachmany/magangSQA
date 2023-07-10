Feature: Halaman Laporan Generate
  Scenario: Mengakses Halaman Generate
    When TCC.H.GNR.HLM.001.Masuk Menu Laporan
    And TCC.H.GNR.HLM.001.Pilih Menu generate
    Then TCC.H.GNR.HLM.001.User get header generate

  Scenario: Mengakses Halaman Generate URL Invalid
    When TCC.H.GNR.HLM.002.Input url invalid
    Then TCC.H.GNR.HLM.002.Menampilkan 404 page not found

  Scenario: Mengakses Fitur Penarikan Data
    When TCC.H.GNR.TGD.001.Input date
    And TCC.H.GNR.TGD.001.Input NIK
    And TCC.H.GNR.TGD.001.Input Nama User
    And TCC.H.GNR.TGD.001.Input Nama Upliner
    And TCC.H.GNR.TGD.001.Input Unit
    And TCC.H.GNR.TGD.001.button generate
    Then TCC.H.GNR.TGD.001.Berhasil generate data

  Scenario: Mengakses Fitur Penarikan Data hanya date
    When TCC.H.GNR.TGD.002.Input date
    And TCC.H.GNR.TGD.002.button generate
    Then TCC.H.GNR.TGD.002.Berhasil generate data

  Scenario: Reset Penarikan Data
    When TCC.H.GNR.RST.001.Button reset
    Then TCC.H.GNR.RST.001.Berhasil reset penarikan data
