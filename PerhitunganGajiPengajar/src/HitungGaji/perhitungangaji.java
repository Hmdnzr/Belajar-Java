/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HitungGaji;

import java.util.Scanner;

/** @author EDO */
public class perhitungangaji {
  public static void main(String args[]) {

    Dosen DosenHonor = new Dosen(75000, 50000, 0);
    DosenTetap DosenTetap = new DosenTetap(75000, 50000, 0, 140000);
    Dekan Dekan = new Dekan(75000, 50000, 0, 140000, 140000);
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);

    System.out.println("Masukkan toal sks ajar dosen dalam sebulan: ");
    int x = input1.nextInt();
    System.out.println("Masukkan toal hari ajar dosen dalam sebulan:");
    int y = input2.nextInt();
    System.out.println("Menu Kategori Dosen: 1) Dosen Tidak Tetap 2) Dosen Tetap 3) Dekan");
    System.out.println("Pilih kategori dosen: ");
    int pil = input3.nextInt();

    if (pil == 1) {
      DosenHonor.hitunggaji(x, y);
      System.out.println("Gaji dosen pada bulan ini:" + DosenHonor.totalupah);
    } else if (pil == 2) {
      DosenTetap.hitunggaji(x, y);
      System.out.println("Gaji dosen pada bulan ini:" + DosenTetap.totalupah);
    } else if (pil == 3) {
      Dekan.hitunggaji(x, y);
      System.out.println("Gaji dosen pada bulan ini:" + Dekan.totalupah);
    }
  }
}
