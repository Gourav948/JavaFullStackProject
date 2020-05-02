# Host: localhost  (Version: 5.5.34)
# Date: 2020-05-02 10:44:05
# Generator: MySQL-Front 5.3  (Build 3.22)

/*!40101 SET NAMES utf8 */;

DROP DATABASE IF EXISTS `ata_tbl`;
CREATE DATABASE `ata_tbl` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ata_tbl`;

#
# Source for table "atl_tbl_driver"
#

DROP TABLE IF EXISTS `atl_tbl_driver`;
CREATE TABLE `atl_tbl_driver` (
  `DRIVERID` varchar(6) NOT NULL DEFAULT '',
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
# Data for table "atl_tbl_driver"
#


#
# Source for table "atl_tbl_route"
#

DROP TABLE IF EXISTS `atl_tbl_route`;
CREATE TABLE `atl_tbl_route` (
  `ROUTEID` varchar(8) NOT NULL DEFAULT '',
  `SOURCE` varchar(20) DEFAULT NULL,
  `DESTINATION` varchar(20) DEFAULT NULL,
  `DISTANCE` int(4) DEFAULT NULL,
  `TRAVELDURATION` int(3) DEFAULT NULL,
  PRIMARY KEY (`ROUTEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "atl_tbl_route"
#


#
# Source for table "atl_tbl_userprofile"
#

DROP TABLE IF EXISTS `atl_tbl_userprofile`;
CREATE TABLE `atl_tbl_userprofile` (
  `USERID` varchar(6) NOT NULL DEFAULT '',
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
# Data for table "atl_tbl_userprofile"
#


#
# Source for table "atl_tbl_creditcard"
#

DROP TABLE IF EXISTS `atl_tbl_creditcard`;
CREATE TABLE `atl_tbl_creditcard` (
  `CREDITCARDID` varchar(10) NOT NULL DEFAULT '',
  `CREDITCARDNUMBER` varchar(20) DEFAULT NULL,
  `VALIDFROM` varchar(7) DEFAULT NULL,
  `VALIDTO` varchar(7) DEFAULT NULL,
  `CREDITBALANCE` int(25) DEFAULT NULL,
  `USERID` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`CREDITCARDID`),
  KEY `creditcard_ibfk_1` (`USERID`),
  CONSTRAINT `creditcard_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `atl_tbl_userprofile` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "atl_tbl_creditcard"
#


#
# Source for table "atl_tbl_vehicle"
#

DROP TABLE IF EXISTS `atl_tbl_vehicle`;
CREATE TABLE `atl_tbl_vehicle` (
  `VEHICLEID` varchar(8) NOT NULL DEFAULT '',
  `NAME` varchar(20) DEFAULT NULL,
  `TYPE` varchar(8) DEFAULT NULL,
  `REGISTRATIONNUMBER` varchar(20) DEFAULT NULL,
  `SEATINGCAPACITY` int(3) DEFAULT NULL,
  `FAREPERKM` int(3) DEFAULT NULL,
  PRIMARY KEY (`VEHICLEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "atl_tbl_vehicle"
#


#
# Source for table "atl_tbl_reservation"
#

DROP TABLE IF EXISTS `atl_tbl_reservation`;
CREATE TABLE `atl_tbl_reservation` (
  `RESERVATIONID` varchar(6) NOT NULL DEFAULT '',
  `USERID` varchar(6) DEFAULT NULL,
  `VEHICLEID` varchar(6) DEFAULT NULL,
  `ROUTEID` varchar(8) DEFAULT NULL,
  `BOOKINGDATE` date DEFAULT NULL,
  `JOURNEYDATE` date DEFAULT NULL,
  `DRIVERID` varchar(6) DEFAULT NULL,
  `BOOKINGSTATUS` varchar(20) DEFAULT NULL,
  `TOTALFARE` int(10) DEFAULT NULL,
  `BOARDINGPOINT` varchar(30) DEFAULT NULL,
  `DROPPOINT` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`RESERVATIONID`),
  KEY `reservation_ibfk_1` (`USERID`),
  KEY `reservation_ibfk_2` (`DRIVERID`),
  KEY `reservatiom_ibfk_3` (`VEHICLEID`),
  KEY `reservation_ibfk_4` (`ROUTEID`),
  CONSTRAINT `reservation_ibfk_4` FOREIGN KEY (`ROUTEID`) REFERENCES `atl_tbl_route` (`ROUTEID`),
  CONSTRAINT `reservatiom_ibfk_3` FOREIGN KEY (`VEHICLEID`) REFERENCES `atl_tbl_vehicle` (`VEHICLEID`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `atl_tbl_userprofile` (`USERID`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`DRIVERID`) REFERENCES `atl_tbl_driver` (`DRIVERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "atl_tbl_reservation"
#

