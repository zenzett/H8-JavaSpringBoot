import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {

        int[] bil = new int[3];
        double max, min, rata, total;
        int i = 0;

        // Membuat scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Menentukan Bilangan Terbesar, Terkecil, dan Rata-rata\n");

        // Mengisi data ke array
        System.out.print("Masukkan Bilangan Pertama (X) : ");
        bil[i] = scan.nextInt(); i++;
        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        bil[i] = scan.nextInt(); i++;
        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        bil[i] = scan.nextInt(); i++;

        scan.close();

        System.out.println(" ");

        // cari total semua element array
        total = 0;
        for (i = 0; i < bil.length; i++) {
            total = total + bil[i];
        }

        // hitung nilai rata-rata
        rata = (total / i);

        // menghitung nilai max dan nilai min
        min = bil[0];
        max = bil[0];
        for (i = 0; i < 3; i++) {
            if (bil[i] > max) {
                max = bil[i];
            } else if (bil[i] < min) {
                min = bil[i];
            }
        }
        System.out.println("Hasil:");
        System.out.println("Rata-ratanya adalah : " + rata);
        System.out.println(max + " adalah bilangan terbesar");
        System.out.println(min + " adalah bilangan terkecil\n");
    }
}
