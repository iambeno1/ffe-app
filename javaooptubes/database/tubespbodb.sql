-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2024 at 12:29 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbodb`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `catID` int(5) NOT NULL,
  `catName` varchar(20) NOT NULL,
  `catDesc` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`catID`, `catName`, `catDesc`) VALUES
(1, 'Cemilan', 'Segala jenis cemilan wenakk'),
(2, 'Daging', 'Segala jenis daging wenakk'),
(3, 'Sayuran', 'Segala jenis sayuran'),
(4, 'Breakfast', 'Segala jenis sarapan'),
(5, 'Lunch', 'Segala jenis makan siang'),
(6, 'Dinner', 'Segala jenis makan malam');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` int(11) NOT NULL,
  `namaLengkap` varchar(70) NOT NULL,
  `tglLahir` varchar(20) NOT NULL,
  `email` varchar(70) NOT NULL,
  `kataSandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `namaLengkap`, `tglLahir`, `email`, `kataSandi`) VALUES
(2, 'Beno Gabriel', '17/08/1945', 'bgabriel17@gmail.com', 'beno123'),
(3, 'Felix Paulus', '15/09/1999', 'felixp15@gmail.com', 'felixganteng'),
(4, 'Dito Risqy', '30/12/2006', 'ditor06@gmail.com', 'ditox'),
(5, 'Sandi', '18/09/2006', 'sandi18@gmail.com', 'sandi18');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `prodID` int(11) NOT NULL,
  `prodName` varchar(35) NOT NULL,
  `prodQtty` int(11) NOT NULL,
  `prodPrice` decimal(10,0) NOT NULL,
  `prodCategory` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`prodID`, `prodName`, `prodQtty`, `prodPrice`, `prodCategory`) VALUES
(1, 'Bubur Cangijo', 300, 10000, 'Breakfast'),
(2, 'Sate Ayam', 449, 25000, 'Dinner'),
(3, 'Nasi Kuning ', 180, 15000, 'Breakfast'),
(4, 'Ayam Suwir', 365, 15000, 'Lunch'),
(5, 'Nasi Bakar', 580, 10000, 'Dinner'),
(6, 'Cilok', 462, 8000, 'Lunch'),
(7, 'Nasi Uduk', 784, 12000, 'Breakfast'),
(8, 'Soto Ayam', 537, 15000, 'Dinner'),
(9, 'Pempek', 545, 15000, 'Lunch'),
(10, 'Nasi Goreng', 500, 1200, 'Dinner'),
(11, 'Kacang Garuda', 1050, 18000, 'Cemilan'),
(12, 'Nastar', 1050, 35000, 'Cemilan'),
(13, 'Sate Padang', 1050, 25000, 'Daging'),
(14, 'Sate Madura', 1050, 25000, 'Daging'),
(15, 'Paket Lode', 1050, 25000, 'Sayuran'),
(16, 'Jagung rebus', 1060, 25000, 'Cemilan'),
(17, 'Susu Jahe', 1430, 8000, 'Dinner');

-- --------------------------------------------------------

--
-- Table structure for table `seller`
--

CREATE TABLE `seller` (
  `sellerID` int(11) NOT NULL,
  `namaLengkap` varchar(70) NOT NULL,
  `tglLahir` varchar(20) NOT NULL,
  `email` varchar(70) NOT NULL,
  `kataSandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `seller`
--

INSERT INTO `seller` (`sellerID`, `namaLengkap`, `tglLahir`, `email`, `kataSandi`) VALUES
(1, 'Bintang Akbar Alim', '23/08/1999', 'masbin5@gmail.com', 'masbin123'),
(2, 'Sholihin Wiwi', '12/04/2001', 'swiwi12@gmail.com', 'wiwi123'),
(3, 'Ony Gabriel', '23/04/2004', 'ony23@gmail.com', 'ony23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`catID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prodID`);

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`sellerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `catID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `prodID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `seller`
--
ALTER TABLE `seller`
  MODIFY `sellerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
