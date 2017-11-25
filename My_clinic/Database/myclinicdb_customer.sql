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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notes` varchar(255) DEFAULT NULL,
  `title` varchar(10) DEFAULT NULL,
  `lastname` varchar(24) NOT NULL,
  `firstname` varchar(24) NOT NULL,
  `address` varchar(48) NOT NULL,
  `zipcode` varchar(10) NOT NULL,
  `city` varchar(32) NOT NULL,
  `country_id` int(11) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `email` varchar(48) DEFAULT NULL,
  `mobilePhone` varchar(20) DEFAULT NULL,
  `workPhone` varchar(20) DEFAULT NULL,
  `homePhone` varchar(20) DEFAULT NULL,
  `taxcode` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,NULL,'Dr','Philips','Barney','tico tico street','23483242','Sidney',13,NULL,'sss@ddd.aa','4535354',NULL,NULL,'fdgdg434534'),(2,NULL,'Sir','Dallas','Roger','Basin Street, 234','829399','Amsterdam',150,NULL,'SHDG@ERRR.rr','34534535353',NULL,NULL,'etrtetete'),(3,NULL,'','Gonsalez','Erminia','plaza De toros, 345','3452352','MAdrid',199,NULL,'dfsfsdaf@sdsa.oo','4353252',NULL,NULL,'ghghjkghk');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-25 21:39:37
