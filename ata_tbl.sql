# Host: localhost  (Version: 5.5.34)
# Date: 2020-05-02 10:44:05
# Generator: MySQL-Front 5.3  (Build 3.22)

/*!40101 SET NAMES utf8 */;

DROP DATABASE IF EXISTS `ata_tbl`;
CREATE DATABASE `ata_tbl` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ata_tbl`;

#
# Source for table "ata_tbl_driver"
#

DROP TABLE IF EXISTS `ata_tbl_driver`;
CREATE TABLE `ata_tbl_driver` (
  `DRIVERID` bigint(6) NOT NULL DEFAULT 0,
  `NAME` varchar(25) DEFAULT NULL,
  `STREET` varchar(30) DEFAULT NULL,
  `LOCATION` varchar(25) DEFAULT NULL,
  `CITY` varchar(20) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `PINCODE` varchar(10) DEFAULT NULL,
  `MOBILENO` varchar(10) DEFAULT NULL,
  `LICENSENUMBER` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DRIVERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_driver"
#


#
# Source for table "ata_tbl_route"
#

DROP TABLE IF EXISTS `ata_tbl_route`;
CREATE TABLE `ata_tbl_route` (
  `ROUTEID` bigint(8) NOT NULL DEFAULT 0,
  `SOURCE` varchar(20) DEFAULT NULL,
  `DESTINATION` varchar(20) DEFAULT NULL,
  `DISTANCE` int(4) DEFAULT NULL,
  `TRAVELDURATION` int(3) DEFAULT NULL,
  PRIMARY KEY (`ROUTEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_route"
#


#
# Source for table "ata_tbl_userprofile"
#

DROP TABLE IF EXISTS `ata_tbl_user_profile`;
CREATE TABLE `ata_tbl_user_profile` (
  `USERID` bigint(6) NOT NULL DEFAULT 0,
  `FIRSTNAME` varchar(15) DEFAULT NULL,
  `LASTNAME` varchar(15) DEFAULT NULL,
  `DATEOFBIRTH` date DEFAULT NULL,
  `GENDER` varchar(7) DEFAULT NULL,
  `STREET` varchar(30) DEFAULT NULL,
  `LOCATION` varchar(15) DEFAULT NULL,
  `CITY` varchar(15) DEFAULT NULL,
  `STATE` varchar(15) DEFAULT NULL,
  `PINCODE` varchar(10) DEFAULT NULL,
  `MOBILENO` varchar(10) DEFAULT NULL,
  `EMAILID` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  `USERTYPE` varchar(1) DEFAULT NULL,
  `LOGINSTATUS` int(1) DEFAULT NULL,
  `SESSIONID` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_userprofile"
#


#
# Source for table "ata_tbl_creditcard"
#

DROP TABLE IF EXISTS `ata_tbl_credit_card`;
CREATE TABLE `ata_tbl_credit_card` (
  `CREDITCARDID` bigint(10) NOT NULL DEFAULT 0,
  `CREDITCARDNUMBER` varchar(20) DEFAULT NULL,
  `VALIDFROM` varchar(7) DEFAULT NULL,
  `VALIDTO` varchar(7) DEFAULT NULL,
  `CREDITBALANCE` int(25) DEFAULT NULL,
  `USERID` bigint(6) DEFAULT NULL,
  PRIMARY KEY (`CREDITCARDID`),
  KEY `creditcard_ibfk_1` (`USERID`),
  CONSTRAINT `creditcard_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `ata_tbl_userprofile` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_creditcard"
#


#
# Source for table "ata_tbl_vehicle"
#

DROP TABLE IF EXISTS `ata_tbl_vehicle`;
CREATE TABLE `ata_tbl_vehicle` (
  `VEHICLEID` bigint(8) NOT NULL DEFAULT 0,
  `NAME` varchar(20) DEFAULT NULL,
  `TYPE` varchar(8) DEFAULT NULL,
  `REGISTRATIONNUMBER` varchar(20) DEFAULT NULL,
  `SEATINGCAPACITY` int(3) DEFAULT NULL,
  `FAREPERKM` int(3) DEFAULT NULL,
  PRIMARY KEY (`VEHICLEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_vehicle"
#


#
# Source for table "ata_tbl_reservation"
#

DROP TABLE IF EXISTS `ata_tbl_reservation`;
CREATE TABLE `ata_tbl_reservation` (
  `RESERVATIONID` bigint(6) NOT NULL DEFAULT 00,
  `USERID` bigint(6) DEFAULT NULL,
  `VEHICLEID` bigint(6) DEFAULT NULL,
  `ROUTEID` bigint(8) DEFAULT NULL,
  `BOOKINGDATE` date DEFAULT NULL,
  `JOURNEYDATE` date DEFAULT NULL,
  `DRIVERID` bigint(6) DEFAULT NULL,
  `BOOKINGSTATUS` varchar(20) DEFAULT NULL,
  `TOTALFARE` int(10) DEFAULT NULL,
  `BOARDINGPOINT` varchar(30) DEFAULT NULL,
  `DROPPOINT` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`RESERVATIONID`),
  KEY `reservation_ibfk_1` (`USERID`),
  KEY `reservation_ibfk_2` (`DRIVERID`),
  KEY `reservatiom_ibfk_3` (`VEHICLEID`),
  KEY `reservation_ibfk_4` (`ROUTEID`),
  CONSTRAINT `reservation_ibfk_4` FOREIGN KEY (`ROUTEID`) REFERENCES `ata_tbl_route` (`ROUTEID`),
  CONSTRAINT `reservatiom_ibfk_3` FOREIGN KEY (`VEHICLEID`) REFERENCES `ata_tbl_vehicle` (`VEHICLEID`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `ata_tbl_userprofile` (`USERID`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`DRIVERID`) REFERENCES `ata_tbl_driver` (`DRIVERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "ata_tbl_reservation"
#

