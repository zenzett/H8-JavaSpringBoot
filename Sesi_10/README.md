>**DISCLAIMER**\
>Semua informasi di sini diterbitkan dengan tujuan baik dan murni hanya untuk informasi umum.\
>Benar atau tidaknya, kembali kepada referensi masing-masing individu.\
>Sekian, terima kasih.
>
>>**Panduan Penggunaan Aplikasi :**\
>		1. Klik kanan pada file pom.xml > update maven project > clean > install\
>		2. Klik kanan pada folder project > run as spring boot app\
>		3. Klik Boot Dashboard > expand local\
>		4. Klik kanan pada project yang ingin diinginkan > Open Web Browser

&nbsp;
## Judul

&nbsp;
### Sub Judul

SQL Database
- Lebih mudah SQL untuk di awal
- SQL menyimpan ke sebuah tabel
- table-based

Tujuan MySQL
- Agar kita bisa saling menghubungkan data
- Mencegah duplikasi data
- Struktur dan normalisasi data
 
NoSQL Database
- NoSQL untuk data jutaan dgn data berbeda2 dengan bbrp server.
- NoSQL disimpan ke dalam bentuk document, tidak beraturan
- document, key-value, graph, or wide-column stores

DDL (Data Definition Language)
- manipulasi struktur data (trigger, stored procedure, index, rule, schema)
- sintaks DDL:
	create database;
  	create table;
  	alter table (merubah struktur tabel);
	drop table;
  	create index (membuat index dalam tabel);
  	drop index;

DML (Data Manipulation Language)
- sintaks:
	select;
	update;
	delete;
	insert;


=== Create =======================================
- membuat database
create database database_name;

- membuat tabel
CREATE TABLE table_name (
    column1 datatype,
    column2 datatype,
    column3 datatype,
   ....
);

primary key -> unique key pada tabel
foreign key -> referensi key(kolom) tabel lain


=== Drop =========================================
- drop database
drop database database_name;

- drop tabel
DROP TABLE nama_tabel;


=== Alter ========================================
- menambahkan kolom baru
ALTER TABLE nama_tabel
ADD Email varchar(255); 

- mengubah tipe data kolom
ALTER TABLE Persons
ALTER COLUMN DateOfBirth year;

- drop kolom
ALTER TABLE Persons
DROP COLUMN DateOfBirth;


=== Constraint ===================================
CREATE TABLE table_name (
    column1 datatype constraint
);

constraint -> not null, unique, primary key, foreign key, etc.


=== View =========================================
CREATE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;


=== Join ==========================================
- inner join -> join dilakukan jika data ada pada kedua tabel
- left join -> menghasilkan record dari left tabel dan matching record dari right tabel
- right join -> menghasilkan record dari right tabel dan matching record dari left tabel
- full join -> menghasilkan record dari kedua tabel
- union -> melakukan kombinasi result-set dari kedua tabel


=== Group ========================================
groupby -> grouping data yang mempunyai nilai yang sama

&nbsp;