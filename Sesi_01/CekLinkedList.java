package Sesi_01;

import java.util.LinkedList;

public class CekLinkedList {
    public static void main(String[] args) {
        // Membuat Instance/Objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();

        // Menambahkan Data pada Objek buah
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        // Mengecek apakah Data pada Obje barang, kosong?
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Penuh");
        }

        // Mengecek apakah sebuah element ada di dalam LinkedList
        if (barang.contains("Komputer")) {
            System.out.println("Barang Ditemukan");
        } else {
            System.out.println("Barang Tidak Ditemukan");
        }
    }
}
