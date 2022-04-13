/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zulfa.kuiss1;

/** @author EDO */

/** @author EDO */
public class Gudang {

  private int sabun, pasta, shampo;

  public Gudang() {}

  public Gudang(int sabun, int pasta, int shampo) {
    this.sabun = sabun;
    this.pasta = pasta;
    this.shampo = shampo;
  }

  public int getSabun() {
    return sabun;
  }

  public void setSabun(int sabun) {
    this.sabun = sabun;
  }

  public int getPasta() {
    return pasta;
  }

  public void setPasta(int pasta) {
    this.pasta = pasta;
  }

  public int getShampo() {
    return shampo;
  }

  public void setShampo(int shampo) {
    this.shampo = shampo;
  }
}
