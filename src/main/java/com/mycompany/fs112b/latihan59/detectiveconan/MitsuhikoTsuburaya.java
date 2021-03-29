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
public class MitsuhikoTsuburaya extends TokohUtama {

    public MitsuhikoTsuburaya() {
        this.nama  = "Mitsuhiko Tsuburaya";
        this.sifat = "Dewasa, suka bekerja sama, dan pandai";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah anggota grup detektif cilik. " +
                "\nCara bicaranya yang sopan adalah karena kedua orang tuanya adalah guru." +
                "\nDiam-diam, ia cemburu terhadap kedekatan Conan dan Ai. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Wawasan Tinggi ");
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
