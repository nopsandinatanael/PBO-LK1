// package LK1;
/* Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli gorengan jika
mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan, yang dapat
ditulis sebagai ekspresi: (uang > 5000) && (!hujan) */

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input
        System.out.print("berapa uang yang anda punya untuk memberli gorenngan? Rp ");
        int uang = input.nextInt();
        input.nextLine();
        System.out.print("apakah hari ini hujan? (true/false)");
        boolean hujan = Boolean.parseBoolean(input.nextLine());
        if (!hujan && uang >= 5000) {
            System.out.println("uang > 5000 & !hujan");
            return;
        }else{
            System.out.print("uang < 5000 atau hujan");
            
        }
    }
}
