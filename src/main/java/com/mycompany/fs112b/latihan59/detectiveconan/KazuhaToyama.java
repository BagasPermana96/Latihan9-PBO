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
public class KazuhaToyama extends TokohUtama {

    public KazuhaToyama() {
        this.nama  = "Kazuha Toyama";
        this.sifat = "Baik hati dan suka menolong";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" Anak dariDetektif Toyama ini adalah teman sejak " +
                "\nkecilHeiji Hattori. Ia tinggal di Osaka dan ayahnya adalah seorang Polisi di Osaka. " +
                "\n Secara tidak sengaja Ia pernah memborgol tangannya bersama dengan Heiji. " +
                "\nSehingga kemana-mana mereka terus bersama. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Aikido.");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : Hantu");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
