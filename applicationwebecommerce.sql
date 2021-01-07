-- phpMyAdmin SQL Dump
-- version 4.9.7deb1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 07, 2021 at 04:53 PM
-- Server version: 8.0.22-0ubuntu0.20.10.2
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `applicationwebecommerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `profile_picture` longblob,
  `username` varchar(255) NOT NULL,
  `cb_coord` varchar(255) DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hashed_mdp` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nom` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `paypal_account` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`profile_picture`, `username`, `cb_coord`, `email`, `hashed_mdp`, `nom`, `paypal_account`, `prenom`) VALUES
(NULL, 'Atee4Real', NULL, 'mabite@dtc.com', '75c4ec0328d2ec2e8cc1cfecda70808ab55a68645a100cd7b88b18ed9d44fd5d', 'Trabelanus', NULL, 'Trabelsi'),
(NULL, 'KANJI', NULL, 'mezzediting@gmail.com', '75c4ec0328d2ec2e8cc1cfecda70808ab55a68645a100cd7b88b18ed9d44fd5d', 'azerty', NULL, 'Trabelsos'),
(NULL, 'Voidd', NULL, 'onlyvoidd@protonmail.com', '75c4ec0328d2ec2e8cc1cfecda70808ab55a68645a100cd7b88b18ed9d44fd5d', 'Only', NULL, 'Voidd'),
(NULL, 'Voidd1999', NULL, '', 'e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855', '', NULL, ''),
(NULL, 'Voidd65', NULL, 'onlyvoidd@protonmail.com', '75c4ec0328d2ec2e8cc1cfecda70808ab55a68645a100cd7b88b18ed9d44fd5d', 'Aymen', NULL, 'Trabelsos');

-- --------------------------------------------------------

--
-- Table structure for table `commandes`
--

CREATE TABLE `commandes` (
  `id` int NOT NULL,
  `id_client` int NOT NULL,
  `total` int NOT NULL,
  `adresse` varchar(150) NOT NULL,
  `id_produits` varchar(500) NOT NULL,
  `moyen_paiement` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `OPENJPA_SEQUENCE_TABLE`
--

CREATE TABLE `OPENJPA_SEQUENCE_TABLE` (
  `ID` tinyint NOT NULL,
  `SEQUENCE_VALUE` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `produits`
--

CREATE TABLE `produits` (
  `id` int NOT NULL,
  `categorie` varchar(255) DEFAULT NULL,
  `description` varchar(1500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prix` int DEFAULT NULL,
  `score` int DEFAULT NULL,
  `stock` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `produits`
--

INSERT INTO `produits` (`id`, `categorie`, `description`, `nom`, `prix`, `score`, `stock`) VALUES
(1, 'Jeux-Vidéos', 'Le dernier jeu Ninendo est arrivé !', 'Mario Bros', 49, 5, 3),
(2, 'Electroménager', 'La Machine à laver phare de Samsung', 'Samsung WashPower Z60', 299, 5, 18),
(3, 'High-Tech', 'Le dernier Téléphone d\'Apple', 'Iphone 15 Pro 64To', 12999, 5, 2),
(4, 'Livres', 'Le livre sur l\'origine de la plus grande histoire d\'heroic fantasy de tosu les temps.', 'Le Simarillon', 15, 5, 200),
(5, 'Maison', 'Le Radiateur Electrique le plus vendu en Europe', 'Radiateur Electrique Karscher 500W', 69, 5, 0),
(6, 'klj', 'dsqdsqdsq', 'dsqdsqdsq', 456, 5, 486),
(7, 'klj', 'dsqdsqdsq', 'dsqdsqdsq', 456, 5, 486),
(8, 'klj', 'dsqdsqdsq', 'dsqdsqdsq', 456, 5, 486),
(9, 'klj', 'dsqdsqdsq', 'dsqdsqdsq', 456, 5, 486);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `commandes`
--
ALTER TABLE `commandes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `OPENJPA_SEQUENCE_TABLE`
--
ALTER TABLE `OPENJPA_SEQUENCE_TABLE`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `produits`
--
ALTER TABLE `produits`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `commandes`
--
ALTER TABLE `commandes`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `produits`
--
ALTER TABLE `produits`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
