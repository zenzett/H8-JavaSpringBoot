<<<<<<< HEAD
==================================================
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


=======
==================================================
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


>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
==================================================