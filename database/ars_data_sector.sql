CREATE DATABASE  IF NOT EXISTS `ars_data` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ars_data`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: ars_data
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sector` (
  `sectorID` varchar(8) NOT NULL,
  `source` varchar(25) DEFAULT NULL,
  `destination` varchar(25) NOT NULL,
  `bfare` decimal(8,2) DEFAULT '0.00',
  `xfare` decimal(8,2) DEFAULT '0.00',
  `efare` decimal(8,2) DEFAULT '0.00',
  PRIMARY KEY (`sectorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sector`
--

LOCK TABLES `sector` WRITE;
/*!40000 ALTER TABLE `sector` DISABLE KEYS */;
INSERT INTO `sector` VALUES ('do-isl','Doha','Islamabad',6000.00,5000.00,4000.00),('dub-isl','Dubai','Islamabad',7990.00,6375.00,4550.00),('dub-kr','Dubai','Karachi',0.00,0.00,6800.00),('dub-lah','Dubai','Lahore',6262.00,5120.00,0.00),('dub-mul','Dubai','Multan',16000.00,12500.00,10500.00),('isl-do','Islamabad','Doha',5600.00,4400.00,3200.00),('isl-dub','Islamabad','Dubai',15500.00,11550.00,9540.00),('isl-kr','Islamabad','Karachi',12500.00,9800.00,6555.00),('isl-lah','Islamabad','Lahore',8500.00,6500.00,4500.00),('isl-mul','Islamabad','Multan',10253.00,8954.00,6789.00),('kr-dub','Karachi','Dubai',12500.00,11000.00,10000.00),('kr-isl','Karachi','Islamabad',9450.00,0.00,6450.00),('kr-lah','Karachi','Lahore',8600.00,0.00,5750.00),('kr-mul','Karachi','Multan',15550.00,12300.00,8600.00),('kr-qu','Karachi','Quetta',12000.00,10000.00,0.00),('lah-dub','Lahore','Dubai',0.00,5700.00,4500.00),('lah-isl','Lahore','Islamabad',9565.00,7500.00,0.00),('lah-kr','Lahore','Karachi',4290.00,3560.00,2563.00),('lah-mul','Lahore','Multan',6330.00,0.00,5664.00),('mul-dub','Multan','Dubai',5800.00,4200.00,3200.00),('mul-isl','Multan','Islamabad',0.00,8990.00,6450.00),('mul-kr','Multan','Karachi',11800.00,9900.00,5630.00),('mul-lah','Multan','Lahore',0.00,7500.00,4660.00),('qu-kr','Quetta','Karachi',10000.00,8700.00,0.00);
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-12 23:01:12
