public class OperatorPenugasan {

    public static void main(String[] args) {

        int a;
        int b;

        // Pengisian nilai
        a = 5;
        b = 10;

        // Penambahan
        b += a;
        // Sekarang b = 15
        System.out.println("Penambahan : " + b);

        // Pengurangan
        b -= a;
        // Sekarang b = 10 (karena 15-5)
        System.out.println("Pengurangan : " + b);

        // Perkalian
        b *= a;
        // Sekarang b = 50 (karena 10*5)
        System.out.println("Perkalian : " + b);

        // Pembagian
        b /= a;
        // Sekarang b = 10
        System.out.println("Pembagian : " + b);

        // Sisa bagi
        b %= a;
        // Sekarang b=0
        System.out.println("Sisa bagi : " + b);

    }
}
