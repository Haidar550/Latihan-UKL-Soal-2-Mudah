package UKL;

import java.util.Scanner;

public class CekGanjilGenapUKL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pengecekan Bilangan Ganjil dan Genap");
        System.out.print("Masukkan Nomor :");
        
        if (scanner.hasNextInt()) {
            int bilangan = scanner.nextInt();

            if (bilangan % 2 == 0) {
                System.out.println("\nHasil: Bilangan " + bilangan + " adalah GENAP.");
            } else {
                System.out.println("\nHasil: Bilangan " + bilangan + " adalah GANJIL.");
            }
        }
        scanner.close();
    }
}
