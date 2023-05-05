import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    System.out.println("luas segitiga");

        System.out.println("alas segitiga:");
        Scanner input = new Scanner(System.in);
        float alas = input.nextFloat();

        System.out.println("tinggi segitiga:");
        float tinggi = input.nextFloat();

        float luas = ((alas*tinggi)/2);

        System.out.println("luas segitiga:" + luas);
    }
}