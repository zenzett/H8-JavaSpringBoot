import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {

        // deklarasi variabel dan scanner
        int beli;
        double diskon, bayar;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Pembelian = Rp. ");
        beli = scan.nextInt();

        scan.close();


        // proses
        if (beli >= 1000000) {
            diskon = (beli * 0.1);
            System.out.println("Diskon = 10%");
        } else {
            diskon = 0;
        }

        // total yang harus dibayar
        bayar = beli - diskon;

        // output
        System.out.println("Harga Bayar = Rp. " + bayar);
    }
}