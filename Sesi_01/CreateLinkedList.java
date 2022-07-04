package Sesi_01;

import java.util.LinkedList;

public class CreateLinkedList {

    public static void main(String[] args) {
        // Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();

        // Menambahkan data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        // Mencetak/menampilkan data
        System.out.println("Nama buah: " + buah);

        // Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: " + buah.size());

        // lanjut add linkedlist
        buah.addFirst("Paling Atas"); // Menambahkan Data pada Index Teratas
        buah.addLast("Paling Bawah"); // Menambahkan Data pada Index Terbawah

        buah.set(2, "Diubah"); // Mengubah Data pada No Index 2
        buah.set(5, "Diubah"); // Mengubah Data pada No Index 5

        // Mencetak/Menampikan Data
        System.out.println("Nama Buah: " + buah);

        // Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: " + buah.getFirst());
        // Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: " + buah.getLast());
        // Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: " + buah.get(1));
        // Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: " + buah.get(3));

        buah.removeFirst(); // Menghapus Data pada urutan paling atas
        buah.removeLast(); // Menghapus Data pada urutan paling bawah
        buah.remove(1); // Menghapus Data pada No Index 1

        // Mencetak Data
        System.out.println(buah);

    }
}
