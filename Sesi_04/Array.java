public class Array {
    public static void main (String[] args) {

        //Cara pertama
        //String[] nama;

        //Cara kedua
        //String nama[];

        //Cara ketiga dengan kata kunci new
        String[] nama = new String[5];
        String[] bahasa = {"Reactjs", "Reactnative", "Golang", "PHP", "Python"};
        
        //Mengambil data array urutan pertama
        System.out.println(bahasa[0]);

        //Mengambil data array urutan ke3
        System.out.println(bahasa[2]);

    }
}