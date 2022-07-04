public class PersegiPanjang extends Main {

    double panjang, lebar;

    double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
        return luas;
    }

    double keliling() {
        double keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
        return keliling;
    }


}
