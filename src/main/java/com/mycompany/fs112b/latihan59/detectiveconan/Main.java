/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan59.detectiveconan;

import java.util.Scanner;

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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        int pilihKategori;
        int pilihTokoh;
        char lagi;

            TokohDetectiveConan tokohDC = new TokohDetectiveConan();
            TokohUtama tokohUtama = new TokohUtama();
            TokohPendukung tokohPendukung = new TokohPendukung();


        do {
            tokohDC.daftarKategoriTokoh();
            System.out.println("Pilih nomor kategori : ");
            pilihKategori = scn1.nextInt();

                pilihTokoh = 0;
            switch (pilihKategori) {
                case 1 -> {
                    tokohUtama.daftarTokohUtama();
                    System.out.println("Pilih nomor tokoh : ");
                    pilihTokoh = scn2.nextInt();
                }
                case 2 -> {
                    tokohPendukung.daftarTokohPendukung();
                    System.out.println("Pilih nomor tokoh : ");
                    pilihTokoh = scn3.nextInt();
                }
                default -> System.out.println(" ");
            }

            switch (pilihTokoh) {
                case 1 -> {
                    ShinichiKudo shiKud = new ShinichiKudo();
                    shiKud.tampilDataTokoh();
                }
                case 2 -> {
                    RanMouri ranMou = new RanMouri();
                    ranMou.tampilDataTokoh();
                }
                case 3 -> {
                    KogoroMouri kogMou = new KogoroMouri();
                    kogMou.tampilDataTokoh();
                }
                case 4 -> {
                    AyumiYoshida ayuYos = new AyumiYoshida();
                    ayuYos.tampilDataTokoh();
                }
                case 5 -> {
                    MitsuhikoTsuburaya mitTsu = new MitsuhikoTsuburaya();
                    mitTsu.tampilDataTokoh();
                }
                case 6 -> {
                    GentaKojima genKoj = new GentaKojima();
                    genKoj.tampilDataTokoh();
                }
                case 7 -> {
                    AiHaibara aiHai = new AiHaibara();
                    aiHai.tampilDataTokoh();
                }
                case 8 -> {
                    SumikoKobayashi sumKob = new SumikoKobayashi();
                    sumKob.tampilDataTokoh();
                }
                case 9 -> {
                    SonokoSuzuki sonSuz = new SonokoSuzuki();
                    sonSuz.tampilDataTokoh();
                }
                case 10 -> {
                    HeijiHattori heiHat = new HeijiHattori();
                    heiHat.tampilDataTokoh();
                }
                case 11 -> {
                    KazuhaToyama kazToy = new KazuhaToyama();
                    kazToy.tampilDataTokoh();
                }
                default -> System.out.println("Nomor yang Anda pilih belum tersedia");
            }

            System.out.println("Lagi (y/n)? : ");
            lagi = scn4.next().charAt(0);
            System.out.println(" ");

        }while (lagi != 'n');
    }
}
