/* 1) Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan! */
import java.util.Scanner;

public class soal1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        // input pecahan
        System.out.print("Masukan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka kedua: ");
        int angka2 = input.nextInt();
        System.out.print("Masukan angka ketiga: ");
        int angka3 = input.nextInt();

        // operasi
        int tambah = angka1+angka2+angka3;
        int kurang = angka1-angka2-angka3;
        int kali = angka1*angka2*angka3;
        float bagi = angka1/angka2 /angka3;

        // print hasil
        System.out.println("Hasil pertambahan = " + tambah);
        System.out.println("Hasil pengurangan = " + kurang);
        System.out.println("Hasil perkalian = " + kali);
        System.out.println("Hasil pembagian = " + bagi);
    }
}