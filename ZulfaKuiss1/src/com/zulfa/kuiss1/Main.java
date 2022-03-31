/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zulfa.kuiss1;

import java.util.Scanner;

/**
 *
 * @author EDO
 */
public class Main {
       static Gudang gudangA = new Gudang();
   static Gudang gudangB = new Gudang();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // state 0 = input stok
        //
        int state = 0;
        while(true) {
            if (state == 0) {
                System.out.println("Masukkan Stok Sabun Gudang A:");
                gudangA.setSabun(scan.nextInt());
                System.out.println("Masukkan Stok Pasta Gudang A:");
                gudangA.setPasta(scan.nextInt());
                System.out.println("Masukkan Stok Shampo Gudang A:");
                gudangA.setShampo(scan.nextInt());
                System.out.println("Masukkan Stok Sabun Gudang B:");
                gudangB.setSabun(scan.nextInt());
                System.out.println("Masukkan Stok Pasta Gudang B:");
                gudangB.setPasta(scan.nextInt());
                System.out.println("Masukkan Stok Shampo Gudang B:");
                gudangB.setShampo(scan.nextInt());
                state = 1;
            } else if (state == 1) {
                printStok();
                state = 2;
            } else if (state == 2) {
                System.out.println("Pilih Barang yang ingin anda transfer dari Gudang A ke Gudang B:");
                System.out.println("1)Sabun");
                System.out.println("2)Pasta");
                System.out.println("3)Shampo");
                System.out.println("Masukkan pilihan 1-3");
                int pilihan = scan.nextInt();
                System.out.println("Masukkan jumlah barang yang ingin anda transfer");
                int jumlahStok = scan.nextInt();
                if (pilihan > 0 && pilihan < 4) {
                    mutasiStok(pilihan, jumlahStok);
                    printStok();
                }
                state = 3;
            } else if (state == 3) {
                System.out.println("Apakah anda ingin memulai lagi ?");
                System.out.println("1)Mulai lagi");
                System.out.println("2)Keluar dari aplikasi");
                int opsi = scan.nextInt();
                if (opsi == 1) {
                    state = 1;

                } else if (opsi == 2) {
                    break;
                }

            }
        }
    }

    private static void printStok() {
        System.out.println("Stok Barang di Gudang A:");
        System.out.println("Stok Sabun:" + gudangA.getSabun());
        System.out.println("Stok Pasta:" + gudangA.getPasta());
        System.out.println("Stok Shampo:" + gudangA.getShampo());
        System.out.println("-------------------------------------------");
        System.out.println("Stok Barang di Gudang B:");
        System.out.println("Stok Sabun:" + gudangB.getSabun());
        System.out.println("Stok Pasta:" + gudangB.getPasta());
        System.out.println("Stok Shampo:" + gudangB.getShampo());
    }

    private static void mutasiStok(int pilihan, int jumlahStok) {
        if (pilihan == 1) {
            if (checkStok(gudangA, pilihan)) {
                gudangA.setSabun(gudangA.getSabun() - jumlahStok);
                gudangB.setSabun((gudangB.getSabun() + jumlahStok));
            } else {
                System.out.println("Mohon maaf dan tidak melakukan transaksi penambahan/pengurangan stok barang");
            }
        }
        if (pilihan == 2) {
            if (checkStok(gudangA, pilihan)) {
                gudangA.setPasta(gudangA.getPasta() - jumlahStok);
                gudangB.setPasta((gudangB.getPasta() + jumlahStok));
            } else {
                System.out.println("Mohon maaf dan tidak melakukan transaksi penambahan/pengurangan stok barang");
            }
        }
        if (pilihan == 3) {
            if (checkStok(gudangA, pilihan)) {
                gudangA.setShampo(gudangA.getShampo() - jumlahStok);
                gudangB.setShampo((gudangB.getShampo() + jumlahStok));
            } else {
                System.out.println("Mohon maaf dan tidak melakukan transaksi penambahan/pengurangan stok barang");
            }
        }
    }

    private static boolean checkStok(Gudang gudang, int pilihan) {
        boolean result = false;
        if (pilihan == 1) {
            if (gudang.getSabun() < pilihan) {
                result = false;
            } else {
                result = true;
            }
        }
        if (pilihan == 2) {
            if (gudang.getPasta() < pilihan) {
                result = false;
            } else {
                result = true;
            }
        }
        if (pilihan == 3) {
            if (gudang.getShampo() < pilihan) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }
}
