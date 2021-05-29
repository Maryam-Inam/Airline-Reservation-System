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
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `flightID` int NOT NULL AUTO_INCREMENT,
  `flightno` varchar(5) NOT NULL,
  `flightdate` date DEFAULT NULL,
  `bcsavailable` int DEFAULT NULL,
  `xcsavailable` int DEFAULT NULL,
  `ecsavailable` int DEFAULT NULL,
  `deptime` time DEFAULT NULL,
  `arrtime` time DEFAULT NULL,
  `aircrafttypeID` varchar(8) DEFAULT NULL,
  `sectorID` varchar(8) DEFAULT NULL,
  `airlineCode` varchar(5) DEFAULT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'Confirmed',
  PRIMARY KEY (`flightID`),
  KEY `FK_AircraftID1` (`aircrafttypeID`),
  KEY `FK_sectorID1` (`sectorID`),
  KEY `FK_AirlineCode1` (`airlineCode`),
  CONSTRAINT `FK_AircraftID1` FOREIGN KEY (`aircrafttypeID`) REFERENCES `aircraft` (`aircraftTypeID`),
  CONSTRAINT `FK_AirlineCode1` FOREIGN KEY (`airlineCode`) REFERENCES `airline` (`airlineCode`),
  CONSTRAINT `FK_sectorID1` FOREIGN KEY (`sectorID`) REFERENCES `sector` (`sectorID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES (1,'FJA11','2020-08-18',41,50,110,'18:00:00','20:00:00','JA075','lah-kr','PIA','Confirmed'),(2,'FJA12','2020-08-18',60,75,80,'08:30:00','10:00:00','JA927','mul-kr','EMR','Confirmed'),(3,'FJA24','2020-08-18',80,150,200,'21:40:00','23:00:00','JA991','kr-lah','PIA','Confirmed'),(4,'FJA19','2020-08-18',80,0,120,'17:55:00','21:00:00','JA930','mul-lah','EMR','Confirmed'),(5,'FJA31','2020-08-18',29,150,200,'08:00:00','12:00:00','JA090','lah-mul','PIA','Confirmed'),(6,'FJA33','2020-08-18',75,200,0,'15:00:00','23:00:00','JA192','kr-dub','QR','Confirmed'),(7,'FJA40','2020-08-17',29,150,200,'08:00:00','22:40:00','JA090','lah-mul','PIA','Confirmed'),(8,'FJA42','2020-08-18',0,0,250,'07:35:00','10:00:00','JA332','mul-kr','EMR','Confirmed'),(9,'FJA55','2020-08-18',75,200,200,'13:15:00','18:00:00','JA191','kr-mul','ITD','Confirmed'),(10,'FJA58','2020-08-18',80,80,80,'20:00:00','22:20:00','JA253','kr-mul','EMR','Confirmed'),(11,'FJA67','2020-08-18',30,30,200,'09:00:00','20:00:00','JA491','mul-kr','QR','Confirmed'),(12,'FJA78','2020-08-18',80,55,100,'21:30:00','23:30:00','JA273','mul-lah','PIA','Confirmed'),(13,'FJA87','2020-08-18',40,80,0,'10:00:00','19:10:30','JA092','lah-mul','PIA','Confirmed'),(14,'FJA91','2020-08-18',0,0,250,'00:25:00','07:00:00','JA331','mul-kr','EMR','Confirmed'),(15,'FJA98','2020-08-17',30,75,110,'13:00:00','20:00:00','JA085','lah-kr','ITD','Confirmed'),(16,'FJA99','2020-08-18',0,100,120,'00:30:00','07:02:00','JA992','kr-lah','DH','Confirmed'),(17,'FJA12','2020-08-16',30,150,200,'08:00:00','20:00:00','JA491','lah-kr','QR','Confirmed'),(18,'FJA55','2020-08-15',75,200,200,'09:00:00','17:00:00','JA191','lah-kr','EMR','Confirmed'),(19,'FJA58','2020-08-19',80,80,80,'10:00:00','20:00:00','JA092','lah-kr','ITD','Confirmed'),(20,'FJA67','2020-08-20',0,0,250,'10:00:00','19:00:00','JA331','lah-kr','QR','Confirmed');
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-12 23:13:08
