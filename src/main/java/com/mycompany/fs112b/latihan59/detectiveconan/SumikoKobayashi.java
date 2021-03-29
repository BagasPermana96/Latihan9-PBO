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
public class SumikoKobayashi extends TokohUtama {

    public SumikoKobayashi() {
        this.nama  = "Sumiko Kobayashi";
        this.sifat = "Pemalu dan Sensitif";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah wali kelasConan. ia sangat sayang pada " +
                "\n anak-anak. Ia juga suka novel misteri, terutama karya Edogawa Rampo.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Mengajar ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : - ");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
