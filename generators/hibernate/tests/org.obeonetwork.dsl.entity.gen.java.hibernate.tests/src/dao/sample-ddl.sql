-- Start of user code DB Name
-- TODO specify the name of database used
USE sample;
-- End of user code

-- Tables for Entity ExempleDirect 

DROP TABLE IF EXISTS EXEMPLE_DIRECT;
CREATE TABLE EXEMPLE_DIRECT
(
	ID CHAR(32) NOT NULL,
	MY_ATTRIBUTE VARCHAR(255) NOT NULL,
	MY_ID VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Person 

DROP TABLE IF EXISTS PERSON;
CREATE TABLE PERSON
(
	ID CHAR(32) NOT NULL,
	FIRST_NAME VARCHAR(255) NOT NULL,
	AGE INT NOT NULL,
	BIRTH_DATE DATETIME NOT NULL,
	LAST_NAME VARCHAR(255) NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Address 

DROP TABLE IF EXISTS ADDRESS;
CREATE TABLE ADDRESS
(
	ID CHAR(32) NOT NULL,
	CITY VARCHAR(255) NOT NULL,
	STREET VARCHAR(255) NOT NULL,
	NB VARCHAR(255) NOT NULL,
	-- |1|<-->1
	FK_PERSON_PERSON_ID CHAR(32) UNIQUE NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Operations 

DROP TABLE IF EXISTS OPERATIONS;
CREATE TABLE OPERATIONS
(
	ID CHAR(32) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Finders 

DROP TABLE IF EXISTS FINDERS;
CREATE TABLE FINDERS
(
	ID CHAR(32) NOT NULL,
	PRIMARY KEY (ID)
);

