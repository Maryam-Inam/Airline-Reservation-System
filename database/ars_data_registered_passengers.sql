CREATE DATABASE  IF NOT EXISTS `ars_data` ;
USE `ars_data`;
DROP TABLE IF EXISTS `registered_passengers`;
CREATE TABLE `registered_passengers` (
  `userId` int unsigned NOT NULL AUTO_INCREMENT,
  `fName` varchar(15) NOT NULL,
  `lName` varchar(15) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phoneNo` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `username` varchar(20) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ;
INSERT INTO `registered_passengers` VALUES (1,'Erskine','Eliaz','eeliaz0@blog.com','5707797384','Padhahegha','nbA1L2OT','eeliaz0'),(2,'Darren','Hennemann','dhennemann1@pagesperso-orange.fr','5163245037','Hujigou','fkDzw55HS','dhennemann1'),(3,'Ivory','Ginman','iginman2@1688.com','4842151451','Jinchang','TenPRk85yE','iginman2'),(4,'Gwennie','Hullah','ghullah3@ehow.com','3334585050','Salavan','oiucrCL4','ghullah3'),(5,'Lockwood','Garforth','lgarforth4@topsy.com','8877789351','Nivnice','3b9z27orvqd','lgarforth4'),(6,'Shel','Balfre','sbalfre5@imdb.com','8298433209','Lukou','T49u34vLP7l','sbalfre5'),(7,'Donaugh','Paskin','dpaskin6@imgur.com','9674710578','Nice','8oO2KQMS','dpaskin6'),(8,'Edwin','Gerrish','egerrish7@shinystat.com','8201703881','Jiaqu','vgMy0C5BMMNv','egerrish7'),(9,'Sylvia','Norsister','snorsister8@berkeley.edu','2679692497','Ambarakaraka','KtDaC8J5cw8X','snorsister8'),(10,'Dorrie','Semechik','dsemechik9@timesonline.co.uk','6174545753','Ganquan','2tV9AXm','dsemechik9'),(11,'Nicol','Berisford','nberisforda@buzzfeed.com','8581880736','San Francisco','KzBbVQJ','nberisforda'),(12,'Hedwig','Cradduck','hcradduckb@java.com','4829789866','Gulou','R8p7cGTbm0','hcradduckb'),(13,'Margarette','Rantoull','mrantoullc@istockphoto.com','7339160701','Langzhong','PzG3aNY2KLz','mrantoullc'),(14,'Angelico','Keefe','akeefed@barnesandnoble.com','6747532807','Doumen','MescyELYvSn','akeefed'),(15,'Denny','Swigg','dswigge@house.gov','5582428195','Widuchowa','rkm62fHDg9pm','dswigge'),(16,'Doll','Rawll','drawllf@forbes.com','1361165146','Wangkung','4l0V2zE7jzAX','drawllf'),(17,'Northrup','Marcos','nmarcosg@tamu.edu','5539795194','Xianghuaqiao','VUxdoiHO','nmarcosg'),(18,'Madlin','Alastair','malastairh@cnn.com','8547453782','Nayoro','XkH0yD','malastairh'),(19,'Isaak','Honnan','ihonnani@howstuffworks.com','6553970096','Bayan Gol','48YH2i','ihonnani'),(20,'Maddy','Edmott','medmottj@deviantart.com','3117405723','Braga','tst6GqZiX0gP','medmottj'),(21,'Maryam','Inam','maryam@gmail.com','0300-9389339','Lahore','mmmm','maryam'),(22,'Labwa','Ali','labwa@gmail.com','0300-4573724','Lahore','llll','labwa'),(23,'Musawir','Ahmed','ahmed@gmail.com','0300-729772','Lahore','aaaa','ahmed'),(24,'Hassaan','Ali','hassaan@gmail.com','0300-4875393','Lahore','hhhh','hassaan'),(25,'Arfat','Sarwar','arfat@gmail.com','0300-2837938','lahore','aaaa','heheArfat'),(26,'nimra','usman','nimo@gmail.com','80233782','lahore','nnnn','nimo'),(27,'ira','faisal','ira@gmail.com','896785','karachi','iii','ira'),(28,'mary','inam','mary@gmail.com','038923892','islamabad','mmmm','maryam2'),(29,'maheen','mazhar','mah@gmail.com','3456789567','lahore','mmmm','mah26');
