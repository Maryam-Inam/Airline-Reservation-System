CREATE DATABASE  IF NOT EXISTS `ars_data` ;
USE `ars_data`;
DROP TABLE IF EXISTS `reserved_passengers`;
CREATE TABLE `reserved_passengers` (
  `resPassID` int NOT NULL AUTO_INCREMENT,
  `pnrno` int NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(15) DEFAULT 'M',
  `class` varchar(15) DEFAULT NULL,
  `mealpref` varchar(30) DEFAULT 'Both veg and non-veg',
  `numoftravelors` int DEFAULT '1',
  `reservedby` int unsigned DEFAULT NULL,
  `flightID` int DEFAULT NULL,
  PRIMARY KEY (`resPassID`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `FK_flightID1` (`flightID`),
  KEY `FK_userID1` (`reservedby`),
  CONSTRAINT `FK_flightID1` FOREIGN KEY (`flightID`) REFERENCES `flights` (`flightID`),
  CONSTRAINT `FK_userID1` FOREIGN KEY (`reservedby`) REFERENCES `registered_passengers` (`userId`)
) ;
INSERT INTO `reserved_passengers` VALUES (1,52670,'ahmed','cheema','ahm',22,'m','economy','vegiterian',3,1,1),(2,52670,'uuu','ppp','usr',50,'m',' economy','vegiterian',3,1,1),(3,52670,'naseer','sidhu','nas',23,'m',' economy','vegiterian',3,1,1),(4,12345,'vbnmhbjn','mary','gvhbjnkm,',67,'f','Executive','vegitarian',1,21,1),(5,12345,'fgvbhjnm','blah','gvbhjnm,',28,'f','Executive','vegitarian',1,21,1),(6,12345,'gvydbhjnm','nahh','gbhjnm',18,'f','Economy','vegitarian',1,21,1),(7,12345,'fgvbhjnk','oho','fgbhjnk',67,'f','Executive','vegitarian',2,21,1),(8,12345,'fgvbhjn','nehh','ygvbhjnm',56,'f','Executive','vegitarian',2,21,1),(9,12345,'sdjhbngyhj','lala','bnghbjnm',27,'m','Executive','vegitarian',1,21,1),(10,12345,'hjnkm','mamdi','bhjnkm,',78,'f','Executive','vegitarian',1,21,1),(11,12345,'ghfds','gfds','nhbgfvd',12,'f','Executive','vegitarian',1,21,1),(12,12345,'rgvbhjn','bababa','rtfgybhjnk',56,'f','Executive','vegitarian',1,21,1),(13,12345,'fgvhj','maha','fvghj',78,'f','Executive','vegitarian',1,21,1),(14,12345,'fsgyhjkn','mariam','gyhjnkm',26,'f','Executive','vegitarian',1,21,1),(15,12345,'jynthrgfd','dddd','hgfds',12,'f','Executive','vegitarian',1,21,1),(16,12345,'hgbfvdc','marya','hbgfvcx',19,'f','Executive','vegitarian',1,21,1),(17,12345,'tgyhjk','haah','fghjkm',56,'f','Executive','vegitarian',1,21,1),(18,12345,'jhgfde','ggggg','FGHJN',67,'m','Executive','vegitarian',1,21,1),(19,12345,'iuytyui','laiba','ifghjk',45,'f','Executive','vegitarian',1,21,1),(20,12345,'rtfgybjhnk','malala','dfghbjnk',27,'f','Executive','vegitarian',1,21,1),(21,12345,'hghjkl','vvvv','fguhjikolm',28,'f','Executive','vegitarian',1,21,1),(22,12345,'ygsdhjkal','tyguhjiklfgh','mmmm',27,'f','Executive','vegitarian',1,21,1),(23,12345,'jhgfgh','gfghbjk','ufff',56,'f','Executive','vegitarian',1,21,1),(24,12345,'ajkhn','ujhknm,','maira',27,'f','Executive','vegitarian',1,21,1),(25,12345,'dftyujihgc','iuyfgghjkhg','haha',67,'f','Executive','vegitarian',1,21,1),(26,12345,'hassaan','ali','hassaan',19,'m','Executive','vegitarian',1,21,1),(27,12345,'sdxfcgvbh','nhgbfvxc','maha',23,'f','economy','veg',1,21,1),(28,12345,'fguhji','ghjk','mala',19,'f','Executive','vegitarian',1,23,1),(29,12345,'fatima','shahzad','fama',16,'f','Executive','vegitarian',1,21,1),(30,12345,'dfghjk','fcgvbhjnk','aaaa',18,'f','Executive','vegitarian',1,21,1),(31,12345,'hgdfghj','jhgfd','nnnn',23,'f','Executive','vegitarian',1,21,1),(32,12345,'fghjk','fghjnkm','maria',19,'f','Business','vegitarian',1,21,2),(33,12345,'dfgyhjk','dfghjk','bbbb',67,'f','Executive','vegitarian',1,21,1),(34,12345,'asdfghjk','sdfghj','cccc',16,'f','Business','vegitarian',1,21,1),(35,12345,'asdfghjkl','sdfghjk','xxxx',25,'f','Business','vegitarian',1,21,1),(36,12345,'maira','Aslam','maira@2',25,'F','Business','vegitarian',1,21,1),(37,297108,'laraib','jafri','laraibb',19,'F','Business','both veg and non-veg',1,21,5),(38,887445,'zara','bb','zarab1',16,'f','Economy','both veg and non-veg',1,21,1),(39,206194,'abraka','dabra','abra',100,'F','Business','both veg and non-veg',1,21,1),(40,224486,'abra','kadabra','dabra',19,'M','Business','both veg and non-veg',1,21,1),(41,107322,'drftgyuhij','cfgvhjk','zzzz',78,'f','Business','both veg and non-veg',2,21,1),(42,107322,'xcghj','tyui','ffff',67,'m','Business','both veg and non-veg',2,21,1),(43,682300,'kiran','ilyas','kiran',18,'f','Business','both veg and non-veg',1,21,1),(44,610260,'sdfghjk','fghjkl','gggg',67,'f','Business','both veg and non-veg',1,21,1),(45,668136,'kjhgfds','jkhgfds','babaa',45,'f','Business','both veg and non-veg',1,21,1),(46,513631,'sdfghjk','dfghjk','cat',28,'f','Business','both veg and non-veg',1,21,1),(47,298336,'kjhgfdsdfgh','fgyhjk','ssss',56,'f','Business','both veg and non-veg',1,21,1),(48,527735,'javaria','inam','javaria29',18,'F','Business','both veg and non-veg',1,21,1);
