import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan skorAngka : ");
        int skorAngka = input.nextInt();
        String skorHuruf = "";

        if(skorAngka >= 80 && skorAngka <= 100){
            skorHuruf = "A+";
        } else if (skorAngka >= 65 && skorAngka <= 79){
            skorHuruf = "B+";
        } else if (skorAngka >= 50 && skorAngka <= 64) {
            skorHuruf = "B";
        } else if (skorAngka >= 35 && skorAngka <= 59) {
            skorHuruf = "c";
        } else if (skorAngka >= 0 && skorAngka <= 34) {
            skorHuruf = "D";
        } else {
            System.out.println("skor tidak terpenuhi");
        }

        System.out.println("Skor Huruf : " + skorHuruf );
    }
}