/*
SQLyog Community Edition- MySQL GUI v5.22a
Host - 5.0.19-nt : Database - bda
*********************************************************************
Server version : 5.0.19-nt
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `bda`;

USE `bda`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `admin_login` */

DROP TABLE IF EXISTS `admin_login`;

CREATE TABLE `admin_login` (
  `user_name` char(30) default NULL,
  `password` char(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin_login` */

insert  into `admin_login`(`user_name`,`password`) values ('a','a');

/*Table structure for table `bus` */

DROP TABLE IF EXISTS `bus`;

CREATE TABLE `bus` (
  `bus_no` char(30) NOT NULL,
  `route` char(40) NOT NULL,
  `Arrival_time_depot` char(10) default NULL,
  `intial_stand` char(30) default NULL,
  `stand1` char(30) default NULL,
  `stand2` char(30) default NULL,
  `stand3` char(30) default NULL,
  `stand4` char(30) default NULL,
  `stand5` char(30) default NULL,
  `stand6` char(30) default NULL,
  `stand7` char(30) default NULL,
  `stand8` char(30) default NULL,
  `stand9` char(30) default NULL,
  `stand10` char(30) default NULL,
  `stand11` char(30) default NULL,
  `stand12` char(30) default NULL,
  `stand13` char(30) default NULL,
  `stand14` char(30) default NULL,
  `stand15` char(30) default NULL,
  `stand16` char(30) default NULL,
  `final_stand` char(30) default NULL,
  `driver` char(20) default NULL,
  `contact_info` char(11) default NULL,
  `conductor` char(20) default NULL,
  `departure_time_depot` char(10) default NULL,
  `route_fare_in_rupees` int(4) default NULL,
  `employee_id` char(30) default NULL,
  PRIMARY KEY  (`bus_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bus` */

insert  into `bus`(`bus_no`,`route`,`Arrival_time_depot`,`intial_stand`,`stand1`,`stand2`,`stand3`,`stand4`,`stand5`,`stand6`,`stand7`,`stand8`,`stand9`,`stand10`,`stand11`,`stand12`,`stand13`,`stand14`,`stand15`,`stand16`,`final_stand`,`driver`,`contact_info`,`conductor`,`departure_time_depot`,`route_fare_in_rupees`,`employee_id`) values ('3','sd','ssd','sd','sdsd','sds','sdsxzc','','xcxcxccx','','','','','','','','','','','','','','','','',200,''),('up16P9272','V.V Nagar','10:45','gr_no_depot','noida_sec35','gr_no_depot','noida_sec35','gr_no_depot','noida_sec35','gr_no_depot','noida_sec35','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','dorilal','7899877889','ved_pal_singh','11:00',50,NULL),('up16T2056','gr_no-ajaypur','7:00','gr_no_depot','noida','bulandshahar','noida_sec35','bulandshahar',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ajaypur','Sunil','9557849545','md_shwaz','7:00',215,NULL),('up16T3125','gr_no-babrala','6:30:','gr_no','noida','bulandshahar','babrala','bulandshahar','noida','gr_no',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'babrala','satinder','9665654784','veer_pal','6:45',265,NULL),('up16T3593','gr_no-agra','15:30','gr_no','noida','agra','noida_sec35','noida','gr_no','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','sachin_bhatda','9665654784','harapal_singh','16:00',265,NULL),('up16T3595','gr_no-shiyana','6:45','gr_no','kashmiri_gate','gr_no','kashmiri_gate','shiyana',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'shiyana','sonu','9523325446','vijendra','7:00',65,NULL),('up16T3596','gr_no-noida-hathras','6:25','gr_no','noida_sec35','gr_no','noida','gr_noida','noida','hathras',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'satish_badana','9989866545','akhil_singh','6:30',60,NULL),('up16T3600','gr_no-agra','6:25','gr_depot','noida_sec35','agra','noida','gr_noida_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'bhupendra_chauhan','8997562146','surendra','7:00',265,NULL),('up16T3641','gr_no-hapur','6:00','gr_no_depot','hapur','gr_no_depot','hapur','gr_no_depot','hapur',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'hapur','rupesh_aggarwal','8988955124','sandhu','6:15',165,NULL),('up16T3642','gr_no-ghaziabad','6:00','gr_no_depot','noida_sec35','ghaziabad','gr_no','ghaziabad','gr_no','noida','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'upendra_singh','9877879546','ramu','6:00',112,NULL),('up16T3644','ajaypur-gr_no','8:45','bulandshahar','noida','bulandshahar','noida_sec35','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','Sardar_singh','9689655478','puneet_singh','8:00',215,NULL),('up16T3685','gr_no-chandosi','5:50','gr_no','noida','gr_no','noida','gr_no_depot','noida','chandosi',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'chandosi_depot','naresh_singh','8895564566','umesh_shrma','6:00',115,NULL),('up16T3687','chandosi-gr_no','5:50','chandosi','noida','gr_no','noida','gr_no','noida','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','suresh_singh','8988955124','rupendra','6:00',115,NULL),('up16T3696','shiyana-gr_no','6:45','shiyana','kashmiri_gate','gr_no','kashmiri_gate','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','shjaad','9645456523','dharamveer','7:00',65,NULL),('up16T4518','gr_no-babrala','5:30','gr_no','noida','bulandshahar','babrala','bulandshahar','noida','gr_no',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'babrala','uday_pal','865489756','dherandra','5:45',265,NULL),('up16T4531','gr_no-alighar-jevarh','9:00','gr_no_depot','noida','alighar','noida','jevarh','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','vipin_kr','8965326532','lokesh','9:15',165,NULL),('up16T4532','gr_no-alighar-meerut','8:30','gr_no_depot','noida','alighar','noida','tupple','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','ajay_singh','9965653214','sudesh_kr_shrma','8:45',165,NULL),('up16T4589','gr_no-agra','7:30/8:00','gr_no','noida','agra','noida_sec35','noida','gr_no','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','naveen_gupta','9665654784','ravinder_badana','8:00/8:30',265,NULL),('up16T4611','gr_no','15:30','gr_no_depot','noida','bulandshahar','noida_sec35','bulandshahar',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'bulandshahar','gaurav_singh','9664578453','rudhra_pratap','7:00',200,NULL),('up16T4648','meerut-airport-gr_no','6:30','meerut','airport','meerut','gr_no',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no','shayam_kr_shrma','7898654732','ashok','6:45',90,NULL),('up16T4697','gr_no-airport','7:45','gr_no','meerut','airport','meerut',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ram_kr_shrma','8965321257','shiv_kr_mishra','8:00',90,NULL),('up16T4698','gr_no-meerut-nehru_place','8:30','gr_noida','meerut','nehru_place','meerut',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'meerut','hari_singh','7896546598','prem_thehy_pandey','8:45',102,NULL),('up16T4699','meerut-nehru_place-gr_no','5:45','meerut','nehru_place','meerut','gr_no',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no','udayveeer','9988745162','suraj_pal','5:45',102,NULL),('up16T4761','gr_no-anand_vihar-kasganjh','5:30','gr_no_depot','noida_sec-35','gr_no','anand-vihar','noida','alighar','kasganjh',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'kuldeep_kr','9875564879','shayam_singh','6:00',465,NULL),('up16T4762','kasganjh-gr_no','5:30','kasganjh','alighr','noida','gr_no','noida','gr_no_workshop',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'sundar_bhati','9875564879','ram_singh','6:00',465,NULL),('up16T6182','gr_no-khurja','13:30','gr_no','noida','khurja','noida','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','suresh','9689653247','rambeer','13:40',230,NULL),('up16T9043','gr_no-agra','6:00','gr_depot','noida_sec35','agra','noida','gr_noida_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ranveer','9899563879','raveendra','6:00',265,NULL),('up16T9567','omicran-site4','6:30','omicran_1','zoo_choraha','kashiram_awas','omax_pam_green','silver_city','city_park','alfa_2','beta_2/athority','beta_1','jagat_farm','knowledge_park3','knowledge_park2','PSI/yamuna_pradhikaran','PSI_1','omega_1','P3','ecotech_1','site4','subhash_singh','9811051182','ramprakash','7:00',80,NULL),('up78BT6062','gr_no-gulavti','6:15','gr_no_depot','noida','bulandshahar','noida','gulavati',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gulavti','jai_prakash','7894659487','mukesh_kr','6:30',80,NULL),('up78BT6184','gulavti-gr_no','6:45','gulavti','noida','bulandshahar','noida','gr_no_depot',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'gr_no_depot','tejveer_singh','8965325421','pushpendra','7:00',80,NULL);

/*Table structure for table `complainrecord` */

DROP TABLE IF EXISTS `complainrecord`;

CREATE TABLE `complainrecord` (
  `name` varchar(100) default NULL,
  `categrory` varchar(100) default NULL,
  `doj` varchar(100) default NULL,
  `discription` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `complainrecord` */

insert  into `complainrecord`(`name`,`categrory`,`doj`,`discription`) values ('dd','Complain','09-Feb-2016','adsf sdsd');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` char(20) NOT NULL,
  `emp_DOB` char(20) default NULL,
  `emp_name` char(30) default NULL,
  `YearsOFService` int(3) default NULL,
  `designation` char(20) default NULL,
  `emp_address` char(50) default NULL,
  `contact_info` double default NULL,
  PRIMARY KEY  (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`emp_id`,`emp_DOB`,`emp_name`,`YearsOFService`,`designation`,`emp_address`,`contact_info`) values ('A1','12-dec-1990','sunil',6,'Cleark','ecotech3',9557849545),('A10','2-feb-1982','rupesh_aggarwal',7,'driver','noida',9765325432),('A11','22-mar-1993','upendra_singh',10,'driver s','gr_no',9999878966),('A12','30-apr-1990','sardar_singh',6,'driver','kasna',8955657432),('A13','3-june-1990','naresh_singh',2,'driver','chalera',9898656532),('A14','20-july-1989','umesh_singh',7,'driver','barola',9663254613),('A15','23-aug-1993','shjaad',7,'driver','achher',9998756452),('A16','2-sept-1984','uday_kr',6,'driver','noida',9965686321),('A17','30-mar-1993','vipin',3,'driver','delhi',9685746589),('A18','3-oct-1973','ajay_singh',2,'driver','gr_no',9632659865),('A19','3-july-1990','naveen_gupta',8,'driver','delhi',9678987898),('A2','15-feb-1987','dorilal',9,'driver','bhangel',8965324587),('A20','9-june-1987','gaurav_singh',3,'driver','sec_49',9678987898),('A3','18-jan-1987','satinder',2,'driver','bhangel',9865326589),('A4','8-jan-1993','satinder',8,'driver','kuleshra',9653125478),('A5','6-mar-1984','sachin_bhatda',6,'driver','surajpur',9654547889),('A6','15-april-1992','sonu',6,'driver','ghaziabad',9632542187),('A7','5-jan-1993','satish_badana',9,'driver','sahibabad',8965324512),('A8','9-jan-1991','bhupendra',2,'driver','sahibabad',8965324512),('A9','12-april-1991','rupesh_aggarwal',2,'driver','sahibabad',8665487956);

/*Table structure for table `employee_login` */

DROP TABLE IF EXISTS `employee_login`;

CREATE TABLE `employee_login` (
  `user_name` char(20) default NULL,
  `employee_id` char(4) default NULL,
  `password` char(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_login` */

/*Table structure for table `employeeattandance` */

DROP TABLE IF EXISTS `employeeattandance`;

CREATE TABLE `employeeattandance` (
  `id` varchar(100) default NULL,
  `name` varchar(100) default NULL,
  `attandance` varchar(100) default NULL,
  `date` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employeeattandance` */

insert  into `employeeattandance`(`id`,`name`,`attandance`,`date`) values ('a1','sumit','PRESENT','01-Feb-2016'),('a1','sumit','PRESENT','02-Mar-2017'),('a1','ss','ABSENT','02-Feb-2017'),('a1','ds','PRESENT','02-Feb-2017'),('a1','sd','PRESENT','02-Feb-2017'),('a1','jkk','PRESENT','03-Mar-2017'),('a1','dfd','PRESENT','02-Mar-2018'),('a1','sd','PRESENT','03-Mar-2018');

/*Table structure for table `employeechange` */

DROP TABLE IF EXISTS `employeechange`;

CREATE TABLE `employeechange` (
  `emp_id` varchar(100) default NULL,
  `emp_DOB` varchar(100) default NULL,
  `emp_name` varchar(100) default NULL,
  `YearsOFService` varchar(100) default NULL,
  `designation` varchar(100) default NULL,
  `emp_address` varchar(100) default NULL,
  `contact_info` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employeechange` */

insert  into `employeechange`(`emp_id`,`emp_DOB`,`emp_name`,`YearsOFService`,`designation`,`emp_address`,`contact_info`) values ('A1','10-02-2015','Sunil Kumar','5','Cleark','new delhi','8956232154');

/*Table structure for table `employeeduty` */

DROP TABLE IF EXISTS `employeeduty`;

CREATE TABLE `employeeduty` (
  `id` varchar(100) default NULL,
  `name` varchar(100) default NULL,
  `date` varchar(100) default NULL,
  `duty` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employeeduty` */

insert  into `employeeduty`(`id`,`name`,`date`,`duty`) values ('a1','ioo','02-Feb-1981','ooiopip'),('a1','ij','02-Jan-1981','	ooko;l');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
