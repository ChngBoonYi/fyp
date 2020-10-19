CREATE TABLE `auth_role` (
  `auth_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`auth_role_id`),
  UNIQUE KEY `auth_role_id_UNIQUE` (`auth_role_id`),
  UNIQUE KEY `role_name_UNIQUE` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;



CREATE TABLE `auth_user` (
  `auth_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(64) NOT NULL,
  `dateCreated` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`auth_user_id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;


CREATE TABLE `auth_user_role` (
  `auth_user_id` int(11) DEFAULT NULL,
  `auth_role_id` int(11) DEFAULT NULL,
  KEY `role_fk_idx` (`auth_role_id`),
  KEY `user_fk` (`auth_user_id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`auth_role_id`) REFERENCES `auth_role` (`auth_role_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `user_fk` FOREIGN KEY (`auth_user_id`) REFERENCES `auth_user` (`auth_user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `customer` (
  `custID` int(11) NOT NULL AUTO_INCREMENT,
  `custName` varchar(50) NOT NULL,
  `custContact` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(64) NOT NULL,
  `dob` date NOT NULL,
  `dateCreated` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`custID`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `custName_fk_idx` (`custName`),
  KEY `username_fk_idx` (`username`),
  KEY `password_fk_idx` (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
