package Project1;

// nama filenya penjualan.java

import java.io.*;

public class penjualan {

    public static void main(String[] args) throws Exception {

        String[] nmbrg = new String[50];

        int[] jum = new int[100];

        int[] hrg = new int[100];

        DataInputStream karakter = new DataInputStream(System.in);

        System.out.print(
        "Masukan Bulan Penjualan: ");

String bulan = karakter.readLine();

        System.out.print(
       "Masukan jumlah data: ");

String jml = karakter.readLine();

        int data = Integer.valueOf(jml).intValue();

        for (int i = 0; i < data; i++) {

            System.out.print(
            "Nama Barang Ke -"+(i + 1
            )+" = ");

String nm = karakter.readLine();

            nmbrg[i] = nm;

            System.out.print(
            "Jumlah: ");

String jlh = karakter.readLine();

            int jlah = Integer.valueOf(jlh).intValue();

            jum[i] = jlah;

            System.out.print(
            "Harga Rp.: ");

String har = karakter.readLine();

            int harg = Integer.valueOf(har).intValue();

            hrg[i] = harg;

        }

        System.out.println(
        "LAPORAN PENJUALAN PT.STI & K");

System.out.println(
        "BULAN: "+bulan);

System.out.println(
        "================================================");

System.out.println(
        "NO NAMA BARANG JUMLAH    HARGA TOTAL    ");

System.out.println(
        "================================================");

int tpenj = 0;

        for (int i = 0; i < data; i++) {

            System.out.println((i + 1) +"   "+nmbrg[i] +"           "+jum[i] +"       "+hrg[i] +

"        "+(jum[i] * hrg[i]
            ));

tpenj = tpenj + (jum[i] * hrg[i]);

        }

        System.out.println(
        "================================================");

System.out.println(
        "TOTAL BARANG : "+data
        );

System.out.println(
        "TOTAL PENJUALAN : "+tpenj
    

);

}

}
