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
public class GentaKojima extends TokohUtama {

    public GentaKojima() {
        this.nama  = "Genta Kojima";
        this.sifat = "Baik dan bisa diandalkan";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah Tokoh dalam grup detektif cilik. Ia berbadan besar. " +
                "\n ia seorang anak nakal yang ditakuti oleh anak-anak. Namun, kini ia " +
                "\nmenjadi anak baik dan menyatakan diri sebagai ketua grup detektif cilik. " +
                "\nIa juga menaruh hati pada Ayumi Yoshida. ");
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
