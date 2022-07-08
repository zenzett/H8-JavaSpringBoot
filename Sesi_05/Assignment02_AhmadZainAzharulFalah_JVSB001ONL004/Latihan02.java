public class Latihan02 {
    public static void main(String[] args) {
        String[][] kelas = {
                { "php", "ruby", "java" },
                { "golang", "javascript", "swift" }
        };
        System.out.println(" ");
        System.out.println("siapa yang akan duduk di kelas (0, 0) : " + kelas[0][0]);
        System.out.println("siapa yang akan duduk di kelas (0, 1) : " + kelas[0][1]);
        System.out.println("siapa yang akan duduk di kelas (0, 2) : " + kelas[0][2]);
        System.out.println("siapa yang akan duduk di kelas (1, 0) : " + kelas[1][0]);
        System.out.println("siapa yang akan duduk di kelas (1, 1) : " + kelas[1][1]);
        System.out.println("siapa yang akan duduk di kelas (1, 2) : " + kelas[1][2]);
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println("|" + kelas[0][0] + "|            |" + kelas[0][1] + "|           |" + kelas[0][2] + "|");
        System.out.println("|" + kelas[1][0] + "|      |" + kelas[1][1] + "|       |" + kelas[1][2] + "|");
        System.out.println("========================================");
        System.out.println(" ");

    }
}