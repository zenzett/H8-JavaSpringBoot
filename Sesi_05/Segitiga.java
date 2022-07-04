public class Segitiga extends Main {
    
    double alas, tinggi;
    
    double luas() {
        double luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }

    double keliling() {
        double keliling = alas + (2 * tinggi);
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;
    }
}
