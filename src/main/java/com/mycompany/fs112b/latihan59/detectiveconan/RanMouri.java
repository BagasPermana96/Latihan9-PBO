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
public class RanMouri extends TokohUtama {

    public RanMouri() {
        this.nama  = "Ran Mouri";
        this.sifat = "Pengertian dan murah hati";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman Shinichi Kudo sejak kecil. Ran dan Shinichi tidak " +
                "\npernah berani mengungkapkan perasaannya. Ran adalah anak seorang detektif, Kogoro  " +
                "\nMouri, dan seorang pengacara handal, Eri Kisaki. Ran juga seorang yang mudah menangis. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Ahli Karate ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : takut hantu dan hewan tertentu");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
