public class Makanan {
    public static void main(String[] args){

        //Membuat Instance/Objek dari class restoran
        Restoran data = new Restoran();

        //Membuat data pada variabel
        data.setMenu("Ayam Geprek");
        data.setHarga(170000);
        data.setSpesial(true);

        //Memanggil method get dari class Restoran dan menampilkannya
        System.out.println("Menu Makanan : " + data.getMenu());
        System.out.println("Harga Makanan : Rp. " + data.getHarga());
        System.out.println("Menu Spesial : " + data.getSpesial());
    }
}
