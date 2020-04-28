
DROP DATABASE IF EXISTS `ata_tbl`;
CREATE DATABASE `ata_tbl` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ata_tbl`;

#
# Source for table "driver"
#

DROP TABLE IF EXISTS `driver`;
CREATE TABLE `driver` (
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
# Data for table "driver"
#


#
# Source for table "route"
#

DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `ROUTEID` varchar(8) NOT NULL DEFAULT '',
  `SOURCE` varchar(20) DEFAULT NULL,
  `DESTINATION` varchar(20) DEFAULT NULL,
  `DISTANCE` int(4) DEFAULT NULL,
  `TRAVELDURATION` int(3) DEFAULT NULL,
  PRIMARY KEY (`ROUTEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "route"
#


#
# Source for table "user_credentials"
#

DROP TABLE IF EXISTS `user_credentials`;
CREATE TABLE `user_credentials` (
  `USERID` varchar(6) NOT NULL DEFAULT '',
  `PASSWORD` varchar(20) DEFAULT NULL,
  `USERTYPE` varchar(1) DEFAULT NULL,
  `LOGINSTATUS` int(1) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "user_credentials"
#


#
# Source for table "creditcard"
#

DROP TABLE IF EXISTS `creditcard`;
CREATE TABLE `creditcard` (
  `CREDITCARDNUMBER` varchar(10) NOT NULL DEFAULT '',
  `VALIDFROM` varchar(7) DEFAULT NULL,
  `VALIDTO` varchar(7) DEFAULT NULL,
  `CREDITBALANCE` int(25) DEFAULT NULL,
  `USERID` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`CREDITCARDNUMBER`),
  KEY `creditcard_ibfk_1` (`USERID`),
  CONSTRAINT `creditcard_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `user_credentials` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "creditcard"
#


#
# Source for table "user_profile"
#

DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
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
  PRIMARY KEY (`USERID`),
  CONSTRAINT `user_profile_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `user_credentials` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "user_profile"
#


#
# Source for table "vehicle"
#

DROP TABLE IF EXISTS `vehicle`;
CREATE TABLE `vehicle` (
  `VEHICLEID` varchar(8) NOT NULL DEFAULT '',
  `NAME` varchar(20) DEFAULT NULL,
  `TYPE` varchar(8) DEFAULT NULL,
  `REGISTRATIONNUMBER` varchar(20) DEFAULT NULL,
  `SEATINGCAPACITY` int(3) DEFAULT NULL,
  `FAREPERKM` int(3) DEFAULT NULL,
  PRIMARY KEY (`VEHICLEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "vehicle"
#


#
# Source for table "reservation"
#

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
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
  CONSTRAINT `reservation_ibfk_4` FOREIGN KEY (`ROUTEID`) REFERENCES `route` (`ROUTEID`),
  CONSTRAINT `reservatiom_ibfk_3` FOREIGN KEY (`VEHICLEID`) REFERENCES `vehicle` (`VEHICLEID`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `user_credentials` (`USERID`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`DRIVERID`) REFERENCES `driver` (`DRIVERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "reservation"
#

