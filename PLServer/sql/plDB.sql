
/* CREATE DATABASE */

CREATE DATABASE DPLServerDB;

/* CREATE USERS */

CREATE USER 'PLServerDBADM'@'localhost' IDENTIFIED BY 'p4$$word';

/* GRANT USERS */

GRANT ALL PRIVILEGES ON DPLServerDB.* TO 'PLServerDBADM'@'localhost' WITH GRANT OPTION;

SHOW GRANTS FOR 'PLServerDBADM'@'localhost';

/* CREATE TABLES */

CREATE TABLE `ADRESS` (`ADRESS_ID` INT(6) NOT NULL AUTO_INCREMENT, `STREET_NUMBER` VARCHAR(50) NOT NULL, `STREET_NAME` VARCHAR(50) NOT NULL, `TOWN` VARCHAR(50) NOT NULL, `COUNTRY` VARCHAR(50) NOT NULL,PRIMARY KEY (`ADRESS_ID`));