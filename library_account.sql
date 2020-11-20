-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `number` int NOT NULL,
  `opened` date DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `item1` varchar(45) DEFAULT NULL,
  `item2` varchar(45) DEFAULT NULL,
  `item3` varchar(45) DEFAULT NULL,
  `item4` varchar(45) DEFAULT NULL,
  `item5` varchar(45) DEFAULT NULL,
  `libraryID` int DEFAULT NULL,
  `patronID` int DEFAULT NULL,
  PRIMARY KEY (`number`),
  KEY `account_state_idx` (`state`),
  KEY `account_library_idx` (`libraryID`),
  KEY `account_has_patron_idx` (`patronID`),
  KEY `item1_idx` (`item1`),
  KEY `item2_id_idx` (`item2`),
  KEY `item3_id_idx` (`item3`),
  KEY `item4_id_idx` (`item4`),
  KEY `item5_id_idx` (`item5`),
  CONSTRAINT `account_has_patron` FOREIGN KEY (`patronID`) REFERENCES `patron` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `account_library` FOREIGN KEY (`libraryID`) REFERENCES `library` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `account_state` FOREIGN KEY (`state`) REFERENCES `account_state` (`account_state`) ON UPDATE CASCADE,
  CONSTRAINT `item1_id` FOREIGN KEY (`item1`) REFERENCES `item` (`ISBN`),
  CONSTRAINT `item2_id` FOREIGN KEY (`item2`) REFERENCES `item` (`ISBN`),
  CONSTRAINT `item3_id` FOREIGN KEY (`item3`) REFERENCES `item` (`ISBN`),
  CONSTRAINT `item4_id` FOREIGN KEY (`item4`) REFERENCES `item` (`ISBN`),
  CONSTRAINT `item5_id` FOREIGN KEY (`item5`) REFERENCES `item` (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-19 17:13:00
