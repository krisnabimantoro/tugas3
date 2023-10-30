package tugas2;

import java.util.Scanner;

/**
 * Kelas yang akan mempresentasikan diskon
 */

public class diskon {

    public static void main(String[] args) {

        final int value =100;
        double hargaAwal,hargaAkhir,diskon,persentaseDiskon;
        Scanner sc = new Scanner(System.in);
        diskon obj = new diskon();


        System.out.printf("Input Harga: ");
        hargaAwal=sc.nextDouble();

        System.out.printf("Input Persentase Diskon: ");
        persentaseDiskon = sc.nextDouble();

        diskon = hargaAwal * (persentaseDiskon/value);
        hargaAkhir = getHargaAkhir(hargaAwal, diskon);

        System.out.printf("Harga sebelum diskon: "+hargaAwal);
        System.out.printf("\nDiskon: "+git diskon);

        System.out.printf("\nHarga setelah di diskon: "+hargaAkhir);
    }
    /**
     * Method untuk menghitung Harga AKhir
     *
     * @param hargaAwal Harga awal barang sebelum di diskon
     * @param diskon harga diskon barang
     * @return hargaAkhir Hasil Harga Akhir
     */
    private static double getHargaAkhir(double hargaAwal, double diskon) {
        double hargaAkhir;
        hargaAkhir = hargaAwal - diskon;
        return hargaAkhir;
    }

}
