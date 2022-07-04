import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        
        // membuat variabel dan scanner
        boolean running =  true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah Anda ingin keluar?");
            System.out.print("Jawab [ ya/tidak ] > ");

            jawab = scan.nextLine();

            // cek jawabannya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    }
}
