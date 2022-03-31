
package com.mycompany.nasabah;
import java.util.Scanner;
/**
 *
 * @author Hamdan
 */
public class Nasabah {
String nama;
int norek;
int saldo;

public Nasabah (String x,int y, int z) {
    this.nama=x;
    this.norek=y;
    this.saldo=z;
    }
public void ceksaldo(){
    System.out.println("Nama pemilik rekening :"+nama );
    System.out.println("Nomor rekening :"+norek );
    System.out.println("Saldo rekening saat ini :"+saldo );
    
    }
public int tariktunai(int a){
saldo=saldo-a;
return saldo;
}
public int terimauang(int a){
saldo=saldo+a;
return saldo;
}

public static void main(String args[]){
Nasabah Nasabah1 = new Nasabah("Hamdan",001,2000000);
Nasabah Nasabah2 = new Nasabah("vera",002,3000000);
Scanner input1=new Scanner(System.in);
Scanner input2=new Scanner(System.in);

do{
Nasabah1.ceksaldo();
Nasabah2.ceksaldo();

System.out.println("Anda ingin melakukan:");
System.out.println("1.Kirim dana dari nasabah 1 ke nasabah 2");
System.out.println("2.Kirim dana dari nasabah 2 ke nasabah 1");
System.out.println("Masukkan pilihan anda :");
int pil=input1.nextInt();

System.out.println("Masukkan jumlah uang yang ingin anda kirim :");
int x1=input2.nextInt();

System.out.println("===Dana anda telah berhasil di transfer sejumlah :"+x1+"===");
if (pil==1){
Nasabah1.tariktunai(x1);
Nasabah2.terimauang(x1);
}
else if (pil==2){
Nasabah2.tariktunai(x1);
Nasabah1.terimauang(x1);
}
else System.out.println("maaf pilihan tidak ada");

Nasabah1.ceksaldo();
Nasabah2.ceksaldo();
}
while (Nasabah1.saldo>0&&Nasabah2.saldo>0);
System.out.println("~~~Maaf saldo anda habis~~~");
        
}
}
