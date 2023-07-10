package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =
//        "src/main/resources/features/01.HalamanLaporanLembur.feature",
//        "src/main/resources/features/02.HalamanLaporanPerjalananDinas.feature",
//        "src/main/resources/features/03.HalamanKoreksi.feature",
//        "src/main/resources/features/04.HalamanGenerate.feature",
//        "src/main/resources/features/05.PerusahaanAdmin.feature",
        "src/main/resources/features/06.PengaturanPerusahaan.feature",
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
