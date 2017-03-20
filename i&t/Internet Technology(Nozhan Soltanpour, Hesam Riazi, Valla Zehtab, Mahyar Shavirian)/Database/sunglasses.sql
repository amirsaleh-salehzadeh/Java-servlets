-- phpMyAdmin SQL Dump
-- version 2.11.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 20, 2008 at 06:10 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `sunglasses`
--

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE IF NOT EXISTS `invoice` (
  `id` int(11) NOT NULL auto_increment,
  `prodId` varchar(11) collate utf8_unicode_ci default NULL,
  `userId` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `date` varchar(50) collate utf8_unicode_ci NOT NULL,
  `session` varchar(100) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=69 ;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `prodId`, `userId`, `qty`, `date`, `session`) VALUES
(16, '46', 5, 6, '2008/07/18', NULL),
(15, '1', 5, 1, '2008/07/18', NULL),
(17, '46', 5, 6, '2008/07/18', NULL),
(18, '10', 5, 9, '2008/07/18', NULL),
(19, '18', 5, 21, '2008/07/18', NULL),
(20, '28', 5, 2, '2008/07/18', NULL),
(21, '10', 5, 3, '2008/07/18', NULL),
(22, '1', 5, 3, '2008/07/18', NULL),
(23, '11', 5, 6, '2008/07/18', NULL),
(24, '1', 5, 9, '2008/07/18', NULL),
(25, '2', 5, 99, '2008/07/18', NULL),
(26, '3', 5, 999, '2008/07/18', NULL),
(27, '1', 5, 9, '2008/07/18', NULL),
(28, '2', 5, 99, '2008/07/18', NULL),
(29, '3', 5, 999, '2008/07/18', NULL),
(30, '10', 5, 4, '2008/07/18', NULL),
(31, '28', 8, 6, '2008/07/18', NULL),
(32, '30', 8, 7, '2008/07/18', NULL),
(33, '18', 7, 6, '2008/07/18', NULL),
(34, '20', 7, 7, '2008/07/18', NULL),
(35, '3', 5, 12, '2008/07/18', NULL),
(36, '7', 5, 13, '2008/07/18', NULL),
(37, '17', 5, 14, '2008/07/18', NULL),
(38, '10', 5, 1, '2008/07/18', NULL),
(39, '17', 5, 2, '2008/07/18', NULL),
(40, '27', 5, 3, '2008/07/18', NULL),
(41, '3', 5, 1, '2008/07/18', NULL),
(42, '9', 5, 4, '2008/07/18', NULL),
(43, '19', 5, 5, '2008/07/18', NULL),
(44, '3', 5, 4, '2008/07/18', NULL),
(45, '7', 5, 1, '2008/07/18', NULL),
(46, '8', 5, 2, '2008/07/18', NULL),
(47, '12', 1, 100, '2008/07/19', '0.10919825980599451'),
(48, '14', 1, 10, '2008/07/19', '0.10919825980599451'),
(49, '16', 1, 15, '2008/07/19', '0.10919825980599451'),
(50, '23', 1, 2, '2008/07/19', '0.014634833084589127'),
(51, '25', 1, 5, '2008/07/19', '0.014634833084589127'),
(52, '10', 5, 1, '2008/07/19', '0.9002874798894956'),
(53, '13', 5, 2, '2008/07/19', '0.9002874798894956'),
(54, '10', 5, 1, '2008/07/19', '0.526550016250816'),
(55, '13', 5, 2, '2008/07/19', '0.526550016250816'),
(56, '10', 5, 1, '2008/07/19', '0.9798757644719033'),
(57, '13', 5, 2, '2008/07/19', '0.9798757644719033'),
(58, '10', 5, 1, '2008/07/19', '0.8440569424687434'),
(59, '13', 5, 2, '2008/07/19', '0.8440569424687434'),
(60, '10', 5, 1, '2008/07/19', '0.6796216997915828'),
(61, '13', 5, 2, '2008/07/19', '0.6796216997915828'),
(62, '10', 5, 1, '2008/07/19', '0.6819392528158464'),
(63, '13', 5, 2, '2008/07/19', '0.6819392528158464'),
(64, '1', 7, 2, '2008/07/19', '0.19327122489114423'),
(65, '6', 7, 1, '2008/07/19', '0.19327122489114423'),
(66, '2', 7, 2, '2008/07/19', '0.6981824057739852'),
(67, '5', 7, 3, '2008/07/19', '0.6981824057739852'),
(68, '5', 7, 2, '2008/07/19', '0.5381395513202072');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL auto_increment,
  `model` varchar(50) NOT NULL,
  `unitPrice` int(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `img1` varchar(100) NOT NULL,
  `img2` varchar(100) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=66 ;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `model`, `unitPrice`, `brand`, `img1`, `img2`) VALUES
(1, '2113 Wayfarer Black', 64, 'Ray-Ban', 'pic/Ray-Ban/2113-901.jpg', 'pic/Ray-Ban/2113-901-02.jpg'),
(2, 'Wayfarer 2113 Havana', 65, 'Ray-Ban', 'pic/Ray-Ban/2113-909.jpg', 'pic/Ray-Ban/2113-909-02.jpg'),
(3, '***2129*** Tortoisel', 59, 'Ray-Ban', 'pic/Ray-Ban/2129-902.jpg', 'pic/Ray-Ban/2129-902-02.jpg'),
(4, '--3194--******* Gunmetal', 66, 'Ray-Ban', 'pic/Ray-Ban/3194-004.jpg', 'pic/Ray-Ban/3194-004-02.jpg'),
(5, '-----3214 -------------Rimless Aviator Gold', 66, 'Ray-Ban', 'pic/Ray-Ban/3214-00173.jpg', 'pic/Ray-Ban/3214-00173-02.jpg'),
(6, '----------****4071**** Black', 68, 'Ray-Ban', 'pic/Ray-Ban/4071-60171.jpg', 'pic/Ray-Ban/4071-60171-02.jpg'),
(7, '4078 Tortoiseshell Polarised', 68, 'Ray-Ban', 'pic/Ray-Ban/4078-60132.jpg', 'pic/Ray-Ban/4078-60132-02.jpg'),
(8, '***4073*** Tortoiseshell', 68, 'Ray-Ban', 'pic/Ray-Ban/4092-601s.jpg', 'pic/Ray-Ban/4092-601s-02.jpg'),
(9, '***4102*** Tortoiseshell', 68, 'Ray-Ban', 'pic/Ray-Ban/4104-601.jpg', 'pic/Ray-Ban/4104-601-02.jpg'),
(10, '04FS Brown', 86, 'Prada', 'pic/Prada/04fs-4bx2z1.jpg', 'pic/Prada/04fs-4bx2z1-02.jpg'),
(11, '04HS Havana', 99, 'Prada', 'pic/Prada/04hs-2ausp1.jpg', 'pic/Prada/04hs-2ausp1-02.jpg'),
(12, '08HS Black', 132, 'Prada', 'pic/Prada/08hs-7js1a1.jpg', 'pic/Prada/08hs-7js1a1-02.jpg'),
(13, '10HS Caramel', 140, 'Prada', 'pic/Prada/10hs-7776s1.jpg', 'pic/Prada/10hs-7776s1-02.jpg'),
(14, '18HS Black', 105, 'Prada', 'pic/Prada/18hs-1ab1a1.jpg', 'pic/Prada/18hs-1ab1a1-02.jpg'),
(15, '19HS Speckled Grey', 128, 'Prada', 'pic/Prada/19hs-7715d1.jpg', 'pic/Prada/19hs-7715d1-02.jpg'),
(16, '52HS Gold', 150, 'Prada', 'pic/Prada/58fs-2bu6s1.jpg', 'pic/Prada/58fs-2bu6s1-02.jpg'),
(17, '72GS Tortoiseshell', 138, 'Prada', 'pic/Prada/72gs-5av3n1.jpg', 'pic/Prada/72gs-5av3n1-02.jpg'),
(18, '3008 Tortoiseshell', 86, 'D_G', 'pic/DG/3008-61287.jpg', 'pic/DG/3008-61287-02.jpg'),
(19, '3009 Tortoiseshell', 86, 'D_G', 'pic/DG/3009-61287.jpg', 'pic/DG/3009-61287-02.jpg'),
(20, '3012 Tortoiseshell', 86, 'D_G', 'pic/DG/3012-50273.jpg', 'pic/DG/3012-50273-02.jpg'),
(21, '8013 BLACK', 86, 'D_G', 'pic/DG/8013-50187.jpg', 'pic/DG/8013-50187-02.jpg'),
(22, '8017 Havana', 78, 'D_G', 'pic/DG/8017-50273.jpg', 'pic/DG/8017-50273-02.jpg'),
(23, '8018 Shiny Brown', 78, 'D_G', 'pic/DG/8018-50273.jpg', 'pic/DG/8018-50273-02.jpg'),
(24, '8018 Shiny Black', 78, 'D_G', 'pic/DG/8019-50187.jpg', 'pic/DG/8019-50187-02.jpg'),
(25, '8024 Tortoiseshell', 78, 'D_G', 'pic/DG/8024-62373.jpg', 'pic/DG/8024-62373-02.jpg'),
(26, '8027 Black', 78, 'D_G', 'pic/DG/8028-50187.jpg', 'pic/DG/8028-50187-02.jpg'),
(27, '63HS Silver', 150, 'Prada', 'pic/Prada/62hs-1bc1a1.jpg', 'pic/Prada/62hs-1bc1a1-02.jpg'),
(28, 'Caos Shiny Gunmetal', 160, 'RobertoCavalli', 'pic/Roberto%20Cavalli/222-731.jpg', 'pic/Roberto%20Cavalli/222-731-02.jpg'),
(29, 'Acheronte Gunmetal', 160, 'RobertoCavalli', 'pic/Roberto%20Cavalli/316-731.jpg', 'pic/Roberto%20Cavalli/316-731-02.jpg'),
(30, 'Onfale Brown', 140, 'RobertoCavalli', 'pic/Roberto%20Cavalli/332-166.jpg', 'pic/Roberto%20Cavalli/332-166-02.jpg'),
(31, 'Ore Gunmetal', 144, 'RobertoCavalli', 'pic/Roberto%20Cavalli/333-f69.jpg', 'pic/Roberto%20Cavalli/333-f69-02.jpg'),
(32, 'Tia Brown', 174, 'RobertoCavalli', 'pic/Roberto%20Cavalli/383-k65.jpg', 'pic/Roberto%20Cavalli/383-k65-02.jpg'),
(33, 'Tiresia Gunmetal', 154, 'RobertoCavalli', 'pic/Roberto%20Cavalli/385-731.jpg', 'pic/Roberto%20Cavalli/385-731-02.jpg'),
(34, 'Steno Black', 162, 'RobertoCavalli', 'pic/Roberto%20Cavalli/389-u14.jpg', 'pic/Roberto%20Cavalli/389-u14-02.jpg'),
(35, '---- Stato ----------Red', 162, 'RobertoCavalli', 'pic/Roberto%20Cavalli/390-u13.jpg', 'pic/Roberto%20Cavalli/390-u13-02.jpg'),
(36, 'Urano Black', 148, 'RobertoCavalli', 'pic/Roberto%20Cavalli/396-0b5.jpg', 'pic/Roberto%20Cavalli/396-0b5-02.jpg'),
(37, '1544 Tortoiseshell', 99, 'Gucci', 'pic/Gucci/1544-086.jpg', 'pic/Gucci/1544-086-02.jpg'),
(38, '1583 Havana', 120, 'Gucci', 'pic/Gucci/1583-v08.jpg', 'pic/Gucci/1583-v08-02.jpg'),
(39, '1844 White', 85, 'Gucci', 'pic/Gucci/1844-gtq.jpg', 'pic/Gucci/1844-gtq-02.jpg'),
(40, '2563 Black', 99, 'Gucci', 'pic/Gucci/2563-z8p.jpg', 'pic/Gucci/2563-z8p-02.jpg'),
(41, '2760 Ruthenium', 99, 'Gucci', 'pic/Gucci/2760-lhu.jpg', 'pic/Gucci/2760-lhu-02.jpg'),
(42, '2934 Clear Grey', 120, 'Gucci', 'pic/Gucci/2934-rhn.jpg', 'pic/Gucci/2934-rhn-02.jpg'),
(43, '2953 Black', 120, 'Gucci', 'pic/Gucci/2953-ha0.jpg', 'pic/Gucci/2953-ha0-02.jpg'),
(44, '1586 Dark Grey', 116, 'Gucci', 'pic/Gucci/2971-olive.jpg', 'pic/Gucci/2971-olive-02.jpg'),
(45, '2986 Shiny Black', 124, 'Gucci', 'pic/Gucci/2986-d28.jpg', 'pic/Gucci/2986-d28-02.jpg'),
(46, '------0035---- ---------------Silver', 99, 'Dior', 'pic/Dior/0035-yb7.jpg', 'pic/Dior/0035-yb7-02.jpg'),
(47, 'Aventura 2 Grey Horn', 110, 'Dior', 'pic/Dior/aventura2-2w8.jpg', 'pic/Dior/aventura2-2w8-02.jpg'),
(48, 'Aventura 1 Grey Horn', 110, 'Dior', 'pic/Dior/aventura2b-2w8.jpg', 'pic/Dior/aventura2b-2w8-02.jpg'),
(49, 'I Love Dior 1 Palladium', 105, 'Dior', 'pic/Dior/diorissimo1-6lb.jpg', 'pic/Dior/diorissimo1-6lb-02.jpg'),
(50, 'Diorissimo 2 Ruthenium', 100, 'Dior', 'pic/Dior/diorissimo2-kj1.jpg', 'pic/Dior/diorissimo2-kj1-02.jpg'),
(51, '-I Love Dior 2 ----------------Horn', 105, 'Dior', 'pic/Dior/ilovedior2-rqw.jpg', 'pic/Dior/ilovedior2-rqw-02.jpg'),
(52, 'Promenade 2 Shiny Black', 111, 'Dior', 'pic/Dior/promenade2-d28.jpg', 'pic/Dior/promenade2-d28-02.jpg'),
(53, '---------Day 2 -------------Salmon', 125, 'Dior', 'pic/Dior/shaded2-grey.jpg', 'pic/Dior/shaded2-grey-02.jpg'),
(54, 'Stronger 2 Shiny Black', 110, 'Dior', 'pic/Dior/stronger2-d28.jpg', 'pic/Dior/stronger2-d28-02.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `fname`, `username`, `password`, `address`, `tel`, `email`) VALUES
(1, 'admin', 'admin', 'admin', '1234', 'Tehran', '09122239521', 'admin@sunglasses.com'),
(3, 'ali', 'rahimi', 'ali', 'xyz', 'Isfahan', '913', 'ali@yahoo.com'),
(5, 'Valla', 'Zehtab', 'valla', '123', 'Darake', '09329177304', 'valla@yahoo.com'),
(7, 'Nojan', 'Soltanpour', 'nojan', 'nojan', 'Tehran', '912', 'ns8564@yahoo.com'),
(8, 'mahyar', 'shavirian', 'mahyar', 'm1a2h3', 'pasdaran', '09122346276', 'mahyarshan@yahoo.com');
