package com.pemrogramanlanjut.algoritme;

import java.util.Scanner;

public class NIMRun {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = min.nextLine(); //nama = FAJAR PRAYOGA
        System.out.print("NIM: ");
        String nim = min.nextLine();  //nim = 12050112032
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Perndidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = 20"+objNim.getTahun());
        System.out.println("Fakutlas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorurut());
    }
}
