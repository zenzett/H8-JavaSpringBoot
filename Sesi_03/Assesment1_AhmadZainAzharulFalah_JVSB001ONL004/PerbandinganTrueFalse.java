public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        // Buat variabel
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        boolean hasil;

        hasil = a > b;
        System.out.println("Tes ke 1 = " + hasil );   
     
        hasil = b < a;
        System.out.println("Tes ke 2 = " + hasil );   
        
        hasil = c >= d;
        System.out.println("Tes ke 3 = " + hasil );   
        
        hasil = d <= c;
        System.out.println("Tes ke 4 = " + hasil );   
        
        hasil = --a == ++b;
        System.out.println("Tes ke 5 = " + hasil );   
    
        hasil = --a != ++b;
        System.out.println("Tes ke 6 = " + hasil );
        
        hasil = a > b;
        System.out.println("Tes ke 7 = " + hasil );   
        
        hasil = ++b <= --a;
        System.out.println("Tes ke 8 = " + hasil );   
        
        hasil = a == b;
        System.out.println("Tes ke 9 = " + hasil );   
        
        hasil = --c != b;
        System.out.println("Tes ke 10 = " + hasil );   

    }
}
