import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ANTIKA");
        System.out.println(" ");


        System.out.println("PERSEGI");
        Persegi Persegi = new Persegi(4);
        System.out.println("Keliling Persegi = " + Persegi.HitungKeliling());
        System.out.println("Luas Persegi = " + Persegi.hitungLuas());
        System.out.println(" ");

        System.out.println("SEGITIGA");
        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("Keliling Segitiga + " + segitiga.HitungKeliling());
        System.out.println("Luas Segitiga + " + segitiga.HitungLuas());
        System.out.println(" ");

        System.out.println("PERSEGI PANJANG");
        PersegiPanjang PersegiPanjang = new PersegiPanjang(7, 8);
        System.out.println("Keliling Persegi Panjang = " + PersegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang + " + PersegiPanjang.hitungLuas());
        System.out.println(" ");

    }
}