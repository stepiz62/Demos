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
-- Table structure for table `patientcustomer`
--

DROP TABLE IF EXISTS `patientcustomer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientcustomer` (
  `patcust_id` int(11) NOT NULL AUTO_INCREMENT,
  `mypatient_id` int(11) NOT NULL,
  `mycustomer_id` int(11) NOT NULL,
  `isThePatient` smallint(6) NOT NULL,
  `relationship` varchar(48) DEFAULT NULL,
  PRIMARY KEY (`patcust_id`),
  KEY `FK_patientcustomer_patient` (`mypatient_id`),
  KEY `FK_patientcustomer_customer` (`mycustomer_id`),
  CONSTRAINT `FK_patientcustomer_customer` FOREIGN KEY (`mycustomer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientcustomer`
--

LOCK TABLES `patientcustomer` WRITE;
/*!40000 ALTER TABLE `patientcustomer` DISABLE KEYS */;
INSERT INTO `patientcustomer` VALUES (1,259,1,0,'Uncle'),(2,259,3,0,'aunt2'),(3,260,1,0,'dfsff'),(4,251,1,0,'brother');
/*!40000 ALTER TABLE `patientcustomer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-25 21:39:46
