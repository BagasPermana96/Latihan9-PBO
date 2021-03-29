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
public class TokohPendukung extends TokohDetectiveConan {
    private final String[] daftarTokoh = {"Ayumi Yoshida","Mitsuhiko Tsuburaya","Genta Kojima",
            "Ai Haibara","Sumiko Kobayashi","Sonoko Suzuki","Heiji Hattori","Kazuha Toyama"};

    public void daftarTokohPendukung() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+4 + ". " + daftarTokoh[i]);
        }
    }

}
