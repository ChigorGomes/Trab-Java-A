CREATE DATABASE  IF NOT EXISTS `ControleEquipamentos` /*!40100 DEFAULT CHARACTER SET utf8 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descricao`
--

LOCK TABLES `descricao` WRITE;
/*!40000 ALTER TABLE `descricao` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipamentos`
--

LOCK TABLES `equipamentos` WRITE;
/*!40000 ALTER TABLE `equipamentos` DISABLE KEYS */;
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
  `email` varchar(45) NOT NULL,
  `senha` varchar(40) NOT NULL,
  `idlogin` int(11) NOT NULL,
  PRIMARY KEY (`idconta`),
  KEY `fk_login_tipo_idx` (`idlogin`),
  CONSTRAINT `fk_login_tipo` FOREIGN KEY (`idlogin`) REFERENCES `tipologin` (`idtipologin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
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
  `data` varchar(20) NOT NULL,
  `descricaosolucao` varchar(200) NOT NULL,
  `idloginsolicitou` int(11) NOT NULL,
  `idloginsolucionou` int(11) DEFAULT NULL,
  PRIMARY KEY (`idmanutencao`),
  KEY `fk_manutencao_desc_idx` (`idtombamento`),
  KEY `fk_manutencao_loginSolicitou_idx` (`idloginsolicitou`),
  KEY `fk_manutencao_loginSolucionou_idx` (`idloginsolucionou`),
  CONSTRAINT `fk_manutencao_desc` FOREIGN KEY (`idtombamento`) REFERENCES `descricao` (`idtombamento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_manutencao_loginSolicitou` FOREIGN KEY (`idloginsolicitou`) REFERENCES `login` (`idconta`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_manutencao_loginSolucionou` FOREIGN KEY (`idloginsolucionou`) REFERENCES `login` (`idconta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manutencao`
--

LOCK TABLES `manutencao` WRITE;
/*!40000 ALTER TABLE `manutencao` DISABLE KEYS */;
/*!40000 ALTER TABLE `manutencao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipologin`
--

DROP TABLE IF EXISTS `tipologin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipologin` (
  `idtipologin` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipologin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipologin`
--

LOCK TABLES `tipologin` WRITE;
/*!40000 ALTER TABLE `tipologin` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipologin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-01  8:55:21
