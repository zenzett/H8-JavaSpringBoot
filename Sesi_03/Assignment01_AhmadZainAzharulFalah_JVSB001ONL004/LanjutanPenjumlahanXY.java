public class LanjutanPenjumlahanXY {
    public static void main(String[] args) {
        boolean hasil;
        int y1 = 7, y2 = 2;
        int z = ( y1 + y2 );
        //int jmlx1 = (y1 + y2);

        int x1 = (y1 + y2) * z;
        int x2 = (y1 % 4) * y2;

        System.out.println(x1);
        System.out.println(x2);

        int a = x1 % 4;
        int b = ++x2 % 5;  

        hasil = x1 >= x2;
        System.out.println("X1 besar sama dengan X2 ===> " + hasil );
        
        hasil = x2 >= x1;
        System.out.println("X2 besar sama dengan X1 ===> " + hasil);

        hasil = ++a == b;
        System.out.println("X1 mod 4 == ++X2 mod 5 ===> " + hasil);

    }
}
