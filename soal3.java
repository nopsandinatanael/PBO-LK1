// package LK1;
/* Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
karakter ‘2’! */
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata pertama: ");
        char kataPertama = input.nextLine().charAt(0);
        System.out.print("Masukan kata kedua: ");
        char kataKedua = input.nextLine().charAt(0);
        int jumlah = (int) kataPertama + (int) kataKedua;
        System.out.println("Jumlah dari dua karakter tersebut adalah: " +jumlah);
    }
}
