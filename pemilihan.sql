-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2023 at 12:27 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemilihan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` int(11) NOT NULL,
  `id_partai` int(11) DEFAULT NULL,
  `nama_anggota` varchar(255) DEFAULT NULL,
  `jenis_perwakilan` int(11) DEFAULT NULL,
  `jumlah_suara` int(11) NOT NULL,
  `id_dapil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `id_partai`, `nama_anggota`, `jenis_perwakilan`, `jumlah_suara`, `id_dapil`) VALUES
(1, 1, 'dr. SOFYAN TAN', 1, 3, 1),
(2, 1, 'H. IRMADI LUBIS', 1, 9, 1),
(3, 1, 'PUTRA NABABAN', 1, 2, 1),
(4, 1, 'SONDANG TIAR DEBORA TAMPUBOLON, S.T', 1, 1, 1),
(5, 1, 'Ir. ERIKO SOTARDUGA B.P.S', 1, 6, 1),
(6, 2, 'Ir. H.T.A. Khalid, M.M.', 1, 2, 1),
(7, 2, 'Fadhlullah, S.E.', 1, 3, 1),
(8, 2, 'Romo H.R. Muhammad Syafi\'i, S.H., M.Hum.', 1, 5, 1),
(9, 2, 'M. Husni, S.E., M.M.', 1, 2, 1),
(10, 2, 'H. Gus Irawan Pasaribu, S.E., Ak., M.M.CA.', 1, 3, 1),
(11, 3, 'H. M. Salim Fakhry, S.E., M.M.', 1, 0, 1),
(12, 3, 'Ilham Pangestu', 1, 2, 1),
(13, 3, 'Meutya Viada Hafid', 1, 2, 1),
(14, 3, 'Ir. Lamhot Sinaga', 1, 2, 1),
(15, 3, 'Christina Aryani, S.E., S.H., M.H.', 1, 2, 1),
(16, 4, 'H. Muhammad Nasir Djamil, M.Si.', 1, 8, 1),
(17, 4, 'Ir. H. Tifatul Sembiring', 1, 15, 1),
(18, 4, 'H. Hidayatullah, S.E.', 1, 15, 1),
(19, 4, 'Dr. H. Mardani, M.Eng.', 1, 13, 1),
(20, 4, 'Dr. H. Muhammad Hidayat Nur Wahid, M.A.', 1, 14, 1),
(21, 1, 'SB Wiryanti Sukmadani ', 2, 0, 1),
(22, 1, 'Putra Nababan', 2, 0, 1),
(23, 1, 'William Yani', 2, 1, 1),
(24, 1, 'Chicha Koeswoyo', 2, 0, 1),
(25, 1, 'Andrie Tadriwan Utama', 2, 0, 1),
(26, 2, 'Habiburokhman', 2, 2, 1),
(27, 2, 'Asril Hamzah Tanjung', 2, 0, 1),
(28, 2, 'Laviona Barretta', 2, 0, 1),
(29, 2, 'Didi Suprijadi', 2, 0, 1),
(30, 2, 'Indah Muktiningtias', 2, 0, 1),
(31, 2, 'Iwan Sumule', 2, 0, 1),
(32, 2, 'Sondang Tiar Debora Tampubolon', 2, 1, 1),
(33, 3, 'Bambang Atmanto Wiyogo', 2, 1, 1),
(34, 3, 'Erwin Ricardo', 2, 1, 1),
(35, 3, 'Christine N Panjaitan', 2, 0, 1),
(36, 3, 'Akhmad Gojali', 2, 3, 1),
(37, 3, 'Ardima Rama Putra', 2, 0, 1),
(38, 3, 'Angelina Christi Sangeroki', 2, 0, 1),
(39, 4, 'Mardani', 2, 0, 1),
(40, 4, 'Anis Byarwati', 2, 1, 1),
(41, 4, 'Andy Azisi Amin', 2, 0, 1),
(42, 4, 'Astriana Baiti Sinaga', 2, 0, 1),
(43, 4, 'Hamid Murroghi', 2, 3, 1),
(44, 4, 'Andriyana', 2, 1, 1),
(45, 1, 'Fransiscus Samosir', 3, 0, 1),
(46, 1, 'Hendrik Tangke Allo', 3, 0, 1),
(47, 1, 'Hermanto', 3, 0, 1),
(48, 1, 'Ikravany Hilman', 3, 0, 1),
(49, 1, 'Imam Turidi', 3, 0, 1),
(50, 1, 'Indah Ariani', 3, 0, 1),
(51, 1, 'Mad Arif', 3, 0, 1),
(52, 1, 'Rudi Kurniawan', 3, 0, 1),
(53, 1, 'Veronica Wiwin Widarini', 3, 0, 1),
(54, 1, 'Yuni Indriany', 3, 1, 1),
(55, 2, 'Edi Masturo', 3, 0, 1),
(56, 2, 'Mohammad HB', 3, 0, 1),
(57, 2, 'Rezky M. Noor', 3, 0, 1),
(58, 2, 'Yeti Wulandari', 3, 0, 1),
(59, 2, 'Turiman', 3, 0, 1),
(60, 2, 'Hamzah', 3, 0, 1),
(61, 2, 'Afrizal A. Lana', 3, 1, 1),
(62, 2, 'M. Iman Yuniawan', 3, 0, 1),
(63, 2, 'Priyanti Susilawati', 3, 0, 1),
(64, 2, 'Irfan Rifai', 3, 0, 1),
(65, 3, 'Supriatni', 3, 0, 1),
(66, 3, 'Tajudin Tabri', 3, 1, 1),
(67, 3, 'Juanah Sarmili', 3, 0, 1),
(68, 3, 'Nurhasyim', 3, 2, 1),
(69, 3, 'Nurdin Al Ardisoma', 3, 1, 1),
(70, 4, 'Imam Musanto', 3, 0, 1),
(71, 4, 'Tengku Farida Rachmayanti', 3, 0, 1),
(72, 4, 'Tengku Muhammad Yusufsyah Putra', 3, 3, 1),
(73, 4, 'Sri Utami', 3, 0, 1),
(74, 4, 'Ade Supriyatna', 3, 1, 1),
(75, 4, 'Muhammad Supariyono', 3, 0, 1),
(76, 4, 'Hengky', 3, 0, 1),
(77, 4, 'Qurtifa Wijaya', 3, 0, 1),
(78, 4, 'Ade Firmansyah', 3, 1, 1),
(79, 4, 'Khairullah', 3, 1, 1),
(80, 4, 'Syarif Gasim Husin Al-Alatas', 3, 0, 1),
(81, 4, 'Mohammad Hafid Nasir', 3, 1, 1),
(82, 0, 'H. Sudirman, S.Pd.I.', 4, 6, 1),
(83, 0, 'H. M. Fadhil Rahmi, Lc.', 4, 6, 1),
(84, 0, 'H. Fachrul Razi, M.I.P.', 4, 4, 1),
(85, 0, 'Dr. Ir. H. Abdullah Puteh, M.Si.', 4, 2, 1),
(86, 0, 'Pdt. Willem T. P. Simarmata, M.A.', 4, 0, 2),
(87, 0, 'Dr. H. Dedi Iskandar Batubara, S.Sos., S.H., M.S.P.', 4, 0, 2),
(88, 0, 'H. Muhammad Nuh, M.SP.', 4, 0, 2),
(89, 0, 'Dr. Badikenita Br. Sitepu, S.E., M.Si.', 4, 0, 2),
(90, 0, 'Hj. Emma Yohanna', 4, 0, 3),
(91, 0, 'H. Muslim M. Yatim, Lc., M.M.', 4, 0, 3),
(92, 0, 'Dr. H. Alirman Sori, S.H., M.Hum, M.M.', 4, 0, 3),
(93, 0, 'H. Leonardy Harmainy Datuak Bandaro Basa, S.IP., M.H.', 4, 0, 3),
(94, 0, 'Dr. Hj. Intsiawati Ayus, S.H., M.H.', 4, 0, 4),
(95, 0, 'Edwin Pratama Putra, S.H.', 4, 0, 4),
(96, 0, 'Dr. Misharti, S.Ag., M.Si.', 4, 0, 4),
(97, 0, 'H. Muhammad Gazali, Lc.', 4, 0, 4),
(98, 0, 'Ria Mayang Sari, S.H., M.H.', 4, 0, 5),
(99, 0, 'H. M. Syukur, S.H., M.H.', 4, 0, 5),
(100, 0, 'Dra. Hj. Elviana, M.Si.', 4, 0, 5),
(101, 0, 'M. Sum Indra, S.E., M.M.Si.', 4, 0, 5),
(102, 0, 'Hj. Eva Susanti', 4, 0, 6),
(103, 0, 'Amaliah, S.K.G.', 4, 0, 6),
(104, 0, 'Jialyka Maharani, S.I.Kom.', 4, 0, 6),
(105, 0, 'Arniza Nilawati, S.E., M.M.', 4, 0, 6),
(106, 0, 'H. Sultan Bachtiar Najamudin, S.Sos, M.Si.', 4, 0, 7),
(107, 0, 'H. Ahmad Kanedi, S.H, M.H.', 4, 0, 7),
(108, 0, 'Hj. Riri Damayanti John Latief, S.Psi.', 4, 0, 7),
(109, 0, 'Dra. Hj. Eni Khairani, M.Si.', 4, 0, 7),
(110, 0, 'dr. Jihan Nurlela', 4, 0, 8),
(111, 0, 'K.H. Ir. Abdul Hakim, M.M.', 4, 0, 8),
(112, 0, 'Drs. Ahmad Bastian SY', 4, 0, 8),
(113, 0, 'H. Bustami Zainudin, S.Pd., M.H.', 4, 0, 8),
(114, 0, 'Ir. H. Darmansyah Husein', 4, 0, 9),
(115, 0, 'Ust. H. Zuhri M. Syazali, Lc., M.A.', 4, 0, 9),
(116, 0, 'Alexander Fransiscus', 4, 0, 9),
(117, 0, 'Drs. H. A. Hudarni Rani, S.H.', 4, 0, 9),
(118, 0, 'Ir. H. Ria Saptarika, M.Eng.', 4, 0, 10),
(119, 0, 'H. Dharma Setiawan', 4, 0, 10),
(120, 0, 'Haripinto Tanuwidjaja', 4, 0, 10),
(121, 0, 'Dr. Richard Hamonangan Pasaribu, B.Sc., M.Sc.', 4, 0, 10),
(122, 0, 'Prof. Dr. H. Jimly Asshiddiqie, S.H.', 4, 0, 11),
(123, 0, 'Sabam Sirait', 4, 0, 11),
(124, 0, 'Prof. Dr. H. Dailami Firdaus, SH., LL.M., MBA.', 4, 0, 11),
(125, 0, 'Fahira Idris, S.E., M.H.', 4, 0, 11),
(126, 0, 'Prof. Dr. Hj. Sylviana Murni, S.H, M.Si.', 4, 0, 11),
(127, 0, 'Aa Oni Suwarman, A.Md.', 4, 0, 12),
(128, 0, 'K.H. Amang Syafrudin, Lc.', 4, 0, 12),
(129, 0, 'H. Asep Hidayat, S.Ag.', 4, 0, 12),
(130, 0, 'Dra. Ir. Hj. Eni Sumarni, M.Kes.', 4, 0, 12),
(131, 0, 'Denty Eka Widi Pratiwi, S.E., M.H.', 4, 0, 13),
(132, 0, 'Casytha A. Kathmandu, S.E.', 4, 0, 13),
(133, 0, 'Ir. H. Bambang Sutrisno, M.M.', 4, 0, 13),
(134, 0, 'Dr. Abdul Kholik, S.H., M.Si.', 4, 0, 13),
(135, 0, 'Gusti Kanjeng Ratu Hemas', 4, 0, 14),
(136, 0, 'Dr. H. Hilmy Muhammad, M.A.', 4, 0, 14),
(137, 0, 'Drs. Muhammad Afnan Hadikusumo', 4, 0, 14),
(138, 0, 'Ir. H. Cholid Mahmud, S.T., M.T.', 4, 0, 14),
(139, 0, 'Evi Zainal Abidin', 4, 0, 15),
(140, 0, 'Ir. H. Aa La Nyalla Mahmud Mattalitti', 4, 0, 15),
(141, 0, 'H. Ahmad Nawardi, S.Ag.', 4, 0, 15),
(142, 0, 'Adilla Azis, S.E.', 4, 0, 15),
(143, 0, 'Andiara Aprilia Hikmat', 4, 0, 16),
(144, 0, 'Drs. K.H. Habib Ali Alwi, M.Si.', 4, 0, 16),
(145, 0, 'Drs. H. Abdi Sumaithi', 4, 0, 16),
(146, 0, 'H. TB. M. Ali Ridho Azhari', 4, 0, 16),
(147, 0, 'Dr. Shri I.G.N. Arya Wedakarna M.W.S., S.E. (M.TrU.), M.Si.', 4, 0, 17),
(148, 0, 'Drs. Made Mangku Pastika, M.M.', 4, 0, 17),
(149, 0, 'Anak Agung Gde Agung, S.H.', 4, 0, 17),
(150, 0, 'H. Bambang Santoso, S.Pd.I., M.A.', 4, 0, 17),
(151, 0, 'Evi Apita Maya, S.H., M.Kn.', 4, 0, 18),
(152, 0, 'Ir. H. Achmad Sukisman Azmy, M.Hum.', 4, 0, 18),
(153, 0, 'TGH. Ibnu Halil, S.Ag., M.Pd.I.', 4, 0, 18),
(154, 0, 'H. Lalu Suhaimi Ismy', 4, 0, 18),
(155, 0, 'Hilda Manafe, S.E., M.M.', 4, 0, 19),
(156, 0, 'dr. Asyera Respati A. Wundalero', 4, 0, 19),
(157, 0, 'Angelius Wake Kako, S.Pd., M.Si.', 4, 0, 19),
(158, 0, 'Ir. Abraham Liyanto', 4, 0, 19),
(159, 0, 'Drs. Christiandy Sanjaya, S.E., M.M.', 4, 0, 20),
(160, 0, 'Maria Goreti, S.Sos., M.Si.', 4, 0, 20),
(161, 0, 'Erlinawati, S.H., M.A.P.', 4, 0, 20),
(162, 0, 'H. Sukiryanto', 4, 0, 20),
(163, 0, 'Dr. Agustin Teras Narang, S.H., M.H.', 4, 0, 21),
(164, 0, 'H. Muhammad Rakhman, S.E., S.T.', 4, 0, 21),
(165, 0, 'Habib Said Abdurrahman', 4, 0, 21),
(166, 0, 'Hj. Yustina Ismiati, S.H., M.H.', 4, 0, 21),
(167, 0, 'Habib Abdurrahman Bahasyim, S.E., M.M.', 4, 0, 22),
(168, 0, 'H. Gusti Farid Hasan Aman, S.E., Akt., M.B.A.', 4, 0, 22),
(169, 0, 'Habib Zakaria Bahasyim', 4, 0, 22),
(170, 0, 'Habib Hamid Abdullah, S.H., M.H.', 4, 0, 22),
(171, 0, 'Dr. Shri I.G.N. Arya Wedakarna M.W.S., S.E. (M.TrU.), M.Si.', 4, 0, 23),
(172, 0, 'Drs. Made Mangku Pastika, M.M.', 4, 0, 23),
(173, 0, 'Anak Agung Gde Agung, S.H.', 4, 0, 23),
(174, 0, 'H. Bambang Santoso, S.Pd.I., M.A.', 4, 0, 23),
(175, 0, 'Evi Apita Maya, S.H., M.Kn.', 4, 0, 24),
(176, 0, 'Ir. H. Achmad Sukisman Azmy, M.Hum.', 4, 0, 24),
(177, 0, 'TGH. Ibnu Halil, S.Ag., M.Pd.I.', 4, 0, 24),
(178, 0, 'H. Lalu Suhaimi Ismy', 4, 0, 24),
(179, 0, 'Hilda Manafe, S.E., M.M.', 4, 0, 25),
(180, 0, 'dr. Asyera Respati A. Wundalero', 4, 0, 25),
(181, 0, 'Angelius Wake Kako, S.Pd., M.Si.', 4, 0, 25),
(182, 0, 'Ir. Abraham Liyanto', 4, 0, 25),
(183, 0, 'Drs. Christiandy Sanjaya, S.E., M.M.', 4, 0, 26),
(184, 0, 'Maria Goreti, S.Sos., M.Si.', 4, 0, 26),
(185, 0, 'Erlinawati, S.H., M.A.P.', 4, 0, 26),
(186, 0, 'H. Sukiryanto', 4, 0, 26),
(187, 0, 'Dr. Agustin Teras Narang, S.H., M.H.', 4, 0, 27),
(188, 0, 'H. Muhammad Rakhman, S.E., S.T.', 4, 0, 27),
(189, 0, 'Habib Said Abdurrahman', 4, 0, 27),
(190, 0, 'Hj. Yustina Ismiati, S.H., M.H.', 4, 0, 27),
(191, 0, 'Habib Abdurrahman Bahasyim, S.E., M.M.', 4, 0, 28),
(192, 0, 'H. Gusti Farid Hasan Aman, S.E., Akt., M.B.A.', 4, 0, 28),
(193, 0, 'Habib Zakaria Bahasyim', 4, 0, 28),
(194, 0, 'Habib Hamid Abdullah, S.H., M.H.', 4, 0, 28),
(195, 0, 'Prof. Dr. Ir. H. Fadel Muhammad', 4, 0, 29),
(196, 0, 'H. Abdurrahman Abubakar Bahmid, Lc., M.H.', 4, 0, 29),
(197, 0, 'Hj. Rahmijati Jahja, S.Pd', 4, 0, 29),
(198, 0, 'Dewi Sartika Hemeto, S.E.', 4, 0, 29),
(199, 0, 'Andri Prayoga Putra Singkarru, M.Sc.', 4, 0, 30),
(200, 0, 'Ir. H. Iskandar Muda Baharuddin Lopa', 4, 0, 30),
(201, 0, 'H. Almalik Pababari', 4, 0, 30),
(202, 0, 'Ajbar', 4, 0, 30),
(203, 0, 'Anna Latuconsina, S.H.', 4, 0, 31),
(204, 0, 'Novita Anakotta, S.H., M.H.', 4, 0, 31),
(205, 0, 'Mirati Dewaningsih, S.T.', 4, 0, 31),
(206, 0, 'Dr. Nono Sampono, M.Si.', 4, 0, 31),
(207, 0, 'Husain Alting Sjah, S.E., M.M.', 4, 0, 32),
(208, 0, 'Ir. Namto Roba, S.H.', 4, 0, 32),
(209, 0, 'Chaidir Djafar, S.E., M.Si.', 4, 0, 32),
(210, 0, 'Matheus Stefi Pasimanjeku, S.H.', 4, 0, 32),
(211, 0, 'Hj. Suriati Armaiyn', 4, 0, 32),
(212, 0, 'Ikbal Hi. Djabid, S.E., M.M.', 4, 0, 32),
(213, 0, 'Yorrys Raweyai', 4, 0, 33),
(214, 0, 'Otopianus P. Tebai, S.H.', 4, 0, 33),
(215, 0, 'Herlina Murib.', 4, 0, 33),
(216, 0, 'Pdt. Ruben Uamang, S.Th., M.A.', 4, 0, 33),
(217, 0, 'Mamberob Yosephus Rumakiek, S.Si., M.Kesos.', 4, 0, 34),
(218, 0, 'Filep Wamafma, S.H., M.Hum.', 4, 0, 34),
(219, 0, 'Yance Samonsabra, S.H.', 4, 0, 34),
(220, 0, 'M. Sanusi Rahaningmas, S.Sos., M.MSip.', 4, 0, 34);

-- --------------------------------------------------------

--
-- Table structure for table `daerahpemilihan`
--

CREATE TABLE `daerahpemilihan` (
  `id_dapil` int(11) NOT NULL,
  `daerah_pemilihan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daerahpemilihan`
--

INSERT INTO `daerahpemilihan` (`id_dapil`, `daerah_pemilihan`) VALUES
(1, 'Aceh'),
(2, 'Sumatera Utara'),
(3, 'Sumatera Barat'),
(4, 'Riau'),
(5, 'Jambi'),
(6, 'Sumatera Selatan'),
(7, 'Bengkulu'),
(8, 'Lampung'),
(9, 'Kepulauan Bangka Belitung'),
(10, 'Kepulauan Riau'),
(11, 'DKI Jakarta'),
(12, 'Jawa Barat'),
(13, 'Jawa Tengah'),
(14, 'DI Yogyakarta'),
(15, 'Jawa Timur'),
(16, 'Banten'),
(17, 'Bali'),
(18, 'Nusa Tenggara Barat'),
(19, 'Nusa Tenggara Timur'),
(20, 'Kalimantan Barat'),
(21, 'Kalimantan Tengah'),
(22, 'Kalimantan Selatan'),
(23, 'Kalimantan Timur'),
(24, 'Kalimantan Utara'),
(25, 'Sulawesi Utara'),
(26, 'Sulawesi Tengah'),
(27, 'Sulawesi Selatan'),
(28, 'Sulawesi Tenggara'),
(29, 'Gorontalo'),
(30, 'Sulawesi Barat'),
(31, 'Maluku'),
(32, 'Maluku Utara'),
(33, 'Papua'),
(34, 'Papua Barat');

-- --------------------------------------------------------

--
-- Table structure for table `daftarpemilih`
--

CREATE TABLE `daftarpemilih` (
  `id_pemilih` int(11) NOT NULL,
  `NIK` bigint(16) NOT NULL,
  `nama_pemilih` varchar(255) NOT NULL,
  `level_pemilih` int(1) DEFAULT NULL,
  `sudahmemilih` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftarpemilih`
--

INSERT INTO `daftarpemilih` (`id_pemilih`, `NIK`, `nama_pemilih`, `level_pemilih`, `sudahmemilih`) VALUES
(1, 1207262804930004, 'Rizky Aprinanda', 1, 1),
(2, 1207262804930005, 'Admin', 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `jenis_perwakilan`
--

CREATE TABLE `jenis_perwakilan` (
  `id_perwakilan` int(11) NOT NULL,
  `nama_perwakilan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_perwakilan`
--

INSERT INTO `jenis_perwakilan` (`id_perwakilan`, `nama_perwakilan`) VALUES
(1, 'DPR'),
(2, 'DPRD Provinsi'),
(3, 'DPRD Kabupaten/Kota'),
(4, 'DPD');

-- --------------------------------------------------------

--
-- Table structure for table `partai`
--

CREATE TABLE `partai` (
  `id_partai` int(11) NOT NULL,
  `nama_partai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `partai`
--

INSERT INTO `partai` (`id_partai`, `nama_partai`) VALUES
(0, 'Non Partai'),
(1, 'PDIP'),
(2, 'Gerindra'),
(3, 'Golkar'),
(4, 'PKS');

-- --------------------------------------------------------

--
-- Table structure for table `presiden`
--

CREATE TABLE `presiden` (
  `id_capres` int(11) NOT NULL,
  `nama_capres` varchar(50) NOT NULL,
  `jumlah_suara` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `presiden`
--

INSERT INTO `presiden` (`id_capres`, `nama_capres`, `jumlah_suara`) VALUES
(1, 'Prabowo Subianto', 1),
(2, 'Anies Baswedan', 8),
(3, 'Ganjar Pranowo', 0),
(4, 'Puan Maharani', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`),
  ADD KEY `id_partai` (`id_partai`),
  ADD KEY `jenis_perwakilan` (`jenis_perwakilan`),
  ADD KEY `fk_id_dapil` (`id_dapil`);

--
-- Indexes for table `daerahpemilihan`
--
ALTER TABLE `daerahpemilihan`
  ADD PRIMARY KEY (`id_dapil`);

--
-- Indexes for table `daftarpemilih`
--
ALTER TABLE `daftarpemilih`
  ADD PRIMARY KEY (`id_pemilih`),
  ADD UNIQUE KEY `NIK` (`NIK`);

--
-- Indexes for table `jenis_perwakilan`
--
ALTER TABLE `jenis_perwakilan`
  ADD PRIMARY KEY (`id_perwakilan`);

--
-- Indexes for table `partai`
--
ALTER TABLE `partai`
  ADD PRIMARY KEY (`id_partai`);

--
-- Indexes for table `presiden`
--
ALTER TABLE `presiden`
  ADD PRIMARY KEY (`id_capres`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `daerahpemilihan`
--
ALTER TABLE `daerahpemilihan`
  MODIFY `id_dapil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `daftarpemilih`
--
ALTER TABLE `daftarpemilih`
  MODIFY `id_pemilih` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `anggota`
--
ALTER TABLE `anggota`
  ADD CONSTRAINT `fk_id_dapil` FOREIGN KEY (`id_dapil`) REFERENCES `daerahpemilihan` (`id_dapil`),
  ADD CONSTRAINT `id_partai` FOREIGN KEY (`id_partai`) REFERENCES `partai` (`id_partai`),
  ADD CONSTRAINT `jenis_perwakilan` FOREIGN KEY (`jenis_perwakilan`) REFERENCES `jenis_perwakilan` (`id_perwakilan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
