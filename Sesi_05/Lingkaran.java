public class Lingkaran extends Main{
    double r;
    double phi = 3.14;

    double luas() {
        double luas = phi * r * r;
        System.out.println("Luas Lingkaran = " + luas);
        return luas;
    }

    double keliling() {
        double keliling = phi * r * 2;
        System.out.println("Keliling Lingkaran = " + keliling);
        return keliling;
    }
}
