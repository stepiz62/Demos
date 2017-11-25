-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: stepiz.stepiz62demo.com    Database: myclinicdb
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(48) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'Alaska'),(2,'Alabama'),(3,'American Samoa'),(4,'Arizona'),(5,'Arkansas'),(6,'California'),(7,'Colorado'),(8,'Connecticut'),(9,'Delaware'),(10,'District of Columbia'),(11,'Federated States of Micronesia'),(12,'Florida'),(13,'Georgia'),(14,'Guam'),(15,'Hawaii'),(16,'Idaho'),(17,'Illinois'),(18,'Indiana'),(19,'Iowa'),(20,'Kansas'),(21,'Kentucky'),(22,'Louisiana'),(23,'Maine'),(24,'Marshall Islands'),(25,'Maryland'),(26,'Massachusetts'),(27,'Michigan'),(28,'Minnesota'),(29,'Mississippi'),(30,'Missouri'),(31,'Montana'),(32,'Nebraska'),(33,'Nevada'),(34,'New Hampshire'),(35,'New Jersey'),(36,'New Mexico'),(37,'New York'),(38,'North Carolina'),(39,'North Dakota'),(40,'Northern Mariana Islands'),(41,'Ohio'),(42,'Oklahoma'),(43,'Oregon'),(44,'Palau'),(45,'Pennsylvania'),(46,'Puerto Rico'),(47,'Rhode Island'),(48,'South Carolina'),(49,'South Dakota'),(50,'Tennessee'),(51,'Texas'),(52,'Utah'),(53,'Vermont'),(54,'Virgin Islands'),(55,'Virginia'),(56,'Washington'),(57,'West Virginia'),(58,'Wisconsin'),(59,'Wyoming'),(60,'Not U.S.');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-25 21:40:05
