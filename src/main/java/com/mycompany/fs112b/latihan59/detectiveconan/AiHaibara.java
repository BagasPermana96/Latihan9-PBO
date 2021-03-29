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
public class AiHaibara extends TokohUtama {

    public AiHaibara() {
        this.nama  = "Ai Haibara / Shiho Miyano";
        this.sifat = "Baik dan bisa diandalkan";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah mantan Apoteker dari Organisasi Hitam yang telah " +
                "\n kabur dari ruang gas organisasi. Ia juga tahu identitas Conan sebenarnya." +
                "\n Sebenarnya, ia menaruh hati pada Conan. Arti nama Shiho Miyano sendiri adalah " +
                "\n\"Pemuda Cantik dan Abadi\". ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : - ");
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
