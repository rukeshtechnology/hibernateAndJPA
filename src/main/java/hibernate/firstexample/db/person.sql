-- USE `hibernatetutorial`; 
CREATE TABLE `person` ( 
`ID` BIGINT(20) NOT NULL AUTO_INCREMENT, 
`name` VARCHAR(255) NOT NULL,
`address_street` VARCHAR(255) NOT NULL,
`address_city` VARCHAR(255) NOT NULL,
`address_zipcode` VARCHAR(255) NOT NULL,
PRIMARY KEY (`ID`) 
);