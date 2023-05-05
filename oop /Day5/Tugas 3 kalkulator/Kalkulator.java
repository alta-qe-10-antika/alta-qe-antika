import java.util.Scanner;

public class Kalkulator {

   double angka1;
   double angka2;

   public double getAngka1() {
      return angka1;
   }

   public void setAngka1(double angka1) {
      this.angka1 = angka1;
   }

   public double getAngka2() {
      return angka2;
   }

   public void setAngka2(double angka2) {
      this.angka2 = angka2;
   }

   public void inputan() {
      Scanner input = new Scanner(System.in);

      System.out.println("Masukkan Angka Pertama : ");
      this.angka1 = input.nextDouble();

      System.out.println("Masukkan Angka Kedua : ");
      this.angka2 = input.nextDouble();

   }


}

