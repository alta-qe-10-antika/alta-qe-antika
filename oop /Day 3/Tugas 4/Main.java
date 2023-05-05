import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Halo Selamat Datang! ");
        System.out.print("Silahkan Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println(numberPrime(bilangan));
    }

    public static boolean numberPrime(int bilangan) {

        if (bilangan == 1) {
            return false;
        }
        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                return false;
            }


        }
        return true;
    }
    }

