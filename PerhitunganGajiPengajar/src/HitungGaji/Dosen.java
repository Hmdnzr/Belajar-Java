package HitungGaji;

/** @author EDO */
public class Dosen {
  int upahsks;
  int transport;
  int totalupah;

  Dosen(int a, int b, int c) {
    this.upahsks = a;
    this.transport = b;
    this.totalupah = c;
  }

  int hitunggaji(int d, int e) {
    totalupah = (upahsks * d) + (transport * e);
    return totalupah;
  }
}
