public class OperatorPembanding {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // Apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        // Apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        // Apakah A lebih besar samadengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        // Apakah A lebih kecil samadengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        // Apakah A samadengan B?
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        // Apakah A tidak samadengan B?
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);
    }
}
