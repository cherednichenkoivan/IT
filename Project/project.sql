-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2017 at 06:48 PM
-- Server version: 5.7.15
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `images`
--

CREATE TABLE `images` (
  `id` int(10) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `path` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `images`
--

INSERT INTO `images` (`id`, `name`, `path`) VALUES
(1, 'all', 'img/image7.jpg'),
(2, 'all', 'img/image8.jpg'),
(3, 'map1', 'img/image5.jpg'),
(4, 'map1', 'img/image6.jpg'),
(5, 'map2', 'img/level2_1.jpg'),
(6, 'map2', 'img/level2_2.jpg'),
(7, 'map3', 'img/level3_1.jpg'),
(8, 'map3', 'img/level3_2.jpg'),
(9, 'map4', 'img/level4_1.jpg'),
(10, 'map4', 'img/level4_2.jpg'),
(11, 'map5', 'img/level5_1.jpg'),
(12, 'map5', 'img/level5_2.jpg'),
(13, 'map6', 'img/level6_1.jpg'),
(14, 'map6', 'img/level6_2.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `namemap`
--

CREATE TABLE `namemap` (
  `id` int(100) NOT NULL,
  `name` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `namemap`
--

INSERT INTO `namemap` (`id`, `name`) VALUES
(1, 'map1'),
(2, 'map2'),
(3, 'map3'),
(4, 'map4'),
(5, 'map5'),
(6, 'map6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `images`
--
ALTER TABLE `images`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `namemap`
--
ALTER TABLE `namemap`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `images`
--
ALTER TABLE `images`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `namemap`
--
ALTER TABLE `namemap`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
