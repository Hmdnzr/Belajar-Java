/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HitungGaji;

/** @author EDO */
public class Dekan extends DosenTetap {
  int tunjangan;

  public Dekan(int a, int b, int c, int d, int e) {
    super(a, b, c, d);
    this.tunjangan = e;
  }

  int hitunggaji(int d, int e) {
    totalupah = super.hitunggaji(d, e) + tunjangan;
    return totalupah;
  }
}
