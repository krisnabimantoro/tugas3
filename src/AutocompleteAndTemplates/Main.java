package AutocompleteAndTemplates;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int pilih, nilaiPertama, nilaiKedua;
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();

        System.out.printf("Input Nilai pertama: ");
        nilaiPertama = sc.nextInt();

        System.out.printf("Input Nilai kedua: ");
        nilaiKedua = sc.nextInt();


        System.out.printf("\n1. Penjumlahan\n");
        System.out.printf("2. Pengurangan\n");
        System.out.printf("3. Pembagian\n");
        System.out.printf("4. Perkalian\n");


        System.out.printf("Pilih operasi: ");
        pilih = sc.nextInt();
        if (pilih == 1){
            System.out.println("Hasil = "+obj.penjumlahan(nilaiPertama,nilaiKedua));

        } else if (pilih==2) {
            System.out.println("Hasil = "+obj.pengurangan(nilaiPertama,nilaiKedua));

        }else if (pilih==3) {
            System.out.println("Hasil = "+obj.pembagian(nilaiPertama,nilaiKedua));

        }else if (pilih==4) {
            System.out.println("Hasil = "+obj.perkalian(nilaiPertama,nilaiKedua));

        }
    }

    public double perkalian(double x, double y){
        return x*y;
    }

    public double pembagian (double x,double y){
        return x/y;
    }

    public double pengurangan(double x,double y){
        return x-y;
    }

    public double penjumlahan (double x,double y){
        return x+y;
    }

}
