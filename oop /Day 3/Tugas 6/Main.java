import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int angka = input.nextInt();

        box(angka);
    }

    public static void box(int angka) {
        int huruf = 1;
        for (int i = 1; i <= angka; i++) {
            System.out.println();
            char result;
            for (int j = 1; j <= angka; j++) {

                if(huruf % 3 == 0){
                    result = 'X';
                } else if (huruf % 2 == 0) {
                    result = 'Z';
                } else {
                    result = 'Y';
                }
                System.out.print(result +" ");

                huruf++;

            }

        }


        }
    }
