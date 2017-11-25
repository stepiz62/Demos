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
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'Afghanistan'),(2,'Albania'),(3,'Algeria'),(4,'American Samoa'),(5,'Andorra'),(6,'Angola'),(7,'Anguilla'),(8,'Antarctica'),(9,'Antigua and Barbuda'),(10,'Argentina'),(11,'Armenia'),(12,'Aruba'),(13,'Australia'),(14,'Austria'),(15,'Azerbaijan'),(16,'Bahamas'),(17,'Bahrain'),(18,'Bangladesh'),(19,'Barbados'),(20,'Belarus'),(21,'Belgium'),(22,'Belize'),(23,'Benin'),(24,'Bermuda'),(25,'Bhutan'),(26,'Bolivia'),(27,'Bosnia and Herzegovina'),(28,'Botswana'),(29,'Bouvet Island'),(30,'Brazil'),(31,'British Indian Ocean Territory'),(32,'Brunei Darussalam'),(33,'Bulgaria'),(34,'Burkina Faso'),(35,'Burundi'),(36,'Cambodia'),(37,'Cameroon'),(38,'Canada'),(39,'Cape Verde'),(40,'Cayman Islands'),(41,'Central African Republic'),(42,'Chad'),(43,'Chile'),(44,'China'),(45,'Christmas Island'),(46,'Cocos (Keeling) Islands'),(47,'Colombia'),(48,'Comoros'),(49,'Congo'),(50,'Congo, the Democratic Republic of the'),(51,'Cook Islands'),(52,'Costa Rica'),(53,'Cote D\'Ivoire'),(54,'Croatia'),(55,'Cuba'),(56,'Cyprus'),(57,'Czech Republic'),(58,'Denmark'),(59,'Djibouti'),(60,'Dominica'),(61,'Dominican Republic'),(62,'Ecuador'),(63,'Egypt'),(64,'El Salvador'),(65,'Equatorial Guinea'),(66,'Eritrea'),(67,'Estonia'),(68,'Ethiopia'),(69,'Falkland Islands (Malvinas)'),(70,'Faroe Islands'),(71,'Fiji'),(72,'Finland'),(73,'France'),(74,'French Guiana'),(75,'French Polynesia'),(76,'French Southern Territories'),(77,'Gabon'),(78,'Gambia'),(79,'Georgia'),(80,'Germany'),(81,'Ghana'),(82,'Gibraltar'),(83,'Greece'),(84,'Greenland'),(85,'Grenada'),(86,'Guadeloupe'),(87,'Guam'),(88,'Guatemala'),(89,'Guinea'),(90,'Guinea-Bissau'),(91,'Guyana'),(92,'Haiti'),(93,'Heard Island and Mcdonald Islands'),(94,'Holy See (Vatican City State)'),(95,'Honduras'),(96,'Hong Kong'),(97,'Hungary'),(98,'Iceland'),(99,'India'),(100,'Indonesia'),(101,'Iran, Islamic Republic of'),(102,'Iraq'),(103,'Ireland'),(104,'Israel'),(105,'Italy'),(106,'Jamaica'),(107,'Japan'),(108,'Jordan'),(109,'Kazakhstan'),(110,'Kenya'),(111,'Kiribati'),(112,'Korea, Democratic People\'s Republic of'),(113,'Korea, Republic of'),(114,'Kuwait'),(115,'Kyrgyzstan'),(116,'Lao People\'s Democratic Republic'),(117,'Latvia'),(118,'Lebanon'),(119,'Lesotho'),(120,'Liberia'),(121,'Libyan Arab Jamahiriya'),(122,'Liechtenstein'),(123,'Lithuania'),(124,'Luxembourg'),(125,'Macao'),(126,'Macedonia, the Former Yugoslav Republic of'),(127,'Madagascar'),(128,'Malawi'),(129,'Malaysia'),(130,'Maldives'),(131,'Mali'),(132,'Malta'),(133,'Marshall Islands'),(134,'Martinique'),(135,'Mauritania'),(136,'Mauritius'),(137,'Mayotte'),(138,'Mexico'),(139,'Micronesia, Federated States of'),(140,'Moldova, Republic of'),(141,'Monaco'),(142,'Mongolia'),(143,'Montserrat'),(144,'Morocco'),(145,'Mozambique'),(146,'Myanmar'),(147,'Namibia'),(148,'Nauru'),(149,'Nepal'),(150,'Netherlands'),(151,'Netherlands Antilles'),(152,'New Caledonia'),(153,'New Zealand'),(154,'Nicaragua'),(155,'Niger'),(156,'Nigeria'),(157,'Niue'),(158,'Norfolk Island'),(159,'Northern Mariana Islands'),(160,'Norway'),(161,'Oman'),(162,'Pakistan'),(163,'Palau'),(164,'Palestinian Territory, Occupied'),(165,'Panama'),(166,'Papua New Guinea'),(167,'Paraguay'),(168,'Peru'),(169,'Philippines'),(170,'Pitcairn'),(171,'Poland'),(172,'Portugal'),(173,'Puerto Rico'),(174,'Qatar'),(175,'Reunion'),(176,'Romania'),(177,'Russian Federation'),(178,'Rwanda'),(179,'Saint Helena'),(180,'Saint Kitts and Nevis'),(181,'Saint Lucia'),(182,'Saint Pierre and Miquelon'),(183,'Saint Vincent and the Grenadines'),(184,'Samoa'),(185,'San Marino'),(186,'Sao Tome and Principe'),(187,'Saudi Arabia'),(188,'Senegal'),(189,'Serbia and Montenegro'),(190,'Seychelles'),(191,'Sierra Leone'),(192,'Singapore'),(193,'Slovakia'),(194,'Slovenia'),(195,'Solomon Islands'),(196,'Somalia'),(197,'South Africa'),(198,'South Georgia and the South Sandwich Islands'),(199,'Spain'),(200,'Sri Lanka'),(201,'Sudan'),(202,'Suriname'),(203,'Svalbard and Jan Mayen'),(204,'Swaziland'),(205,'Sweden'),(206,'Switzerland'),(207,'Syrian Arab Republic'),(208,'Taiwan, Province of China'),(209,'Tajikistan'),(210,'Tanzania, United Republic of'),(211,'Thailand'),(212,'Timor-Leste'),(213,'Togo'),(214,'Tokelau'),(215,'Tonga'),(216,'Trinidad and Tobago'),(217,'Tunisia'),(218,'Turkey'),(219,'Turkmenistan'),(220,'Turks and Caicos Islands'),(221,'Tuvalu'),(222,'Uganda'),(223,'Ukraine'),(224,'United Arab Emirates'),(225,'United Kingdom'),(226,'United States'),(227,'United States Minor Outlying Islands'),(228,'Uruguay'),(229,'Uzbekistan'),(230,'Vanuatu'),(231,'Venezuela'),(232,'Viet Nam'),(233,'Virgin Islands, British'),(234,'Virgin Islands, U.s.'),(235,'Wallis and Futuna'),(236,'Western Sahara'),(237,'Yemen'),(238,'Zambia'),(239,'Zimbabwe');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-25 21:39:50
