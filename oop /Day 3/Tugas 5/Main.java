import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kata : ");
        String kata = input.nextLine();
        String back="";

        palindrome(kata,back);

    }

    public static void palindrome(String kata, String back){
        int length = kata.length();
        for (int i = length-1; i>=0; i--){
            back = back + kata.charAt(i);
        }
        if (kata.equals(back)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}