-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 17, 2013 at 11:08 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `packt`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `BOOK_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `AUTHOR_NAME` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `PRICE` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ISSUED_DATE` date NOT NULL,
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=19 ;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BOOK_ID`, `NAME`, `AUTHOR_NAME`, `PRICE`, `ISSUED_DATE`) VALUES
(1, 'Hibernate', 'Some Name', '50$', '2012-03-13'),
(2, 'Struts2', 'Some Name', '50$', '2012-02-16'),
(3, 'Spring', 'Some Name', '50$', '2011-03-16'),
(14, 'Apache Maven', 'Some Name', '50$', '2013-03-16'),
(15, 'aaa', 'aaa', 'aaa', '2013-03-17'),
(16, 'Test', 'Test Name', '50', '2013-03-18'),
(17, 'ttt', 'ttt', 'tt', '2013-03-18'),
(18, 'Test Book', 'Test Name', '50$', '2013-03-18');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
