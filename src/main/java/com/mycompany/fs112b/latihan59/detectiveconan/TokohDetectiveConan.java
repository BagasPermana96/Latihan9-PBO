/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Muhamad Bagas Permana
 * KELAS    : FS112B-PBO
 * NIK      : 2022431570
 * Deskripsi Program	: Program ini berisi program yang berisikan
 * karakter dari serial anime detective conan
 * 
 */
public class TokohDetectiveConan {
    protected String nama;
    protected String sifat;

    public TokohDetectiveConan() {
        this.nama = " ";
        this.sifat = " ";
    }

    public void daftarKategoriTokoh() {
        System.out.println("===PILTER - Pilih Karakter===");
        System.out.println("1. Tokoh Utama \n2. Tokoh Pendukung");
    }

    public void siapaKamu() {
        System.out.println("Saya adalah salah satu tokoh dari film Detective Conan");
    }

    public void kemampuanKamu() {
        System.out.println("Kemampuan saya adalah masuk dalam film Detective Conan");
    }

    public void kelemahanKamu() {
        System.out.println("Tidak bisa masuk ke bioskop Metro TV");
    }

    public void tampilDataTokoh() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama : "+nama);
        System.out.println("Sifat : "+sifat);
        siapaKamu();
        kemampuanKamu();
        kelemahanKamu();
    }

}