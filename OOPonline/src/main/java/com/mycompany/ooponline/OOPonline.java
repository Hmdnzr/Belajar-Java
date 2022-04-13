package com.mycompany.ooponline;

import java.util.Scanner;

/** @author Hamdan ZR) */
public class OOPonline {
  public static void main(String args[]) {
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    Scanner input4 = new Scanner(System.in);
    int ulang;
    // Titik Looping
    do {
      System.out.println(
          "selamat datang di aplikasi kalkulator ini \n\n" + "Masukkan Angka Pertama : ");
      int a = input1.nextInt();
      System.out.println("Masukkan Angka Kedua : ");
      int b = input2.nextInt();
      float c = 0;
      System.out.println("Menu yang tersedia : ");
      System.out.println("1)Penjumlahan 2)Pengurangan 3)Pembagian 4)Perkalian");
      System.out.println("Pilih operasi yang mau dilakukan");
      int pil = input3.nextInt();

      if (pil == 1) {
        c = a + b;
        System.out.println("Hasil Penjumlahan Kedua Bilangan adalah : ");
      }
      if (pil == 2) {
        c = a - b;
        System.out.println("Hasil Pengurangan Kedua Bilangan adalah : ");
      }
      if (pil == 3) {
        c = a / b;
        System.out.println("Hasil Pembagian Kedua Bilangan adalah : ");
      }
      if (pil == 4) {
        c = a * b;
        System.out.println("Hasil Perkalian Kedua Bilangan adalah : ");
      }
      System.out.println(c);
      System.out.println("Tekan angka 1 jika mau diulang");
      ulang = input4.nextInt();
    } while (ulang == 1);
  }
}
