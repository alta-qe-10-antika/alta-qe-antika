import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Harga Harga = new Harga();

        System.out.println("Masukkan Data Barang : ");
        System.out.println("Data panjang : ");
        int p = input.nextInt();
        System.out.println("Data Lebar : ");
        int l = input.nextInt();
        System.out.println("Data tinggi : ");
        int t = input.nextInt();
        System.out.println("Berat Barang : ");
        int Berat = input.nextInt();
        System.out.println();

        System.out.println("Total semua Barang");
        System.out.println("Dimensi Berat : " +Harga.dimensiBarang(p, l, t));
        System.out.println("Harga : " +Harga.TinggiBarang(Berat));


        // panjang : 5 lebar : 2 tinggi : 4 berat : 1kg
    }
}