CREATE DATABASE  IF NOT EXISTS `ars_data` ;
USE `ars_data`;
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffId` int NOT NULL,
  `fname` varchar(15) NOT NULL,
  `lName` varchar(15) NOT NULL,
  `phoneNo` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `adminname` varchar(20) NOT NULL,
  PRIMARY KEY (`staffId`)
);

INSERT INTO `staff` VALUES (1,'admin1','ad','03001111111','lahore','admin1@gmail.com','aaaa','admin1');

