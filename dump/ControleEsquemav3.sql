CREATE DATABASE  IF NOT EXISTS `ControleEquipamentos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ControleEquipamentos`;
-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: ControleEquipamentos
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

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
-- Table structure for table `descricao`
--

DROP TABLE IF EXISTS `descricao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descricao` (
  `idtombamento` int(11) NOT NULL AUTO_INCREMENT,
  `idequipamento` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `data` varchar(20) NOT NULL,
  `local` varchar(45) NOT NULL,
  PRIMARY KEY (`idtombamento`),
  KEY `fk_descricao_equi_idx` (`idequipamento`),
  CONSTRAINT `fk_descricao_equi` FOREIGN KEY (`idequipamento`) REFERENCES `equipamentos` (`idequipamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descricao`
--

LOCK TABLES `descricao` WRITE;
/*!40000 ALTER TABLE `descricao` DISABLE KEYS */;
INSERT INTO `descricao` VALUES (1,2,'olá','01/06/1997','Manaus'),(2,2,'olá','01/08/1998','SP');
/*!40000 ALTER TABLE `descricao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipamentos`
--

DROP TABLE IF EXISTS `equipamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipamentos` (
  `idequipamento` int(11) NOT NULL AUTO_INCREMENT,
  `nomeequipamento` varchar(50) NOT NULL,
  PRIMARY KEY (`idequipamento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipamentos`
--

LOCK TABLES `equipamentos` WRITE;
/*!40000 ALTER TABLE `equipamentos` DISABLE KEYS */;
INSERT INTO `equipamentos` VALUES (1,'Computador'),(2,'Notebook');
/*!40000 ALTER TABLE `equipamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idconta` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `senha` varchar(40) NOT NULL,
  `tipousuario` varchar(50) NOT NULL,
  PRIMARY KEY (`idconta`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (7,'NEGÃO','nego','202CB962AC59075B964B07152D234B70','Suporte'),(8,'NEGÃO','ngs','CAF1A3DFB505FFED0D024130F58C5CFA','Suporte'),(9,'XIVA','a','202CB962AC59075B964B07152D234B70','Secretária');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manutencao`
--

DROP TABLE IF EXISTS `manutencao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manutencao` (
  `idmanutencao` int(11) NOT NULL AUTO_INCREMENT,
  `idtombamento` int(11) NOT NULL,
  `descricaodefeito` varchar(200) NOT NULL,
  `datadefeito` varchar(20) NOT NULL,
  `descricaosolucao` varchar(200) DEFAULT NULL,
  `idloginsolicitou` int(11) NOT NULL,
  `idloginsolucionou` int(11) DEFAULT NULL,
  `dataconserto` varchar(20) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmanutencao`),
  KEY `fk_manutencao_desc_idx` (`idtombamento`),
  KEY `fk_manutencao_loginSolicitou_idx` (`idloginsolicitou`),
  KEY `fk_manutencao_loginSolucionou_idx` (`idloginsolucionou`),
  CONSTRAINT `fk_manutencao_desc` FOREIGN KEY (`idtombamento`) REFERENCES `descricao` (`idtombamento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_manutencao_loginSolicitou` FOREIGN KEY (`idloginsolicitou`) REFERENCES `login` (`idconta`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_manutencao_loginSolucionou` FOREIGN KEY (`idloginsolucionou`) REFERENCES `login` (`idconta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manutencao`
--

LOCK TABLES `manutencao` WRITE;
/*!40000 ALTER TABLE `manutencao` DISABLE KEYS */;
INSERT INTO `manutencao` VALUES (1,2,'olá','12/31/2312','ewe',9,7,'31/24/1241','Regular');
/*!40000 ALTER TABLE `manutencao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-04 19:19:44
