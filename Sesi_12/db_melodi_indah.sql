-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `all_data`;
CREATE TABLE `all_data` (`id_ssn` int(2) unsigned zerofill, `nama_pemusik` varchar(50), `alamat_pemusik` text, `notelp_pemusik` varchar(13), `nama_album` varchar(20), `tanggal_copyright` date, `format_album` enum('CD','MC'), `judul_lagu` varchar(30), `pengarang_lagu` varchar(20), `nama_instrumen` varchar(20), `kunci_musik` enum('A','B','C','A#','B#','C#'));


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_album`;
CREATE TABLE `tb_album` (
  `id_album` int(5) NOT NULL AUTO_INCREMENT,
  `nama_album` varchar(20) NOT NULL,
  `tanggal_copyright` date NOT NULL,
  `format_album` enum('CD','MC') NOT NULL,
  `id_combine_musik` int(2) unsigned zerofill NOT NULL,
  PRIMARY KEY (`id_album`),
  KEY `id_combine_musik` (`id_combine_musik`),
  CONSTRAINT `tb_album_ibfk_1` FOREIGN KEY (`id_combine_musik`) REFERENCES `tb_pemusik` (`id_ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_album` (`id_album`, `nama_album`, `tanggal_copyright`, `format_album`, `id_combine_musik`) VALUES
(111,	'Air',	'2001-01-01',	'CD',	11),
(222,	'Api',	'2002-02-02',	'MC',	22),
(333,	'Udara',	'2003-03-03',	'CD',	33),
(444,	'Bumi',	'2004-04-04',	'CD',	11);

DROP TABLE IF EXISTS `tb_combine_musik`;
CREATE TABLE `tb_combine_musik` (
  `id_combine_musik` int(2) unsigned zerofill NOT NULL,
  `id_ssn` int(2) unsigned zerofill NOT NULL,
  `id_instrumen` int(5) NOT NULL,
  KEY `id_ssn` (`id_combine_musik`),
  KEY `id_ssn_2` (`id_ssn`),
  KEY `id_instrumen` (`id_instrumen`),
  CONSTRAINT `tb_combine_musik_ibfk_1` FOREIGN KEY (`id_combine_musik`) REFERENCES `tb_pemusik` (`id_ssn`),
  CONSTRAINT `tb_combine_musik_ibfk_2` FOREIGN KEY (`id_ssn`) REFERENCES `tb_pemusik` (`id_ssn`),
  CONSTRAINT `tb_combine_musik_ibfk_3` FOREIGN KEY (`id_instrumen`) REFERENCES `tb_instrumen` (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_combine_musik` (`id_combine_musik`, `id_ssn`, `id_instrumen`) VALUES
(11,	11,	1),
(22,	22,	2),
(33,	33,	1);

DROP TABLE IF EXISTS `tb_instrumen`;
CREATE TABLE `tb_instrumen` (
  `id_instrumen` int(5) NOT NULL AUTO_INCREMENT,
  `nama_instrumen` varchar(20) NOT NULL,
  `kunci_musik` enum('A','B','C','A#','B#','C#') NOT NULL,
  PRIMARY KEY (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_instrumen` (`id_instrumen`, `nama_instrumen`, `kunci_musik`) VALUES
(1,	'Piano',	'A'),
(2,	'Suling',	'A#'),
(3,	'Gitar',	'C#'),
(4,	'Gendang',	'B'),
(5,	'Harpa',	'C');

DROP TABLE IF EXISTS `tb_lagu`;
CREATE TABLE `tb_lagu` (
  `id_lagu` int(11) NOT NULL AUTO_INCREMENT,
  `judul_lagu` varchar(30) NOT NULL,
  `pengarang_lagu` varchar(20) NOT NULL,
  `id_album` int(5) NOT NULL,
  PRIMARY KEY (`id_lagu`),
  KEY `id_album` (`id_album`),
  CONSTRAINT `tb_lagu_ibfk_2` FOREIGN KEY (`id_album`) REFERENCES `tb_album` (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_lagu` (`id_lagu`, `judul_lagu`, `pengarang_lagu`, `id_album`) VALUES
(1,	'Easy On Me',	'Adele',	111),
(2,	'Friends',	'Anne Marie',	222),
(3,	'Lay All Your Love On Me',	'ABBA',	444),
(4,	'R U Mine?',	'Arctic Monkeys',	333),
(6,	'Beautiful',	'Bazzi',	444),
(7,	'Build a Bitch',	'Bella Poarch',	333),
(8,	'Happier Than Ever',	'Bille Eilish',	333),
(9,	'Dejavu',	'Olivia R',	222);

DROP TABLE IF EXISTS `tb_pemusik`;
CREATE TABLE `tb_pemusik` (
  `id_ssn` int(2) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `nama_pemusik` varchar(50) NOT NULL,
  `alamat_pemusik` text NOT NULL,
  `notelp_pemusik` varchar(13) NOT NULL,
  PRIMARY KEY (`id_ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pemusik` (`id_ssn`, `nama_pemusik`, `alamat_pemusik`, `notelp_pemusik`) VALUES
(11,	'Olivia R',	'Bandung',	'081201010101'),
(22,	'Bella Poarch',	'Tangerang',	'081202020202'),
(33,	'Arctic Monkeys',	'Depok',	'081203030303'),
(44,	'Billie Eilish',	'Sukabumi',	'081204040404');

DROP TABLE IF EXISTS `all_data`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `all_data` AS select `tpe`.`id_ssn` AS `id_ssn`,`tpe`.`nama_pemusik` AS `nama_pemusik`,`tpe`.`alamat_pemusik` AS `alamat_pemusik`,`tpe`.`notelp_pemusik` AS `notelp_pemusik`,`ta`.`nama_album` AS `nama_album`,`ta`.`tanggal_copyright` AS `tanggal_copyright`,`ta`.`format_album` AS `format_album`,`tl`.`judul_lagu` AS `judul_lagu`,`tl`.`pengarang_lagu` AS `pengarang_lagu`,`ti`.`nama_instrumen` AS `nama_instrumen`,`ti`.`kunci_musik` AS `kunci_musik` from (`tb_pemusik` `tpe` join (((`tb_combine_musik` `tc` join `tb_album` `ta` on(`tc`.`id_ssn` = `ta`.`id_combine_musik`)) join `tb_lagu` `tl` on(`ta`.`id_album` = `tl`.`id_album`)) join `tb_instrumen` `ti` on(`tc`.`id_instrumen` = `ti`.`id_instrumen`)));

-- 2022-06-26 08:47:57