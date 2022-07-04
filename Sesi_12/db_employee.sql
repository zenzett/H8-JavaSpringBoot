-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `req2_soal_a`;
CREATE TABLE `req2_soal_a` (`nama_tanggungan` varchar(20), `hubungan_tanggungan` varchar(20));


DROP VIEW IF EXISTS `req2_soal_b`;
CREATE TABLE `req2_soal_b` (`id_proyek` int(11), `total_proyek_1` bigint(21));


DROP VIEW IF EXISTS `req2_soal_c`;
CREATE TABLE `req2_soal_c` (`gaji_pegawai_diatas_3juta500` bigint(21));


DROP VIEW IF EXISTS `req2_soal_d`;
CREATE TABLE `req2_soal_d` (`total_proyek_departemen_2` bigint(21));


DROP VIEW IF EXISTS `req2_soal_e`;
CREATE TABLE `req2_soal_e` (`nama_departemen` varchar(20), `rata_rata_gaji` double);


DROP VIEW IF EXISTS `req2_soal_f`;
CREATE TABLE `req2_soal_f` (`nama_departemen` varchar(20), `banyak_pegawai` bigint(21));


DROP VIEW IF EXISTS `req2_soal_g`;
CREATE TABLE `req2_soal_g` (`nama_proyek` varchar(20), `total_jam_kerja_perminggu` decimal(32,0));


DROP VIEW IF EXISTS `req2_soal_h`;
CREATE TABLE `req2_soal_h` (`nama_pegawai` varchar(20), `total_waktu_kerja` decimal(32,0));


DROP VIEW IF EXISTS `req2_soal_i`;
CREATE TABLE `req2_soal_i` (`nama_pegawai` varchar(20), `total_waktu_kerja` decimal(32,0), `bonus_kinerja` varchar(9));


DROP VIEW IF EXISTS `req2_soal_j`;
CREATE TABLE `req2_soal_j` (`nama_pegawai` varchar(20), `jumlah_proyek` bigint(21));


DROP VIEW IF EXISTS `req2_soal_k`;
CREATE TABLE `req2_soal_k` (`nama_pegawai` varchar(20), `jumlah_proyek` bigint(21));


DROP VIEW IF EXISTS `req2_soal_l`;
CREATE TABLE `req2_soal_l` (`nama_pegawai` varchar(20), `rata_rata_waktu_kerja` decimal(14,4), `jumlah_proyek` bigint(21));


DROP VIEW IF EXISTS `req2_soal_m`;
CREATE TABLE `req2_soal_m` (`hubungan_tanggungan` varchar(20), `banyaknya_tanggungan` bigint(21));


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_departemen`;
CREATE TABLE `tb_departemen` (
  `id_departemen` int(11) NOT NULL AUTO_INCREMENT,
  `nama_departemen` varchar(20) NOT NULL,
  `tanggal_mulai_manager` date NOT NULL,
  `id_manager` int(11) NOT NULL,
  PRIMARY KEY (`id_departemen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_departemen` (`id_departemen`, `nama_departemen`, `tanggal_mulai_manager`, `id_manager`) VALUES
(1,	'HRD',	'2021-01-01',	111),
(2,	'Sales & Marketing',	'2021-02-02',	221),
(3,	'Production',	'2021-03-03',	331),
(4,	'Qaulity Assurance',	'2021-04-04',	441),
(5,	'Information & Technology',	'2021-05-05',	551),
(6,	'Accounting',	'2021-06-06',	661);

DROP TABLE IF EXISTS `tb_lokasi_departemen`;
CREATE TABLE `tb_lokasi_departemen` (
  `id_departemen` int(11) NOT NULL,
  `lokasi_departemen` varchar(20) NOT NULL,
  KEY `id_departemen` (`id_departemen`),
  CONSTRAINT `tb_lokasi_departemen_ibfk_1` FOREIGN KEY (`id_departemen`) REFERENCES `tb_departemen` (`id_departemen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_lokasi_departemen` (`id_departemen`, `lokasi_departemen`) VALUES
(1,	'Jakarta Selatan'),
(2,	'Banten'),
(3,	'Tangerang'),
(4,	'Depok'),
(5,	'Bogor'),
(6,	'Bekasi');

DROP TABLE IF EXISTS `tb_pegawai`;
CREATE TABLE `tb_pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `id_departemen` int(11) NOT NULL,
  `nama_depan` varchar(20) NOT NULL,
  `nama_tengah` varchar(20) NOT NULL,
  `nama_belakang` varchar(20) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `alamat_pegawai` text NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `gaji_pegawai` float NOT NULL,
  `SuperSSN` int(11) NOT NULL,
  PRIMARY KEY (`id_pegawai`),
  KEY `id_departemen` (`id_departemen`),
  CONSTRAINT `tb_pegawai_ibfk_1` FOREIGN KEY (`id_departemen`) REFERENCES `tb_departemen` (`id_departemen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pegawai` (`id_pegawai`, `id_departemen`, `nama_depan`, `nama_tengah`, `nama_belakang`, `tanggal_lahir`, `alamat_pegawai`, `jenis_kelamin`, `gaji_pegawai`, `SuperSSN`) VALUES
(111,	1,	'Tomas',	'Shelby',	'Gipsy',	'1972-10-10',	'Birmingham',	'Laki-laki',	15000000,	1),
(112,	1,	'Arthur',	'Shelby',	'Gipsy',	'1970-08-07',	'Birmingham',	'Laki-laki',	33000000,	1),
(221,	2,	'John',	'Shelby',	'Gipsy',	'1974-07-07',	'Birmingham',	'Laki-laki',	14000000,	1),
(222,	2,	'Polly',	'Gray',	'Gipsy',	'1965-06-09',	'Birmingham',	'Perempuan',	2300000,	2),
(331,	3,	'Finn',	'Shelby',	'Gipsy',	'1979-11-11',	'Birmingham',	'Laki-laki',	16000000,	2),
(332,	3,	'Michael',	'Gray',	'Gipsy',	'1980-03-07',	'Birmingham',	'Laki-laki',	2200000,	3),
(441,	4,	'Grace',	'',	'Burgess',	'1975-04-04',	'London',	'Perempuan',	13000000,	3),
(443,	4,	'Charlie',	'',	'Strong',	'1965-07-07',	'Birmingham',	'Laki-laki',	5000000,	4),
(551,	5,	'Aberama',	'',	'Gold',	'1967-05-05',	'London',	'Laki-laki',	10000000,	5),
(661,	6,	'Bonnie',	'',	'Gold',	'1979-07-07',	'London',	'Laki-laki',	17000000,	6);

DROP TABLE IF EXISTS `tb_proyek`;
CREATE TABLE `tb_proyek` (
  `id_proyek` int(11) NOT NULL AUTO_INCREMENT,
  `nama_proyek` varchar(20) NOT NULL,
  `lokasi_proyek` text NOT NULL,
  `id_departemen` int(11) NOT NULL,
  PRIMARY KEY (`id_proyek`),
  KEY `id_departemen` (`id_departemen`),
  CONSTRAINT `tb_proyek_ibfk_1` FOREIGN KEY (`id_departemen`) REFERENCES `tb_departemen` (`id_departemen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_proyek` (`id_proyek`, `nama_proyek`, `lokasi_proyek`, `id_departemen`) VALUES
(1,	'Pembangunan Gedung Cabang',	'Jakarta Selatan',	1),
(2,	'Training Tech Staff',	'Bekasi',	2),
(3,	'Yearly Run Fest',	'Banten',	3),
(4,	'Training Digital Marketing',	'Online',	4),
(5,	'Pemeliharaan Kesehatan Karyawan',	'Bogor',	5),
(6,	'Programming Certfication',	'Tangerang',	6),
(7,	'Ms. Excel Workshop',	'Online',	2);

DROP TABLE IF EXISTS `tb_tanggungan`;
CREATE TABLE `tb_tanggungan` (
  `id_pegawai` int(11) NOT NULL,
  `nama_tanggungan` varchar(20) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tanggal_lahir_tanggungan` date NOT NULL,
  `hubungan_tanggungan` varchar(20) NOT NULL,
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_tanggungan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_tanggungan` (`id_pegawai`, `nama_tanggungan`, `jenis_kelamin`, `tanggal_lahir_tanggungan`, `hubungan_tanggungan`) VALUES
(111,	'Qory',	'Laki-laki',	'1997-06-05',	'Anak'),
(221,	'Bill',	'Laki-laki',	'1997-08-23',	'Ayah'),
(332,	'Kanaya',	'Perempuan',	'1997-07-06',	'Anak'),
(332,	'Fanny',	'Perempuan',	'1997-01-11',	'Istri'),
(443,	'Balmond',	'Laki-laki',	'1997-07-18',	'Suami'),
(441,	'Karina',	'Perempuan',	'1997-05-02',	'Istri'),
(441,	'Bambang',	'Laki-laki',	'1997-12-22',	'Anak'),
(441,	'Ucup',	'Laki-laki',	'1997-11-25',	'Anak'),
(331,	'Tika',	'Perempuan',	'1997-11-27',	'Istri'),
(661,	'Risti',	'Perempuan',	'1997-09-16',	'Istri'),
(661,	'Sahal',	'Laki-laki',	'1997-05-14',	'Anak'),
(661,	'Rama',	'Laki-laki',	'1997-12-21',	'Anak');

DROP TABLE IF EXISTS `tb_waktu_kerja`;
CREATE TABLE `tb_waktu_kerja` (
  `id_proyek` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `waktu_kerja` int(11) NOT NULL,
  KEY `id_proyek` (`id_proyek`),
  KEY `id_pegawai` (`id_pegawai`),
  KEY `waktu_kerja` (`waktu_kerja`),
  CONSTRAINT `tb_waktu_kerja_ibfk_1` FOREIGN KEY (`id_proyek`) REFERENCES `tb_proyek` (`id_proyek`),
  CONSTRAINT `tb_waktu_kerja_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_waktu_kerja` (`id_proyek`, `id_pegawai`, `waktu_kerja`) VALUES
(1,	111,	150),
(2,	221,	130),
(3,	331,	250),
(4,	441,	160),
(1,	221,	100),
(1,	331,	210),
(1,	441,	160),
(2,	221,	10),
(2,	221,	30),
(2,	221,	40),
(2,	221,	14),
(2,	221,	50),
(7,	551,	10),
(7,	551,	20),
(7,	551,	30),
(7,	551,	20),
(6,	551,	20),
(4,	551,	30),
(5,	441,	20);

DROP TABLE IF EXISTS `req2_soal_a`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_a` AS select `tt`.`nama_tanggungan` AS `nama_tanggungan`,`tt`.`hubungan_tanggungan` AS `hubungan_tanggungan` from (`tb_tanggungan` `tt` join `tb_pegawai` `tpe` on(`tt`.`id_pegawai` = `tpe`.`id_pegawai`)) where `tpe`.`nama_depan` like 'R%';

DROP TABLE IF EXISTS `req2_soal_b`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_b` AS select `twak`.`id_proyek` AS `id_proyek`,count(`twak`.`id_proyek`) AS `total_proyek_1` from `tb_waktu_kerja` `twak` where `twak`.`id_proyek` = 1;

DROP TABLE IF EXISTS `req2_soal_c`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_c` AS select count(`tpe`.`gaji_pegawai`) AS `gaji_pegawai_diatas_3juta500` from `tb_pegawai` `tpe` where `tpe`.`gaji_pegawai` > 3500000;

DROP TABLE IF EXISTS `req2_soal_d`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_d` AS select count(`tpr`.`id_departemen`) AS `total_proyek_departemen_2` from `tb_proyek` `tpr` where `tpr`.`id_departemen` = 2;

DROP TABLE IF EXISTS `req2_soal_e`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_e` AS select `td`.`nama_departemen` AS `nama_departemen`,avg(`tpe`.`gaji_pegawai`) AS `rata_rata_gaji` from (`tb_pegawai` `tpe` join `tb_departemen` `td` on(`tpe`.`id_departemen` = `td`.`id_departemen`)) group by `td`.`id_departemen`;

DROP TABLE IF EXISTS `req2_soal_f`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_f` AS select `td`.`nama_departemen` AS `nama_departemen`,count(`tpe`.`id_pegawai`) AS `banyak_pegawai` from (`tb_pegawai` `tpe` join `tb_departemen` `td` on(`tpe`.`id_departemen` = `td`.`id_departemen`)) group by `td`.`id_departemen`;

DROP TABLE IF EXISTS `req2_soal_g`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_g` AS select `tpr`.`nama_proyek` AS `nama_proyek`,sum(`twak`.`waktu_kerja`) AS `total_jam_kerja_perminggu` from (`tb_waktu_kerja` `twak` join `tb_proyek` `tpr` on(`tpr`.`id_proyek` = `twak`.`id_proyek`)) group by `twak`.`id_proyek` order by sum(`twak`.`waktu_kerja`) desc;

DROP TABLE IF EXISTS `req2_soal_h`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_h` AS select `tpe`.`nama_depan` AS `nama_pegawai`,sum(`twak`.`waktu_kerja`) AS `total_waktu_kerja` from (`tb_pegawai` `tpe` join `tb_waktu_kerja` `twak` on(`tpe`.`id_pegawai` = `twak`.`id_pegawai`)) group by `twak`.`id_pegawai` having sum(`twak`.`waktu_kerja`) > 140 order by sum(`twak`.`waktu_kerja`) desc;

DROP TABLE IF EXISTS `req2_soal_i`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_i` AS select `tpe`.`nama_depan` AS `nama_pegawai`,sum(`twak`.`waktu_kerja`) AS `total_waktu_kerja`,case when sum(`twak`.`waktu_kerja`) > 200 then 'Bonus 50%' when sum(`twak`.`waktu_kerja`) > 150 then 'Bonus 25%' else 'Bonus 10%' end AS `bonus_kinerja` from (`tb_pegawai` `tpe` join `tb_waktu_kerja` `twak` on(`tpe`.`id_pegawai` = `twak`.`id_pegawai`)) group by `twak`.`id_pegawai` order by sum(`twak`.`waktu_kerja`) desc;

DROP TABLE IF EXISTS `req2_soal_j`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_j` AS select `tpe`.`nama_depan` AS `nama_pegawai`,count(`twak`.`id_proyek`) AS `jumlah_proyek` from (`tb_pegawai` `tpe` join `tb_waktu_kerja` `twak` on(`tpe`.`id_pegawai` = `twak`.`id_pegawai`)) group by `tpe`.`id_pegawai` order by count(`twak`.`id_proyek`) desc;

DROP TABLE IF EXISTS `req2_soal_k`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_k` AS select `tpe`.`nama_depan` AS `nama_pegawai`,count(`twak`.`id_proyek`) AS `jumlah_proyek` from (`tb_pegawai` `tpe` join `tb_waktu_kerja` `twak` on(`tpe`.`id_pegawai` = `twak`.`id_pegawai`)) group by `tpe`.`id_pegawai` having `jumlah_proyek` >= 4 order by count(`twak`.`id_proyek`) desc;

DROP TABLE IF EXISTS `req2_soal_l`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_l` AS select `tpe`.`nama_depan` AS `nama_pegawai`,avg(`twak`.`waktu_kerja`) AS `rata_rata_waktu_kerja`,count(`twak`.`id_proyek`) AS `jumlah_proyek` from (`tb_pegawai` `tpe` join `tb_waktu_kerja` `twak` on(`tpe`.`id_pegawai` = `twak`.`id_pegawai`)) group by `tpe`.`id_pegawai` having `rata_rata_waktu_kerja` > 70 and `jumlah_proyek` >= 2;

DROP TABLE IF EXISTS `req2_soal_m`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `req2_soal_m` AS select `tt`.`hubungan_tanggungan` AS `hubungan_tanggungan`,count(`tt`.`hubungan_tanggungan`) AS `banyaknya_tanggungan` from (`tb_pegawai` `tpe` join `tb_tanggungan` `tt` on(`tpe`.`id_pegawai` = `tt`.`id_pegawai`)) group by `tt`.`hubungan_tanggungan` order by count(`tt`.`hubungan_tanggungan`) desc;

-- 2022-06-21 21:10:26
