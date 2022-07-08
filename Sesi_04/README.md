>**DISCLAIMER**\
>Semua informasi di sini diterbitkan dengan tujuan baik dan murni hanya untuk informasi umum.\
>Benar atau tidaknya, kembali kepada referensi masing-masing individu.\
>Sekian, terima kasih.

>>**Panduan Penggunaan Aplikasi :**\
>		1. Aplikasi dapat dijalankan terpisah sesuai dengan keinginan user.\
>		2. Compile terlebih dahulu file java kemudian jalankan class dengan nama yang sama pada file java.\
>		3. Perhatikan pada bagian console untuk melihat hasil ataupun memasukkan inputan ke dalam program.

&nbsp;
## Array & Structure Data Tree

&nbsp;
#### Array Introduction
**Array** adalah sebuah variabel yang bisa menyimpan banyak data dalam 1 variabel dan menggunakan indeksuntuk mengakses data.\
Array yang ada di Java adalah sebuah objek yang berisikan elemen-elemen dari tipe data yang mirip. Tidak hanya itu, elemen yang ada di dalam array ini juga disimpan di lokasi memori yang berdekatan.\
Array ini adalah struktur data tempat untuk menyimpan elemen yang serupa. Anda hanya dapat menyimpan satu set elemen tetap dalam setiap array Java.\
Array pada Java berbasis indeks, di mana elemen pertama dari array ini disimpan di dalam indeks 0, elemen ke-2 disimpan di indeks pertama dan begitulah seterusnya.\
Tidak seperti bahasa C / C++, Anda bisa mendapatkan panjang array dengan menggunakan panjangmember.\
Sementara dalam bahasa C / C++, Anda perlu menggunakan operator sizeof.

&nbsp;
#### Bagaimana Array Bekerja ?
Perhatikan :
- Kita menggunakan [ ] untuk membuat array
- Kurung siku diletakkan setelah tipe data atau nama array
- Angka 5 dalam kurung artinya batas atau ukuran array-
- Array yang kosong siap diisi dengan data. Pastikan mengisinya dengan data yang sesuai  dengan tipedatanya.

\
&nbsp;
Pada materi ini ada beberapa latihan array yang dilakukan, yaitu:
- Array Handling
- Array Looping
- Array Looping - For Each
- Array Multidimensi

&nbsp;
#### Data Structure - Tree
Tree (pohon) adalah salah satu bentuk struktur data yang menggambarkan hubungan hierarki antarelemen-elemennya (seperti relasi one to many).\
Sebuah node dalam tree biasanya bisa memiliki beberapa node lagi sebagai percabangan atas dirinya.

Lalu, ada lagi yang namanya Binary Tree. Apa bedanya?\
Sebenarnya sama sama konsepnya dengan Tree. Hanya saja, kita akan mengambil sifat bilangan biner yang selalu bernilai 1 atau 0 (2 pilihan).\
Berarti, binary tree adalah tree yang hanya dapat mempunyai maksimal 2 percabangan saja.

&nbsp;
#### Binary Search Tree
Struktur data yang mengadopsi konsep Binary Tree. Terdapat aturan bahwa setiap child node sebelah kiri selalu lebih kecil nilainya dari pada root node. Begitu pula sebaliknya, setiap child node sebelah kanan selalu lebih besar nilainya daripada root node.

Aturan main Binary Search Tree :
- Setiap child node sebelah kiri harus lebih kecil nilainya daripada root nodenya.
- Setiap child node sebelah kanan harus lebih besar nilainya daripada root nodenya.

Lalu, ada 3 jenis cara untuk melakukan penelusuran data (traversal) pada BST :
- PreOrder : Print data, telusur ke kiri, telusur ke kanan
- InOrder : Telusur ke kiri, print data, telusur ke kanan
- Post Order : Telusur ke kiri, telusur ke kanan, print data

\
&nbsp;
#### Penjelasan Program Latihan
- Array.java\
		- Mendeklarasikan array.\
		- Membuat kode program untuk mengambil data dari sebuah array dengan menggunakan indexnya.

- ArrayForEach.java\
    	- Membuat array.\
    	- Membuat scanner.\
    	- Mengisi data ke array.\
    	- Menampilkan array.

- ArrayLooping.java\
    	- Membuat array berisi bahasa pemrograman.\
    	- Membuat kode perulangan untuk menampilkan semua isi array.

- ArrayMultiDimensi.java\
    	- Membuat beberapa array di dalam array.\
    	- Membuat kode perulangan untuk menampilkan semua isi array tersebut.

- Tree.java\
    	- Membuat scanner\
    	- Membuat kode program untuk mengoperasikan binary tree dan mengurutkan angka2 yang diinput sesuai dengan aturan dari masing2 Order (Pre Order, In Order, Post Order).
    
&nbsp;