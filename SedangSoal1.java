import java.util.Scanner;

public class SedangSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("   PROGRAM MENGHITUNG NILAI FAKTORIAL");
        System.out.println("====================================");
        System.out.println("Masukkan Bilangan Bulat Positif : ");
        int x = input.nextInt();
        System.out.println("-------------------------------------");

        if (x < 0) {
            System.out.println("Angka Harus Positif");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= x; i++) {
                faktorial *= i;
            }   
            System.out.println("Faktorial dari " + x + " adalah " + faktorial);
        }

        System.out.println("=====================================");
    }
}