package com.juaracoding.utils;

public enum TestScenarios {

    // LAPORAN LEMBUR
    T1("Mengakses Halaman Lembur"),
    T2 ("Mengakses Fitur Search Berdasarkan Nama"),
    T3("Tidak Menginput Fitur Search Berdasarkan Nama "),
    T4("Menginput data yang tidak sesuai"),
    T5 ("Reset Search dengan Button Riset"),
    T6("Filter By Job Departement"),
    T7("Tidak Memilih Filter By Job Departement"),
    T8("Start date and end date"),
    T9 ( "Tidak memilih start date and end date"),
    T10 ("Appopve Lembur"),
    T11("Cancel Approve Lembur"),
    T12("Reject Lembur"),
    T13("Cancel Reject Lembur"),
    T14("Tidak menginputkan alasan reject lembur"),
    T15("TCC.H.LBR.RPP.001.Rows per page 5"),
    T16("TCC.H.LBR.RPP.002.Rows per page 10"),
    T17("TCC.H.LBR.RPP.003.Rows per page 25"),
    T18("TCC.H.LBR.NXT.PG.001.Menampilkan data Next page"),
    T19("TCC.H.LBR.PRE.PG.001.Menampilkan data Previous page"),
    T20("TCC.H.LBR.LST.PG.001.Menampilkan data last page"),
    T21("TCC.H.LBR.FRT.PG.001.Menampilkan data first page"),

    //LAPORAN PERJALANAN DINAS
    T22("Mengakses Halaman Perjalanan Dinas"),
    T23("Mengakses Halaman Perjalanan Dinas URL Invalid"),
    T24("Mengakses Fitur Search Berdasarkan Nama"),
    T25("TCC.H.PJD.SEARCH.002.Tidak Menginput Fitur Search Berdasarkan Nama"),
    T26("Menginput data yang tidak sesuai"),
    T27("Reset Search dengan Button Riset"),
    T28("Filter By Job Departement"),
    T29("Tidak Memilih Filter By Job Departement"),
    T30("Start date and end date"),
    T31("Tidak Memilih Start date and end date"),
    T32("Approve Perjalanan Dinas"),
    T33("Cancel Approve Perjalanan Dinas"),
    T34("Reject Perjalanan Dinas"),
    T35("Cancel Reject Perjalanan Dinas"),
    T36("Tidak menginputkan alasan reject perjalanan dinas"),
    T37("TCC.H.PJD.RPP.001.Rows per page 5"),
    T38("TCC.H.PJD.RPP.002.Rows per page 10"),
    T39("TCC.H.PJD.RPP.003.Rows per page 25"),
    T40("TCC.H.PJD.NXT.PG.001.Menampilkan data Next page"),
    T41("TCC.H.PJD.PRE.PG.001.Menampilkan data Previous page"),
    T42("TCC.H.PJD.LST.PG.001.Menampilkan data last page"),
    T43("TCC.H.PJD.FRT.PG.001.Menampilkan data first page"),
    T44("TCC.H.PJD.VIEW.001.Menampilkan dokumen"),

    //LAPORAN KOREKSI
    T45("Mengakses Halaman Koreksi"),
    T46("Mengakses Halaman Koreksi URL Invalid"),
    T47("Mengakses Fitur Search Berdasarkan Nama"),
    T48("TCC.H.KRS.SEARCH.002.Tidak Menginput Fitur Search Berdasarkan Nama"),
    T49("Menginput data yang tidak sesuai"),
    T50("Reset Search dengan Button Riset"),
    T51("Filter By Job Departement"),
    T52("Tidak Memilih Filter By Job Departement"),
    T53("Start date and end date"),
    T54("Tidak Memilih Start date and end date"),
    T55("Approve Koreksi"),
    T56("Cancel Approve Koreksi"),
    T57("Reject Koreksi"),
    T58("Cancel Reject Koreksi"),
    T59("Tidak menginputkan alasan reject koreksi"),
    T60("TCC.H.KRS.RPP.001.Rows per page 5"),
    T61("TCC.H.KRS.RPP.002.Rows per page 10"),
    T62("TCC.H.PJD.RPP.003.Rows per page 25"),
    T63("TCC.H.KRS.NXT.PG.001.Menampilkan data Next page"),
    T64("TCC.H.KRS.PRE.PG.001.Menampilkan data Previous page"),
    T65("TCC.H.KRS.LST.PG.001.Menampilkan data last page"),
    T66("TCC.H.KRS.FRT.PG.001.Menampilkan data first page"),

    // LAPORAN GENERATE
    T67("Mengakses Halaman Generate"),
    T68("Mengakses Halaman Generate URL Invalid"),
    T69("Mengakses Fitur Penarikan Data"),
    T70("Mengakses Fitur Penarikan Data hanya date"),
    T71("Mengakses Fitur Date"),

    //Perusahaan Admin
    T72("Mengakses Halaman Perusahaan URL Valid"),
    T73("Mengakses Halaman Perusahaan URL inValid"),
    T74("Edit Company Setting"),
    T75("Tidak input company name dan industry"),
    T76("Tidak input company name"),
    T77("Tidak input data industry"),
    T78("Delete Company Setting"),
    T79 ("Tidak Delete Company Setting"),
    T80 ("Rows per page 5"),
    T81 ("Rows per page 10"),
    T82 ("Rows per page 25"),

    //PENGATURAN PERUSAHAAN
    T83("Mengakses Halaman Pengaturan Perusahaan"),
    T84("Menambahkan max radius"),
    T85("Mengedit max radius"),
    T86("Mengedit dengan tidak input max radius"),
    T87("Mematikan self in"),
    T88("Menyalakan self in"),
    T89("Delete Pengaturan Perusahaan"),
    T90("Rows per page 5"),
    T91("Rows per page 10"),
    T92("Rows per page 25"),
    ;
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
