import java.util.Scanner;

public class Latihan04 {
  public static void main(String[] args) {
    int tahun;
    Scanner scan = new Scanner(System.in);

    System.out.print("Silahkan masukkan tahun = ");
    tahun = scan.nextInt();

    scan.close();

    if (tahun % 400 == 0) {
      System.out.print("Merupakan tahun kabisat.\n");
    } else if (tahun % 100 == 0) {
      System.out.print("Bukan tahun kabisat.\n");
    } else if (tahun % 4 == 0) {
      System.out.print("Merupakan tahun kabisat.\n");
    } else {
      System.out.print("Bukan tahun kabisat.\n");
    }
  }
}