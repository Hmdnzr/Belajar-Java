package HitungGaji;

/** @author EDO */
public class DosenTetap extends Dosen {
  int gaji;

  public DosenTetap(int a, int b, int c, int d) {
    super(a, b, c);
    this.gaji = d;
  }

  int hitunggaji(int d, int e) {
    totalupah = super.hitunggaji(d, e) + gaji;
    return totalupah;
  }
}
