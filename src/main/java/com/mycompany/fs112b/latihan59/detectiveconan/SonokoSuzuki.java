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
public class SonokoSuzuki extends TokohUtama {

    public SonokoSuzuki() {
        this.nama  = "Sonoko Suzuki";
        this.sifat = "Baik hati dan centil";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman dekat Ran. Seperti Kogoro, ia disebut detektif tidur. " +
                "\n anak-anak. Ia juga suka novel misteri, terutama karya Edogawa Rampo.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : -");
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
